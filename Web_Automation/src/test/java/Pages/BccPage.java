package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BccPage extends Locators {
    Common common = new Common(driver);

    public BccPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Verify 'Sign Up' Functionality.
     * Ensure that users can successfully sign up with email, password, and username.
     * Validate all required steps, including form submission, profile setup, and phone linking.
     */
    public void signupTest(String email, String pass, String userName) {
        common.logPrint("Step:: Click on Sign Up link");
        common.waitUntilElementToBeVisible(By.xpath(SIGNUPLINK));
        common.click(SIGNUPLINK);

        common.logPrint("Step:: Verify agree and continue button is disabled before adding email and pass");
        common.waitUntilElementsToBeVisible(By.xpath(AGREEANDCONTINUE));
        WebElement button = common.findElement(AGREEANDCONTINUE);
        if (!button.isEnabled()) {
            common.logPrint("Agree and continue button is disabled");
        }

        common.logPrint("Step:: Enter email");
        common.waitUntilElementToBeVisible(By.xpath(EMAILFIELD));
        common.type(EMAILFIELD, email);
        common.logPrint("Entered email is: " + email);

        common.logPrint("Step:: Enter password");
        common.waitUntilElementToBeVisible(By.xpath(SETYOURPASSWORDFIELD));
        common.type(SETYOURPASSWORDFIELD, pass);
        common.logPrint("Entered password is: " + pass);

        common.logPrint("Step:: Click on 'Agree and Continue'");
        common.waitUntilElementToBeVisible(By.xpath(AGREEANDCONTINUE));
        common.click(AGREEANDCONTINUE);

        common.logPrint("Step:: Verify logo is present on the brand setup page");
        common.waitUntilElementsToBeVisible(By.xpath(LOGINPAGELOGO));
        common.verifyElementIsDisplayed(LOGINPAGELOGO);

        common.pause(2);
        common.logPrint("Step:: Verify brand setup header is displayed");
        common.waitUntilElementToBeVisible(By.xpath(PROFILEBRANDTXT));
        String brandHeader = common.findElement(PROFILEBRANDTXT).getText();
        common.assertTwoValuesAreEqual(brandHeader, "Set up brand profile");
        common.logPrint("Header name is: " + brandHeader);

        common.logPrint("Step:: Verify image is displayed for the photo upload");
        common.waitUntilElementsToBeVisible(By.xpath(BRANDPHOTO));
        common.verifyElementIsDisplayed(BRANDPHOTO);

        common.logPrint("Step:: Verify begenuine link is displayed");
        common.waitUntilElementToBeVisible(By.xpath(BEGENUINELINK));
        String linkBegenuineText = common.findElement(BEGENUINELINK).getText();
        common.assertTwoValuesAreEqual(linkBegenuineText, ".qa.begenuin.com");
        common.logPrint("Link is displayed: " + linkBegenuineText);

        common.logPrint("Step:: Enter Brand name");
        String brandName = common.generateRandomChars(10);
        common.waitUntilElementsToBeVisible(By.xpath(BRANDNAME));
        common.type(BRANDNAME, brandName);

        common.logPrint("Step:: Enter preferred url");
        String preferredURL = common.generateRandomChars(10);
        common.waitUntilElementsToBeVisible(By.xpath(PREFERREDURL));
        common.type(PREFERREDURL, preferredURL);

        common.logPrint("Step:: Click on the save button");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEBUTTON));
        common.click(SAVEBUTTON);

        common.logPrint("Step:: Verify logo is present on the choose a branded username page");
        common.waitUntilElementsToBeVisible(By.xpath(LOGINPAGELOGO));
        common.verifyElementIsDisplayed(LOGINPAGELOGO);

        common.logPrint("Step:: Verify Choose a branded username header is displayed");
        common.waitUntilElementToBeVisible(By.xpath(CHOOSEBRANDUSERNAME));
        String chooseBrandHeader = common.findElement(CHOOSEBRANDUSERNAME).getText();
        common.assertTwoValuesAreEqual(chooseBrandHeader, "Choose a branded username");
        common.logPrint("Header name is: " + chooseBrandHeader);

        common.logPrint("Step:: Verify text is showing on the choose a branded username");
        common.waitUntilElementToBeVisible(By.xpath(CHOOSEBRADNTEXT));
        String chooseBrandText = common.findElement(CHOOSEBRADNTEXT).getText();
        common.assertTwoValuesAreEqual(chooseBrandText, "Your branded @username is unique. Pick something that will help your audience find you on the branded communities.");
        common.logPrint("Text is displayed: " + linkBegenuineText);

        common.logPrint("Step:: Verify username label is showing on choose a branded");
        common.waitUntilElementToBeVisible(By.xpath(USERNAMELABEL));
        String usernameLabel = common.findElement(USERNAMELABEL).getText();
        common.assertTwoValuesAreEqual(usernameLabel, "Username");
        common.logPrint("Text is displayed: " + usernameLabel);

        common.logPrint("Step:: Enter username");
        common.waitUntilElementsToBeVisible(By.xpath(USERNAMEFIELD));
        common.type(USERNAMEFIELD, userName);

        common.logPrint("Step:: Click on the continue button");
        common.waitUntilElementsToBeVisible(By.xpath(CONTINUEBTN));
        common.click(CONTINUEBTN);

        common.logPrint("Step:: Verify logo is present on the Link your phone number page");
        common.waitUntilElementsToBeVisible(By.xpath(LOGINPAGELOGO));
        common.verifyElementIsDisplayed(LOGINPAGELOGO);

        common.logPrint("Step:: Verify Link your phone number header is displayed");
        common.waitUntilElementToBeVisible(By.xpath(HEADLINKPHONE));
        String linkPhonHeader = common.findElement(HEADLINKPHONE).getText();
        common.assertTwoValuesAreEqual(linkPhonHeader, "Link your phone number");
        common.logPrint("Header name is: " + linkPhonHeader);

        common.logPrint("Step:: Verify text is showing on the choose a branded username");
        common.waitUntilElementToBeVisible(By.xpath(TEXTLINKPHONE));
        String linkPhoneText = common.findElement(TEXTLINKPHONE).getText();
        common.assertTwoValuesAreEqual(linkPhoneText, "You can use your phone number to log in with @" + userName + " and manage your community using the Genuin App");
        common.logPrint("Text is displayed: " + linkPhoneText);

        common.logPrint("Step:: Select country number from dropdown");
        WebElement countryDropdown = common.findElement(DROPDOWNCOUNTRY);
        Select sc = new Select(countryDropdown);
        sc.selectByVisibleText("India");
        common.logPrint("Selected country is: India");

        common.logPrint("Step:: Enter mobile number");
        String mobileNum = common.generateRandomNumberString(9);
        common.waitUntilElementsToBeVisible(By.xpath(PHONENUM));
        common.type(PHONENUM, "9" + mobileNum);
        common.logPrint("Entered mobile number is: " + "9" + mobileNum);

        common.logPrint("Step:: Click on the save button");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEBTN));
        common.click(SAVEBTN);

        common.logPrint("Step:: Click on the continue button");
        common.waitUntilElementsToBeVisible(By.xpath(CONTINUEBTN));
        common.click(CONTINUEBTN);

    }

    /**
     * Verify 'Login' Functionality.
     * Ensure that users can log in with valid credentials.
     * Validate that the correct username is displayed after login and that logout functionality works properly.
     * Verify that the logged-in username is displayed.
     */
    public void loginTest(String email, String pass, String userName) {

        common.pause(2);
        common.logPrint("Step:: Click on the profile logo");
        common.waitUntilElementsToBeVisible(By.xpath(PROFILEIMG));
        common.click(PROFILEIMG);

        common.logPrint("Step:: Click on the logout button");
        common.waitUntilElementsToBeVisible(By.xpath(LOGOUTBTN));
        common.click(LOGOUTBTN);
        common.pause(2);

    }

    /**
     * Verify 'Forgot Password' Functionality.
     * Ensure that users can reset their password using the 'Forgot Password' link.
     * Validate email verification, new password setup, and successful login with the new password.
     */
    public void forgotPasswordTest(String email, String pass) {
        common.logPrint("Step:: Click on Forgot Password link");
        common.waitUntilElementsToBeVisible(By.xpath(FORGOTPASSWORD));
        common.click(FORGOTPASSWORD);

        common.logPrint("Step:: Enter registered email");
        common.type(EMAILFIELD, email);

        common.logPrint("Step:: Click on Send Email button");
        common.click(SENDEMAILBTN);

        common.logPrint("Step:: Open new tab in browser");
        //Open browser new tab using java scripts
        ((JavascriptExecutor) driver).executeScript("window-open();");

        String mainWindo = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(mainWindo)) {
                driver.switchTo().window(tab);
            }
        }

        common.logPrint("Step:: Open Yopmail");
        driver.get("https://yopmail.com/");

        common.logPrint("Step:: Enter email in Yopmail");
        common.pause(10);
        common.type("login", email);
        common.click("//i[@class='material-icons-outlined f36']");

        driver.switchTo().frame("ifmail");

        common.pause(5);
        common.waitUntilElementToBeVisible(By.xpath(RESETPASSWORDYOP));
        common.click(RESETPASSWORDYOP);

        driver.switchTo().defaultContent();

        common.pause(2);
        common.logPrint("Step:: Switch tab");
        common.switchToTab(2);

        String resetPassword = common.generateRandomChars(10);
        common.logPrint("Step:: Enter new password");
        common.waitUntilElementToBeVisible(By.xpath(RESETPASSINP));
        common.type(RESETPASSINP, resetPassword);

        common.logPrint("Step:: Click on the save button");
        common.waitUntilElementToBeVisible(By.xpath(SAVEBTNCOM));
        common.click(SAVEBTNCOM);

        common.logPrint("Password is reset successfully and now login with new password");
        common.pause(5);
        common.logPrint("Step:: Enter newly created username and pass");
        common.waitUntilElementsToBeVisible(By.xpath(EMAILFIEDL));
        common.typeAndTab(EMAILFIEDL, email);

        common.waitUntilElementsToBeVisible(By.xpath(PASSWORDFIELD));
        common.type(PASSWORDFIELD, resetPassword);

        common.logPrint("Step:: Click on Login button");
        common.waitUntilElementsToBeVisible(By.xpath(LOGINBTN));
        common.click(LOGINBTN);

    }

    /**
     * Verify 'Sign Up' Page Fields and Labels.
     * Ensure that all essential elements on the sign-up page are displayed correctly.
     * Validate text labels, icons, and links for accuracy.
     */
    public void verifySignupFieldsAndLabels() {

        common.logPrint("Step:: Click on the sign up link");
        common.waitUntilElementsToBeVisible(By.xpath(SIGNUPLINK));
        common.click(SIGNUPLINK);

        common.logPrint("Verify logo is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINPAGELOGO));
        common.verifyElementIsDisplayed(LOGINPAGELOGO);

        common.pause(2);
        common.logPrint("Step:: Verify header is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINHEADER));
        String headeName = common.findElement(LOGINHEADER).getText();
        common.assertTwoValuesAreEqual(headeName, "Set up your account");
        common.logPrint("Header name is: " + headeName);

        common.logPrint("Step:: Verify Email label is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(ENTEREMAILADDRESS));
        String emaillabel = common.findElement(ENTEREMAILADDRESS).getText();
        common.assertTwoValuesAreEqual(emaillabel, "Enter Email Address");
        common.logPrint("Email label is: " + emaillabel);

        common.logPrint("Step:: Verify password label is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(SETYOURPASSWORD));
        String passwordLabel = common.findElement(SETYOURPASSWORD).getText();
        common.assertTwoValuesAreEqual(passwordLabel, "Set Your Password");
        common.logPrint("Password label is: " + passwordLabel);

        common.logPrint("Step:: Verify eye icon is displayed on the password field.");
        common.waitUntilElementToBeVisible(By.xpath(EYEICONLOGIN));
        common.verifyElementIsDisplayed(EYEICONLOGIN);

        common.logPrint("Step:: Verify text is showing on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(TEXTSIGNUP));
        String textSignup = common.getText(TEXTSIGNUP);
        common.assertTwoValuesAreEqual(textSignup, "By signing up, you agree to our publisher’s agreement, information collection notice and Privacy Policy");
        common.logPrint("Signup page text is: " + textSignup);

        common.logPrint("Step:: Verify Already signup text is showing on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(ALREADYHAVEANACTEXT));
        String AlreadyHaveAnAccount = common.getText(ALREADYHAVEANACTEXT);
        common.assertTwoValuesAreEqual(AlreadyHaveAnAccount, "Already have an account? Log In");
        common.logPrint("Already an account text is: " + AlreadyHaveAnAccount);
    }

    public void verifyLoginPageFieldsAndLabels() {

        common.logPrint("Verify logo is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINPAGELOGO));
        common.verifyElementIsDisplayed(LOGINPAGELOGO);

        common.pause(2);
        common.logPrint("Step:: Verify header is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINHEADER));
        String headeName = common.findElement(LOGINHEADER).getText();
        common.assertTwoValuesAreEqual(headeName, "Log Into Your Account");
        common.logPrint("Header name is: " + headeName);

        common.logPrint("Step:: Verify Email label is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(EMAILLABEL));
        String emaillabel = common.findElement(EMAILLABEL).getText();
        common.assertTwoValuesAreEqual(emaillabel, "Enter Email Address");
        common.logPrint("Email label is: " + emaillabel);

        common.logPrint("Step:: Verify password label is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(PASSWORDLABEL));
        String passwordLabel = common.findElement(PASSWORDLABEL).getText();
        common.assertTwoValuesAreEqual(passwordLabel, "Enter Password");
        common.logPrint("Password label is: " + passwordLabel);

        common.logPrint("Step:: Verify eye icon is displayed on the password field.");
        common.waitUntilElementToBeVisible(By.xpath(EYEICONLOGIN));
        common.verifyElementIsDisplayed(EYEICONLOGIN);

        common.logPrint("Step:: Verify forgot password link is displayed.");
        common.waitUntilElementToBeVisible(By.xpath(FORGOTPASSWORD));
        common.verifyElementIsDisplayed(FORGOTPASSWORD);

        common.logPrint("Step:: Verify login button is displayed.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINBTN));
        common.verifyElementIsDisplayed(LOGINBTN);

        common.logPrint("Step:: Verify Email label is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(ORTEXTONLOGIN));
        String orText = common.findElement(ORTEXTONLOGIN).getText();
        common.assertTwoValuesAreEqual(orText, "OR");
        common.logPrint("Or text is: " + emaillabel);

        common.logPrint("Step:: Verify Continue with google button is displayed.");
        common.waitUntilElementToBeVisible(By.xpath(CONTINUEWITHGOOGLE));
        common.verifyElementIsDisplayed(CONTINUEWITHGOOGLE);

        common.logPrint("Step:: Verify 'Don't have an account' text on login page.");
        common.waitUntilElementToBeVisible(By.xpath(DONTHAVEACTEXT));
        String dontHaveAcText = common.findElement(DONTHAVEACTEXT).getText();
        common.assertTwoValuesAreEqual(dontHaveAcText, "Don't have an account? Sign up");
        common.logPrint("Text is displayed: " + emaillabel);
    }

    /**
     * Verify 'Login Page' Fields and Labels.
     * Ensure that all essential elements on the login page are displayed correctly.
     * Validate text labels, buttons, icons, and links for accuracy.
     */
    public void verifyForgotPassPageFieldsAndLabels() {

        common.logPrint("Step:: Click on the login link");
        common.waitUntilElementsToBeVisible(By.xpath(LOGINLINK));
        common.click(LOGINLINK);

        common.logPrint("Step:: Click on the forgot password link");
        common.waitUntilElementsToBeVisible(By.xpath(FORGOTPASSWORD));
        common.click(FORGOTPASSWORD);

        common.logPrint("Verify logo is displayed on the login page.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINPAGELOGO));
        common.verifyElementIsDisplayed(LOGINPAGELOGO);

        common.pause(2);
        common.logPrint("Step:: Verify header is displayed on the forgot password page.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINHEADER));
        String headeName = common.findElement(LOGINHEADER).getText();
        common.assertTwoValuesAreEqual(headeName, "Forgot Password");
        common.logPrint("Header name is: " + headeName);

        common.logPrint("Step:: Verify Email label is displayed on the forgot password page.");
        common.waitUntilElementToBeVisible(By.xpath(ENTEREMAITTORESETPASSWORD));
        String emaillabel = common.findElement(ENTEREMAITTORESETPASSWORD).getText();
        common.assertTwoValuesAreEqual(emaillabel, "Enter Email Address to reset password");
        common.logPrint("Email label is: " + emaillabel);

        common.logPrint("Step:: Verify Send email button is displayed on forgot password.");
        common.waitUntilElementToBeVisible(By.xpath(SENDEMAILBTN));
        common.verifyElementIsDisplayed(SENDEMAILBTN);
    }

    /**
     * Verify 'Brand Assets' Page After Entering URL.
     * Ensure that all essential elements on the Brand Assets page are displayed correctly.
     * Validate text labels, buttons, images, dropdowns, and input fields for accuracy.
     */
    public void verifyAfterEnterURL() {
        common.logPrint("Step:: Verify 'Step 1 to 4' label is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(STEP1OF4));
        String step1of4 = common.findElement(STEP1OF4).getText();
        common.assertTwoValuesAreEqual(step1of4, "Step 1 of 4");

        common.logPrint("Step:: Verify 'Confirm Your Brand Assets' is displayed on the Brand Assets page. ");
        common.waitUntilElementsToBeVisible(By.xpath(CONFIRMBRANDASSERT));
        String confirmbrandassert = common.findElement(CONFIRMBRANDASSERT).getText();
        common.assertTwoValuesAreEqual(confirmbrandassert, "Confirm your brand assets");

        common.logPrint("Step:: Verify After 'We’ve gathered brand assets from your website. These assets will be used across your brand profile and community.' is displayed on the Brand Assert Page.");
        common.waitUntilElementsToBeVisible(By.xpath(ACROSSEBRANDPROFILE));
        String Acrossbrandprofile = common.findElement(ACROSSEBRANDPROFILE).getText();
        common.assertTwoValuesAreEqual(Acrossbrandprofile, "We’ve gathered brand assets from your website. These assets will be used across your brand profile and community.");

        common.logPrint("Step:: Veify the 'Favicon label' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(FAVICON));
        String favicon = common.findElement(FAVICON).getText();
        common.assertTwoValuesAreEqual(favicon, "Favicon");

        common.logPrint("Step:: Verify the 'Profile label' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PROFILE));
        String profile = common.findElement(PROFILE).getText();
        common.assertTwoValuesAreEqual(profile, "Profile");

        common.logPrint("Step:: Verify the 'Banner label' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(BANNER));
        String banner = common.findElement(BANNER).getText();
        common.assertTwoValuesAreEqual(banner, "Banner");

        common.logPrint("Step:: Verify the 'Favicon image' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(FAVICONIMG));
        common.assertElementDisplayed(FAVICONIMG);

        common.logPrint("Step:: Verify the 'Profile image' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PROFILEIMAGE));
        common.assertElementDisplayed(PROFILEIMAGE);

        common.logPrint("Step:: Verify the 'Banner image' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(BANNERIMG));
        common.assertElementDisplayed(BANNERIMG);

        common.logPrint("Step:: Verify the 'Brand Slogan Text' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(BRANDSLOGAN));
        common.verifyElementIsDisplayed(BRANDSLOGAN);
        String brandslogan = common.findElement(BRANDSLOGAN).getText();
        common.assertTwoValuesAreEqual(brandslogan, "Brand Slogan");

        common.logPrint("Step:: Verify the 'Your brand slogan will appear in the center of the brand feed' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(BRANDSLOGANLINE));
        common.assertElementDisplayed(BRANDSLOGANLINE);
        String brandsloganline = common.findElement(BRANDSLOGANLINE).getText();
        common.assertTwoValuesAreEqual(brandsloganline, "Your brand slogan will appear in the center of the brand feed.");

        common.logPrint("Step:: Verify the 'Custom Button' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(CUSTOMBUTTON));
        common.assertElementDisplayed(CUSTOMBUTTON);

        common.logPrint("Step:: Verify the 'Slogan image' button is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(SLOGANIMAGEBUTTON));
        common.assertElementDisplayed(SLOGANIMAGEBUTTON);

        common.logPrint("Step:: Verify 'Customize Your Web CTAs' TEXT is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(CUSTOMIZEWEBCTAS));
        common.assertElementDisplayed(CUSTOMIZEWEBCTAS);
        String customizewebcta = common.findElement(CUSTOMIZEWEBCTAS).getText();
        common.assertTwoValuesAreEqual(customizewebcta, "Customize Your Web CTAs");

        common.logPrint("Step:: Verify 'Set options for users to download your app or log in to the web' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(CUTOMIZEWEBCTASPARGRAPH));
        common.assertElementDisplayed(CUTOMIZEWEBCTASPARGRAPH);
        String customizeparagraph = common.findElement(CUTOMIZEWEBCTASPARGRAPH).getText();
        common.assertTwoValuesAreEqual(customizeparagraph, "Set options for users to download your app or log in to the web.");

        common.logPrint("Step:: Verify 'CUSTOMIZE WEB CTAS IMAGE' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(CUTOMIZEWEBCTASIMG));
        common.assertElementDisplayed(CUTOMIZEWEBCTASIMG);

        common.logPrint("Step:: Verify 'Login DropDown' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(LOGINDROPDOWN));
        common.assertElementDisplayed(LOGINDROPDOWN);

        common.logPrint("Step:: Verify 'MOBILE APP URL' Text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(MOBILEAPPURL));
        common.assertElementDisplayed(MOBILEAPPURL);
        String mobileappurl = common.findElement(MOBILEAPPURL).getText();
        common.assertTwoValuesAreEqual(mobileappurl, "Mobile App URLs");

        common.logPrint("Step:: Verify 'This link will be used to prompt users to download your app.' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(MOBILEAPPPARAGRAPH));
        common.assertElementDisplayed(MOBILEAPPPARAGRAPH);
        String mobileappparagraph = common.findElement(MOBILEAPPPARAGRAPH).getText();
        common.assertTwoValuesAreEqual(mobileappparagraph, "This link will be used to prompt users to download your app.");

        common.logPrint("Step:: Verify 'App Store URL text' is displayed on the Brand Assets page.");
        common.waitUntilElementsToBeVisible(By.xpath(APPSTOREURL));
        common.assertElementDisplayed(APPSTOREURL);
        String appstoreurl = common.findElement(APPSTOREURL).getText();
        common.assertTwoValuesAreEqual(appstoreurl, "App Store URL");

        common.logPrint("Step:: Verify 'App Store URL INPUT' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(APPSTOREINPUT);
        common.assertElementDisplayed(APPSTOREINPUT);

        common.logPrint("Step:: Verify 'Play Store URL INPUT' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PLAYSTOREURL));
        String playstoreurl = common.findElement(PLAYSTOREURL).getText();
        common.assertTwoValuesAreEqual(playstoreurl, "Play Store URL");

        common.logPrint("Step:: Verify 'Play Store URL INPUT' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PLAYSTOREURLINPUT));
        common.assertElementDisplayed(PLAYSTOREURLINPUT);

        common.logPrint("Step:: Verify 'Policy URLs' text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(POLICYURL));
        String policyurl = common.findElement(POLICYURL).getText();
        common.assertTwoValuesAreEqual(policyurl, "Policy URLs");

        common.logPrint("Step:: Verify 'Include URLs for your Terms and Privacy Policy to display on the community platform and redirect users to your site.' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(POLICYURLPARAGRAPH));
        String policyparagraph = common.findElement(POLICYURLPARAGRAPH).getText();
        common.assertTwoValuesAreEqual(policyparagraph, "Include URLs for your Terms and Privacy Policy to display on the community platform and redirect users to your site.");

        common.logPrint("Step:: Verify 'Privacy Policy URL' text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIVACYPOLICYTEXT));
        String privacypolicyurl = common.findElement(PRIVACYPOLICYTEXT).getText();
        common.assertTwoValuesAreEqual(privacypolicyurl, "Privacy Policy URL");

        common.logPrint("Step:: Verify 'POLICY URL INPUT' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(POLICYINPUT));
        common.assertElementDisplayed(POLICYINPUT);

        common.logPrint("Step:: Verify 'Terms of Use URL' text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERMOFUSE));
        String termofuseurl = common.findElement(TERMOFUSE).getText();
        common.assertTwoValuesAreEqual(termofuseurl, "Terms of Use URL");

        common.logPrint("Step:: Verify 'Terms of Use URL INPUT' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERMSOFUSEURL));
        common.assertElementDisplayed(TERMSOFUSEURL);

        common.logPrint("Step:: Verify 'Image for shared URL' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(IMGSHAREURL));
        String imgshareurl = common.findElement(IMGSHAREURL).getText();
        common.assertTwoValuesAreEqual(imgshareurl, "Image for shared URL");

        common.logPrint("Step:: Verify 'This information will appear when sharing the brand URL.' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(IMAGEURLINPUT));
        String imageurl = common.findElement(IMAGEURLINPUT).getText();
        common.assertTwoValuesAreEqual(imageurl, "This information will appear when sharing the brand URL.");

        common.logPrint("Step:: Verify 'PREVIEW METADATA' Button is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PREVIEWMETADATA));
        common.assertElementDisplayed(PREVIEWMETADATA);

        common.logPrint("Step:: Verify 'PAGETITLE' Text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PAGETITLE));
        String pagetitle = common.findElement(PAGETITLE).getText();
        common.assertTwoValuesAreEqual(pagetitle, "Page Title");

        common.logPrint("Step:: Verify 'Tester | Innovative Solutions for Modern Needs' Textbox is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TESTERINNOVATIVE));
        common.assertElementDisplayed(TESTERINNOVATIVE);

        common.logPrint("Step:: Verify 'Meta Description' Text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(METADESC));
        String metadesc = common.findElement(METADESC).getText();
        common.assertTwoValuesAreEqual(metadesc, "Meta Description");

        common.logPrint("Step:: Verify 'META Description Text Area' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(METATEXTAREA));
        common.assertElementDisplayed(METATEXTAREA);

        common.logPrint("Step:: Verify 'IMAGE' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(IMAGE));
        common.assertElementDisplayed(IMAGE);

        common.logPrint("Step:: Verify 'Brand Color' Text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(BRANDCOLOR));
        String brandcolor = common.findElement(BRANDCOLOR).getText();
        common.assertTwoValuesAreEqual(brandcolor, "Brand Color");

        common.logPrint("Step:: Verify 'They will be used for interactive elements.' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(BRANDPARAGRAPH));
        String brandparagraph = common.findElement(BRANDPARAGRAPH).getText();
        common.assertTwoValuesAreEqual(brandparagraph, "They will be used for interactive elements.");

        common.logPrint("Step:: Verify 'PRIMARY BOX' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIMARYBOX));
        common.assertElementDisplayed(PRIMARYBOX);

        common.logPrint("Step:: Verify 'Primary' text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIMARY));
        String primary = common.findElement(PRIMARY).getText();
        common.assertTwoValuesAreEqual(primary, "Primary");

        common.logPrint("Step:: Verify 'Used for buttons, selected states, and links.' paragraph is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIMARYPARAGRAPH));
        String primaryparagraph = common.findElement(PRIMARYPARAGRAPH).getText();
        common.assertTwoValuesAreEqual(primaryparagraph, "Used for buttons, selected states, and links.");

        common.logPrint("Step:: Verify 'PRIMARY COLOR' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIMARYCOLOR));
        common.assertElementDisplayed(PRIMARYCOLOR);

        common.logPrint("Step:: Verify 'Hash' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIMARYHASH));
        common.assertElementDisplayed(PRIMARYHASH);

        common.logPrint("Step:: Verify 'Code' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIMARYCODE));
        common.assertElementDisplayed(PRIMARYCODE);

        common.logPrint("Step:: Verify 'Primary ViewBox' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(PRIMARYVIEWBOX));
        common.assertElementDisplayed(PRIMARYVIEWBOX);

        common.logPrint("Step:: Verify 'SECONDARY BOX'is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(SECONDARYBOX));
        common.assertElementDisplayed(SECONDARYBOX);

        common.logPrint("Step:: Verify 'Secondary' text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(SECONDARY));
        String secondary = common.findElement(SECONDARY).getText();
        common.assertTwoValuesAreEqual(secondary, "Secondary");

        common.logPrint("Step:: Verify 'Used for text and contrast for backgrounds.' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(SECONDARYPARAGRAPH));
        String secondaryparagraph = common.findElement(SECONDARYPARAGRAPH).getText();
        common.assertTwoValuesAreEqual(secondaryparagraph, "Used for text and contrast for backgrounds.");

        common.logPrint("Step:: Verify 'Secondary Color' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(SECONDARYCOLOR));
        common.assertElementDisplayed(SECONDARYCOLOR);

        common.logPrint("Step:: Verify 'Secondary hash' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(SECONDARYHASH));
        common.assertElementDisplayed(SECONDARYHASH);

        common.logPrint("Step:: Verify 'Secondary code' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(SECONDARYCODE));
        common.assertElementDisplayed(SECONDARYCODE);

        common.logPrint("Step:: Verify 'Secondary view box' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(SECONDARYVIEWBOX));
        common.assertElementDisplayed(SECONDARYVIEWBOX);

        common.logPrint("Step:: Verify 'Tertiary Box' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERTIARYBOX));
        common.assertElementDisplayed(TERTIARYBOX);

        common.logPrint("Step:: Verify 'Tertiary' text is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERTIARY));
        String tertiary = common.findElement(TERTIARY).getText();
        common.assertTwoValuesAreEqual(tertiary, "Tertiary");

        common.logPrint("Step:: Verify 'Used for backgrounds and subtle accents.' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERTIARYPARAGRAPH));
        String tertiaryparagraph = common.findElement(TERTIARYPARAGRAPH).getText();
        common.assertTwoValuesAreEqual(tertiaryparagraph, "Used for backgrounds and subtle accents.");

        common.logPrint("Step:: Verify 'Tertiary Color' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERTIARYCOLOR));
        common.assertElementDisplayed(TERTIARYCOLOR);

        common.logPrint("Step:: Verify 'Tertiary hash' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERTIARYHASH));
        common.assertElementDisplayed(TERTIARYHASH);

        common.logPrint("Step:: Verify 'Tertiary code' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERTIARYCODE));
        common.assertElementDisplayed(TERTIARYCODE);

        common.logPrint("Step:: Vwerify 'Tertiary view box' is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(TERTIARYVIEWBOX));
        common.assertElementDisplayed(TERTIARYVIEWBOX);

        common.logPrint("Step:: Verify 'Change Brand URL' button is displayed on the Brand Assets page.");
        common.waitUntilElementToBeVisible(By.xpath(CHANGEBRANDURL));
        common.assertElementDisplayed(CHANGEBRANDURL);

        common.logPrint("Step:: Verify 'Preview page' is display on the Brand Asserts Page.");
        common.waitUntilElementsToBeVisible(By.xpath(PREVIEWPAGE));
        common.assertElementDisplayed(PREVIEWPAGE);

        common.logPrint("Step:: Verify 'Next' Buttom is display on the Brand Asserts Page.");
        common.waitUntilElementsToBeVisible(By.xpath(NEXT));
        common.assertElementDisplayed(NEXT);
    }

    public void verify_brand_catagory() {
        common.logPrint("Step:: Verify 'Brand catagory' is visible and clickable");
        common.click(BRANDCATAGORIES);

        common.logPrint("Step:: Verify 'Step 2 to 4' label is displayed on the Brand catagory page.");
        common.waitUntilElementToBeVisible(By.xpath(STEP2OF4));
        String step2of4 = common.findElement(STEP2OF4).getText();
        common.assertTwoValuesAreEqual(step2of4, "Step 2 of 4");

        if (common.isElementDisplayed(CHECKBOX)) {
            return;
        } else {
            common.logPrint("Step:: Verify 'icon' is display on brand catagory page ");
            common.waitUntilElementToBeVisible(By.xpath(ICON));
            common.verifyElementIsDisplayed(ICON);

            common.logPrint("Step:: Verify 'Select the categories of your brand'is diplayed on the Brand catagory page.");
            common.waitUntilElementToBeVisible(By.xpath(SELECTCATAGORIESOFYOURBRAND));
            String selectCategory = common.findElement(SELECTCATAGORIESOFYOURBRAND).getText();
            common.assertTwoValuesAreEqual(selectCategory, "Select the categories of your brand");

            common.logPrint("Step:: Verify 'These categories, topics, and keywords will be used by Genuin AI to personalize the community feed and moderate video posts.' is displayed on the Brand catagory page.");
            common.waitUntilElementToBeVisible(By.xpath(CATAGORIESPARAGRAPH));
            String categoryTopics = common.findElement(CATAGORIESPARAGRAPH).getText();
            common.assertTwoValuesAreEqual(categoryTopics, "These categories, topics, and keywords will be used by Genuin AI to personalize the community feed and moderate video posts.");

            common.logPrint("Step:: Verify 'Add Category Box' is display on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(CARDBOARD));
            common.verifyElementIsDisplayed(CARDBOARD);

            common.logPrint("Step:: Verify 'ICON in Box' is display on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(ADDCATICON));
            common.verifyElementIsDisplayed(ADDCATICON);

            common.logPrint("Step:: Verify 'No categories found' text is displayed on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(NOCATAGORIESFOUND));
            String noCategoriesFound = common.findElement(NOCATAGORIESFOUND).getText();
            common.assertTwoValuesAreEqual(noCategoriesFound, "No categories found.");

            common.logPrint("Step:: Verify 'All categories will be displayed here.' is displayed on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(ALLCTAGORIESDISPLAYED));
            String allCategoriesDisplayed = common.findElement(ALLCTAGORIESDISPLAYED).getText();
            common.assertTwoValuesAreEqual(allCategoriesDisplayed, "All categories will be displayed here.");

            common.logPrint("Step:: Verify 'Add Category' button is displayed on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(ADDALLCATAGORY));
            common.verifyElementIsDisplayed(ADDALLCATAGORY);

            common.logPrint("Step:: Verify 'Continue' button is displayed on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(CONTINUE));
            String continuebuttontext = common.findElement(CONTINUE).getText();
            common.assertTwoValuesAreEqual(continuebuttontext, "Continue");
        }
    }

    public void new_catagory_verification() {
        common.logPrint("Step:: Verify 'ADD CATEGORY' Button click on the Brand category page");
        common.click(ADDCATAGORYBUTTON);

        common.logPrint("Step:: verify 'New Category' Text is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(NEWCATEGORY));
        String newCategoryText = common.findElement(NEWCATEGORY).getText();
        common.assertTwoValuesAreEqual(newCategoryText, "New Category");

        common.logPrint("Step:: Verify 'Close' button is displayed and clickable on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(CLOSEBUTTON));
        common.verifyElementIsDisplayed(CLOSEBUTTON);
        common.waitUntilElementToBeClickable(CLOSEBUTTON);

        common.logPrint("Step:: Verify 'Category Name' text is displayed correctly on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(CATEGORYNAME));
        String categoryLabel = common.findElement(CATEGORYNAME).getText();
        common.assertTwoValuesAreEqual(categoryLabel, "Category Name *");

        common.logPrint("Step:: Verify '(0/24)' is displayed correctly on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(CATAGORY_0_24));
        String categoryRangeText = common.findElement(CATAGORY_0_24).getText();
        common.assertTwoValuesAreEqual(categoryRangeText, "0/24");

        common.logPrint("Step:: Verify 'Enter Category name' is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERCATAGORYNAME));
        common.waitUntilElementToBeClickable(ENTERCATAGORYNAME);
        common.verifyElementIsDisplayed(ENTERCATAGORYNAME);

        common.logPrint("Step:: Verify 'Topics' text is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(TOPICS));
        String topicsText = common.findElement(TOPICS).getText();
        common.assertTwoValuesAreEqual(topicsText, "Topics");

        common.logPrint("Step:: Verify 'Add Topics' button is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(ADD_TOPICS));
        common.verifyElementIsDisplayed(ADD_TOPICS);

        common.logPrint("Step:: Verify 'Topic 1: ' is displayed correctly on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(TOPIC1));
        String topicLabel = common.findElement(TOPIC1).getText();
        common.assertTwoValuesAreEqual(topicLabel, "Topic 1:");

        common.logPrint("Step:: Verify 'Topic' text is displayed  on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(TOPIC));
        String topicText = common.findElement(TOPIC).getText();
        common.assertTwoValuesAreEqual(topicText, "Topic *");

        common.logPrint("Step:: Verify 'Topic  (0/24)' is displayed  on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(TOPIC0_24));
        String topicRangeText = common.findElement(TOPIC0_24).getText();
        common.assertTwoValuesAreEqual(topicRangeText, "0/24");

        common.logPrint("Step:: Verify 'Entering Topic' is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERTOPIC));
        common.assertElementDisplayed(ENTERTOPIC);

        common.logPrint("Step:: Verify 'Keywords' text is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(KEYWORDS));
        String keywordsLabel = common.findElement(KEYWORDS).getText();
        common.assertTwoValuesAreEqual(keywordsLabel, "Keywords");

        common.logPrint("Step:: Verify 'Keywords (0/1000)' is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(KEYWORDS_0_1000));
        String keywordsRangeText = common.findElement(KEYWORDS_0_1000).getText();
        common.assertTwoValuesAreEqual(keywordsRangeText, "0/1000");

        common.logPrint("Step:: Verify 'Enter Keywords'  is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERKEYWORDS));
        common.verifyElementIsDisplayed(ENTERKEYWORDS);

        common.logPrint("Step:: Verify 'Press Enter after each keyword to add multiple keywords' is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(PRESSENTERAFTERTEXT));
        String pressEnterText = common.findElement(PRESSENTERAFTERTEXT).getText();
        common.assertTwoValuesAreEqual(pressEnterText, "Press Enter after each keyword to add multiple keywords");

        common.logPrint("Step:: Verify 'Add' button is displayed on the Brand category page");
        common.waitUntilElementToBeVisible(By.xpath(ADDBUTTON));
        common.verifyElementIsDisplayed(ADDBUTTON);


        for (int i = 0; i < 5; i++) {
            common.logPrint("adding element" + i);
            common.logPrint("step :: Verifying add 'new catagory' of element ");
            String variable1 = common.generateRandomChars(10);

            common.logPrint("Step:: Verify 'Catagory Name' " + variable1 + "input is entered on the Brand category page");
            common.type(ENTERCATAGORYNAME, variable1);

            String variable2 = common.generateRandomChars(10);
            common.logPrint("Step:: Verify 'Topic Name' " + variable2 + " input is entered");
            common.type(ENTERTOPIC, variable2);

            common.logPrint("Step:: Verify 'Add' button can be clicked on the Brand category page");
            common.waitUntilElementToBeClickable(ADDBUTTON);
            common.click(ADDBUTTON);

            common.logPrint("Step:: Verify 'Check Box' is checked on newly added element on brand catagory page");
            common.waitUntilElementToBeVisible(By.xpath(CHECKBOX));
            common.waitUntilElementToBeClickable(CHECKBOX);
            common.isChecked(CHECKBOX);

            common.logPrint("Step:: Verify 'Title' on brand catagory page is same as input");
            common.waitUntilElementToBeVisible(By.xpath(TITLEOFINPUT));
            common.assertElementDisplayed(TITLEOFINPUT);
            String listheading = common.findElement(TITLEOFINPUT).getText();
            common.assertTwoValuesAreEqual(listheading, variable1);
            common.click(TITLEOFINPUT);

            common.logPrint("Step:: Verifying 'Topic' on brand catagory page is same as input");
            common.waitUntilElementToBeVisible(By.xpath(LISTOFTOPIC));
            String listtopic = common.findElement(LISTOFTOPIC).getText();
            common.assertTwoValuesAreEqual(listtopic, variable2);

            common.logPrint("Step:: Verifying 'Add Topic' button in the list is displayed and clickable on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(ADDTOPIC));
            common.waitUntilElementToBeClickable(ADDTOPIC);
            common.verifyElementIsDisplayed(ADDTOPIC);

            common.logPrint("Step::Verifying 'Up' button is displayed and clickable on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(UPBUTTON));
            common.verifyElementIsDisplayed(UPBUTTON);
            common.waitUntilElementToBeClickable(UPBUTTON);

            common.logPrint("Step::Verifying 'Alert text' is displayed on the Brand category page");
            common.waitUntilElementToBeVisible(By.xpath(ALERTTEXT));
            String alertText = common.findElement(ALERTTEXT).getText();
            common.verifyElementIsDisplayed(ALERTTEXT);
            /// /
            if (alertText.equals("Choose 3 or more categories to continue.") || alertText.equals("The unselected categories will be removed.\n")) {
                common.logPrint("Step:: Alert message displayed correctly: " + alertText);
            }

            if (i < 4) {
                common.click(ADDCATAGORYBUTTON);
            }


        }
    }
}

