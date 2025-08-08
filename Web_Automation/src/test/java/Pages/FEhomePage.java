package Pages;

import Utils.Locators;
import Utils.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FEhomePage extends Locators {
    Common common = new Common(driver);
    private Actions actions;  // Declare the Actions object

    public FEhomePage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);  // Initialize the Actions object
    }

    public void clickOnPopular() {
        common.click(POPULAR_OPTION);
        common.logPrint("Step ::Click on popular button");
    }

    public void verifyHeader() {
        // Use the HEADER_FRONTEND constant from Locators class
        By headerLocator = By.xpath(HEADER_FRONTEND);

        // Wait for the header to be visible using long for timeout (for Selenium 3.x)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // DRIVER_WAIT is in seconds as a long
        WebElement headerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(headerLocator));

        // Check if the header is displayed
        if (headerElement.isDisplayed()) {
            common.logPrint("Step ::Header is visible on the page.");
        } else {
            common.logPrint("Step ::Header is not visible on the page.");
        }
    }

    public void verifyPopupIsVisible() {
        // Initialize WebDriverWait with the correct syntax for Selenium 3.x (using long)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use long for timeout in seconds

        // Define the popup locator
        By popupLocator = By.xpath(POPUP_VISIABLE);

        try {
            // Wait for the popup to become visible
            WebElement popupElement = wait.until(ExpectedConditions.visibilityOfElementLocated(popupLocator));

            // Verify if the popup is displayed
            if (popupElement.isDisplayed()) {
                common.logPrint("Step ::Popup is visible after clicking the Login button.");
            } else {
                common.logPrint("Step ::Popup is NOT visible after clicking the Login button.");
            }
        } catch (Exception e) {
            common.logPrint("Step ::Error occurred while checking popup visibility: " + e.getMessage());
        }
    }

    public void clickOnHomeButton() {
        common.click(HOME_OPTION);
        common.logPrint("Step ::Clicked on Download Button");
    }

    public void clickOnLogIn() {
        common.click((Log_In));
        common.logPrint("Step ::Click on login Button");
    }

    public void changeVideoFeedByArrowPress() {
        // Wait for the video feed element to be visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement videoFeedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(VIDEO_FEED)));

        // Loop to change the video feed 5 times
        for (int i = 0; i < 5; i++) {
            try {
                // Focus on the video feed element to make sure it's active
                actions.moveToElement(videoFeedElement).click().perform();  // Perform the click action
                common.logPrint("Step ::Focused on the video feed element.");

                // Simulate pressing the "Arrow Down" key to select the next video
                actions.sendKeys(Keys.ARROW_DOWN).perform();  // Perform the "Arrow Down" action
                common.logPrint("Step ::Pressed 'Arrow Down' to move to the next video feed.");

                // Wait for the video feed to change
                wait.until(ExpectedConditions.stalenessOf(videoFeedElement));  // Wait until the element is no longer in the DOM
                videoFeedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(VIDEO_FEED))); // Wait for the element to be updated

                common.logPrint("Step ::Video feed updated after pressing Arrow Down.");

                // Optionally, add a delay between key presses to simulate user behavior
                common.pause(3);  // This could be a custom method that waits for 3 seconds

            } catch (Exception e) {
                common.logPrint("Step ::Error while changing video feed: " + e.getMessage());
            }
        }
    }

    public void enterEmailAndClickOnContinue(String frontendUserName) {
        common.logPrint("Step ::Click on email field");
        common.click(EMAIL_FIELD);
        common.logPrint("Step ::Enter the email");
        common.type(EMAIL_FIELD, frontendUserName);
        common.logPrint("Step ::Enter email:" + frontendUserName);
        common.pause(3);
        common.click(CONTINUE_BUTTON);
        common.logPrint("Step ::Click on continue");
    }

    public void enterOTPAndVerify(String frontendPassWord) {
        common.logPrint("Step ::Enter in enter otp");
        common.click(ENTER_OTP);
        common.logPrint("Step ::Click on OTP");
        common.type(ENTER_OTP, frontendPassWord);
        common.logPrint("Step ::Fill otp" + frontendPassWord);
        common.pause(3);
        common.click(VERIFY_BUTTON);
        common.logPrint("Step ::Click on verify buttons");
    }

    public void approveBrandGuidelines() {
        common.logPrint("Step ::Go to brand guidelines");
        common.click(CheckboxBrandGuidelines);
        common.logPrint("Step ::Click on checkbox of brand guidelines");
        common.pause(2);
        common.click(VERIFY_BUTTON);
        common.logPrint("Step ::Click on continue button");
    }

    public void clickthreeTopic() {
        common.logPrint("Step ::Click three Topic");
        common.click(ClickFirstInterest);
        common.logPrint("Step ::Click first topic");
        common.pause(1);
    }

}

