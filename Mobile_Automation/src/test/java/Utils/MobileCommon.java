package Utils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class MobileCommon {

    public MobileDriver driver;
    public static String path = System.getProperty("user.dir");
    public static String fileName = path + "/src/test/resources/testData.xlsx";
    String doneBtn = "//XCUIElementTypeButton[@name=\"Done\"]";

    public Properties readConfigFile(String configFile) {
        Properties prop = null;

        try (InputStream input = new FileInputStream(new File("src/test/java/Config/" + configFile + ".properties").getAbsolutePath())) {

            prop = new Properties();

            prop.load(input);


        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return prop;
    }


    public void pause(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void printCurrentTime(String time)
    {
        // Get the current time in IST
        SimpleDateFormat istFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        istFormat.setTimeZone(TimeZone.getTimeZone("CST"));
        String cstTime = istFormat.format(new Date());
        System.out.println("<br>Script " + time + ":" + cstTime);
        Reporter.log("<br>Script " + time + ":" + cstTime);
        // Check if the script is running on a server
        String serverIndicatorProperty = System.getProperty("server.indicator");
        if (serverIndicatorProperty != null && serverIndicatorProperty.contains("true")) {
            // Get the server time
            SimpleDateFormat serverFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
            serverFormat.setTimeZone(TimeZone.getTimeZone("Server/Time/Zone"));  // Replace with the actual time zone
            cstTime = serverFormat.format(new Date());
            System.out.println("Server Time: " + cstTime);
        }
    }

    public String GenerateRandomNumber(int charLength) {
        if (charLength < 1) {
            return "0"; // Return "0" if the charLength is less than 1
        }

        // Generate a random number starting with 9
        StringBuilder result = new StringBuilder("9"); // Start with 9

        // Generate the remaining digits (charLength - 1 digits)
        Random random = new Random();
        for (int i = 1; i < charLength; i++) {
            result.append(random.nextInt(10)); // Append a random digit (0-9)
        }

        return result.toString();
    }

    public void logPrint(String print) {
        if (print.startsWith("Step")) {
            int stepcount = MobileBasePage.steps.get();
            String[] msg = print.split("::");
            Reporter.log("<br>Step " + stepcount + " : " + msg[1].trim(),true);
//            System.out.println("Step " + stepcount + " : " + msg[1].trim());
            MobileBasePage.steps.set(stepcount + 1);
        } else {
            Reporter.log("<br>Message : " + print,true);
//            System.out.println("Message : " + print);
        }
    }
    public void logStepMessage(String log) {
        System.out.println(log);
        Reporter.log(log + "<br>");
    }


    public void logStepResult(String result) {
        System.out.println("Result : " + result);
        if (result.equals("passed")) {
            Reporter.log("<h4 style=\"color:green;\">Passed</h4>");
        } else if (result.equals("failed"))
            Reporter.log("<h4 style=\"color:red;\">Failed</h4>");
        {

        }

    }

    public String getScreenshotLink(String screenshot_name, String link_text) {
        logStepMessage("<br><Strong><font color=#FF0000>--Failed</font></strong>");
        return "<a href='../target/failsafe-reports/failed/screenshots/" + screenshot_name + "'>" + link_text + "</a>";
    }

    public void makeScreenshot(MobileDriver driver, String screenshotName) {

        MobileDriver augmentedDriver = (MobileDriver) new Augmenter().augment(driver);

        /* Take a screenshot */
        File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
        String nameWithExtention = screenshotName + ".png";

        /* Copy screenshot to specific folder */
        try {
            String reportFolder = "target" + File.separator + "failsafe-reports" + File.separator + "failed"
                    + File.separator;
            String screenshotsFolder = "screenshots";
            File screenshotFolder = new File(reportFolder + screenshotsFolder);
            if (!screenshotFolder.getAbsoluteFile().exists()) {
                screenshotFolder.mkdir();
            }
            FileUtils.copyFile(screenshot,
                    new File(screenshotFolder + File.separator + nameWithExtention).getAbsoluteFile());
        } catch (IOException e) {
            logStepMessage("Failed to capture screenshot: " + e.getMessage());
        }
        logStepMessage(getScreenshotLink(nameWithExtention, nameWithExtention)); // add
// screenshot
// link
// to
// the
// report
    }
    public long startTime() {
        return System.currentTimeMillis();
    }
    public void endTime(long startTime, String msg) {
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        logPrint("Step ::Total Time for loading the " + msg + " in Seconds: "
                + TimeUnit.MILLISECONDS.toSeconds(totalTime));
    }

    public void relaunch_app(MobileDriver driver) {
        driver.launchApp();

    }

    public static String getCellDataFromLoginCredentialSheet(String colName, int rowNum) {
        String CellValue = null;

        try {
            FileInputStream fileInput = new FileInputStream(new File(fileName));
            Workbook wb = WorkbookFactory.create(fileInput);
            Sheet sheet = wb.getSheet("LoginCredential");
            Row row = sheet.getRow(0);
            short lastcolumnused = row.getLastCellNum();

            int columnNumber = 0;
            for (int i = 0; i < lastcolumnused; i++) {
                if (row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) {
                    columnNumber = i;
                    break;
                }
            }

            row = sheet.getRow(rowNum);
            Cell column = row.getCell(columnNumber);
            column.setCellType(CellType.STRING);

            CellValue = column.getStringCellValue();
        } catch (Exception e) {
            System.out.println("Exception Occur in getCellDataFromLoginCredentialSheet method is " + e);
        }
        return CellValue;

    }

    public void scrollToText(MobileDriver driver, String targetText) {
        while (true) {
            try {
                // Look for the target text in the current visible screen
                if (driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + targetText + "\")")).isDisplayed()) {
                    break; // Text found, exit the loop
                }
            } catch (WebDriverException e) {
                // Swipe to scroll down
                Dimension size = driver.manage().window().getSize();
                int startX = size.getWidth() / 2;
                int startY = (int) (size.getHeight() * 0.8);
                int endY = (int) (size.getHeight() * 0.2);

                TouchAction touchAction = new TouchAction(driver);
                touchAction.press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(100)))
                        .moveTo(PointOption.point(startX, endY))
                        .release()
                        .perform();
            }
        }
    }


    public boolean isElementVisible(MobileDriver driver, By locator, long timeoutInSeconds) {
        try {
            // Create WebDriverWait with timeout in seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).toMillis());
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true; // Element is visible
        } catch (TimeoutException e) {
            return false; // Element is not visible within the timeout
        }
    }

    public void assertTwoValuesAreEqual(Object value1, Object value2) {
        Assert.assertEquals(value1, value2);
    }

    public String generateRandomNumber(int charLength){
        return String.valueOf(charLength < 1 ? 0 : new Random().nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1) + (int) Math.pow(10, charLength - 1));
    }

    public String generateRandomChar(int length){
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }

}
