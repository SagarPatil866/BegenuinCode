package Tests;

import Config.ReadProperties;
import Utils.BasePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WhitelabelSetting extends BasePage {
    ReadProperties readProperties = new ReadProperties();
    String adminCredentials[] = readProperties.getAdminCredentials();
    String username = adminCredentials[0];
    String password = adminCredentials[1];

    /**
     * Opens the web URL, logs into the application if not already logged in, and tracks the execution time.
     */
    private void open_Web_URL_and_Login() {
        // Start tracking the execution time
        long startTime = common.startTime();

        // Retrieve the URL from the properties file
        String urlToOpen = readProperties.getWebUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);

        // Open the URL in the browser
        driver.get(urlToOpen);

        // Xpath to check if the user is already logged in
        String xpath = "//span[@title='Shivani Kada']";

        // If the element does not exist, perform login steps
        if (!common.existsElement(xpath)) {
            // Log in as an admin user
            dashboardpage.loginAsAdmin(username, password);

            // Select the brand after login
            dashboardpage.selectBrand();

            // Record and log the total time taken for login
            common.endTime(startTime, "<br>" + "<b><span style='color:red;'>login to home page time</span></b>" + "</br>");
            // buildPage.createBrandPersona();
        }
    }

    /**
     * Test Case: Verify White Label Setting Page
     * <p>
     * This test case:
     * - Logs the test execution details .
     * - Opens the web application and logs in .
     * - Navigates to the White Label Settings page and verifies its functionality.
     */
    @Test
    public void verify_White_Label_Setting() {
        // Log the test case details in the test report
        Reporter.log("<font color='blue'><b>(TC-1, GEN-1456(BCC), Verify white label setting page</b></font>", true);
        open_Web_URL_and_Login();
        whitelabelSettingPage.verifyWhitelabelSetting();

    }

    /**
     * Test Case: Verify White Label Setting URL Functionality
     * <p>
     * This test case:
     * - Logs the test execution details.
     * - Opens the web application and logs in if necessary.
     * - Navigates to the White Label Settings URL and verifies its functionality.
     */
    @Test
    public void verify_White_Label_Setting_URL() {
        // Log the test case details
        Reporter.log("<font color='blue'><b>(TC-2, GEN-1456(BCC), Verify white label setting URL functionality</b></font>", true);
        // Open the web application and log in if required
        open_Web_URL_and_Login();
        // Perform verification of the White Label Setting URL
        whitelabelSettingPage.verifyWhitelabelSettingURL();
    }

    /**
     * Test Case: Verify White Label Setting URL for QA Environment
     * <p>
     * This test case:
     * - Logs the test execution details.
     * - Opens the web application and logs in if necessary.
     * - Navigates to the White Label Settings page.
     * - Verifies the white label settings after entering the URL in the
     * 'White Label URL for QA Environment' field.
     */
    @Test
    public void verify_White_Label_Setting_URL_For_QA_Environment() {
        Reporter.log("<font color='blue'><b>(TC-3, GEN-1456(BCC), Verify the white label settings page after entering the URL in the 'White label URL for QA Environment' field</b></font>", true);
        open_Web_URL_and_Login();
        whitelabelSettingPage.verifyWhitelabelSettingURLQAENVIRONMENT();
    }


    /**
     * Test Case: Verify White Label Setting with Live Environment
     * <p>
     * This test case performs the following steps:
     * - Logs the test execution details .
     * - Opens the web application and logs in if necessary.
     * - Navigates to the White Label Settings page.
     * - Verifies the white label settings when configured for a Live environment.
     */
    @Test
    public void verify_White_Label_Setting_With_Live_Environment() {
        Reporter.log("<font color='blue'><b>GEN-1456(BCC), Verify white label setting URL functionality for Live</b></font>", true);
        open_Web_URL_and_Login();
        whitelabelSettingPage.verifyWhitelabelSettingWithLiveEnvironment();
    }
}
