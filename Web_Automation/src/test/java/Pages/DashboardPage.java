package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage extends Locators {
    Common common = new Common(driver);

    public DashboardPage(WebDriver driver) {

        super(driver);
    }

    /**
     * Verify 'Select Brand' Functionality.
     * Ensure that a user can successfully select a brand from the available options.
     * Validate that selecting a brand navigates to the 'Build' dashboard page.
     */
    public void selectBrand() {
        common.click(SELECT_ANY_BRAND);
        common.logPrint("Step ::Select Any brand");
        common.pause(10);
        common.assertTwoValuesAreEqual(driver.getTitle(), "Build");
        common.logPrint("Step ::Verify that Dashboard page is open ");
    }

    /**
     * Verify 'Create Brand Persona' Functionality.
     * Ensure that users can successfully navigate to the Brand Persona section.
     * Validate that all necessary steps are performed in the correct sequence.
     */
    public void createBrandPersona() {
        common.waitUntilElementToBeVisible(DASHBOARD_SCREEN);
        common.pause(4);
        common.click(DASHBOARD_SCREEN);
        common.logPrint("Step ::Click on Dashboard");
        common.pause(2);
        common.click(ADD_BRAND_ELEMENT);
        common.logPrint("Step ::Click on Add Brand Elements");
        common.pause(2);
        common.click(BRAND_PERSONA);
        common.logPrint("Step ::Click on Brand Persona");
        common.pause(2);
    }

    /**
     * Verify 'All Elements Are Present' on Brand Persona Page.
     * Ensure that all required elements are displayed correctly.
     * Validate the presence of mission, vision, values, policies, and other key sections.
     */
    public void checkAllElementPresent() {
        common.pause(4);
        common.assertElementPresentWithMessage(MISSION_BRANDPERSONA, "Mission is not visible");
        common.logPrint("Step ::Verify Mission Element is present");
        common.assertElementPresentWithMessage(VISION_BRANDPERSONA, "Vision is not present");
        common.logPrint("Step ::Verify Vision Element is present");
        common.assertElementPresent(VALUE_BRANDPERSONA);
        common.logPrint("Step ::Verify Value element is present");
        common.assertElementPresent(POLICIES_BRANDPERSONA);
        common.logPrint("Step ::Verify Policies element is present");
        common.assertElementPresent(PROCEDURES_BRANDPERSONA);
        common.logPrint("Step ::Verify Procedures element is present");
        common.assertElementPresent(WORKING_CONDITIONS_BRANDPERSONA);
        common.logPrint("Step ::Verify Working conditions element is present");
        common.assertElementPresent(CODE_OF_CONDUCT_BRANDPERSONA);
        common.logPrint("Step ::Verify Code of conduct element is present");
        common.assertElementPresent(DO_AS_BRANDPERSONA);
        common.logPrint("Step ::Verify DO'S element is present");
        common.assertElementPresent(DONT_AS_BRANDPERSONA);
        common.logPrint("Step ::Verify Dont's element is present");
        common.assertElementPresent(DOCUMENT_BRANDPERSONA);
        common.logPrint("Step ::Verify Document element is present");
    }

    /**
     * Verify 'Empty All Fields' in Brand Persona.
     * Ensure that all input fields in the Brand Persona section can be cleared.
     * Validate that mission, vision, policies, procedures, and other fields are emptied.
     */
    public void emptyAllFieldsBrandPersona() {
        common.clear(MISSION_FIELD);
        common.clear(VISION_FIELD);
        // common.click(VALUES_FIELD);
        common.clear(POLICIES_FIELD);
        common.clear(PROCEDURE_FIELD);
        common.clear(WORKING_CONDITIONS_FIELD);
        common.clear(CODE_OF_CONDUCT_FIELD);
        common.clear(DO_AS_FIELDS);
        common.clear(DONT_AS_FIELD);
        common.clear(DOCUMENT_FIELD);
    }

    /**
     * Verify 'Remove Tag' Functionality in Brand Persona.
     * Ensure that the value field can be cleared by clicking and removing text.
     * Validate that all existing text is deleted using the BACKSPACE key and clear actions.
     */
    public void clickOnRemoveTag() {
        common.pause(50);
        // common.waitUntilElementToBeClickable(By.xpath(VALUES_FIELD));
        common.click(VALUES_FIELD);
        common.logPrint("Step ::click on Value");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.BACK_SPACE).perform();
        for (int i = 0; i < 7; i++) {
            common.clear(VALUES_FIELD);
        }
    }

    /**
     * Verify Character Limit Mission in
     */
    public void charLimitMission() {
        common.pause(14);
        common.waitUntilElementToBeVisible(CHARLIMIT_FOR_MISSION);
        common.assertElementPresentWithMessage(String.valueOf(CHARLIMIT_FOR_MISSION), "Character limit is not 300");
        common.logPrint("Step ::verify Character limit of MISSION");
    }

    /**
     * Verify 'Enter 300 Characters' in the Mission Field.
     * Ensure that the mission field can accept and store up to 300 characters.
     * Validate the correct input by generating and entering a 300-character string.
     */
    public void enter300CharacterInMissionField() {
        common.pause(15);  // Optionally wait for 2 seconds
//		common.waitUntilElementToBeVisible(TEXT_AREA_OF_MISSION);
        // Click on the text area to focus
        common.click(TEXT_AREA_OF_MISSION);
        common.logPrint("Click on mission field");

        // Clear the existing content in the text area
        common.clear(TEXT_AREA_OF_MISSION);
        common.logPrint("Clear the mission field");

        // Generate a string of 300 characters (repeated 'A')
        String textToEnter = "A".repeat(300);  // Creates a string of 300 'A's

        // Enter the 300 characters into the text area
        common.type(TEXT_AREA_OF_MISSION, textToEnter);
        common.logPrint("Enter character:" + textToEnter);
    }

    /**
     * Verify Char Limit for Vision
     */
    public void charLimitVision() {
        common.pause(10);
        common.waitUntilElementToBeVisible(CHARLIMIT_FOR_VISION);
        common.assertElementPresentWithMessage(CHARLIMIT_FOR_VISION, "Character limit is not 300");
        common.logPrint("Step ::verify Character limit of VISION");
    }

    /**
     * Verify 'Character Limit' for Policies Field.
     * Ensure that the policies field enforces a maximum character limit of 1000.
     * Validate that the character limit message is correctly displayed.
     */
    public void charLimitPolicies() {
        common.pause(9);
//		common.waitUntilElementToBeVisible(CHARLIMIT_FOR_POLICIES);
        common.assertElementPresentWithMessage(CHARLIMIT_FOR_POLICIES, "Character limit is not 1000");
        common.logPrint("Step ::verify Character limit of Policies");
    }

    /**
     * Verify 'Character Limit' for Working Conditions Field.
     * Ensure that the Working Conditions field enforces a maximum character limit of 500.
     * Validate that the character limit message is correctly displayed.
     */
    public void charLimitWorkingConditions() {
        common.pause(10);
        common.waitUntilElementToBeVisible(CHARLIMIT_FOR_WORKING_CONDITIONS);
        common.assertElementPresentWithMessage(CHARLIMIT_FOR_WORKING_CONDITIONS, "Character limit is not 500");
        common.logPrint("Step ::verify Character limit of Working Conditions");
    }

    /**
     * Verify 'Character Limit' for Code of Conduct Field.
     * Ensure that the Code of Conduct field enforces a maximum character limit of 1000.
     * Validate that the character limit message is correctly displayed.
     */
    public void charLimitCodeOfConduct() {
        common.pause(3);
//		common.waitUntilElementToBeVisible(CHARLIMIT_FOR_CODE_OF_CONDUCT);
        common.assertElementPresentWithMessage(CHARLIMIT_FOR_CODE_OF_CONDUCT, "Character limit is not 1000");
        common.logPrint("Step ::verify Character limit of Code of Conduct");
    }

    /**
     * Verify 'Character Limit' for Do's Field.
     * Ensure that the Do's field enforces a maximum character limit of 1000.
     * Validate that the character limit message is correctly displayed.
     */
    public void charLimitDoAs() {
        common.pause(3);
        common.assertElementPresentWithMessage(CHARLIMIT_FOR_DO_AS, "Character limit is not 1000");
        common.logPrint("Step ::verify Character limit of Do's");
    }

    /**
     * Verify 'Character Limit' for Don'ts Field.
     * Ensure that the Don'ts field enforces a maximum character limit of 1000.
     * Validate that the character limit message is correctly displayed.
     */
    public void charLimitDontAs() {
        common.pause(5);
        common.waitUntilElementToBeVisible(CHARLIMIT_FOR_DONT_AS);
        common.assertElementPresentWithMessage(CHARLIMIT_FOR_DONT_AS, "Character limit is not 1000");
        common.logPrint("Step ::verify Character limit of Dont's");
    }

    /**
     * Verify 'Launch Community Media' Functionality.
     * Ensure that the user can navigate to the Community Media Network section.
     * Validate that the correct elements are clicked in sequence.
     */
    public void launchCommunityMedia() {
        common.waitUntilElementToBeVisible(DASHBOARD_SCREEN);
        common.click(DASHBOARD_SCREEN);
        common.logPrint("Step ::Click on Dashboard");
        common.click(LAUNCH_COMMUNITY_MEDIA_NETWORK);
        common.logPrint("Step ::Click on community media network");
        common.click(BRAND_TYPE);
    }

    /**
     * Verify 'Retail Network or Marketplace' Selection.
     * Ensure that the user can successfully click on the 'Retail Network/Marketplace' option.
     * Validate that the selection is properly logged.
     */
    public void retailNetworkOrmarketPlace() {
        common.click(RETAIL_NETWORK_OR_MARKET_PLACE);
        common.logPrint("Step ::Click on Retail Network/Market Place");
    }

    /**
     * Verify 'Element is Not Disabled' Functionality.
     * Ensure that the required elements are enabled and not in a disabled state.
     * Validate that 'Term Sheet' and 'Consumer Brands' are interactive.
     */
    public void verifyElementisNotDisabled() {
        common.isElementEnabled(TERMS_SHEET);
        common.logPrint("Step ::Term Sheet is enabled");
        common.isElementEnabled(CONSUMER_BRANDS);
        common.logPrint("Step ::Consumer is enabled");
    }

    /**
     * Verify 'Admin Login' Functionality.
     * Ensure that an admin can log in successfully using valid credentials.
     * Validate that the user is redirected to the 'Log In' page upon login.
     */
    public void loginAsAdmin(String uName, String pWord) {
        common.logPrint("Step ::Login on Dashboard");
        common.type(usernameLogin, uName);
        common.type(passLogin, pWord);
        common.click(loginBtn);
        common.assertTwoValuesAreEqual(driver.getTitle(), "Log In");
    }

    /**
     * Verify 'Options Are Displayed' Functionality.
     * Ensure that the 'Traffic Range' option is visible on the page.
     * Validate that the element is displayed successfully.
     */
    public void verifyOptionsAreDisplayed() {
        common.pause(3);
        common.isElementDisplayed(OPTIONS_TRAFFIC_RANGE);
        common.logPrint("Step ::Option Traffic range is displayed");
    }

    /**
     * Verify 'Redirection to Publish Brand Community' Section.
     * Ensure that clicking the 'Continue' button redirects the user to the 'Publish Brand Community' section.
     * Validate that the correct text is displayed after redirection.
     */
    public void verifyRedirectionOnPublishBrandCommunitySection() {
        common.pause(3);
        common.click(NETWORK_OR_MARKET_PLACE_CONTINUE_BUTTON);
        common.logPrint("Step ::Click on Continue");
        common.logPrint("Step ::Redirect on publish your community");

        common.assertTwoValuesAreEqual(common.getText(PUBLISH_YOUR_COMMUNITY_TEXT), "Publish Brand Community");
        common.logPrint("Step ::Verify Text: Publish Brand community");
    }

    /**
     * Verify 'Alert Message' for Retail Network Traffic Under 1M.
     * Ensure that an appropriate alert message is displayed when traffic is below 1M.
     * Validate that the message matches the expected text.
     */
    public void alertMessageOnRetailNetworkTrafficRangeUnder1M() {
        common.pause(3);
        common.assertTwoValuesAreEqual(common.getText(ALERT_MESSAGE),
                "We're sorry, but you can't launch a Community Media Network due to traffic being under 1M. However, you can still create and publish your brand community.");
        common.logPrint("Step :: Verify Alert message : We're sorry, but you can't launch a Community Media Network due to traffic being under 1M. However, you can still create and publish your brand community.");
    }

    /**
     * Verify 'Alert Message' for Media Brand with Traffic Under 1M.
     * Ensure that an appropriate alert message is displayed when selecting Media Brand with traffic under 1M.
     * Validate that the message matches the expected text.
     */
    public void verifyAlertMessageOnMediaIsDisplayed() {
        common.pause(3);
        common.click(BRAND_TYPE_MEDIA);
        common.logPrint("Step ::click on Media");
        common.click(SELECT_BRAND_TRAFFIC_UNDER_1M);
        common.logPrint("Step ::Select traffic range option : Under_1M");

        common.assertTwoValuesAreEqual(common.getText(ALERT_MESSAGE),
                "Sorry, the Community Media Network for Media Brand is still in development. Stay tuned!");
        common.logPrint("Step :: Verify alert message is display : Sorry, the Community Media Network for Media Brand is still in development. Stay tuned!");
    }

    /**
     * Verify 'Alert Message' for Consumer Brand with Traffic Under 1M.
     * Ensure that an appropriate alert message is displayed when selecting Consumer Brand with traffic under 1M.
     * Validate that the message matches the expected text.
     */
    public void verifyAlertMessageOnConsumerIsDisplay() {
        common.pause(3);
        common.click(BRAND_TYPE_CONSUMER);
        common.logPrint("Step ::Click on Consumer");
        common.click(SELECT_BRAND_TRAFFIC_UNDER_1M);
        common.logPrint("Step ::Select Traffic range option : Under 1M");

        common.assertTwoValuesAreEqual(common.getText(ALERT_MESSAGE),
                "Sorry, the Community Media Network for Consumer Brand is still in development. Stay tuned!");
        common.logPrint("Step :: Verify alert message is display : Sorry, the Community Media Network for Consumer Brand is still in development. Stay tuned!");
    }

    /**
     * Verify 'Term Sheet' and 'Consumer Brand' are Disabled.
     * Ensure that the 'Term Sheet' and 'Consumer Brand' elements are in a disabled state.
     * Validate that they cannot be interacted with.
     */
    public void verifyTermSheetAndConsumerBrandIsDisabled() {
        common.pause(3);
        common.isElementDisabled(TERM_SHEET_DISABLED);
        common.logPrint("Step ::Verify that Term Sheet is Disabled");
        common.isElementDisabled(CONSUMER_BRANDS_DISABLED);
        common.logPrint("Step ::Verify that Consumer Brand is Disabled");
    }

    /**
     * Select 'Under 1M' Traffic Range Option.
     * Ensure that the 'Under 1M' traffic range option is selectable.
     * Validate that the selection is properly logged.
     */
    public void selectUnder1MTrafficRangeOption() {
        common.pause(3);
        common.click(SELECT_BRAND_TRAFFIC_UNDER_1M);
        common.logPrint("Step ::Select Traffic range option : Under 1M");
    }

    /**
     * Select '1M-5M' Traffic Range Option.
     * Ensure that the '1M-5M' traffic range option is selectable.
     * Validate that the selection is properly logged.
     */
    public void select1M_5MTrafficRangeOption() {
        common.pause(3);
        common.click(SELECT_BRAND_TRAFFIC_1M_5M);
        common.logPrint("Step ::Select Traffic range option : 1M-5M");
    }

    /**
     * Verify 'Continue' Button is Enabled.
     * Ensure that the 'Continue' button is in an enabled state.
     * Validate that the button can be interacted with.
     */
    public void verifyContinueButtonEnabled() {
        common.pause(3);
        common.isElementEnabled(NETWORK_OR_MARKET_PLACE_CONTINUE_BUTTON);
        common.logPrint("Step ::Verify that Continue button is Enable");
    }

    /**
     * Select '5M-10M' Traffic Range Option.
     * Ensure that the '5M-10M' traffic range option is selectable.
     * Validate that the selection is properly logged.
     */
    public void select5M_10mTrafficRangeOption() {
        common.pause(3);
        common.click(SELECT_BRAND_TRAFFIC_5M_10M);
        common.logPrint("Step ::Select traffic range option : 5M-10M");
    }

    /**
     * Select 'More than 10M' Traffic Range Option.
     * Ensure that the 'More than 10M' traffic range option is selectable.
     * Validate that the selection is properly logged.
     */
    public void selectMoreThan10MTrafficRangeOption() {
        common.pause(3);
        common.click(SELECT_BRAND_TRAFFIC_MORE_THAN_10M);
        common.logPrint("Step ::Select traffic range option : More than 10M");
    }

    /**
     * Verify Redirection to the Next Section.
     * Ensure that clicking on 'Consumer' redirects to the correct section.
     * Validate that the title displayed matches the expected text.
     */
    public void verifyNextSectionRedirection() {
        common.pause(3);
        common.click(NEXT_SECTION_CONSUMER_BRANDS);
        common.logPrint("Step ::click on Consumer");
        common.assertTwoValuesAreEqual(common.getText(TITLE_CONSUMER_BRAND), "Add consumer brands to your network");
        common.logPrint("Step ::Verify the title of Consumer : Add consumer brands to your network");
    }

    /**
     * Verify Add a Consumer Brand.
     * Ensure that a consumer brand can be added successfully.
     * Validate the username, brand selection, CPM price, and social handle addition.
     */
    String searchbyhandle = common.generateRandomChars(4);
    public void addConsumerBrand() {
        common.pause(3);
        common.click(CONSUMER_BRANDS);
        common.logPrint("Step ::Click on Consumer");
        common.logPrint("Step:: Verify 'Add Brand' is clicked on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(ADDBRANDTOEARN));
        common.verifyElementIsDisplayed(ADDBRANDTOEARN);
        common.click(ADDBRANDTOEARN);

        common.logPrint("Step:: Verify 'Add Consumer Brand' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(ADDCONSUMER));
        String addconsumer = common.findElement(ADDCONSUMER).getText();
        common.assertTwoValuesAreEqual(addconsumer, "Add Consumer Brand");

        common.logPrint("Step:: Verify 'Brand Handle *' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDHANDLE));
        common.verifyElementIsDisplayed(BRANDHANDLE);

        common.logPrint("Step:: Verify 'Search icon' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICON));
        common.verifyElementIsDisplayed(SEARCHICON);

        common.logPrint("Step:: Verify 'Search by handle' input is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHBYBRANDHANDLE));
        common.verifyElementIsDisplayed(SEARCHBYBRANDHANDLE);
        common.type(SEARCHBYBRANDHANDLE, searchbyhandle);
        common.pause(5);

        common.logPrint("Step:: Verify 'Contact Emails' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(CONTACTEMAILS));
        common.verifyElementIsDisplayed(CONTACTEMAILS);

        common.logPrint("Step:: Verify 'PREVIEW TEMPLATE' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(PREVIEWTEMPLATE));
        common.verifyElementIsDisplayed(PREVIEWTEMPLATE);

        common.logPrint("Step:: Verify 'EMAIL' is enter on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(EMAILPLACEHOLDER));
        common.click(EMAILPLACEHOLDER);
        common.type(EMAILPLACEHOLDER, searchbyhandle + "@yopmail.com");

        common.logPrint("Step:: Verify 'Invite" + searchbyhandle + " click on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(INVITE));
        common.verifyElementIsDisplayed(INVITE);
        common.click(INVITE);

        common.logPrint("Step:: Verify 'Website Url' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(WEBSITEURL));
        common.verifyElementIsDisplayed(WEBSITEURL);

        common.logPrint("Step:: Verify 'Brand Web site ' is enter on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERBRANDWEBSITE));
        common.typeAndEnter(ENTERBRANDWEBSITE, searchbyhandle + ".com");

        common.logPrint("Step:: Verify 'EARNINGCPMFLOORPRICE' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(EARNINGCPMFLOORPRICE));
        common.verifyElementIsDisplayed(EARNINGCPMFLOORPRICE);

        common.logPrint("Step:: Verify 'CPM$' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(Cpm));
        common.verifyElementIsDisplayed(Cpm);

        common.logPrint("Step:: Verify 'Enter for CPM' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERCPM));
        common.verifyElementIsDisplayed(ENTERCPM);
        int enterforCPM = common.generateValidCPM();
        String cpmValue = String.valueOf(enterforCPM);
        common.typeAndEnter(ENTERCPM, cpmValue);

        common.logPrint("Step:: Verify 'Community Feed Access Period' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEEDACCESS));
        String communityfeedaccess = common.findElement(COMMUNITYFEEDACCESS).getText();
        common.assertTwoValuesAreEqual(communityfeedaccess, "Community Feed Access Period");

        common.logPrint("Step:: Verify 'Start date' is display on the Consume brand page");
        common.waitUntilElementsToBeVisible(By.xpath(Startdate));
        common.verifyElementIsDisplayed(Startdate);

        common.logPrint("Step:: Verify 'end date'  is display on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(ENDDATE));
        String enddate = common.generateFutureDate();
        common.type(ENDDATE, enddate);

        common.logPrint("Step:: Verify 'Social Media Handel' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(SOCIALMEDIAHANDLE));
        common.verifyElementIsDisplayed(SOCIALMEDIAHANDLE);

        common.logPrint("Step:: Verify 'Select social media' is properly work on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTSOCIALMEDIA));
        common.verifyElementIsDisplayed(SELECTSOCIALMEDIA);

        common.logPrint("Step:: Verify 'Youtube handle' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(YOUTUBEHANDLE));
        String youtubehandle = common.generateRandomChars(4);
        common.typeAndEnter(YOUTUBEHANDLE, youtubehandle);

        common.logPrint("Step:: Verify 'Add Social Handle Button' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(ADDSOCIALHANDLE));
        common.verifyElementIsDisplayed(ADDSOCIALHANDLE);
        common.click(ADDSOCIALHANDLE);
        common.logPrint("Step:: Verify 'ANOTHER SOCIAL HANDLE' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(CLICKADDSOCIALHANDLE));
        String youtubehandler = common.getRandomYouTubeHandle();
        common.type(YOUTUBEHANDLE, youtubehandler);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(Cancel));
        common.verifyElementIsDisplayed(Cancel);

        common.logPrint("Step:: Verify 'Add' Button is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(ADD));
        common.verifyElementIsDisplayed(ADD);
        common.click(ADD);

    }

    /**
     * Verify 'Term Sheet' Functionality.
     * Ensure that the 'Term Sheet' page is accessible and interactive.
     * Validate the presence of key elements such as contact details, legal team section, and navigation buttons.
     */
    public void termSheetVerification() {
        common.pause(3);
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on Term Sheet");
//        common.assertElementPresent(PRIMARY_CONTACT_TERM_SHEET);
//        common.logPrint("Step ::Verify that 'Primary Contact' is displayed");
//        common.assertElementPresent(FULL_NAME);
//        common.logPrint("Step ::Verify that 'Full Name' is displayed");
//        common.assertElementPresent(CONTACT_EMAIL);
//        common.logPrint("Step ::Verify that 'Contact Email' is displayed");
//        common.assertElementPresent(LEGAL_TEAM_ADD_PERSON_BUTTON);
//        common.logPrint("Step ::Verify that 'Add Person button' is displayed in 'Legal term field'");
//        common.assertElementPresent(LEGAL_TEAM_FOR_REVIEW);
//        common.logPrint("Step ::verify that 'Legal team for review' is displayed");
//        common.assertElementPresent(PERSON_1_NAME_FOR_LEGAL_TEAM_REVIEW);
//        common.logPrint("Step ::verify that 'Person 1- Name' is displayed");
//        common.assertElementPresent(PERSON_1_EMAIL_FOR_LEGAL_TEAM_REVIEW);
//        common.logPrint("Step ::verify that 'Person 1 - Email' is displayed");
//        common.assertElementPresent(TEAM_MEMBERS_FOR_NOTICE);
//        common.logPrint("Step ::verify that 'Team Member for Notice' is displayed");
//        common.assertElementPresent(ADD_A_PERSON_BUTTON_TEAM_MEMBER);
//        common.logPrint("Step ::verify that 'Add a Person button' is displayed");
//        common.assertElementPresent(PERSON_1_NAME_FOR_NOTICE_TEAM);
//        common.logPrint("Step ::verify that 'Person 1 - Name for Notice Team' is displayed");
//        common.assertElementPresent(PERSON_1_EMAIL_FOR_NOTICE_TEAM);
//        common.logPrint("Step ::verify that 'Person 1 - Email for Notice' is displayed");
//        common.assertElementPresent(SKIP_BUTTON);
//        common.logPrint("Step ::verify that 'Skip Button' is displayed");
//        common.assertElementPresent(CONTINUE_TERM_SHEET);
//        common.logPrint("Step ::verify that 'Continue' is displayed");
    }

    /**
     * Verify Validation Message on Term Sheet.
     * Ensure that validation messages appear when incorrect or incomplete data is entered.
     * Validate that the error message "Oops, something went wrong!" is displayed.
     */
    public void verifyValidationMessage() {
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on Term sheet");
        String s = common.generateRandomChars(6);
        common.type(FULL_NAME, s);
        common.logPrint("Step ::Enter a Full Name" + s);
        String email = common.generateRandomChars(5) + "@" + common.generateRandomChars(4) + ".com";
        common.type(CONTACT_EMAIL, email);
        common.logPrint("Step ::Type email address on email field" + email);
        common.click(CONTINUE_TERM_SHEET);
        common.logPrint("Step ::Click on Term sheet");
        common.assertTwoValuesAreEqual(common.getText(TITLE_CONSUMER_BRAND), "Oops, something went wrong!");
        common.logPrint("Step ::Verify message : Oops, something went wrong!");
    }

    /**
     * Verify 'Add Person' Button is Disabled for Review.
     * Ensure that the 'Add Person' button under the Legal Team Review section is disabled.
     * Validate that users cannot add additional persons for review.
     */
    public void addPersonButtonDisableForReview() {
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on terms Sheet");
//        common.isElementDisabled(LEGAL_TEAM_ADD_PERSON_BUTTON);
        common.logPrint("Step ::Verify Add person button is disabled");
    }

    /**
     * Verify 'Add Person' Button is Disabled for Notice.
     * Ensure that the 'Add Person' button under the Team Member Notice section is disabled.
     * Validate that users cannot add additional persons for notice.
     */
    public void addPersonButtonDisableForNotice() {
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on Terms sheet");
//        common.isElementDisabled(ADD_A_PERSON_BUTTON_TEAM_MEMBER);
        common.logPrint("Step ::Verify that Add person button is disabled");
    }

    /**
     * Add a New Field for Legal Team Review.
     * Ensure that a new person can be added to the Legal Team Review section.
     * Validate that 'Person 2' appears after adding a new person.
     */
    public void addNewFieldForLegalReview() {
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on term sheet");
//        String s = common.generateRandomChars(6);
//        common.type(PERSON_1_NAME_FOR_LEGAL_TEAM_REVIEW, s);
//        common.logPrint("Step ::Enter Name for Person-1 : " + s);
//        String email = common.generateRandomChars(5) + "@" + common.generateRandomChars(4) + ".com";
//        common.type(PERSON_1_EMAIL_FOR_LEGAL_TEAM_REVIEW, email);
//        common.logPrint("Step ::Enter an Email address for Person 1 : " + email);
//        common.pause(3);
//        common.click(LEGAL_TEAM_ADD_PERSON_BUTTON);
//        common.logPrint("Step ::Click on Add person ");
//        common.assertElementPresent(PERSON_2_LEGAL_TEAM);
//        common.logPrint("Step ::Verify that Person 2 is Present ");
    }

    public void addTeamMembertoNotice() {
        common.pause(3);
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on Terms Sheet");
//        String s = common.generateRandomChars(6);
//        common.type(PERSON_1_NAME_FOR_NOTICE_TEAM, s);
//        common.logPrint("Step ::Enter a name : " + s);
//        String email = common.generateRandomChars(5) + "@" + common.generateRandomChars(4) + ".com";
//        common.type(PERSON_1_EMAIL_FOR_NOTICE_TEAM, email);
//        common.logPrint("Step ::Enter an EMail address: " + email);
//        common.pause(2);
//        common.click(NOTICE_TEAM_ADD_PERSON_BUTTON_CLICKBLE);
//        common.logPrint("Step ::Click on Add Person");
//        common.assertElementPresent(PERSON_2_NOTICE_TEAM);
//        common.logPrint("Step ::Verify that Person 2 is present");
    }

    public void verifyContactNameFieldIsRequire() {
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on Term Sheet");
//        common.click(FULL_NAME);
//        common.logPrint("Step ::Click on Full Name");
//        common.click(CONTACT_EMAIL);
//        common.logPrint("Step ::Click on Email");
//        common.assertElementPresentWithMessage(VALIDATIONMESSAGEFORCONTACTNAME, "Enter your name");
//        common.logPrint("Step ::Verify validation message is Displayed: Enter your name");
    }

    public void verifyContactEmailFieldRequire() {
        common.click(TERMS_SHEET);
        common.logPrint("Step ::Click on Term sheet");
//        common.click(CONTACT_EMAIL);
//        common.logPrint("Step ::Click on Email");
//        common.click(FULL_NAME);
//        common.logPrint("Step ::Click on name");
//        common.assertElementPresentWithMessage(VALIDATIONMESSAGEFORCONTACTEMAIL, "Enter your Email");
//        common.logPrint("Step ::Verify validation message is Displayed: Enter your Email");
    }

}

