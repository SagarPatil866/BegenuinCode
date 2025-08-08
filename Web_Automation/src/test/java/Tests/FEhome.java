package Tests;

import Config.ReadProperties;
import Utils.BasePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FEhome extends BasePage {
    ReadProperties readProperties = new ReadProperties();
    String frontendCredentials[] = readProperties.getAdminCredentials();
    String frontendUserName = frontendCredentials[0];
    String frontendPassWord = frontendCredentials[1];

    private void open_Web_FE_URL() {
        long startTime = common.startTime();
        String urlToOpen = readProperties.getFEUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);
        driver.get(urlToOpen);
        common.endTime(startTime, "<br>" + "<b><span style='color:red;'>login to home page time</span></b>" + "</br>");
    }

    /**
     * Verify Login or Signup Functionality.
     * Opens the frontend URL and attempts to log in or sign up.
     * Ensures that the login popup appears and verifies authentication using email and OTP.
     */
    @Test
    public void login_Or_Signup() {
        String urlToOpen = readProperties.getFEUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);
        driver.get(urlToOpen);
        common.pause(3);
        fEhomePage.clickOnLogIn();
        fEhomePage.verifyPopupIsVisible();
        fEhomePage.enterEmailAndClickOnContinue(frontendUserName);
        fEhomePage.enterOTPAndVerify(frontendPassWord);
//        fEhomePage.approveBrandGuidelines();
//        fEhomePage.clickthreeTopic();
    }

    /**
     * Verify Home Feed with 5 Videos.
     * Opens the frontend URL and navigates to the home feed.
     * Changes the video feed using arrow press functionality and verifies playback.
     */
    @Test
    public void home_Feed_With_5_Video() {
        String urlToOpen = readProperties.getFEUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);
        driver.get(urlToOpen);
        fEhomePage.clickOnHomeButton();
        common.pause(10);
        fEhomePage.changeVideoFeedByArrowPress();
        common.pause(10);
    }

    /**
     * Verify Popular Section Click Functionality.
     * Opens the frontend URL and navigates to the "Popular" section.
     * Ensures that clicking on the "Popular" tab functions correctly.
     */
    @Test
    public void verify_Popular() {
        Reporter.log("<font color='blue'><b>popular click</b></font>", true);
        open_Web_FE_URL();
        fEhomePage.clickOnPopular();
    }

    /**
     * Verify Header Visibility.
     * Opens the frontend URL and checks if the header is displayed.
     * Ensures that the header is visible on the webpage.
     */
    @Test
    public void verify_Header() {
        Reporter.log("<font color='blue'><b>Verify Header is visible</b></font>", true);
        open_Web_FE_URL();
        fEhomePage.verifyHeader();
    }

    /**
     * Verify Download Popup.
     * Opens the frontend URL, clicks on the login button,
     * and verifies that the download popup is displayed.
     */
    @Test
    public void verify_Download_Popup() {
        Reporter.log("<font color='blue'><b>Verify Download Popup</b></font>", true);
        open_Web_FE_URL();
        fEhomePage.clickOnLogIn();
        fEhomePage.verifyPopupIsVisible();
    }
}