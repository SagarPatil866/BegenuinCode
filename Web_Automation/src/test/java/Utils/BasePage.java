package Utils;

//import Page.AdminDashboard;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.*;


public class BasePage {

    static Properties configProperties = null;
    protected WebDriver driver;
    public static Common common;
    public static String currentTest; // current running test
    public static ThreadLocal<Integer> steps = new ThreadLocal<Integer>();
    private ThreadLocal<WebDriver> threadLocal = new ThreadLocal();
    //    public AdminDashboard adminDashboard;
    public DashboardPage dashboardpage;
    public Embedpage embedpage;
    public EngagePage engagePage;
    public Managepage managepage;
    public WhitelabelSettingPage whitelabelSettingPage;
    public FEhomePage fEhomePage;
    public BccPage bccPage;
    public BugPage bugPage;
    protected List<String> stringList = new ArrayList<>();


    /**
     * Setup Method
     */
    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public void setUp(Method method, ITestResult testResult, @Optional("firefox") String browser)throws Exception {
        Reporter.setCurrentTestResult(testResult);

        currentTest = method.getName();

        String headless = getPropertyValue("headless");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            if (headless.equals("true")) {
                options.addArguments("--headless");
            }
            options.addArguments("--incognito");
            options.addArguments("start-maximized");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--no-sandbox");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("user-agent=Mozilla/5.0 (Linux; Android 8.0.0; TA-1053 Build/OPR1.170623.026) AppleWebKit/537.36 (HTML, like Gecko) Chrome/73.0.3683.0 Mobile Safari/537.36");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("-private");
            options.addArguments("start-maximized");

            if (headless.equals("true")) {
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("user-agent=Mozilla/5.0 (Linux; Android 8.0.0; TA-1053 Build/OPR1.170623.026) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.0 Mobile Safari/537.36");
            }

            driver = new EdgeDriver(options);
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("-private");
            if (headless.equals("true")) {
                options.addArguments("--headless");
            }

            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("safari")) {
            // Ensure safaridriver is enabled on macOS
            // Run this command in the terminal to enable: sudo safaridriver --enable

            SafariOptions options = new SafariOptions();
            driver = new SafariDriver(options); // SafariDriver doesn't require any extra setup
        }

        threadLocal.set(driver);
        driver = threadLocal.get();
        driver.manage().window().maximize();

        dashboardpage = new DashboardPage(driver);
        embedpage = new Embedpage(driver);
        engagePage = new EngagePage(driver);
        managepage = new Managepage(driver);
        whitelabelSettingPage = new WhitelabelSettingPage(driver);
        fEhomePage = new FEhomePage(driver);
        bugPage = new BugPage(driver);
        bccPage = new BccPage(driver);
        common = new Common(driver);

        steps.set(1);
        Common.printCurrentTime("Starting Time");
    }

    /**
     * Retrieves the configuration properties from the config.properties file.
     * If the properties are not already loaded, it loads them from the specified path.
     *
     * @return A Properties object containing configuration values.
     */
    protected Properties getConfigProperties() {
        if (configProperties == null) {
            configProperties = this.loadProperties(Paths.get("src/test/java/Config").toAbsolutePath().normalize() + "//config.properties");
        }
        return configProperties;
    }

    /**
     * Retrieves the value of a specified property from the loaded configuration properties.
     *
     * @param value The key of the property to fetch.
     * @return The corresponding property value as a String, or null if the key is not found.
     */
    protected String getPropertyValue(String value) {
        Properties properties = getConfigProperties();
        return properties.getProperty(value);
    }


    /**
     * Check that given element is present or not.
     *
     * @param xpath the xpath of element to be checked present or not
     * @return True if the element present, false otherwise
     */

    public boolean existsElement(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    /**
     * Load Properties
     *
     * @return properties
     */
    private Properties loadProperties(String filePath) {
        File file = new File(filePath);
        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties properties = new Properties();

        try {
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }


    /**
     * After Method {TearDown}
     */
    @AfterMethod(alwaysRun = true)

//     public void tearDown(ITestResult testResult,String TestCycle, String TestCase) throws Exception {
    public void tearDown(ITestResult testResult) throws Exception {

        String testName = testResult.getName();
        Reporter.setCurrentTestResult(testResult);

        if (testResult.getStatus() == 2) {
            Reporter.log("<font color = 'red'><b><i><u><br>Fail :: " + testResult.getName() + "</u></i></b></font>");
            makeScreenshot(driver, testName);
            Reporter.log("Failed page URL: " + driver.getCurrentUrl());
        }
        // MyScreenRecorder.stopRecording();
        if (testResult.getStatus() == 1) {
            Reporter.log("<font color = 'green'><b><i><u><br>Pass :: " + testResult.getName() + "</u></i></b></font>");
//           MyScreenRecorder.deleteFile(testName+".avi");
            testResult.getThrowable();
            // makeScreenshot(driver, testName);
        }
//        for (String logs : stringList) {
//            Reporter.log(logs,true);
//        }

        Common.printCurrentTime("Ending Time");
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    /**
     * Captures a screenshot of the current browser window and saves it to a designated folder.
     * Additionally, it logs a link to the screenshot for reporting purposes.
     *
     * @param driver         The WebDriver instance used to take the screenshot.
     * @param screenshotName The name to be assigned to the screenshot file.
     */
    public void makeScreenshot(WebDriver driver, String screenshotName) {

        // Augment the driver to allow taking screenshots (useful for remote WebDriver instances)
        WebDriver augmentedDriver = new Augmenter().augment(driver);

        // Capture the screenshot as a file
        File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
        String nameWithExtension = screenshotName + ".png";

        try {
            // Define the directory path for storing screenshots
            String reportFolder = "target" + File.separator + "test-output" + File.separator + "screenshots";
            File screenshotFolder = new File(reportFolder);

            // Create the directory if it does not exist
            if (!screenshotFolder.getAbsoluteFile().exists()) {
                screenshotFolder.mkdir();
            }

            // Define the destination file where the screenshot will be saved
            File destFile = new File(screenshotFolder + File.separator + nameWithExtension).getAbsoluteFile();

            // Copy the captured screenshot to the destination file
            FileUtils.copyFile(screenshot, destFile);

            // Log the screenshot in the test report with a clickable link and embedded preview
            Reporter.log("<a href='" + "https://app.testreport.io/qa-java-api/api/v1/user/getImage/SCREENSHOT/"
                    + destFile.getName() + "'> <img src='"
                    + "https://app.testreport.io/qa-java-api/api/v1/user/getImage/SCREENSHOT/" + destFile.getName()
                    + "' height='250' width='500'/> </a>");
        } catch (IOException e) {
            // Handle exceptions if the screenshot capture or file copying fails
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }


}
