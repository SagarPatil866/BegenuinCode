package Tests;

import Config.ReadProperties;
import Utils.BasePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Embed extends BasePage {

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
     * Verify Embed Page.
     * Ensure that the Embed page is accessible after logging in.
     * Validate that all required elements on the Embed page are displayed correctly.
     */
    @Test
    public void verify_Embed_Page() {
        Reporter.log("<font color='blue'><b>Method…</b></font>", true);
        open_Web_URL_and_Login();
        common.logPrint("Step ::click on the manage page");
        embedpage.clickOnEmbedPage();
    }

    @Test
    public void verify_EmbedPage_Functionality(){
        Reporter.log("<font color='blue'><b>Verify Embed Page…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Embed_Page();
    }

    @Test
    public void verify_New_Embad_Page(){
        Reporter.log("<font color='blue'><b>Verify New Embed Page…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Embed_Page();
        embedpage.verify_New_Embad_Page();
    }

    @Test
    public void verify_Embed_StandardWall_Style_For_EmbedView(){
        Reporter.log("<font color='blue'><b>Verify to create Standard wall style  Page Functionality…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Embed_For_StandardWall_Style();
    }

    @Test
    public void verify_Embed_FeedStyle_For_EmbedView(){
        Reporter.log("<font color='blue'><b>Verify to create Feed Style For Embed View  Functionality…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Embed_FeedStyle_For_EmbedView();
    }

    @Test
    public void verify_Embed_FeedStyle_For_PopUpView(){
        Reporter.log("<font color='blue'><b>Verify to create Feed Style For PopUp View  Functionality…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Embed_FeedStyle_For_PopUpView();
    }

    @Test
    public void verify_Embed_Carousel_Style_For_EmbedView(){
        Reporter.log("<font color='blue'><b>Verify to create Carousel Style For PopUp View  Functionality…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Embed_Carousel_Style_For_EmbedView();
    }
    @Test
    public void verify_Embed_Carousel_Style_For_PopUpView(){
        Reporter.log("<font color='blue'><b>Verify to create Carousel Style For PopUp View  Functionality…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Embed_Carousel_Style_For_PopUpView();
    }

    @Test
    public void verify_Edit_Embed_For_BrandFeed(){
        Reporter.log("<font color='blue'><b>Verify to Edit Embed For Brand Feed…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Edit_Embed_For_BrandFeed();
    }

    @Test
    public void verify_Edit_Embed_For_CommunityFeed(){
        Reporter.log("<font color='blue'><b>Verify to Edit Embed For Community Feed…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Edit_Embed_For_CommunityFeed();
    }

    @Test
    public void verify_Edit_Embed_For_GroupFeed(){
        Reporter.log("<font color='blue'><b>Verify to Edit Embed For Community Feed…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_Edit_Embed_For_GroupFeed();
    }

    @Test
    public void verify_To_Create_Duplicate_Embed_For_BrandFeed(){
        Reporter.log("<font color='blue'><b>Verify to create Duplicate Embed For Brand Feed…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.create_Duplicate_Embed_For_BrandFeed();
    }

    @Test
    public void verify_To_Create_Duplicate_Embed_For_CommunityFeed(){
        Reporter.log("<font color='blue'><b>Verify to create Duplicate Embed For Community Feed…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.create_Duplicate_Embed_For_CommunityFeed();
    }

    @Test
    public void verify_To_Create_Duplicate_Embed_For_Group_Feed(){
        Reporter.log("<font color='blue'><b>Verify to create Duplicate Embed For Group Feed…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.create_Duplicate_Embed_For_Group_Feed();
    }

    @Test
    public void verify_OffSite_Page(){
        Reporter.log("<font color='blue'><b>Verify to create Duplicate Embed For Group Feed…</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_OffSite_Page();
    }

    @Test
    public void verify_To_Create_NewAdd(){
        Reporter.log("<font color='blue'><b>Verify to create New Add</b></font>", true);
        open_Web_URL_and_Login();
        embedpage.clickOnEmbedPage();
        embedpage.verify_OffSite_Page();
        embedpage.clickOnNewAd();
        embedpage.create_NewAdd();
    }
}
