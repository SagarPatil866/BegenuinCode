package Tests;

import Config.ReadProperties;
import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.time.Duration;

public class Engage extends BasePage {

    ReadProperties readProperties = new ReadProperties();
    String adminCredentials[] = readProperties.getAdminCredentials();
    String username = adminCredentials[0];
    String password = adminCredentials[1];

    private void open_Web_URL_and_Login() {
        long startTime = common.startTime();
        String urlToOpen = readProperties.getWebUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);
        driver.get(urlToOpen);
        String xpath = "//span[@title='Shivani Kada']";

        if (!common.existsElement(xpath)) {
            dashboardpage.loginAsAdmin(username, password);
            dashboardpage.selectBrand();
            common.endTime(startTime, "<br>" + "<b><span style='color:red;'>login to home page time</span></b>" + "</br>");
//			buildPage.createBrandPersona();
        }

    }

    /**
     * Verify Video Upload Functionality.
     * Navigates to the Engage Engine folder and performs a video upload process.
     * Steps:
     * - Opens the web URL and logs in.
     * - Clicks on the Engage Engine button.
     * - Initiates video import.
     * - Uploads a folder and selects a file for upload.
     * - Confirms the import process and verifies success message.
     */
    @Test
    public void Upload_Video() {
        Reporter.log("<font color='blue'><b>Video Upload in Engage Engine folder</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        common.pause(2);
        engagePage.clickOnImportButton();
        common.pause(3);
        engagePage.clickOnUploadFolderButton();
        common.pause(3);
        engagePage.clickOnFileUploadButton();
        common.pause(10);
        engagePage.clickOnImportButton();
        common.pause(3);
        engagePage.verify_Message();
    }
    /**
     * Verify Video Deletion in Activity Dashboard.
     * This test case ensures that a video can be successfully deleted from the Activity section.
     * <p>
     * Steps:
     * 1. Open the web URL and log in.
     * 2. Navigate to Engage Engine and open the Activity Dashboard.
     * 3. Click on the Pending tab and proceed to the next page.
     * 4. Hover over the first video box to reveal options.
     * 5. Click on the "View" button to open the video details.
     * 6. Verify that the required element is visible on the page.
     * 7. Click on the "Delete" button to remove the video.
     * 8. Confirm the deletion by clicking on "Confirm and Delete."
     * 9. Validate that the video has been successfully deleted.
     */
    @Test
    public void delete_Video_In_Activity() {
        // Log the start of the test
        Reporter.log("<font color='blue'><b>Test started: Video deletion without error</b></font>", true);

        // Step 1: Open the URL and log in
        open_Web_URL_and_Login();

        // Step 2: Navigate to Engage Engine and Activity Dashboard
        engagePage.clickOnEngageEngineButton();
        engagePage.ClickOnActivity();

        // Step 3: Click on the Pending tab
        engagePage.ClickOnPendingButton();
        engagePage.ClickOnNextButton();

        common.pause(10);
        // Step 4: Hover over the first box
        WebElement firstBox = driver.findElement(By.xpath("//img[@alt='text'][last()]"));
        common.scroll_To_Element(firstBox);
        common.mouseOver(driver, firstBox); // Hover over the box
        common.logPrint("Step :: Hovered over the first video box");

        // Step 5: Wait for the View button to become visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement viewButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[normalize-space(text())='View']")
        ));

        // Step 6: Click on the View button
        common.mouseOverClick(viewButton);
        common.logPrint("Step :: Clicked on View Button");

        //step 7 : click on reject button
        common.click("//button[@class='btn btn-outline-danger border-transparent']");
        common.logPrint("Step :: Click on reject button");

        // step 8 : enter text
        common.click("//textarea[@id='reason']");
        common.type("//textarea[@id='reason']", common.generateRandomChars(10));
        common.logPrint("Step :: entering text in the text area");

        // step 9 : click on final reject button
        common.pause(5);
        common.click("//button[@type='submit']");
        common.logPrint("Step :: click on final reject button");

    }

    /**
     * Verifies the functionality of adding, saving, and deleting a YouTube handle in the social import and settings section.
     * This test includes the following steps:
     * 1. Logs into the application and navigates to the Engage Engine page.
     * 2. Clicks on the "Import Video" and "Social Import" buttons to access the social media settings.
     * 3. Expands the section and manages social handles.
     * 4. Adds a new YouTube handle, saves the changes, and verifies the success message.
     * 5. Repeats the process to ensure consistency and verifies the ability to delete the added YouTube handle.
     * 6. Saves the deletion and ensures the handle is removed.
     */
    @Test
    public void verify_Youtube_Handle_In_social_Import_And_Settings() {
        Reporter.log("<font color='blue'><b>Verify youtube handle in social import and setting</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.ClickOnImportVideo();
        engagePage.ClickOnSocialImportButton();
        engagePage.ClickOnExpandArrow();
        engagePage.ClickOnManageHandles();
        common.pause(5);
        common.refreshPage();

        //      try {
        //        common.click("(//*[@class= 'form-control'])[last()]");
        //       System.out.println("Click action performed successfully.");
        //   } catch (Exception ignored) {
        //  }

        engagePage.ClickOnAddSocialHandle();
        engagePage.AddYoutubeHandle();
        engagePage.ClickOnSaveButton();
        engagePage.VerifyMessage1();
        engagePage.clickOnEngageEngineButton();
        engagePage.ClickOnImportVideo();
        engagePage.ClickOnSocialImportButton();
        engagePage.ClickOnExpandArrow();
        engagePage.ClickOnManageHandles();
        common.pause(3);
        engagePage.ClickOnDelete();
        engagePage.ClickOnSaveButton();
    }

    @Test
    public void verify_Data_Logs_For_SocialImport() {
        Reporter.log("<font color='blue'><b>Verify Data Log For Social Imports</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.verify_Data_Logs();
    }

    @Test
    public void verify_Data_Logs_For_Uploads() {
        Reporter.log("<font color='blue'><b>Verify Data Log For Uploads</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.verify_Data_Logs_For_Upload();
    }

    @Test
    public void verify_Data_Logs_For_ClipIt() {
        Reporter.log("<font color='blue'><b>Verify Data Log For Uploads</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.verify_Data_Logs_For_ClipIt();
    }

    @Test
    public void verify_Engage_Page(){
        Reporter.log("<font color='blue'><b>Verify Engage Page</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.verify_Engagepage();

    }
    /**
     * Verify Edit Community Functionality
     */

    @Test
    public void verify_Edit_Community()  {
        Reporter.log("<font color='blue'><b>Verify Edit Community</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.clickOnEditCommunity();
        engagePage.verify_Edit_Community();
    }
    @Test
    public void verify_Edit_Group(){
        Reporter.log("<font color='blue'><b>Verify Edit Group</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        common.pause(5);
        engagePage.verify_Edit_Group();
    }

    @Test
    public void verify_Video_Count_For_All_Community(){
        Reporter.log("<font color='blue'><b>Verify Video Count For All Community</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        common.pause(5);
        engagePage.verify_Video_Count_On_All_Tab();
    }
    @Test
    public void verify_Video_Counts(){
        Reporter.log("<font color='blue'><b>Verify Video Count Functionality</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        common.pause(5);
        engagePage.verify_Video_Count_On_Pending_Tab();
        engagePage.verify_Video_Count_On_Approved_Tab();
        engagePage.verify_Video_Count_On_Rejected_Tab();
    }
    @Test
    public void verify_Communities_Details_For_All_Page(){
        Reporter.log("<font color='blue'><b>Verify Communities Details For All Page</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.verify_Communities_For_All_Pages();
        common.pause(3);
    }

    @Test
    public void verify_Import_Videos(){
        Reporter.log("<font color='blue'><b>Verify Import videos </b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.clickOnImportVideos();
        engagePage.verify_Import_Videos();
    }

    @Test
    public void verify_Social_Imports(){
        Reporter.log("<font color='blue'><b>Verify Social Import</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.clickOnImportVideos();
        engagePage.verify_Social_Imports();
        common.pause(10);
    }

    @Test
    public void verify_Uploads() {
        Reporter.log("<font color='blue'><b>Verify Uploads</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.clickOnImportVideos();
        engagePage.verify_Uploads();
    }

    @Test
    public void verify_Clip_It(){
        Reporter.log("<font color='blue'><b>Verify Clip it</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.clickOnImportVideos();
        engagePage.verify_Clip_It();
    }
    @Test
    public void verify_Upload_Youtube_Link_For_Clip_It(){
        Reporter.log("<font color='blue'><b>Verify Upload video on Clip it using youtube link</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.clickOnImportVideos();
        engagePage.upload_Youtube_Link_For_Clip_It();
        common.pause(10);
    }
    @Test
    public void verify_Upload_Video_For_Clip_It(){
        Reporter.log("<font color='blue'><b>Verify Upload video on Clip it</b></font>", true);
        open_Web_URL_and_Login();
        engagePage.clickOnEngageEngineButton();
        engagePage.clickOnImportVideos();
        engagePage.upload_Video_For_Clip_It();
    }
}
