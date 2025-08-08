package Utils;

import Tests.Mobile;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.nio.file.Files;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

public class UserAction {

    MobileCommon common = new MobileCommon();

    public void click(MobileDriver driver, String element, String element_name) {
        common.logPrint("Step :: Click On " + element_name);

        findElementByXpath(driver, element).click();
    }

    public void clickImage(MobileDriver driver, String element){

        findElementByXpath(driver,element).click();
    }


    public void touchTap(MobileDriver driver, String xpath, String elementName) {
        common.logPrint("Step :: Tap On " + elementName);

        MobileElement element = findElementByXpath(driver, xpath);

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }


    public void clickAtCoordinates(MobileDriver driver, int x, int y) {
        common.logPrint("Step :: Click at coordinates (" + x + ", " + y + ")");

        try {
            // Create a TouchAction instance
            TouchAction action = new TouchAction(driver);

            // Perform a tap at the specified coordinates
            action.tap(TapOptions.tapOptions().withPosition(PointOption.point(x, y))).perform();

            common.logPrint("Step :: Successfully clicked at (" + x + ", " + y + ")");
        } catch (Exception e) {
            common.logPrint("Step :: Failed to click at (" + x + ", " + y + ") - " + e.getMessage());
        }
    }

    public void doubleClick(MobileDriver driver, String element, String element_name) {
        common.logPrint("Step :: Double Click On " + element_name);

        MobileElement mobileElement = findElementByXpath(driver, element);

        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(mobileElement))).perform()
                .tap(TapOptions.tapOptions().withElement(ElementOption.element(mobileElement))).perform();

        common.logPrint("Step :: Double Clicked On " + element_name);
    }


    public void clear(MobileDriver driver, String element, String element_name) {
        common.logStepMessage("Step ::Clear " + element_name);
        findElementByXpath(driver, element).clear();
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
    public void enter_text(MobileDriver driver, String element, String text_to_enter) {
        common.logStepMessage("Enter text " + text_to_enter);
        findElementByXpath(driver, element).click();
        findElementByXpath(driver, element).sendKeys(text_to_enter);
    }

    public void waitAndClickOnElement(MobileDriver driver, String[] elementString) {
        IOSElement element = ((IOSElement) new WebDriverWait(driver, Duration.ofSeconds(30).toMillis()).until(
                ExpectedConditions.elementToBeClickable(By.xpath(elementString[1]))));
        element.click();
    }

    public void waitForElementToBeClickable(MobileDriver driver, String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30).toMillis());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }

    public void waitForElementToBeVisible(MobileDriver driver, String elementXpath) {
        IOSElement element = ((IOSElement) new WebDriverWait(driver, Duration.ofSeconds(30).toMillis()).until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath))));
    }

    public void waitForElementToBeInvisible(MobileDriver driver, String element) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120).toSeconds());  // Wait for 2 minutes
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
    }

    public void waitForElementToDisappear(MobileDriver driver, String element) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300).toSeconds());  // Wait for 2 minutes
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
    }


    public void waitForElement(MobileDriver driver, String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30).toSeconds());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }

    public void scrollToElement(MobileDriver driver, By locator) {
        while (driver.findElements(locator).isEmpty()) {
            new TouchAction<>(driver)
                    .press(PointOption.point(500, 1800)) // Adjust coordinates as needed
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(500, 300))
                    .release()
                    .perform();
        }
    }
    public void swipeUp(MobileDriver driver) {
        try {
            new TouchAction<>(driver)
                    .press(PointOption.point(500, 1800))  // Adjust coordinates as per your screen size
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(500, 300))
                    .release()
                    .perform();
        } catch (Exception e) {
            System.out.println("Swipe Up action failed: " + e.getMessage());
        }
    }
    public void verifyElementIsDisplayed(MobileDriver driver, String element) {

        boolean bool = false;
        try {
            if (findElementByXpath(driver, element).isDisplayed()) {
                common.logStepResult("Element Is displayed - PASS");
                bool = true;
            } else {
                bool = false;
            }
        } catch (Exception e) {

        }

        if (!bool) {
            common.logStepResult("Element is displayed - failed");
            Assert.assertTrue(false);
        }

    }

    public void verifyElementIsNotDisplayed(MobileDriver driver, String element, String elementName) {

        boolean bool = false;

        common.logStepMessage("Verify " + elementName + " is not displayed");
        try {
            if (!findElementByXpath(driver, element).isDisplayed()) {
                common.logStepResult("passed");
                bool = true;
            } else {
                bool = false;
            }
        } catch (Exception e) {

        }

        if (!bool) {
            common.logStepResult("failed");
            Assert.assertTrue(true);
        }

    }


    public void verify_element_text_is_equal_to_given_text(MobileDriver driver, String element, String text_to_verify, String element_name) {

        boolean bool = false;

        common.logStepMessage("Verify " + element_name + " text is equal to " + text_to_verify);
        try {
            if (findElementByXpath(driver, element).getText().equals(text_to_verify)) {
                common.logStepResult("passed");
                bool = true;
            } else {
                bool = false;
            }
        } catch (Exception e) {

        }

        if (!bool) {
            common.logStepResult("failed");
            Assert.assertTrue(false);
        }

    }

    public static boolean waitForElementWithTimeout(MobileDriver driver, By locator, int timeoutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds).toMillis());
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false; // Element did not appear within timeout
        }
    }

    public MobileElement findElementByXpath(MobileDriver driver, String element_name) {
        Properties config = common.readConfigFile("runConfig");
        MobileElement element = null;

        if (config.getProperty("platformName").equals("android")) {
            element = ((AndroidElement) driver.findElement(By.xpath(element_name)));

        } else if (config.getProperty("platformName").equals("iOS")) {
            element = ((IOSElement) driver.findElement(By.xpath(element_name)));

        }
        return element;

    }

    public List<MobileElement> findElementListByXpath(MobileDriver driver, String[] element_name) {

        MobileCommon common = new MobileCommon();
        Properties config = common.readConfigFile("runConfig");
        List<MobileElement> element = null;

        if (config.getProperty("platformName").equals("android")) {

            element = driver.findElements(By.xpath(element_name[0]));
            System.out.println("Found Element" + element.size());

        } else if (config.getProperty("platformName").equals("iOS")) {
            element = driver.findElements(By.xpath(element_name[0]));
            System.out.println("Found Element" + element.size());

        }


        return element;
    }

    private String getReferenceImageB64(String image1) {
        String image = null;
        try {

            File refImgFile = new File(image1);

            image = Base64.getEncoder().encodeToString(Files.readAllBytes(refImgFile.toPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Images" + image);
        return image;
    }

    public MobileElement findElementById(MobileDriver driver, String element) {
        return (AndroidElement) driver.findElement(By.id(element));
    }

    public MobileElement findElementByImage(MobileDriver driver, String ImagePath) {
        return (AndroidElement) driver.findElement(MobileBy.image(getReferenceImageB64(ImagePath)));
    }


    public static void scrollUpMobile(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.40);
        int bottom_y = (int) (height * 0.70);
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1500))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
        System.out.println("\nScrolling the screen upwards !!!");
        Thread.sleep(1000);
    }

    public static void tapOnElement(MobileDriver driver, MobileElement element) {
        new TouchAction<>(driver)
                .tap(TapOptions.tapOptions().withElement(ElementOption.element(element)))
                .perform();
        System.out.println("Tapped on the element: " + element);
    }
    public static void scrollDownMobile(MobileDriver driver) throws InterruptedException {
        Thread.sleep(1000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.50);
        int bottom_y = (int) (height * 0.20);
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
        System.out.println("\nScrolling the screen downwards !!!");
        Thread.sleep(1000);
    }


    public static void swipeFromLeftToRight(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int y = height / 2;
        int x_right = (int) (width * 0.8);
        int x_left = (int) (width * 0.20);
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x_left, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(ElementOption.point(x_right, y)).release().perform();
        System.out.println("\nSwiping from Left to Right !!!");
        Thread.sleep(2000);
    }

    public static void swipeFromRightToLeft(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int y = height / 2;
        int x_right = (int) (width * 0.8);
        int x_left = (int) (width * 0.2);
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x_right, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(ElementOption.point(x_left, y)).release().perform();
        System.out.println("\nSwiping from Right to Left !!!");
        Thread.sleep(2000);
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        int value = random.nextInt(4000);
        return value;
    }
    public static int generateRandomNumberInteger(int length) {
        String randomNumeric = RandomStringUtils.randomNumeric(length);
        return Integer.parseInt(randomNumeric);
    }

    public static String generateRandomChars(int length) {
        String total = "iokijfmnbxcvfrpqsdfgvcxzdferiuytjndifur";
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char _char = total.charAt((int) (Math.random() * 100) % total.length());
            buf.append(_char);
        }
        return buf.toString();
    }

    public static void scrollDownDatePickerYear(MobileDriver driver) throws InterruptedException {
        Thread.sleep(2000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = 300;
        int top_y = 650;
        int bottom_y = 760;
//        new TouchAction((MobileDriver) driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
        System.out.println("\nScrolling the screen downwards !!!");
        Thread.sleep(1000);
    }

    public static void swipeFromRightToLeftE_GIFT(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int y = 508;
        int x_right = (int) (width * 0.8);
        int x_left = (int) (width * 0.2);
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x_right, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(ElementOption.point(x_left, y)).release().perform();
        System.out.println("\nSwiping from Right to Left !!!");
        Thread.sleep(2000);
    }

    public static void swipeFromRightToLeft_cart(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int y = 250;
        int x_right = 320;
        int x_left = 49;
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x_right, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.point(x_left, y)).release().perform();
        System.out.println("\nSwiping from Left to Right !!!");
        Thread.sleep(2000);
    }

    public static void swipeFromRightToLeftE_Payment_Method(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int y = 120;
        int x_right = 258;
        int x_left = 100;
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x_right, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.point(x_left, y)).release().perform();
        System.out.println("\nSwiping from Left to Right !!!");
        Thread.sleep(2000);
    }

    public static void swipeFromRightToLeftE_on_ShoppingList_Items(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int y = 150;
        int x_right = 300;
        int x_left = 100;
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x_right, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(ElementOption.point(x_left, y)).release().perform();
        System.out.println("\nSwiping from Right to Left !!!");
        Thread.sleep(2000);
    }

    public boolean isElementVisible(MobileDriver<MobileElement> driver, String xpath) {
        try {
            // Wait for up to 5 seconds for the element to be visible
            WebDriverWait wait = new WebDriverWait(driver, 5); // Timeout in seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            common.logPrint("Step ::Element is visible: " + xpath);
            return true;
        } catch (NoSuchElementException e) {
            common.logPrint("Step ::Element not found: " + xpath);
            return false;
        } catch (Exception e) {
            // Handling other possible exceptions
            common.logPrint("Step ::Unexpected error while checking visibility: " + e.getMessage());
            return false;
        }
    }
}
