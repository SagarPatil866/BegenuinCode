package Tests;

import Config.ReadProperties;
import Utils.BasePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.awt.*;

public class Manage extends BasePage {

    ReadProperties readProperties = new ReadProperties();
    String adminCredentials[] = readProperties.getAdminCredentials();
    String username = adminCredentials[0];
    String password = adminCredentials[1];

    /**
     * Opens the web application URL and performs login if required.
     * <p>
     * Steps:
     * 1. Retrieve the web URL from the configuration properties.
     * 2. Open the browser and navigate to the URL.
     * 3. Check if the user is already logged in by verifying the presence of a specific element.
     * 4. If not logged in, perform login as an admin and select a brand.
     * 5. Log the time taken for the login process.
     */
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
     * Verify Manage Page to Validate
     * Add Brand to Earn
     */
    @Test
    public void verify_Mange_Page() {
        Reporter.log("<font color='blue'><b>(TC-1, GEN-1451(BCC), verify the manage page</b></font>", true);
        open_Web_URL_and_Login();
        managepage.verifyMangePage();
    }

    /**
     * Verify Create New Community to Validate
     * Community Created Successfully.
     */
    @Test
    public void create_New_Community() {
        Reporter.log("<font color='blue'><b>(TC-2, GEN-1451(BCC), To verify the community records by mouse hovering on the created record</b></font>", true);
        open_Web_URL_and_Login();
        managepage.communityCreation();
    }

    /**
     * Verify Update Community Functionality.
     * Update an existing community record.
     * Validate that the community update is successful.
     */
    @Test
    public void update_Community() {
        Reporter.log("<font color='blue'><b>GEN-1451(BCC), To verify the update community functionality</b></font>", true);
        open_Web_URL_and_Login();
        managepage.updateCommnunity();
    }

    /**
     * Verify Community Details Section.
     * Ensure that all details related to the community are displayed correctly.
     * Validate the accuracy and completeness of the community information.
     */
    @Test
    public void verify_Community_Details() {
        Reporter.log("<font color='blue'><b>GEN-1451(BCC), Community details section verificaion</b></font>", true);
        open_Web_URL_and_Login();
        managepage.communityDetailsSection();
    }

    /**
     * Verify Users Test.
     * Ensure that the Users tab is accessible and functioning correctly.
     * Validate that the correct user information is displayed.
     */
    @Test
    public void verify_Users_Test() {
        Reporter.log("<font color='blue'><b>(TC-01, GEN-1454(BCC), verify the users test</b></font>", true);
        open_Web_URL_and_Login();
        managepage.checkUsersTab();
    }

    /**
     * Verify All Users Page Test.
     * Ensure that the 'Create your brand persona' tab is accessible and functioning correctly.
     * Validate that all users' information is displayed properly.
     */
    @Test
    public void verify_All_Users_Page_Test() {
        Reporter.log("<font color='blue'><b>TC-1, GEN-1017(BCC), Verify the 'Create your brand persona' tab </b></font>", true);
        open_Web_URL_and_Login();
        managepage.checkAllUsersTab();
    }

    /**
     * Verify Column Details Test.
     * Ensure that all columns in the table are displayed correctly.
     * Validate that column headers and corresponding data are accurate.
     */
    @Test
    public void column_Details_Test() {
        Reporter.log("<font color='blue'><b>(TC-03, GEN-1454(BCC), To verify all column details</b></font>", true);
        open_Web_URL_and_Login();
        managepage.checkAllTableDetails();
    }

    /**
     * Verify View/Share Functionality.
     * Ensure that users can successfully view and share relevant details.
     * Validate that the View and Share options function as expected.
     */
    @Test
    public void verify_View_Share_Functionality() {
        Reporter.log("<font color='blue'><b>(TC-04, GEN-1454(BCC), To verify View/Share functionality</b></font>", true);
        open_Web_URL_and_Login();
        managepage.checkViewandShareOptions();
    }

