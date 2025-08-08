package Tests;

import Pages.MobilePage;
import Utils.MobileBasePage;
import Utils.MobileCommon;
import org.testng.annotations.Test;


public class Mobile extends MobileBasePage {
    MobileCommon common = new MobileCommon();

    @Test
    public void verify_Login_Page_Element() throws Exception {
        common.pause(10);
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verifying Elements are present in Login page");
        mobilePage.verifyLoginPageElementsArePresent();
        common.pause(10);
    }

    @Test
    public void verify_Welcome_Page_Instruction()throws Exception{
        common.pause(10);
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verifying Elements are present on Welcome page");
        mobilePage.welcomePageInstruction();
        common.pause(10);
    }

    @Test
    public void verify_Login_Scenarios_With_Number() throws Exception {
        common.pause(10);
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.logInWithPhoneNumber();
        //mobilePage.loginWithEmail_LogOut();
        common.pause(50);
    }

    @Test
    public void verify_Login_Scenario_With_Email() throws Exception{

        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.logInWithEmail();
       // mobilePage.loginWithEmail_LogOut();
        common.pause(50);
    }

    @Test
    public void verify_Icon_Present_On_Home_Screen() throws Exception {
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.logInWithPhoneNumber();
        mobilePage.verifyElementsArePresent();
       //mobilePage.loginWithEmail_LogOut();
        common.pause(50);
    }
    @Test
    public void verify_Sign_Up_Scenario() throws Exception {
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.signUpFlow();
        common.pause(50);
    }
    @Test
    public void verify_Community_Create_With_Login_Scenario() throws Exception {
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.createCommunityWithLoginFlow();
    }
    @Test
    public void verify_Create_Auto_Community_Scenario()throws Exception{
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.createCommunityAutomatically();
    }
    @Test
    public void verify_Create_Loop_Scenario()throws Exception{
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.createLoopManually();
    }
    @Test
    public void verify_Create_Auto_Loop_Scenario()throws Exception{
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.createLoopAutomatically();
    }

    @Test
    public void verify_Create_Avatar_Scenario()throws Exception{
        common.logStepMessage("Application Launch Successfully");
        MobilePage mobilePage = new MobilePage(driver);
        common.logStepMessage("Verify Login page");
        mobilePage.createAvtar();

    }
}

