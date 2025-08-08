package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.WebDriver;

public class WhitelabelSettingPage extends Locators {
    Common common = new Common(driver);

    public WhitelabelSettingPage(WebDriver driver) {

        super(driver);
    }

    public String PUBLISH_BRAND_COMMUNITY = "//*[contains(text(),'Publish Brand Community')]";
    public String WHITE_LABEL_SETTINGS = "//*[contains(text(),'White label Settings')]";
    public String SET_WHITE_DOMAIN_LABEL = "//h4[text()='Set up white label domain']";
    public String PRODUCTION_ENV_TITLE = "//h5[text()='For Production Environment']";
    public String WHITE_LABEL_URL_TITLE = "//h6[text()='White Label URL']";
    public String SKIP_FOR_NOW_BUTTON = "//button[text()='Skip for now']";
    public String CONTINUE_BUTTON = "//button[text()='Continue']";
    public String WHITE_LABEL_URL = "//input[@id='label_url']";
    public String SAVE_BUTTON = "//button[@class='btn btn-light-info']";
    public String VERIFICATION_MESSAGE = "//div[text()='Brand white label URL successfully updated for prod environment']";
    public String WHITE_LABEL_URL_QA_ENVIRONMENT = "//input[@id='test_label_url']";
    public String VERIFICATION_MESSAGE_QAENV = "//div[text()='Brand white label URL successfully updated for QA environment']";
    public String WHITELABEL_CONTINUE_BUTTON = "//button[normalize-space()='Continue']";
    public String LIVE_ENVIRONMENT_OPTION = "//label[normalize-space()='Live Environment']";
    public String LIVE_WEB_EMBED = "//button[normalize-space()='Web']";
    public String LIVE_IOS = "//button[normalize-space()='iOS']";
    public String LIVE_ANDROID = "//button[normalize-space()='Android']";
    public String SDK_INTEGRATION = "//button[normalize-space()='SDK Integration']";

    /**
     * Selects a brand from the available options and verifies that the Dashboard page is loaded.
     * This method clicks on a brand selection element, waits for the Dashboard page to load,
     * and then validates that the page title is "Dashboard" to confirm successful navigation.
     */
    public void selectBrand() {
        common.click(SELECT_ANY_BRAND);
        common.logPrint("Step ::Select Any brand");
//        common.waitUntilSpecificTitle("Dashboard");
        common.assertTwoValuesAreEqual(driver.getTitle(), "Dashboard");
        common.logPrint("Step ::Verify that Dashboard page is open ");
    }

    /**
     * Verifies the White Label Settings page by performing a series of interactions and validations.
     * This method waits for the "Build" page to load, clicks to publish the brand community, and navigates to
     * the white label settings. It then checks if the necessary elements such as labels and buttons are present
     * on the page to confirm that the white label settings page is correctly loaded.
     */
    public void verifyWhitelabelSetting() {
        common.waitUntilSpecificTitle("Build");
        common.logPrint("Step ::Click on publish brand community");
        common.click(PUBLISH_BRAND_COMMUNITY);
        common.logPrint("Step ::Click on label settings");
        common.click(WHITE_LABEL_SETTINGS);

        common.logPrint("Step ::Verify white domain label title");
        common.assertElementPresent(SET_WHITE_DOMAIN_LABEL);
        common.assertElementPresent(PRODUCTION_ENV_TITLE);
        common.assertElementPresent(WHITE_LABEL_URL_TITLE);
        common.assertElementPresent(SKIP_FOR_NOW_BUTTON);
        common.assertElementPresent(CONTINUE_BUTTON);

    }

    /**
     * Verifies the functionality of entering and saving a White Label URL.
     * This method waits for the "Build" page to load, clicks to publish the brand community, and navigates to
     * the white label settings. It then enters a randomly generated URL into the white label URL field, clicks
     * the save button, and checks if the verification message appears, confirming the successful operation.
     */
    public void verifyWhitelabelSettingURL() {
        common.waitUntilSpecificTitle("Build");
        common.logPrint("Step ::Click on publish brand community");
        common.click(PUBLISH_BRAND_COMMUNITY);
        common.logPrint("Step ::Click on label settings");
        common.click(WHITE_LABEL_SETTINGS);
        common.logPrint("Step ::enter the whilte label setting url");
        String emailIs = common.generateRandomChars(3) + "gmail.com";
        common.type(WHITE_LABEL_URL, emailIs);
        common.logPrint("Step ::click on save button");
        common.click(SAVE_BUTTON);
        common.assertElementPresent(VERIFICATION_MESSAGE);

    }

    /**
     * Verifies the functionality of entering and saving a White Label URL for the QA environment.
     * This method waits for the "Build" page to load, clicks to publish the brand community, and navigates to
     * the white label settings. It then enters a randomly generated URL into the white label URL field for the QA environment,
     * clicks the save button, and checks if the verification message for the QA environment appears, confirming the successful operation.
     */
    public void verifyWhitelabelSettingURLQAENVIRONMENT() {
        common.waitUntilSpecificTitle("Build");
        common.logPrint("Step ::Click on publish brand community");
        common.click(PUBLISH_BRAND_COMMUNITY);
        common.logPrint("Step ::Click on label settings");
        common.click(WHITE_LABEL_SETTINGS);
        common.logPrint("Step ::enter the whilte label setting url");
        String emailIs = common.generateRandomChars(3) + "gmail.com";
        common.type(WHITE_LABEL_URL_QA_ENVIRONMENT, emailIs);
        common.logPrint("Step ::click on save button");
        common.click(SAVE_BUTTON);
        common.assertElementPresent(VERIFICATION_MESSAGE_QAENV);
    }

    /**
     * Verifies the functionality of the white label settings in the live environment.
     * This method waits for the "Build" page to load, clicks to publish the brand community, and navigates to
     * the white label settings. It enters a randomly generated URL into the white label URL field for the QA environment,
     * clicks the save button, and verifies the appearance of the verification message for the QA environment.
     * Then, it clicks on the "Continue" button, navigates to SDK integration, and checks for the presence of live environment
     * options and code elements for different platforms (Android, iOS, and Web Embed).
     */
    public void verifyWhitelabelSettingWithLiveEnvironment() {

        common.waitUntilSpecificTitle("Build");
        common.logPrint("Step ::Click on publish brand community");
        common.click(PUBLISH_BRAND_COMMUNITY);
        common.logPrint("Step ::Click on label settings");
        common.click(WHITE_LABEL_SETTINGS);
        common.logPrint("Step ::enter the whilte label setting url");
        String emailIs = common.generateRandomChars(3) + "gmail.com";
        common.type(WHITE_LABEL_URL_QA_ENVIRONMENT, emailIs);
        common.logPrint("Step ::click on save button");
        common.click(SAVE_BUTTON);
        common.logPrint("Step ::verify the message for QA environment !!");
        common.assertElementPresent(VERIFICATION_MESSAGE_QAENV);

        common.logPrint("Step ::click on the continue button");
        common.click(WHITELABEL_CONTINUE_BUTTON);

        common.logPrint("Step ::click on SDK integration");
        common.click(SDK_INTEGRATION);
        ;

        common.logPrint("Step ::Verifying the live environment option");
        common.assertElementPresent(LIVE_ENVIRONMENT_OPTION);

        common.logPrint("Step ::Verifying the code element across the different platforms");
        common.assertElementPresent(LIVE_ANDROID);
        common.assertElementPresent(LIVE_IOS);
        common.assertElementPresent(LIVE_WEB_EMBED);
    }
}
