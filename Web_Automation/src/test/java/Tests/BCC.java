package Tests;

import Config.ReadProperties;
import Utils.BasePage;
import org.testng.annotations.Test;

import java.awt.*;

public class BCC extends BasePage {

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
        }
    }

    /**
     * Verify login and signup scenarios, including successful sign-up, login, and password reset.
     * This test simulates a complete flow where a new user signs up, logs in with the credentials,
     * and performs a password reset operation to ensure that all related functionalities work correctly.
     * <p>
     * Steps:
     * 1. Open the browser and navigate to the provided URL.
     * 2. Generate a random email, password, and username.
     * 3. Perform the sign-up process with the generated credentials.
     * 4. Log in using the newly created credentials.
     * 5. Perform the 'Forgot Password' functionality to verify the password reset flow.
     *
     * @throws InterruptedException if the thread is interrupted during sleep or pause.
     * @throws AWTException         if there is an issue with AWT operations during the test.
     */
    @Test
    public void loginAndSignupScenarios() throws InterruptedException, AWTException {
        String urlToOpen = readProperties.getWebUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);
        driver.get(urlToOpen);
        String testEmail = common.generateRandomChars(7) + "11@yopmail.com";
        String testPassword = common.generateRandomChars(20);
        String userName = common.generateRandomChars(10);
        bccPage.signupTest(testEmail, testPassword, userName);
        bccPage.loginTest(testEmail, testPassword, userName);
        bccPage.forgotPasswordTest(testEmail, testPassword);
    }

    /**
     * Verify all the fields and labels on the login page.
     * This test ensures that all necessary fields and labels are present and correctly displayed
     * on the login, signup, and forgot password pages.
     *
     * @throws InterruptedException if the thread is interrupted during the test.
     * @throws AWTException         if there is an issue with AWT operations during the test.
     */
    @Test
    public void verifyAllTheFIeldsAndLabelsOnLoginPage() {
        String urlToOpen = readProperties.getWebUrl();
        common.logPrint("Open the browser and enter URL : " + urlToOpen);
        driver.get(urlToOpen);
        bccPage.verifyLoginPageFieldsAndLabels();
        bccPage.verifySignupFieldsAndLabels();
        bccPage.verifyForgotPassPageFieldsAndLabels();
    }

    /**
     * Verify the behavior after entering the URL.
     * This test ensures that the correct page is loaded and any relevant actions
     * or verifications are performed after the user enters the specified URL.
     */
    @Test
    public void verifyAfterEnterURL() {
        open_Web_URL_and_Login();
        bccPage.verifyAfterEnterURL();
    }

    /**
     * Verify the brand category functionality.
     * This test ensures that the correct brand categories are displayed and the
     * relevant functionality is working as expected when the user interacts with
     * the brand category section.
     */
    @Test
    public void verify_brand_catagory() {
        open_Web_URL_and_Login();
        bccPage.verify_brand_catagory();
    }

    /**
     * Verify the creation and functionality of a new brand category.
     * This test ensures that the process of adding a new category is working as expected
     * and the new category is correctly displayed in the brand category section.
     */
    @Test
    public void new_catagory_verification() {
        open_Web_URL_and_Login();
        bccPage.verify_brand_catagory();
        bccPage.new_catagory_verification();
    }
}