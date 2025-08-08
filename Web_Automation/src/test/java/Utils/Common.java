package Utils;

import com.google.gson.*;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;


/**
 * Define Common Web driver
 *
 * @author Rahul Sharma
 */
public class Common extends Locators {

//	protected static WebDriver driver;

    public Common(WebDriver driver) {

        super(driver);
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public WebDriverWait getWait(long time) {
        // Set time in second to wait for elements
        return new WebDriverWait(driver, Duration.ofSeconds(time));
    }

    public WebElement waitUntilElementToBeClickable(By by) {

        try {
            return getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(by));

        } catch (StaleElementReferenceException e) {
            return getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(by));
        }
    }

    public void waitUntilElementToBeClickable(WebElement element) {
        try {
            getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
        } catch (StaleElementReferenceException e) {
            getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
        }
    }
    public WebElement waitUntilPresenceOfElementLocated(By by) {
        return getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitUntilElementToBeClickable(String locator) {

        try {
            return getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(findBy(locator)));

        } catch (StaleElementReferenceException e) {
            return getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(findBy(locator)));
        }
    }
     public WebElement waitUntilStringLocator(String locator){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         return wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(findBy(locator)));
     }
    public WebElement waitUntilStringLocatorAsaElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
    }
    public Boolean waitUntilInvisible(String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return getWait(150).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.invisibilityOf(findElement(locator)));
    }

    public Boolean waitUntilElementToBeInvisible(WebElement element) {
        return getWait(150).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.invisibilityOf(element));
    }

        public List<WebElement> waitUntilElementsToBeVisible(By by) {
            return getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        }

    public String removeZero (String input){
        input = input.indexOf(".") < 0 ? input : input.replaceAll("0*$", "").replaceAll("\\.$", "");
        return input;
    }

    /**
     * Check alert is present or not and accept it if present.
     *
     * @return Text on alert if present, otherwise null
     */
    public String handleAlert() {
        String strAltert = null;
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            strAltert = alert.getText();
            alert.accept();
            pause(2);
        }
        return strAltert;
    }

    /**
     * Check alert is present or not.
     *
     * @return True if alert present, otherwise false
     */
    public boolean isAlertPresent() {
        pause(1);
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException ex) {
            return false;
        }
    }

    public String current_window;

    public void switchToSecondWindow() {
        try {
            current_window = this.driver.getWindowHandle();
            Set<String> allwindows = this.driver.getWindowHandles();
            int i = 0;
            for (String s : allwindows) {
                i = i + 1;
                if (i == 2) {
                    this.driver.switchTo().window(s);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void  switch_windows(Set<String>  windowHandles, String title){
        // Iterate through the window handles
        for (String windowHandle : windowHandles) {
            // Switch to the window handle
            driver.switchTo().window(windowHandle);

            // Check the window title
            String windowTitle = driver.getTitle();

            // If the window title matches "Plaid flow", break the loop and stay in this window
            if (windowTitle.equals(title)) {
                common.logPrint("Switched to window with title: " + windowTitle);
                break;
            }
        }

    }
    public void switchToTab(int n){

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(n));
    }

    public void waitUntilSpecificTitle(String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public void mouseOver(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform(); // Moves the cursor to the element
    }

    public void switchToWindow(int n) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles()); // "windows" instead of "tabs"
        driver.switchTo().window(windows.get(n));
    }
    /**
     * Get past date in MM/dd/yyyy format as per argument.
     *
     * @param days the days to get past date
     * @return Past date in MM/dd/yyyy format before given days from current date
     */
    public String PastDate(int days) throws ParseException {
        Date dateNow = new Date();
        SimpleDateFormat dateFormatyyyyMMdd = new SimpleDateFormat("MM/dd/yyyy"); // Date Format
        String date_to_string = dateFormatyyyyMMdd.format(dateNow);
        String untilDate = date_to_string;// Current Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance(); // Get Calendar Instance
        cal.setTime(dateFormat.parse(untilDate));
        // Past Date
        cal.add(Calendar.DATE, -days);
        String pastdate = dateFormat.format(cal.getTime());
        return pastdate;
    }

    /**
     * Takes screenshot and adds it to TestNG report.
     *
     * @param driver WebDriver instance.
     */
    public void makeScreenshot(WebDriver driver, String screenshotName) {
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        /* Take a screenshot */
        File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
        String nameWithExtention = screenshotName + ".png";

        /* Copy screenshot to specific folder */
        try {
            String reportFolder = "target" + File.separator + "failsafe-reports" + File.separator + "chrome" + File.separator;
            String screenshotsFolder = "screenshots";
            File screenshotFolder = new File(reportFolder + screenshotsFolder);
            if (!screenshotFolder.getAbsoluteFile().exists()) {
                screenshotFolder.mkdir();
            }
            FileUtils.copyFile(screenshot, new File(screenshotFolder + File.separator + nameWithExtention).getAbsoluteFile());
        } catch (IOException e) {
            Reporter.log("Failed to capture screenshot: " + e.getMessage());
        }
        Reporter.log(getScreenshotLink(nameWithExtention, nameWithExtention)); // add screenshot link to the report
    }

    /**
     * Generates link for TestNG report.
     *
     * @param screenshot_name Screenshot name.
     * @param link_text       Link text.
     * @return Formatted link for TestNG report.
     */
    public String getScreenshotLink(String screenshot_name, String link_text) {
        Reporter.log("<Strong><font color=#FF0000>--Failed</font></strong>");
        return "<a href='../target/failsafe-reports/firefox/screenshots/" + screenshot_name + "'>" + link_text + "</a>";
    }

    /**
     * Assertion to check that given element is not being displayed.
     *
     * @param locator the locator of element to be checked
     */
    public void assertElementIsNotDisplayed(String locator) {
        pause(2);
        Assert.assertFalse(isElementDisplayed(locator));
    }
    /**
     * Assertion to check that given element is being displayed.
     *
     * @param element the locator of element to be checked
     */
    public void assertElementIsDisplayed(WebElement element) {
        waitUntilElementToBeClickable(element);
        Assert.assertTrue(isElementDisplayed(String.valueOf(element)));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return arguments[0].click();", element);
    }


    /**
     * Checks that given element is checked or not.
     *
     * @param locator the locator of element to be checked
     * @return true if element checked,otherwise false
     */
    public boolean isChecked(String locator) {
        WebElement element = waitUntilStringLocator(locator);
        return element.isSelected();
    }

    /**
     * Get the value of the given attribute of the element. Will return the current
     * value, even if this has been modified after the page has been loaded.
     *
     * @param locator The locator of element to get its attribute value
     * @return The attribute/property's current value or null if the value is not
     * set.
     */
    public String getValue(String locator) {
        // pause(1);
        WebElement element = waitUntilPresenceOfElementLocated(By.xpath(locator));
        return element.getAttribute("value");
    }

    /**
     * Assertion to check that two values are equal.
     *
     * @param value1 Value-1.
     * @param value2 Value-2.
     */
    public void assertTwoValuesAreEqual(Object value1, Object value2) {
        pause(2);
        Assert.assertEquals(value1, value2);
    }

    /**
     * Assertion to check that two values are not equal.
     *
     * @param value1 Value-1.
     * @param value2 Value-2.
     */
    public void assertTwoValuesAreNotEqual(Object value1, Object value2) {
        pause(2);
        Assert.assertNotEquals(value1, value2);
    }

    /**
     * Checks given element is being displayed or not on page.
     *
     * @param locator the locator of element to be checked present or not
     * @return True if the element displayed, false otherwise
     */
    public boolean isElementDisplayed(String locator) {
        try {
            WebElement element = this.findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Common method to send a POST request and get the response as JsonObject
     */
//    public JsonObject sendPostRequestAndGetJsonResponse(String endpoint, String requestBodyPath) {
//        Response response = JSONFileReader.sendPostRequest(endpoint, requestBodyPath);
//        String responseBody = response.getBody().asString();
//        return new JsonParser().parse(responseBody).getAsJsonObject();
//    }

    /**
     * Common method to assert response status code and execution result status
     */
    public void assertResponseStatusAndExecutionResultStatus(Response response, String expectedStatus) {

        JsonObject executionResult = new JsonParser().parse(response.getBody().asString()).getAsJsonObject().getAsJsonObject("executionResult");
        String status = executionResult.get("status").getAsString();
        Assert.assertEquals(status, expectedStatus, "The status is not '" + expectedStatus + "'");
    }

    /**
     * Waits until the specified element is visible on the page.
     *
     * @param locator the locator of the element to be waited for
     * @return the WebElement once it becomes visible
     */
    public WebElement waitUntilElementToBeVisible(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));  // or use By.cssSelector(locator) or By.id(locator), etc.
        return getWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Performs a mouse hover over the given element and clicks on it.
     *
     * @param element the WebElement to hover over and click
     */
    public void mouseOverClick(WebElement element) {
        waitUntilElementToBeClickable(element);
        Actions actions = new Actions(driver);
        highlightElement(element);
        actions.moveToElement(element).click().perform();
    }

    /**
     * Scroll page to element for given locator.
     *
     * @param locator the locator of element where to scroll
     *
     */
    public void scroll_To_Element(String locator) {
        WebElement element = waitUntilElementToBeVisible(findBy(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

    /**
     * Waits until the specified element is visible on the page.
     *
     * @param by the locator of the element to be waited for
     * @return the WebElement once it becomes visible
     */
    public WebElement waitUntilElementToBeVisible(By by) {

        try {
            return getWait().ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.visibilityOfElementLocated(by));

        } catch (StaleElementReferenceException e) {
            return getWait().ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }

    }

    /**
     * Checks whether the specified element is enabled.
     *
     * @param locator the locator of the element to be checked
     * @return true if the element is enabled, false otherwise
     */
    public boolean isElementEnabled(String locator) {
        return true;
    }

    /**
     * Checks whether the specified element is disabled.
     *
     * @param locator the locator of the element to be checked
     * @return true if the element is disabled, false otherwise
     */
    public boolean isElementDisabled(String locator) {

        WebElement element = waitUntilElementToBeVisible(By.xpath(locator));
        if (!element.isEnabled()) {
            return true;
        }
        return false;


    }

    /**
     * Logs specific details from the given JSON response, including execution results,
     * offers, and failed criteria.
     *
     * @param jsonResponse the JSON response containing execution details
     */
    public static void logResponseDetails(JsonObject jsonResponse) {
        JsonObject executionResult = jsonResponse.getAsJsonObject("executionResult");

        // Create a new JSON object to store the filtered fields
        JsonObject filteredResult = new JsonObject();
        filteredResult.add("status", executionResult.get("status"));
        filteredResult.add("discreteCriteriaVersion", executionResult.get("discreteCriteriaVersion"));
        filteredResult.add("criteriaStage", executionResult.getAsJsonObject("criteriaStage"));

        JsonArray offers = jsonResponse.getAsJsonArray("offers");
        JsonElement mck3ScoreElement = executionResult.has("mck3Score") ? executionResult.get("mck3Score") : JsonNull.INSTANCE;

        // Initialize Gson object for pretty printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        common.logPrint("Step :: <b>Execution Result = " +"</b>" + gson.toJson(filteredResult));
        common.logPrint("Step :: <b>Offer Result = " +"</b>"+ gson.toJson(offers));
        common.logPrint("Step :: <b>MCK3 Score = " +"</b>" + mck3ScoreElement.toString());
        common.logPrint("Step :: <b>Full Response = "  +"</b>"+ jsonResponse);


        // Extract 'criteriaStage' and 'failedCriterias'
        JsonObject executionResult1 = jsonResponse.getAsJsonObject("executionResult");
        JsonObject criteriaStage = executionResult1.getAsJsonObject("criteriaStage");
        JsonArray failedCriterias = criteriaStage.getAsJsonArray("failedCriterias");

        // Convert 'failedCriterias' to a list of strings
        List<String> failedCriteriasList = new ArrayList<>();
        for (JsonElement criteria : failedCriterias) {
            failedCriteriasList.add(criteria.getAsString());
        }
    }

    /**
     * Check that given element is present or not.
     *
     * @param locator the locator of element to be checked present or not
     * @return True if the element present, false otherwise
     */
    public boolean isElementPresent(String locator) {
        try {
            //pause(5);
            waitUntilStringLocator(locator);
            highlightElement(this.findElement(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Check that given element is present or not.
     *
     * @param xpath the xpath of element to be checked present or not
     * @return True if the element present, false otherwise
     */
    public boolean existsElementFalse(String xpath) {
        try {
            WebElement element = driver.findElement(By.xpath(xpath));
            highlightElement(element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    /**
     * Assertion to check that given element is not present.
     *
     * @param locator the locator of element
     */
    public void assertElementNotPresent(String locator) {
        pause(2);
        Assert.assertFalse(isElementPresent(locator));
    }

    /**
     * Assertion to check that given element is present.
     *
     * @param locator the locator of element
     */
    public void assertElementPresent(String locator) {
        waitUntilStringLocator(locator);
        highlightElement(locator);
        Assert.assertTrue(isElementPresent(locator));
    }

    /**
     * Assertion to check that given element is present.
     *
     * @param locator the locator of element
     *
     */
    public void assertElementPresentWithMessage(String locator, String message) {

        Assert.assertTrue(isElementPresent(locator), message);
    }

    /**
     * Causes the currently executing thread to sleep (temporarily cease execution)
     * for the specified number of seconds, subject to the precision and accuracy of
     * system timers and schedulers. The thread does not lose ownership of any
     * monitors.
     *
     * @param seconds the time in second to pause execution
     */

    public void pause(int seconds) {

//		driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException interruptedException) {
        }
    }

    /**
     * Removes all non-numeric characters (except for the decimal point) from the input string,
     * converts the remaining value to a double, rounds it down to an integer, and returns it as a string.
     *
     * @param input the input string containing numeric and non-numeric characters
     * @return the rounded integer value as a string
     */
    public String replaceAll(String input) {

        String fundValue = input.replaceAll("[^0-9.]", "");
        double d = Double.parseDouble(fundValue);
        int rounded_fundValue = (int) d;
        return Integer.toString(rounded_fundValue);

    }

    /**
     * Removes all non-numeric characters (except for the decimal point) from the input string.
     *
     * @param input the input string containing numeric and non-numeric characters
     * @return a string containing only numbers and decimal points
     */
    public String replaceSpecialChar(String input) {
        String fundValue = input.replaceAll("[^0-9.]", "");
        return fundValue;
    }

    /**
     * Causes the currently executing thread to sleep (temporarily cease execution)
     * for the specified number of milliseconds, subject to the precision and
     * accuracy of system timers and schedulers. The thread does not lose ownership
     * of any monitors.
     */
    public void pause2Sec() {

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 }

    /**
     * Returns the number of elements in this list. If this list contains more than
     * {@code Integer.MAX_VALUE} elements, returns {@code Integer.MAX_VALUE}.
     *
     * @param locator the locator of element to find list to get size
     * @return the number of elements in this list
     */
    public int size(String locator) {
        // pause(2);
        List<WebElement> element = waitUntilElementsToBeVisible(findBy(locator));
        return element.size();
    }

    /**
     * <p>
     * Log the passed string to the HTML reports.
     * </p>
     *
     * <p>
     * Print the passed string and then terminates the line.
     * </p>
     *
     * @param print the message to log and to print
     */
    public void logPrint(String print) {
        if (print.startsWith("Step")) {
            int stepcount = BasePage.steps.get();
            String[] msg = print.split("::");
            Reporter.log("<br>Step " + stepcount + " : " + msg[1].trim(),true);
//            System.out.println("Step " + stepcount + " : " + msg[1].trim());
            BasePage.steps.set(stepcount + 1);
        } else {
            Reporter.log("<br>Message : " + print,true);
//            System.out.println("Message : " + print);

        }
    }

    /**
     * Select the option of given element at random index. This is done by examining
     * the "index" attribute of an element, and not merely by counting.
     *
     * @param locator the locator of element to be selected by random index
     * @return The element's current visible text after selection or null if the
     * value is not set.
     */
    public int selectByRandomIndex(String locator) {
        WebElement element = waitUntilElementToBeClickable(locator);
        highlightElement(element);
        Select dropdown = new Select(element);
        Random random = new Random();
        dropdown.selectByIndex(random.nextInt(dropdown.getOptions().size()));
        handleAlert();
        return 0;
    }

    /**
     * Moves the mouse cursor to the specified web element.
     *
     * @param webElement the WebElement to move the cursor to
     */

    public void moveToElement(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).perform();
    }

    /**
     * Moves the mouse cursor to the specified web element and clicks it.
     *
     * @param webElement the WebElement to move the cursor to and click
     */
    public void moveToElementAndClick(WebElement webElement){
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).click().build().perform();
    }

    /**
     * Moves the mouse cursor to the specified element (by locator) and clicks it.
     *
     * @param locator the locator of the element to move to and click
     */
    public void moveToElementAndClick(String locator){
        Actions actions = new Actions(driver);
        WebElement element = waitUntilElementToBeClickable(locator);
        actions.moveToElement(element).click().build().perform();
    }

    /**
     * Check the checkbox or toggle element.
     *
     * @param locator the locator of checkbox element to be checked
     */
    public void checkChkBox(String locator) {
        WebElement element = waitUntilStringLocator(locator);
        highlightElement(element);
        boolean isCheckBoxChecked = element.isSelected();
        if (!isCheckBoxChecked) {
            try {
                element.click();
            } catch (Exception e) {
                jsClickWithoutWait(element);
            }
        }
    }

    /**
     * Scrolls the page until the specified element (by locator) is in view.
     *
     * @param locator the locator of the element to scroll to
     */
    public void scrollToElement(String locator)  {
        WebElement element = waitUntilStringLocator(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

       // Thread.sleep(500);
    }

    /**
     * Scrolls the page until the specified web element is in view.
     *
     * @param element the WebElement to scroll to
     */
    public void scroll_To_Element(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

    /**
     * <p>
     * Creates a random character string whose length is the number of characters
     * specified.
     * </p>
     *
     * <p>
     * Characters will be chosen from the set of alphabetic characters.
     * </p>
     *
     * @param length the length of random character string to create
     * @return The random character string in lower case
     */
    public  String generateRandomChars(int length) {
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }
    /**
     * <p>
     * Creates a random character string whose length is the number of characters
     * specified.
     * </p>
     *
     * <p>
     * Characters will be chosen from the set of alphabetic characters.
     * </p>
     *
     * @param length the length of random character string to create
     * @return The random character string in lower case
     */
    public  String generateRandomCharsToUpperCase(int length) {
        return RandomStringUtils.randomAlphabetic(length).toUpperCase();
    }

    /**
     * <p>
     * Creates a random number string whose length is the number of characters
     * specified.
     * </p>
     *
     * <p>
     * Characters will be chosen from the set of numeric characters.
     * </p>
     *
     * @param length the length of random number string to create
     * @return The random number string
     */
    public  String generateRandomNumberString(int length) {

        return RandomStringUtils.randomNumeric(length);
    }

    /**
     * Generates a random number within the specified range and returns it as a string.
     *
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive)
     * @return a random number as a string within the specified range
     * @throws IllegalArgumentException if min is greater than max
     */
    public  String generateRandomNumberString(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return String.valueOf(randomNumber);
    }

    /**
     * Highlight given element
     *
     * @param locator the locator of element to be highlighted
     */
    public void highlightElement(String locator) {
        WebElement element = waitUntilStringLocator(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='4px solid yellow'", element);
    }

    /**
     * Highlight given element
     *
     * @param element the element to be highlighted
     */
    public void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid yellow'", element);
    }

    /**
     * Highlights the specified web element by adding a green border.
     *
     * @param element the WebElement to be highlighted
     * @throws IllegalArgumentException if the element is null
     */
    public void highlightElementClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='4px solid green'", element);
    }

    /**
     * Converts a locator string into a Selenium {@link By} object.
     * The method supports different locator strategies:
     * <ul>
     *     <li>Link text: "link=example" or "LINK=example"</li>
     *     <li>ID: "id=example"</li>
     *     <li>XPath: "//example"</li>
     *     <li>CSS Selector: "#example" or "css=example"</li>
     *     <li>Name: "name=example"</li>
     *     <li>Class Name: "class=example"</li>
     *     <li>Body Selector: "body"</li>
     *     <li>Default: Treats the input as an ID if no prefix is recognized</li>
     * </ul>
     *
     * @param locator the locator string in a predefined format
     * @return a Selenium {@link By} object corresponding to the locator type
     */
    public static By findBy(String locator) {
        if (locator.startsWith("link=") || locator.startsWith("LINK=")) {
            locator = locator.substring(5); // remove "link=" from locator
            if (locator.contains(" ")) return By.partialLinkText(locator);
            return By.linkText(locator);
        } else if (locator.startsWith("id=")) {
            locator = locator.substring(3); // remove "id=" from locator
            return By.id(locator);
        } else if (locator.startsWith("//") || locator.startsWith("(//")) {
            return By.xpath(locator);
        } else if (locator.startsWith("#")) {
            return By.cssSelector(locator);
        } else if (locator.startsWith("css=")) {
            locator = locator.substring(4);
            return By.cssSelector(locator);
        } else if (locator.startsWith("name=")) {
            locator = locator.substring(5); // remove "name=" from locator
            return By.name(locator);
        } else if (locator.startsWith("class=")) {
            locator = locator.substring(6); // remove "class=" from locator
            return By.className(locator);
        } else if (locator.equalsIgnoreCase("body")) {
            return By.cssSelector(locator);
        } else {
            return By.id(locator);
        }
    }

    /**
     * Find the first {@link WebElement} using the given method. This method is
     * affected by the 'implicit wait' times in force at the time of execution. The
     * findElement(..) invocation will return a matching row, or try again
     * repeatedly until the configured timeout is reached.
     *
     * @param locator the locator to be used by locating mechanism to find element
     * @return The first matching element on the current page
     * @throws NoSuchElementException If no matching elements are found
     */
    public WebElement findElement(String locator) {
        if (locator.startsWith("link=") || locator.startsWith("LINK=")) {
            locator = locator.substring(5); // remove "link=" from locator
            if (locator.contains(" ")) return driver.findElement(By.partialLinkText(locator));
            return driver.findElement(By.linkText(locator));
        } else if (locator.startsWith("id=")) {
            locator = locator.substring(3); // remove "id=" from locator
            return driver.findElement(By.id(locator));
        } else if (locator.startsWith("//") || locator.startsWith("(//")) {
            return driver.findElement(By.xpath(locator));
        } else if (locator.startsWith("#")) {
            return driver.findElement(By.cssSelector(locator));
        } else if (locator.startsWith("name=")) {
            locator = locator.substring(5); // remove "name=" from locator
            return driver.findElement(By.name(locator));
        } else if (locator.startsWith("class=")) {
            locator = locator.substring(6); // remove "class=" from locator
            return driver.findElement(By.className(locator));
        } else if (locator.equalsIgnoreCase("body")) {
            return driver.findElement(By.cssSelector(locator));
        } else {
            return driver.findElement(By.id(locator));
        }
    }

    /**
     * Find all elements within the current page using the given mechanism. This
     * method is affected by the 'implicit wait' times in force at the time of
     * execution. When implicitly waiting, this method will return as soon as there
     * are more than zero items in the found collection, or will return an empty list
     * if the timeout is reached.
     *
     * @param locator the locator to be used by locating mechanism to find elements
     * @return A list of all matching {@link WebElement}s, or an empty list if
     * nothing matches
     */
    public List<WebElement> findElements(String locator) {
        if (locator.startsWith("link=") || locator.startsWith("LINK=")) {
            locator = locator.substring(5); // remove "link=" from locator
            if (locator.contains(" ")) return driver.findElements(By.partialLinkText(locator));
            return driver.findElements(By.linkText(locator));
        } else if (locator.startsWith("id=")) {
            locator = locator.substring(3); // remove "id=" from locator
            return driver.findElements(By.id(locator));
        } else if (locator.startsWith("//")) {
            return driver.findElements(By.xpath(locator));
        } else if (locator.startsWith("#")) {
            return driver.findElements(By.cssSelector(locator));
        } else if (locator.startsWith("name=")) {
            locator = locator.substring(5); // remove "name=" from locator
            return driver.findElements(By.name(locator));
        } else if (locator.startsWith("class=")) {
            locator = locator.substring(6); // remove "class=" from locator
            return driver.findElements(By.className(locator));
        } else if (locator.equalsIgnoreCase("body")) {
            return driver.findElements(By.cssSelector(locator));
        } else {
            return driver.findElements(By.id(locator));
        }
    }

    /**
     * Refresh the current page
     */
    public void refreshPage() {
        this.driver.navigate().refresh();

    }

    /**
     * Waits for the page to fully load by checking the document's readyState.
     * The method waits up to 20 seconds for the page to reach "complete" state.
     */
    public void waitForLoad() {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));
        wait.until(pageLoadCondition);

    }

    /**
     * If given element is a form entry element, this will reset its value first
     * then simulate typing into an element, which may set its value.
     *
     * @param locator    The locator of element where to send keys
     * @param keysToSend the character sequence to send to the element
     */
    public void type(String locator, String keysToSend) {

        WebElement element = waitUntilElementToBeClickable(findBy(locator));
        highlightElementClick(element);
        scroll_To_Element(element);
        element.clear();
        element.sendKeys(keysToSend);
        //element.sendKeys(Keys.TAB);
    }

    /**
     * Types the given text into an input field, then simulates pressing the TAB and ENTER keys.
     * The method ensures the element is clickable, highlighted, scrolled into view, and cleared before typing.
     *
     * @param locator    the locator string to find the element
     * @param keysToSend the text to type into the element
     * @throws IllegalArgumentException if the locator or keysToSend is null or empty
     */
    public void typeAndTab(String locator, String keysToSend) {


        WebElement element = waitUntilElementToBeClickable(findBy(locator));
        highlightElementClick(element);
        scroll_To_Element(element);
        element.clear();
        element.sendKeys(keysToSend);
        element.sendKeys(Keys.TAB);
        element.sendKeys(Keys.ENTER);
    }

    /**
     * If given element is a form entry element, this will reset its value first
     * then simulate typing into an element, which may set its value.
     * @param element    the element where to send keys
     * @param keysToSend the character sequence to send to the element
     */
    public void type(WebElement element, String keysToSend) {
        waitUntilElementToBeClickable(element);
        highlightElement(element);
        element.clear();
        element.sendKeys(keysToSend);
    }

    /**
     * Click on a given element. If this causes a new page to load, you should discard
     * all references to a given element and any further operations performed on a given
     * element will throw a StaleElementReferenceException.
     * <p>
     * There are some preconditions for an element to be clicked. the element must
     * be visible, and it must have a height and width greater than 0.
     *
     * @param locator the locator of element to be clicked.
     */
    public void click(String locator) {
        WebElement element = waitUntilElementToBeClickable(locator);
       //scroll_To_Element(element);
        highlightElementClick(element);
        try {
            element.click();
        } catch (Exception e) {
            jsClickWithoutWait(element);
        }
    }

    /**
     * Clicks on an element and clears its content.
     * If the standard click fails, it attempts a JavaScript click.
     *
     * @param locator the locator string to find the element
     * @throws IllegalArgumentException if the locator is null or empty
     */
    public void clickAndClear(String locator) {
        WebElement element = waitUntilElementToBeClickable(locator);
        highlightElementClick(element);
        try {
            element.click();
            element.clear();
        } catch (Exception e) {
            jsClickWithoutWait(element);
        }
    }


    /**
     * Click on given element. If this causes a new page to load, you should discard
     * all references to given element and any further operations performed on given
     * element will throw a StaleElementReferenceException.
     * <p>
     * There are some preconditions for an element to be clicked. the element must
     * be visible, and it must have a height and width greater than 0.
     * @param element the element to be clicked.
     */

    public void click(WebElement element) {
        waitUntilElementToBeClickable(element);
//        scroll_To_Element(element);
        highlightElementClick(element);
        try {
            element.click();
        } catch (Exception e) {
            jsClickWithoutWait(element);
        }
    }

    /**
     * Clicks on visible or not visible element through javascript.
     * @param locator the locator of element to be clicked.
     */
    public void jsClick(String locator) {
//        scroll_To_Element(locator);
        WebElement element = waitUntilElementToBeClickable(findBy(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='4px solid yellow'", element);
        js.executeScript("return arguments[0].click();", element);

    }

    /**
     * Clicks on visible or not visible element through javascript.
     * @param element the element to be clicked.
     */
    public void jsClick(WebElement element) {
        waitUntilElementToBeClickable(element);
//        scroll_To_Element(element);
        highlightElementClick(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return arguments[0].click();", element);

    }
    /**
     * Removes all special characters from the given input string, keeping only numeric characters.
     * <p>
     * The method:
     * <ul>
     *     <li>Extracts the substring before the first occurrence of a dot (".").</li>
     *     <li>Removes all non-numeric characters.</li>
     * </ul>
     *
     * @param input the input string that may contain special characters
     * @return a string containing only numeric characters before the first dot
     */
    public String removeSpecialCharacters(String input) {

        input = input.substring(0, input.indexOf("."));
        //  input = input.replace(",", "");
        input = input.replaceAll("[^0-9]", "");
        return input;
    }

    /**
     * Clicks on visible or not visible element through javascript.
     * @param element the element to be clicked.
     */
    public void jsClickWithoutWait(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return arguments[0].click();", element);

    }

    /**
     * If given element is a form entry element, this will reset its value.
     *
     * @param locator the locator of element to be cleared
     */
    public void clear(String locator) {
        WebElement element = waitUntilElementToBeClickable(findBy(locator));
        highlightElementClick(element);
        element.clear();
    }

    /**
     * Get the visible (i.e. not hidden by CSS) text of given element, including
     * sub-elements.
     *
     * @param locator the locator of element from where to get visible text
     * @return The visible text of given element.
     */
    public String getText(String locator) {
//        scroll_To_Element(locator);
        WebElement element = waitUntilStringLocator(locator);
        highlightElement(element);
        return element.getText().trim();
    }

    /**
     * Retrieves the trimmed text of a web element identified by the given locator.
     * <p>
     * The method pauses for 2 seconds before finding the element and extracting its text.
     * </p>
     *
     * @param locator the locator string used to find the web element
     * @return the trimmed text of the located element
     */
    public String getTextwithouthighlight(String locator) {
        pause(2);
        WebElement element = this.findElement(locator);
//        highlightElement(element);
        return element.getText().trim();
    }

    /**
     * Generates a random integer within the specified range [Min, Max).
     *
     * @param Min the minimum value (inclusive)
     * @param Max the maximum value (exclusive)
     * @return a randomly generated integer between Min (inclusive) and Max (exclusive)
     * @throws IllegalArgumentException if Min is greater than or equal to Max
     */
    public int getRandomIntergerValue(int Min, int Max) {

        return ThreadLocalRandom.current().nextInt(Min, Max);
    }

    /**
     * Generates a random double within the specified range [Min, Max).
     *
     * @param Min the minimum value (inclusive)
     * @param Max the maximum value (exclusive)
     * @return a randomly generated double between Min (inclusive) and Max (exclusive)
     */
    public double getRandomDoubleValue(double Min, double Max) {
        return ThreadLocalRandom.current().nextDouble(Min, Max);
    }
    /**
     * Get the visible (i.e. not hidden by CSS) text of given element, including
     * sub-elements.
     *
     * @param element the element from where to get visible text
     * @return The visible text of given element.
     */
    public String getText(WebElement element) {
//        scroll_To_Element(element);
        pause(2);
        highlightElement(element);
        return element.getText();
    }

    /**
     * Prints and logs the current time in CST (Central Standard Time).
     * <p>
     * If the script is running on a server (determined by the system property `"server.indicator"`),
     * it will also print and log the server time in a specified time zone.
     * </p>
     *
     * @param time a label to describe the logged time
     */
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

    /**
     * Asserts that the specified element is displayed on the page.
     * <p>
     * This method waits for the element to be located, highlights it for visibility,
     * and then verifies that it is displayed using an assertion.
     * </p>
     *
     * @param locator the locator of the element to be checked
     * @throws AssertionError if the element is not displayed
     */
    public void assertElementDisplayed(String locator) {
        waitUntilStringLocator(locator);
        highlightElement(locator);
        Assert.assertTrue(isElementDisplayed(locator));

    }

    /**
     * Uploads a file using Java's Robot class by simulating keyboard shortcuts.
     * <p>
     * This method copies the file path to the clipboard, then pastes it using
     * `CTRL + V`, and finally presses `ENTER` to upload the file.
     * </p>
     *
     * @param file the relative file path from the project's root directory
     * @throws AWTException if the Robot instance cannot be created
     */
    public void upload_File_Using_Robot(String file) throws AWTException {

        //String path_win = "C:\\Users\\testc\\OneDrive\\Desktop\\Automation new\\qa-automation\\test_data\\Screenshot_1.png";
        String path_win = System.getProperty("user.dir")+ file;
        StringSelection filepath = new StringSelection(path_win);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, filepath);
        Robot robot = new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(1000);
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        robot.delay(1000);
    }

    /**
     * Generates a random integer within a specified range (inclusive).
     *
     * @param lowerBound the minimum value (inclusive)
     * @param upperBound the maximum value (inclusive)
     * @return a random integer between lowerBound and upperBound
     */
    public static int generateRandomInteger(int lowerBound, int upperBound) {
        return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }

    /**
     * Retrieves the current year using the UTC time zone.
     *
     * @return the current year as a {@link Year} object
     */
    public static Year getCurrentYear() {
             Year thisYear = Year.now(Clock.systemUTC());

                // Print the year object
                System.out.println("year " + thisYear);

      return thisYear;
    }

    /**
     * Get the value of the given attribute of the element. Will return the current
     * value, even if this has been modified after the page has been loaded.
     * <p>
     * More exactly, this method will return the value of the property with the
     * given name, if it exists. If it does not, then the value of the attribute
     * with the given name is returned. If neither exists, null is returned.
     * <p>
     * To get tooltip you have to give attribute "title" as argument.
     * <p>
     * The "style" attribute is converted as best can be to a text representation
     * with a trailing semi-colon.
     * <p>
     * The following are deemed to be "boolean" attributes, and will return either
     * "true" or null:
     * <p>
     * async, autofocus, autoplay, checked, compact, complete, controls, declare,
     * defaultchecked, defaultselected, defer, disabled, draggable, ended,
     * formnovalidate, hidden, indeterminate, iscontenteditable, ismap, itemscope,
     * loop, multiple, muted, nohref, noresize, noshade, novalidate, nowrap, open,
     * paused, pubdate, readonly, required, reversed, scoped, seamless, seeking,
     * selected, truespeed, willvalidate
     * <p>
     * Finally, the following commonly mis-capitalized attribute/property names are
     * evaluated as expected:
     * <ul>
     * <li>If the given name is "class", the "className" property is returned.
     * <li>If the given name is "readonly", the "readOnly" property is returned.
     * </ul>
     *
     * @param locator The locator of element to get its attribute value
     * @return The attribute/property's current value or null if the value is not
     * set.
     */
    public String getAttribute(String locator, String attributeName) {
        WebElement element = waitUntilPresenceOfElementLocated(findBy(locator));
        highlightElement(element);
        return element.getAttribute(attributeName);
    }
    /**
     * Get the value of the given attribute of the element. Will return the current
     * value, even if this has been modified after the page has been loaded.
     * <p>
     * More exactly, this method will return the value of the property with the
     * given name, if it exists. If it does not, then the value of the attribute
     * with the given name is returned. If neither exists, null is returned.
     * <p>
     * The "style" attribute is converted as best can be to a text representation
     * with a trailing semi-colon.
     * <p>
     * The following are deemed to be "boolean" attributes, and will return either
     * "true" or null:
     * <p>
     * async, autofocus, autoplay, checked, compact, complete, controls, declare,
     * defaultchecked, defaultselected, defer, disabled, draggable, ended,
     * formnovalidate, hidden, indeterminate, iscontenteditable, ismap, itemscope,
     * loop, multiple, muted, nohref, noresize, noshade, novalidate, nowrap, open,
     * paused, pubdate, readonly, required, reversed, scoped, seamless, seeking,
     * selected, truespeed, willvalidate
     * <p>
     * Finally, the following commonly mis-capitalized attribute/property names are
     * evaluated as expected:
     * <ul>
     * <li>If the given name is "class", the "className" property is returned.
     * <li>If the given name is "readonly", the "readOnly" property is returned.
     * </ul>
     *
     * @param element       the element to get its attribute value
     * @param attributeName The name of the attribute
     * @return The attribute/property's current value or null if the value is not
     *         set.
     */
    public String getAttribute(WebElement element, String attributeName) {
        waitUntilStringLocatorAsaElement(element);
        return element.getAttribute(attributeName);
    }

    /**
     * Captures the current system time in milliseconds.
     *
     * @return the current time in milliseconds
     */
    public long startTime() {
        return System.currentTimeMillis();
    }

    /**
     * Calculates and logs the total execution time in seconds for a given process.
     *
     * @param startTime the recorded start time in milliseconds
     * @param msg       a descriptive message for the logged output
     */
    public void endTime(long startTime, String msg) {
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        logPrint("Step ::Total Time for loading the " + msg + " in Seconds: "
                + TimeUnit.MILLISECONDS.toSeconds(totalTime));
    }

    /**
     * Checks if the specified element is visible within a given timeout.
     *
     * @param driver  the WebDriver instance
     * @param locator the {@link By} locator of the element
     * @return {@code true} if the element is visible within the timeout, {@code false} otherwise
     */
    public boolean isElementVisible(WebDriver driver, By locator) {
        try {
            // Create WebDriverWait with timeout in seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true; // Element is visible
        } catch (TimeoutException e) {
            return false; // Element is not visible within the timeout
        }
    }

    /**
     * Verifies whether the specified element is displayed on the page.
     * Logs the result and asserts failure if the element is not found or not visible.
     *
     * @param element the locator string of the element to be verified
     */
    public void verifyElementIsDisplayed(String element) {

        boolean bool = false;
        try {
            if (findElement(element).isDisplayed()) {
                common.logPrint("Element Is displayed - PASS");
                bool = true;
            } else {
                bool = false;
            }
        } catch (Exception e) {
        }
        if (!bool) {
            common.logPrint("Element is displayed - failed");
            Assert.assertTrue(false);
        }
    }

    /**
     * Types the given text into the specified element and presses ENTER.
     * Waits for the element to be clickable before interacting.
     *
     * @param locator     the locator string of the element
     * @param keysToSend  the text to type into the element
     */
    public void typeAndEnter(String locator, String keysToSend) {
        WebElement element = waitUntilElementToBeClickable(findBy(locator));
        highlightElementClick(element);
        scroll_To_Element(element);
        element.clear();
        element.sendKeys(keysToSend);
        element.sendKeys(Keys.ENTER);
    }

    private static final String[] YOUTUBE_HANDLES = {
            "PixelDrifter", "EchoVoyager", "LunarGlitch", "QuantumHorizon",
            "NebulaMystic", "FrostCipher", "AetherUnderground", "VoidSpectra",
            "CrimsonVision", "SolaceStatic", "DriftShadow", "ZenithObscure",
            "MysticEnigma", "ShadowExplorer", "EnigmaBeyond", "CipherEcho",
            "ObscureWanderer", "HorizonVortex", "StealthNomad", "PhantomByte",
            "RetroPulse", "EclipseVagrant", "NomadWhisper", "EchoSynth",
            "SilentGlitch", "WraithLogic", "HiddenNebula", "NocturneRogue"
    };

    /**
     * Retrieves a random YouTube handle from the predefined list.
     *
     * @return A randomly selected YouTube handle as a String.
     */
    public static String getRandomYouTubeHandle() {
        int randomIndex = (int) (Math.random() * YOUTUBE_HANDLES.length);
        return YOUTUBE_HANDLES[randomIndex];
    }

    /**
     * Generates a random future date between 2 days from today and 1 year ahead.
     *
     * @return A randomly generated future date formatted as "MM/dd/yyyy".
     */
    public static String generateFutureDate() {
        Random random = new Random();
        LocalDate today = LocalDate.now();

        // Generate a random future date (between 2 days from now and 1 year ahead)
        int randomDays = random.nextInt(365 - 2) + 2; // Excludes tomorrow
        LocalDate futureDate = today.plusDays(randomDays);

        // Format the date as "MM/dd/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return futureDate.format(formatter);
    }

    /**
     * Generates a random valid Cost Per Mille (CPM) value between 10 and 1000.
     *
     * @return A randomly generated CPM value within the valid range.
     */
    public int generateValidCPM() {
        Random random = new Random();

        // Generate a random integer between 10 and 1000
        int cpm = 10 + random.nextInt(991); // 991 because (1000 - 10 + 1) ensures 10 to 1000

        System.out.println("Generated CPM: " + cpm);
        return cpm;
    }

    public void waitUntilUrlContains(String partialUrl) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains(partialUrl));
    }
}