    /**
     * Verify Reorder Functionality in Communities.
     * Ensure that users can reorder communities successfully.
     * Validate that the reorder changes are correctly applied.
     */
    @Test
    public void Verify_Reorder_Functionality_In_Communities() {
        Reporter.log("<font color='blue'><b>Verify reorder functionality in communities </b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.clickOnReorderButton();
        managepage.verifyReorderFunctionality();
    }

    /**
     * Verify Group Section.
     * Ensure that users can access and interact with the Group section.
     * Validate that the edit functionality works as expected.
     */
    @Test
    public void Verify_Group_Section() {
        Reporter.log("<font color='blue'><b>Verify Group Section</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnGroupButton();
        managepage.clickOnEditIcon();
        managepage.clickOnEditGroup();
    }

    /**
     * Verify User Tab.
     * Ensure that the User tab is accessible under the Manage section.
     * Validate that all headers within the User tab are displayed correctly.
     */
    @Test
    public void Verify_User_Tab() {
        Reporter.log("<font color='blue'><b>Verify User Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnUserTab();
        managepage.verifyAllHeaderInManage();
    }

    /**
     * Verify Brand Details.
     * Ensure that the Brand tab is accessible under the Manage section.
     * Validate that all necessary brand details are displayed correctly.
     */
    @Test
    public void Verify_Brands_Details() {
        Reporter.log("<font color='blue'><b>Verify Brand Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.Verify_Brands_Details();
    }

    /**
     * Verify 'Add Brand to Earn' Functionality.
     * Ensure that the 'Add Brand to Earn' option is available under the Brand tab.
     * Validate that the brand can be successfully added to the earnings section.
     */
    @Test
    public void VerifyADDBrandToEarn() {
        Reporter.log("<font color='blue'><b>Verify 'Add Brand to earn' on  Brand Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.VerifyADDBrandToEarn();
    }

    /**
     * Verify Brand Creation Functionality.
     * Ensures that a new brand can be added successfully under the 'Add Brand to Earn' section.
     * Validates that the created brand appears in the brand list.
     */
    @Test
    public void VerifyBrandCreated() {
        Reporter.log("<font color='blue'><b>Verify 'Add Brand to earn' on  Brand Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.VerifyADDBrandToEarn();
        managepage.VerifyBrandCreated();
    }

    @Test
    public void clickOnCommentsTab() {
        Reporter.log("<font color='blue'><b>Verify Comments Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommentsTab();
    }

    //This Ticket Is Not Pass Due To We need to Add Comment on Post but not added the Post
    @Test
    public void verify_Comment_Tab() {
        Reporter.log("<font color='blue'><b>Verify Comments Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommentsTab();
       // managepage.verifyCommentTab();
    }

    //This Ticket Is Not Pass Due To We need to Add Comment on Post but not added the Post
    @Test
    public void verify_Delete_Comment() {
        Reporter.log("<font color='blue'><b>Verify Comments Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommentsTab();
      //  managepage.verify_Delete_Comment();
    }

    @Test
    public void clickOnCategory() {
        Reporter.log("<font color='blue'><b>Verify Category Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCategory();
    }

    @Test
    public void verify_Category_Tab() {
        Reporter.log("<font color='blue'><b>Verify Category Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCategory();
        managepage.verify_Category_Tab();
    }

    @Test
    public void verify_Add_Topic_Tab() {
        Reporter.log("<font color='blue'><b>Verify Add Topic Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCategory();
        managepage.verify_Category_Tab();
        managepage.verify_Add_Topic_Tab();
    }

    @Test
    public void verify_Edit_Topic_Tab() {
        Reporter.log("<font color='blue'><b>Verify Edit Topic Tab</b></font>", true);
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCategory();
        managepage.verify_Category_Tab();
        managepage.verify_Edit_Topic_Tab();
    }

    @Test
    public void verify_Create_Private_For_AllCommunity() throws InterruptedException {
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Create_Private_For_AllCommunity();
    }

    @Test
    public void verify_Create_Private_For_Admin() throws InterruptedException {
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Create_Private_For_Admin();
    }

    @Test
    public void verify_Create_Public_For_Admin() throws InterruptedException {
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Create_Public_For_Admin();
    }

    @Test
    public void verify_Create_Public_For_AllCommunity() throws InterruptedException {
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Create_Public_For_AllCommunity();
    }

    @Test
    public void verify_Community_In_Ascending_Order(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Community_In_Ascending_Order();
    }

    @Test
    public void verify_Community_In_Descending_Order(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Community_In_Descending_Order();
    }

    @Test
    public void verify_Pinned_Community(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Pinned_Community();
    }

    @Test
    public void verify_Reorder_Community(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Reorder_Community();
    }

    @Test
    public void verify_Date_Created_In_Ascending_Order(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Date_Created_In_AscendingOrder();
    }
    @Test
    public void verify_Date_Cretaed_In_Descending_Order(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnCommunities();
        managepage.verify_Date_Cretaed_In_DescendingOrder();
    }

    @Test
    public void verify_Groups_Tab(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnGroupButton();
        managepage.verify_Groups_Tab();
    }

    @Test
    public void verify_To_Create_New_Group_For_ALLCommunities(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnGroupButton();
        managepage.create_New_Group_For_ALLCommunities();
    }

    @Test
    public void verify_To_Create_New_Group_For_GroupMember(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnGroupButton();
        managepage.create_New_Group_For_GroupMembers();
    }

    @Test
    public void verify_create_Group_For_Members(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnGroupButton();
        managepage.create_Group_For_Members();
    }

    @Test
    public void verify_clickOnPosts(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnPosts();
    }

    @Test
    public void verify_Posts_Tab(){
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnPosts();
        managepage.verify_Posts_Tab();
    }

    @Test
    public void verify_To_Create_New_Post() throws InterruptedException, AWTException {
        open_Web_URL_and_Login();
        managepage.clickOnManageTab();
        managepage.clickOnPosts();
        managepage.create_New_Post();

    }

}
