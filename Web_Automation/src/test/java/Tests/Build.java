package Tests;

import Config.ReadProperties;
import Utils.BasePage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Build extends BasePage {


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
//			deshboardpage.createBrandPersona();
        }

    }

    /**
     * Verify All Brand Elements Presence.
     * Ensure that the 'Create your brand persona' tab is accessible.
     * Validate that all necessary elements related to brand creation are displayed correctly.
     */
    @Test
    public void all_Brand_Elements_Present() {
        Reporter.log("<font color='blue'><b>TC-1, GEN-1017(BCC), Verify the 'Create your brand persona' tab </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.checkAllElementPresent();
    }

    /**
     * Verify Character Limit on Mission Field.
     * Ensure that the 'Mission' field enforces the expected character limit.
     * Validate that input beyond the limit is restricted or handled properly.
     */
    @Test
    public void verify_Character_Limit_On_Mission() throws Exception {
        Reporter.log("<font color='blue'><b>TC-6, GEN-1017(BCC), Verify the Character limits on the 'Mission' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.charLimitMission();
    }

    /**
     * Verify Character Limit on Mission Field with 300 Characters.
     * Ensure that the 'Mission' field allows entering exactly 300 characters.
     * Validate that the system correctly accepts or restricts the input if it exceeds the limit.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Character_Limit_On_Mission_Enter_300_Character() throws Exception {
        Reporter.log("<font color='blue'><b>TC-6, GEN-1017(BCC), Verify the Character limits on the 'Mission' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.enter300CharacterInMissionField();
    }

    /**
     * Verify Character Limit on Vision Field.
     * Ensure that the 'Vision' field enforces the expected character limit.
     * Validate that the system restricts or allows input as per the requirement.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Character_Limit_On_Vision() throws Exception {
        Reporter.log("<font color='blue'><b>TC-7, GEN-1017(BCC), Verify the Character limits on the 'Vision' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.charLimitVision();
    }

    /**
     * Verify Character Limit on Policies Field.
     * Ensure that the 'Policies' field enforces the expected character limit.
     * Validate that the system correctly restricts or allows input as per the requirement.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Character_Limit_On_Policies() throws Exception {
        Reporter.log("<font color='blue'><b>TC-8, GEN-1017(BCC), Verify the Character limits on the 'Policies' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.charLimitPolicies();
    }

    /**
     * Verify Character Limit on Working Conditions Field.
     * Ensure that the 'Working Conditions' field enforces the expected character limit.
     * Validate that the system correctly restricts or allows input as per the requirement.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Character_Limit_On_Working_Conditions() throws Exception {
        Reporter.log("<font color='blue'><b>TC-9, GEN-1017(BCC), Verify the Character limits on the 'Working Conditions' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.charLimitWorkingConditions();
    }

    /**
     * Verify Character Limit on Code of Conduct Field.
     * Ensure that the 'Code of Conduct' field enforces the expected character limit.
     * Validate that the system correctly restricts or allows input as per the requirement.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Character_Limit_Of_Conduct() throws Exception {
        Reporter.log("<font color='blue'><b>TC-10, GEN-1017(BCC), Verify the Character limits on the 'Code of Conduct' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.charLimitCodeOfConduct();
    }

    /**
     * Verify Character Limit on 'Do As' Field.
     * Ensure that the 'Do As' field enforces the expected character limit.
     * Validate that the system correctly restricts or allows input as per the requirement.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Character_Limit_Of_Do_As() throws Exception {
        Reporter.log("<font color='blue'><b>TC-11, GEN-1017(BCC), Verify the Character limits on the 'Do as' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.charLimitDoAs();
    }

    /**
     * Verify Character Limit on 'Don't As' Field.
     * Ensure that the 'Don't As' field enforces the expected character limit.
     * Validate that the system correctly restricts or allows input as per the requirement.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Character_Limit_Of_Dont_As() throws Exception {
        Reporter.log("<font color='blue'><b>TC-11, GEN-1017(BCC), Verify the Character limits on the 'Don't as' field. </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.createBrandPersona();
        dashboardpage.charLimitDontAs();
    }

    /**
     * Verify Retail Network Functionality.
     * Ensure that the 'Retail Network/Marketplace' brand type selection functionality works as expected.
     * Validate that the options are displayed correctly and that the element is not disabled.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Retail_Network_Functionality() throws Exception {
        Reporter.log("<font color='blue'><b>TC-1, GEN-1018(BCC), Verify the Functionality of Brand Type Selection - Retail Network/Marketplace</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.retailNetworkOrmarketPlace();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.verifyElementisNotDisabled();
        // deshboardpage.verifyRedirectionOnPublishBrandCommunitySection();
        // common.assertElementPresent(PUBLISH_YOUR_COMMUNITY_TEXT);
    }

    /**
     * Verify Media Brand Functionality.
     * Ensure that the 'Media' brand type selection functionality works as expected.
     * Validate that the options are displayed correctly and the alert message for media is shown.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Media_Brand_Functionality() throws Exception {
        Reporter.log("<font color='blue'><b>TC-2, GEN-1018(BCC), Verify the Functionality of Brand Type Selection - Media</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.verifyAlertMessageOnMediaIsDisplayed();
    }

    /**
     * Verify Consumer Brand Functionality.
     * Ensure that the 'Consumer' brand type selection functionality works as expected.
     * Validate that the options are displayed correctly and the alert message for the consumer brand is shown.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Consumer_Brand_Functionality() throws Exception {
        Reporter.log("<font color='blue'><b>TC-3, GEN-1018(BCC), Verify the Functionality of Brand Type Selection - Consumer</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.verifyAlertMessageOnConsumerIsDisplay();
        // common.assertTwoValuesAreEqual(common.getText(ALERT_MESSAGE),"Sorry, the
        // Community Media Network for Consumer Brand is still in development. Stay
        // tuned!");
    }

    /**
     * Verify the Functionality of Traffic Range Selection - Under 1M.
     * Ensure that the traffic range selection for 'Under 1M' works as expected.
     * Validate that the term sheet and consumer brand are disabled when this selection is made.
     * Verify that the correct alert message is displayed and that redirection to the 'Publish Brand Community' section happens correctly.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Functionality_Of_Retail_Network_Traffic_Range_Selection_Under_1M() throws Exception {
        Reporter.log("<font color='blue'><b>TC-4, GEN-1018(BCC), Verify the Functionality of Traffic Range Selection - Under 1M</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.retailNetworkOrmarketPlace();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.selectUnder1MTrafficRangeOption();
        // test will be fail due to bug
        dashboardpage.verifyTermSheetAndConsumerBrandIsDisabled();
        dashboardpage.alertMessageOnRetailNetworkTrafficRangeUnder1M();
        dashboardpage.verifyRedirectionOnPublishBrandCommunitySection();
    }

    /**
     * Verify the Functionality of Traffic Range Selection - 1M to 5M.
     * Ensure that the traffic range selection for '1M to 5M' works as expected.
     * Validate that the corresponding elements are not disabled when this selection is made.
     * Verify that the 'Continue' button is enabled after selecting the traffic range.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_The_Functionality_Of_Retail_Network_Traffic_Range_Selection_1M_5M() throws Exception {
        Reporter.log("<font color='blue'><bCopy string literal text to the clipboard</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.retailNetworkOrmarketPlace();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.select1M_5MTrafficRangeOption();
        dashboardpage.verifyElementisNotDisabled();
        dashboardpage.verifyContinueButtonEnabled();
    }

    /**
     * Verify the Functionality of Traffic Range Selection - 5M to 10M.
     * Ensure that the traffic range selection for '5M to 10M' works as expected.
     * Validate that the corresponding elements are not disabled when this selection is made.
     * Verify that the 'Continue' button is enabled after selecting the traffic range.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_The_Functionality_Of_Retail_Network_Traffic_Range_Selection_5M_10m() throws Exception {
        Reporter.log("<font color='blue'><b>TC-6, GEN-1018(BCC), Verify the Functionality of Traffic Range Selection : 5M - 10M</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.retailNetworkOrmarketPlace();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.select5M_10mTrafficRangeOption();
        dashboardpage.verifyElementisNotDisabled();
        dashboardpage.verifyContinueButtonEnabled();
    }

    /**
     * Verify the Functionality of Traffic Range Selection - More than 10M.
     * Ensure that the traffic range selection for "More than 10M" works as expected.
     * Validate that the corresponding elements are not disabled when this selection is made.
     * Verify that the 'Continue' button is enabled after selecting the traffic range.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_The_Functionality_Of_Retail_Network_Traffic_Range_Selection_More_Than_10M() {
        Reporter.log("<font color='blue'><b>TC-7, GEN-1018(BCC), Verify the Functionality of Traffic Range Selection More than 10M</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.retailNetworkOrmarketPlace();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.selectMoreThan10MTrafficRangeOption();
        dashboardpage.verifyElementisNotDisabled();
        dashboardpage.verifyContinueButtonEnabled();
    }

    /**
     * Verify the Functionality of Switching to the Next Section.
     * Ensure that after selecting the traffic range and verifying the necessary elements,
     * the redirection to the next section occurs correctly.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void next_Section_Redirection() {
        Reporter.log("<font color='blue'><b>TC-8, GEN-1018(BCC), Verify the Functionality of Switching to Next Section</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.retailNetworkOrmarketPlace();
        dashboardpage.verifyOptionsAreDisplayed();
        dashboardpage.selectUnder1MTrafficRangeOption();
        dashboardpage.verifyTermSheetAndConsumerBrandIsDisabled();
        dashboardpage.verifyNextSectionRedirection();
    }

    /**
     * Verify the process of adding a Consumer Brand.
     * Ensure that the functionality to add a consumer brand works as expected.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void add_Consumer_Brand_Verification() {
        Reporter.log("<font color='blue'><b>TC-8, GEN-1019(BCC)</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.addConsumerBrand();
    }

    /**
     * Verify the presence of all elements on the Term Sheet page.
     * Ensure that all necessary elements are displayed as expected.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Term_Sheet_Element() {
        common.logPrint(("TC-1, GEN-1020(BCC), Verify all element present"));
        open_Web_URL_and_Login();
//		deshboardpage.selectBrand();
        dashboardpage.launchCommunityMedia();
        dashboardpage.termSheetVerification();
    }

    /**
     * Verify the functionality of the '+Add Person' button in the 'Add Legal Team for review' section.
     * Ensure that the '+Add Person' button behaves as expected, including verifying if it is disabled when appropriate.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Add_Person_For_Review() {
        Reporter.log("<font color='blue'><b>TC-9.1, GEN-1020(BCC), Verify the '+Add Person' button in Add Legal Team for review section </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.addPersonButtonDisableForReview();
    }

    /**
     * Verify the functionality of the '+Add Person' button in the 'Add Notice Team for review' section.
     * Ensure that the '+Add Person' button behaves as expected, including verifying if it is disabled when appropriate.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Add_Person_For_Notice() {
        Reporter.log("<font color='blue'><b>TC -9.2, GEN-1020(BCC), Verify the '+Add Person' button in Add Notice Team for review section </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.addPersonButtonDisableForNotice();
    }

    /**
     * Verify the functionality of the '+Add Person' button for the Legal review section.
     * Ensure that the '+Add Person' button works as expected for adding a person to the legal review team.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void verify_Add_Person_Functionality_For_Legal_Review() {
        Reporter.log("<font color='blue'><b>TC-10, GEN-1020(BCC), Verify the '+Add Person' button functionality for Legal review</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.addNewFieldForLegalReview();
    }

    /**
     * Verify the functionality of the '+Add Person' button for the Notice team section.
     * Ensure that the '+Add Person' button works as expected for adding a person to the Notice team.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void Verify_Notice_Team_Section() {
        Reporter.log("<font color='blue'><b>TC-10, GEN-1020(BCC), Verify the '+Add Person' button functionality for Notice </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.addTeamMembertoNotice();
    }

    /**
     * Verify the functionality of the "Contact Name" field in the Primary Contact Details section.
     * Ensure that the "Contact Name" field is required and behaves as expected.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void Verify_Contact_Name() {
        Reporter.log("<font color='blue'><b>TC-2 & 4, GEN-1020(BCC), Verify the \"Contact Name\" in the Primary Contact Details section.</b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.verifyContactNameFieldIsRequire();
    }

    /**
     * Verify the functionality of the "Contact Email" field in the Primary Contact Details section.
     * Ensure that the "Contact Email" field is required and behaves as expected when invalid data is entered.
     *
     * @throws Exception if an unexpected error occurs during execution.
     */
    @Test
    public void Verify_Contact_Email() {
        Reporter.log("<font color='blue'><b>TC-3 & 5, GEN-1020(BCC), Verify the enter the invalid date in the \"Contact Email\" field </b></font>", true);
        open_Web_URL_and_Login();
        dashboardpage.launchCommunityMedia();
        dashboardpage.verifyContactEmailFieldRequire();
    }

}

