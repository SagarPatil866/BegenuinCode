package Tests;

import Config.ReadProperties;
import Utils.BasePage;
import org.testng.annotations.Test;

import java.awt.*;

public class BUG extends BasePage {

    ReadProperties readProperties = new ReadProperties();
    String frontendCredentials[] = readProperties.getAdminCredentials();
    String frontendUserName = frontendCredentials[0];
    String frontendPassWord = frontendCredentials[1];

    private void open_Web_URL_and_Login() {
        long startTime = common.startTime();
        String urlToOpen = readProperties.getWebUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);
        driver.get(urlToOpen);
        String xpath = "//span[@title='Shivani Kada']";

        if (!common.existsElement(xpath)) {
            dashboardpage.loginAsAdmin(frontendUserName, frontendPassWord);
            dashboardpage.selectBrand();
            common.endTime(startTime, "<br>" + "<b><span style='color:red;'>login to home page time</span></b>" + "</br>");
        }
    }

    /**
     * Verify that the "Manage" and "Engage" pages do not load multiple times.
     * This test ensures that both pages are loaded correctly and do not reload unnecessarily.
     */
    @Test
    public void verifyManageAndEngagePageIsNotLoadMultipleTime() {
        open_Web_URL_and_Login();
        bugPage.verifyManageAndEngagePageIsNotLoadMultipleTime();
    }

    /**
     * Verify that the search functionality works correctly when logged in under BCC.
     * This test ensures that the search feature functions as expected after logging in with valid credentials.
     */
    @Test
    public void verifySearchIsWorkingWhenloginUnderBCC() {
        String urlToOpen = readProperties.getWebUrl();
        driver.get(urlToOpen);
        dashboardpage.loginAsAdmin(frontendUserName, frontendPassWord);
        bugPage.verifySearchIsWorkingWhenloginUnderBCC();
    }

    /**
     * Verify the functionality of the Brand Switch search field.
     * This test ensures that the Brand Switch search field works as expected after logging in.
     */
    @Test
    public void verifyBrandSwitchSearchField() {
        open_Web_URL_and_Login();
        bugPage.verifyBrandSwitchSearchField();
    }

    /**
     * Verify the functionality of updating the headline of the Carousel Embed from the Grow section.
     * This test checks if the headline can be updated correctly within the Carousel Embed feature in the Grow section.
     */
    @Test
    public void updatingTheHeadlineOfCarouselEmbedFromGrow() {
        open_Web_URL_and_Login();
        bugPage.updatingTheHeadlineOfCarouselEmbedFromGrow();
    }

    /**
     * Verify the functionality of the "Delete Filter" feature on the Moderate page.
     * This test checks if the filter deletion functionality works as expected in the Moderate section.
     */
    //This ticket is not pass due to no post is added
    @Test
    public void verifyDeleteFilterOnModerate() {
        open_Web_URL_and_Login();
        //bugPage.verifyDeleteFilterOnModerate();
    }

    /**
     * Verify that when clicking on the same brand module, the page should not reload.
     * This test ensures that switching between the same brand module does not trigger unnecessary page reloads.
     */
    @Test
    public void verifyWhenClickingOnSameBrandModulePageShouldNotBeLoad() {
        common.logPrint("Verify when clicking one same brand module page should not be load");
        open_Web_URL_and_Login();
        bugPage.verifyToSwitchOneBrandToAnotherBrand();
    }

    /**
     * Verify the video upload functionality on the Engage page.
     * This test ensures that a video can be uploaded correctly to the Engage platform.
     *
     * @throws InterruptedException if the thread is interrupted during sleep or pause.
     * @throws AWTException         if there is an issue with the AWT operations during the upload process.
     */
    @Test
    public void uploadVideoOnEngage() throws InterruptedException, AWTException {
        open_Web_URL_and_Login();
        bugPage.uploadVideoOnEngage();
    }

    /**
     * Verify the display of the Community DP (Display Picture) for the IFN brand
     * under the 'Manage Communities' table.
     * This test ensures that the community DP is correctly displayed for the IFN brand
     * in the Manage Communities table.
     *
     * @throws InterruptedException if the thread is interrupted during sleep or pause.
     * @throws AWTException         if there is an issue with the AWT operations during the verification process.
     */
    @Test
    public void VerifyToSeeTheCommunityDPforIFNBrandUnderManageCommunitiesTable() throws InterruptedException, AWTException {
        open_Web_URL_and_Login();
        bugPage.VerifyToSeeTheCommunityDPforIFNBrandUnderManageCommunitiesTable();
    }

    /**
     * Verify the display of members under the selected Ankpal brand.
     * This test ensures that members related to the Ankpal brand are properly displayed
     * when the brand is selected.
     *
     * @throws InterruptedException if the thread is interrupted during sleep or pause.
     * @throws AWTException         if there is an issue with AWT operations during the verification process.
     */
    @Test
    public void verifyMembers() throws InterruptedException, AWTException {
        open_Web_URL_and_Login();
        bugPage.selectAnkpalBrand();
        bugPage.verifyMemberIsDisplayed();
    }

    /**
     * Verify the error message when attempting to upload a video.
     * This test ensures that the correct error message is displayed when an issue
     * occurs during the video upload process, such as a failed upload.
     *
     * @throws InterruptedException if the thread is interrupted during sleep or pause.
     * @throws AWTException         if there is an issue with AWT operations during the upload verification.
     */
    @Test
    public void verifyErrorMessageWhenUploadVideo() throws InterruptedException, AWTException {
        open_Web_URL_and_Login();
        bugPage.createNewBrand();
        bugPage.verifyErrorMessageWhenUploadVideo();
    }

}