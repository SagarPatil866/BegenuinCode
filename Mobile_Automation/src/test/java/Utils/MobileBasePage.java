package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class MobileBasePage {

    // Thread-safe driver management
    protected AppiumDriver driver;
    private final MobileCommon common = new MobileCommon();

    // ThreadLocal for step count with default initialization
    public static ThreadLocal<Integer> steps = ThreadLocal.withInitial(() -> 0);

    // Reset step counter
    public static void resetSteps() {
        steps.set(0);
    }
    private JavascriptExecutor js;
    // Constructor
    public MobileBasePage() {
        this.driver = null;
    }

    @BeforeMethod(alwaysRun = true)
    public void init() {
        MobileBasePage.steps.set(1);
        Properties config = common.readConfigFile("runConfig");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:platformName", config.getProperty("platformName"));
        capabilities.setCapability("appium:platformVersion", config.getProperty("platformVersion"));
        capabilities.setCapability("appium:deviceName", config.getProperty("deviceName"));
        capabilities.setCapability("appium:autoGrantPermissions", true);
        capabilities.setCapability("appium:autoAcceptAlerts", false);
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + config.getProperty("appPath"));
        capabilities.setCapability("appium:appPackage", config.getProperty("appPackage"));
        capabilities.setCapability("appium:appActivity", config.getProperty("appActivity")) ;
        capabilities.setCapability("appium:noReset", true);
        capabilities.setCapability("appium:full-reset", false);
        capabilities.setCapability("appium:uiautomator2ServerInstallTimeout", "600000");
        System.out.println("----------------" + config.getProperty("platformName"));
        if (config.getProperty("platformName").equals("android")) {

            try {
                driver = new AndroidDriver(new URL(config.getProperty("server")), capabilities);
                js = (JavascriptExecutor) driver;

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (config.getProperty("platformName").equals("iOS")) {
            capabilities.setCapability("appium:showXcodeLog", true);
            capabilities.setCapability("appium:showXcodeLog", true);
            capabilities.setCapability("appium:showIOSLog", false);
            capabilities.setCapability("appium:showIOSLog", false);
            capabilities.setCapability("appium:automationName", config.getProperty("automationName"));
            capabilities.setCapability("appium:udid", config.getProperty("udid"));
            capabilities.setCapability("appium:app", System.getProperty("user.dir") + config.getProperty("appPath"));
            capabilities.setCapability("appium:snapshotMaxDepth", config.getProperty("snapshotMaxDepth"));
            capabilities.setCapability("appium:customSnapshotTimeout", config.getProperty("customSnapshotTimeout"));
            capabilities.setCapability("appium:simulatorTracePointer", true);
            capabilities.setCapability("appium:useNewWDA", false);

            try {
                driver = new IOSDriver(new URL(config.getProperty("server")), capabilities);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) throws IOException {
        String testName = testResult.getName();
        Reporter.setCurrentTestResult(testResult);

        if (testResult.getStatus() == ITestResult.FAILURE) {
            Reporter.log("<font color='red'><b><i><u><br>Fail :: " + testName + "</u></i></b></font>", true);
            makeScreenshot(driver, testName);
        } else if (testResult.getStatus() == ITestResult.SUCCESS) {
            Reporter.log("<font color='green'><b><i><u><br>Pass :: " + testName + "</u></i></b></font>", true);
        }

        if (driver != null) {
            driver.resetApp();
            driver.quit();
        }
    }

    public void makeScreenshot(WebDriver driver, String screenshotName) {
        try {
            WebDriver augmentedDriver = new Augmenter().augment(driver);
            File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
            String reportFolder = "target/test-output/screenshots";
            File screenshotFolder = new File(reportFolder);

            if (!screenshotFolder.exists() && !screenshotFolder.mkdirs()) {
                throw new IOException("Failed to create screenshot directory");
            }

            File destFile = new File(screenshotFolder, screenshotName + ".png");
            FileUtils.copyFile(screenshot, destFile);

            String screenshotPath = destFile.getAbsolutePath();
            Reporter.log("<a href='" + screenshotPath + "'> <img src='" + screenshotPath + "' height='250' width='500'/> </a>", true);
        } catch (IOException e) {
            Reporter.log("Failed to capture screenshot: " + e.getMessage(), true);
        }
    }
}
