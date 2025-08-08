package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Embedpage extends Locators {
    Common common = new Common(driver);

    public String PUBLISH_BRAND_COMMUNITY = "//*[contains(text(),'Publish Brand Community')]";
    public String EMBED_PAGE_MENU = "//a[@href='/grow/on-site']//span[@class='navigation-link-info']//*[name()='svg']";
    public String EMBED_IMPRESSIONS = "//a[contains(text(),'Embed Impressions')]";

    public Embedpage(WebDriver driver) {

        super(driver);
    }

    public void selectBrand() {
        common.click(SELECT_ANY_BRAND);
        common.logPrint("Step ::Select Any brand");
        common.assertTwoValuesAreEqual(driver.getTitle(), "Build");
        common.logPrint("Step ::Verify that Dashboard page is open ");
    }


    public void clickOnEmbedPage() {
        common.pause(3);
        common.logPrint("Step ::Click on embed page");
        common.click(EMBED_PAGE_MENU);
        common.pause(8);

    }

    public void verify_Embed_Page(){
        common.logPrint("Step:: Verify 'On Site' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ONSITE));
        common.assertElementDisplayed(ONSITE);

        common.logPrint("Step:: Verify 'Off Site' Button is displyed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(OFFSITE));
        common.verifyElementIsDisplayed(OFFSITE);

        common.logPrint("Step:: Verify 'Quests' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(QUESTS));
        common.verifyElementIsDisplayed(QUESTS);

        common.logPrint("Step:: Verify 'Embeds' Text is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDSTEXT));
        common.assertElementDisplayed(EMBEDSTEXT);

        common.logPrint("Step:: Verify 'Download' Button is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(DOWNLOADBUTTON));
        common.assertElementDisplayed(DOWNLOADBUTTON);

        common.logPrint("Step:: Verify 'New' Button is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(NEWEMBED));
        common.assertElementDisplayed(NEWEMBED);

        common.logPrint("Step:: Verify 'Search Icon' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFOREMBED));
        common.verifyElementIsDisplayed(SEARCHICONFOREMBED);

        common.logPrint("Step:: Verify 'Search By Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHINPUTFORCOMMENT));
        common.assertElementDisplayed(SEARCHINPUTFORCOMMENT);

        common.logPrint("Step:: Verify 'Global Analytics' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GLOBALANALYTICS));
        common.assertElementDisplayed(GLOBALANALYTICS);

        common.logPrint("Step:: Verify 'CARDBODY' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CARDBODY));
        common.verifyElementIsDisplayed(CARDBODY);

        common.logPrint("Step:: Verify 'Edit' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITEMBED));
        common.verifyElementIsDisplayed(EDITEMBED);

        common.logPrint("Step:: Verify 'HOMESEARCHEMBED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HOMESEARCHEMBED));
        common.verifyElementIsDisplayed(HOMESEARCHEMBED);

        common.logPrint("Step:: Verify 'BLOGEMBED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BLOGEMBED));
        common.verifyElementIsDisplayed(BLOGEMBED);

        common.logPrint("Step:: Verify 'HOMESEARCH' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HOMESEARCH));
        common.verifyElementIsDisplayed(HOMESEARCH);

        common.logPrint("Step:: Verify 'POSTSALESEMBED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(POSTSALESEMBED));
        common.verifyElementIsDisplayed(POSTSALESEMBED);

        common.logPrint("Step:: Verify 'PDPEMBED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(PDPEMBED));
        common.verifyElementIsDisplayed(PDPEMBED);

        common.logPrint("Step:: Verify 'HOMEBLOGEMBED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HOMEBLOGEMBED));
        common.verifyElementIsDisplayed(HOMEBLOGEMBED);

        common.logPrint("Step:: Verify 'HOMEPOSTSALESEMBED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HOMEPOSTSALESEMBED));
        common.verifyElementIsDisplayed(HOMEPOSTSALESEMBED);
    }

    public void verify_New_Embad_Page(){
        common.logPrint("Step:: Verify 'New' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWEMBED));
        common.click(NEWEMBED);

        common.logPrint("Step:: Verify 'Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.verifyElementIsDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.verifyElementIsDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.verifyElementIsDisplayed(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'SELECT EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDSTYLE));
        common.click(SELECTEMBEDSTYLE);

        common.logPrint("Step:: Verify 'STANDAED WALL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(STANDAEDWALL));
        common.assertElementDisplayed(STANDAEDWALL);

        common.logPrint("Step:: Verify 'FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(FEED));
        common.assertElementDisplayed(FEED);

        common.logPrint("Step:: Verify 'CAROUSEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CAROUSEL));
        common.assertElementDisplayed(CAROUSEL);

        common.logPrint("Step:: Verify 'Monitor' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MONITORBUTTON));
        common.assertElementDisplayed(MONITORBUTTON);

        common.logPrint("Step:: Verify 'Mobile' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MOBILEBUTTON));
        common.assertElementDisplayed(MOBILEBUTTON);

        common.logPrint("Step:: Verify 'VIEW SETTINGS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWSETTINGS));
        common.assertElementDisplayed(VIEWSETTINGS);

        common.logPrint("Step:: Verify 'EMBED SIZE' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSIZE));
        common.assertElementDisplayed(EMBEDSIZE);

        common.logPrint("Step:: Verify 'SHOW HEADER' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWHEADER));
        common.assertElementDisplayed(SHOWHEADER);

        common.logPrint("Step:: Verify 'Display the top nav bar' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DISPLAYTOPNAVBAR));
        common.assertElementDisplayed(DISPLAYTOPNAVBAR);

        common.logPrint("Step:: Verify 'SHOW NEVIGATION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWNEVIGATIONBUTTON));
        common.assertElementDisplayed(SHOWNEVIGATIONBUTTON);
        common.click(SHOWNEVIGATIONBUTTON);
        common.click(SHOWNEVIGATIONBUTTON);

        common.logPrint("Step:: Verify 'SHOW SIDE PANEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSIDEPANEL));
        common.assertElementDisplayed(SHOWSIDEPANEL);

        common.logPrint("Step:: Verify 'SHOW SIDE PANEL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSIDEPANELBUTTON));
        common.assertElementDisplayed(SHOWSIDEPANELBUTTON);
        common.click(SHOWSIDEPANELBUTTON);
        common.click(SHOWSIDEPANELBUTTON);

        common.logPrint("Step:: Verify 'SHOW JOIN COMMUNITY' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWJOINCOMMUNITY));
        common.assertElementDisplayed(SHOWJOINCOMMUNITY);

        common.logPrint("Step:: Verify 'SHOW JOIN COMMUNITY' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWJOINCOMMUNITYBUTTON));
        common.assertElementDisplayed(SHOWJOINCOMMUNITYBUTTON);
        common.click(SHOWJOINCOMMUNITYBUTTON);
        common.click(SHOWJOINCOMMUNITYBUTTON);

        common.logPrint("Step:: Verify 'SHOW COMMUNITY SHARE ' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWCOMMUNITYSHAREBUTTON));
        common.assertElementDisplayed(SHOWCOMMUNITYSHAREBUTTON);
        common.click(SHOWCOMMUNITYSHAREBUTTON);
        common.click(SHOWCOMMUNITYSHAREBUTTON);

        common.logPrint("Step:: Verify 'ENGAGEMENT DETAILS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENGAGEMENTDETAILS));
        common.assertElementDisplayed(ENGAGEMENTDETAILS);

        common.logPrint("Step:: Verify 'ENABLE ENGAGEMENT TOOL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEENGAGEMENTTOOL));
        common.assertElementDisplayed(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTION));
        common.assertElementDisplayed(ENABLEREDIRECTION);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTIONBUTTON));
        common.assertElementDisplayed(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);

        common.logPrint("Step:: Verify 'LINKS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LINKS));
        common.assertElementDisplayed(LINKS);

        common.logPrint("Step:: Verify 'SHOW LINKS' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWLINKSBUTTON));
        common.assertElementDisplayed(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);

        common.logPrint("Step:: Verify 'MEDIAPLAY' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MEDIAPLAY));
        common.assertElementDisplayed(MEDIAPLAY);

        common.logPrint("Step:: Verify 'LOOP VIDEO' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LOOPVIDEOBUTTON));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);

        common.logPrint("Step:: Verify 'GENERATE CODE' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(CONFIRMFOREMBED);
    }


    public void verify_Embed_For_StandardWall_Style(){
        common.logPrint("Step:: Verify 'New' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWEMBED));
        common.click(NEWEMBED);

        common.logPrint("Step:: Verify 'Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'SELECT EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDSTYLE));
        common.assertElementDisplayed(SELECTEMBEDSTYLE);
        common.click(SELECTEMBEDSTYLE);

        common.logPrint("Step:: Verify 'STANDAED WALL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(STANDAEDWALL));
        common.assertElementDisplayed(STANDAEDWALL);

        common.logPrint("Step:: Verify 'FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(FEED));
        common.assertElementDisplayed(FEED);

        common.logPrint("Step:: Verify 'CAROUSEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CAROUSEL));
        common.assertElementDisplayed(CAROUSEL);
        common.click(STANDAEDWALL);

        common.logPrint("Step:: Verify 'Monitor' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MONITORBUTTON));
        common.assertElementDisplayed(MONITORBUTTON);

        common.logPrint("Step:: Verify 'Mobile' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MOBILEBUTTON));
        common.assertElementDisplayed(MOBILEBUTTON);
        common.click(MOBILEBUTTON);
        common.pause(5);
        common.click(MONITERBUTTONFOREMBED);

        common.logPrint("Step:: Verify 'VIEW SETTINGS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWSETTINGS));
        common.assertElementDisplayed(VIEWSETTINGS);

        common.logPrint("Step:: Verify 'EMBED SIZE' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSIZE));
        common.assertElementDisplayed(EMBEDSIZE);

        common.logPrint("Step:: Verify 'SHOW HEADER' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWHEADER));
        common.assertElementDisplayed(SHOWHEADER);

        common.logPrint("Step:: Verify 'Display the top nav bar' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DISPLAYTOPNAVBAR));
        common.assertElementDisplayed(DISPLAYTOPNAVBAR);

        common.logPrint("Step:: Verify 'SHOW NEVIGATION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWNEVIGATIONBUTTON));
        common.assertElementDisplayed(SHOWNEVIGATIONBUTTON);
        common.click(SHOWNEVIGATIONBUTTON);
        common.click(SHOWNEVIGATIONBUTTON);

        common.logPrint("Step:: Verify 'SHOW SIDE PANEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSIDEPANEL));
        common.assertElementDisplayed(SHOWSIDEPANEL);

        common.logPrint("Step:: Verify 'SHOW SIDE PANEL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSIDEPANELBUTTON));
        common.assertElementDisplayed(SHOWSIDEPANELBUTTON);
        common.click(SHOWSIDEPANELBUTTON);
        common.click(SHOWSIDEPANELBUTTON);

        common.logPrint("Step:: Verify 'SHOW JOIN COMMUNITY' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWJOINCOMMUNITY));
        common.assertElementDisplayed(SHOWJOINCOMMUNITY);

        common.logPrint("Step:: Verify 'SHOW JOIN COMMUNITY' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWJOINCOMMUNITYBUTTON));
        common.assertElementDisplayed(SHOWJOINCOMMUNITYBUTTON);
        common.click(SHOWJOINCOMMUNITYBUTTON);
        common.pause(5);
        common.click(SHOWJOINCOMMUNITYBUTTON);

        common.logPrint("Step:: Verify 'SHOW COMMUNITY SHARE ' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWCOMMUNITYSHAREBUTTON));
        common.assertElementDisplayed(SHOWCOMMUNITYSHAREBUTTON);
        common.click(SHOWCOMMUNITYSHAREBUTTON);
        common.click(SHOWCOMMUNITYSHAREBUTTON);

        common.logPrint("Step:: Verify 'ENGAGEMENT DETAILS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENGAGEMENTDETAILS));
        common.assertElementDisplayed(ENGAGEMENTDETAILS);

        common.logPrint("Step:: Verify 'ENABLE ENGAGEMENT TOOL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEENGAGEMENTTOOL));
        common.assertElementDisplayed(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTION));
        common.assertElementDisplayed(ENABLEREDIRECTION);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTIONBUTTON));
        common.assertElementDisplayed(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);

        common.logPrint("Step:: Verify 'LINKS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LINKS));
        common.assertElementDisplayed(LINKS);

        common.logPrint("Step:: Verify 'SHOW LINKS' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWLINKSBUTTON));
        common.assertElementDisplayed(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);

        common.logPrint("Step:: Verify 'MEDIAPLAY' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MEDIAPLAY));
        common.assertElementDisplayed(MEDIAPLAY);

        common.logPrint("Step:: Verify 'LOOP VIDEO' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LOOPVIDEOBUTTON));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);

        common.logPrint("Step:: Verify 'GENERATE CODE' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(GENERATECODE);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(CONFIRMFOREMBED);
        common.click(CONFIRMFOREMBED);
    }

    public void verify_Embed_FeedStyle_For_EmbedView(){
        common.logPrint("Step:: Verify 'New' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWEMBED));
        common.click(NEWEMBED);

        common.logPrint("Step:: Verify 'Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'SELECT EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDSTYLE));
        common.assertElementDisplayed(SELECTEMBEDSTYLE);
        common.click(SELECTEMBEDSTYLE);

        common.logPrint("Step:: Verify 'STANDAED WALL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(STANDAEDWALL));
        common.assertElementDisplayed(STANDAEDWALL);

        common.logPrint("Step:: Verify 'Feed' Style is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(FEED));
        common.click(FEED);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);

        common.logPrint("Step:: Verify 'Title' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(TITLE));
        common.assertElementDisplayed(TITLE);

        common.logPrint("Step:: Verify 'Headline' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HEADLINE));
        common.assertElementDisplayed(HEADLINE);

        common.logPrint("Step:: Verify 'ENTER HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERHEADLINE));
        common.assertElementDisplayed(ENTERHEADLINE);
        String headline=common.generateRandomChars(4);
        common.type(ENTERHEADLINE,headline);

        common.logPrint("Step:: Verify 'HEADLINE TEXT COLOR' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HEADLINETEXTCOLOR));
        common.assertElementDisplayed(HEADLINETEXTCOLOR);

        common.logPrint("Step:: Verify 'COLOR FOR HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COLORFORHEADLINE));
        common.assertElementDisplayed(COLORFORHEADLINE);

        common.logPrint("Step:: Verify 'Sub Headline' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SUBHEADLINE));
        common.assertElementDisplayed(SUBHEADLINE);

        common.logPrint("Step:: Verify 'ENTER SUB HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERSUBHEADLINE));
        common.assertElementDisplayed(ENTERSUBHEADLINE);
        String subheadline=common.generateRandomChars(4);
        common.type(ENTERHEADLINE,subheadline);

        common.logPrint("Step:: Verify 'SUB HEADLINE TEXT COLOR' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SUBHEADLINETEXTCOLOR));
        common.assertElementDisplayed(SUBHEADLINETEXTCOLOR);

        common.logPrint("Step:: Verify 'COLOR FOR SUB HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COLORFORSUBHEADLINE));
        common.assertElementDisplayed(COLORFORSUBHEADLINE);

        common.logPrint("Step:: Verify 'BUTTON' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BUTTON));
        common.assertElementDisplayed(BUTTON);

        common.logPrint("Step:: Verify 'CHECK HIDE BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CHECKHIDEBUTTON));
        common.assertElementDisplayed(CHECKHIDEBUTTON);
        common.click(CHECKHIDEBUTTON);
        common.pause(5);
        common.click(CHECKHIDEBUTTON);

        common.logPrint("Step:: Verify 'VIEW SETTING SFOR FEED' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWSETTINGSFORFEED));
        common.assertElementDisplayed(VIEWSETTINGSFORFEED);

        common.logPrint("Step:: Verify 'Embed Size' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSIZE));
        common.assertElementDisplayed(EMBEDSIZE);

        common.logPrint("Step:: Verify 'Adjust the dimensions of the embed frame' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ADJUSTDIMENSION));
        common.assertElementDisplayed(ADJUSTDIMENSION);

        common.logPrint("Step:: Verify 'ENABLE FLOATING VIEW' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEFLOATINGVIEW));
        common.assertElementDisplayed(ENABLEFLOATINGVIEW);

        common.logPrint("Step:: Verify 'ENABLE FLOATING VIEW BUTTON'is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEFLOATINGVIEWBUTTON));
        common.assertElementDisplayed(ENABLEFLOATINGVIEWBUTTON);
        common.click(ENABLEFLOATINGVIEWBUTTON);
        common.click(ENABLEFLOATINGVIEWBUTTON);

        common.logPrint("Step:: Verify 'SHOW USERNAME' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWUSERNAME));
        common.assertElementDisplayed(SHOWUSERNAME);

        common.logPrint("Step:: Verify 'SHOW USERNAME BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWUSERNAMEBUTTON));
        common.assertElementDisplayed(SHOWUSERNAMEBUTTON);
        common.click(SHOWUSERNAMEBUTTON);
        common.pause(5);
        common.click(SHOWUSERNAMEBUTTON);

        common.logPrint("Step:: Verify 'SHOW VIEW COUNT' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWVIEWCOUNT));
        common.assertElementDisplayed(SHOWVIEWCOUNT);

        common.logPrint("Step:: Verify 'SHOW VIEW COUNT BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWVIEWCOUNTBUTTON));
        common.assertElementDisplayed(SHOWVIEWCOUNTBUTTON);
        common.click(SHOWVIEWCOUNTBUTTON);
        common.pause(5);
        common.click(SHOWVIEWCOUNTBUTTON);

        common.logPrint("Step:: Verify 'SHOW SOCIAL INTEGRATION DATA' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSOCIALINTEGRATIONDATA));
        common.assertElementDisplayed(SHOWSOCIALINTEGRATIONDATA);

        common.logPrint("Step:: Verify 'SHOW SOCIAL INTEGRATION DATA BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSOCIALINTEGRATIONDATABUTTON));
        common.assertElementDisplayed(SHOWSOCIALINTEGRATIONDATABUTTON);
        common.click(SHOWSOCIALINTEGRATIONDATABUTTON);
        common.pause(5);
        common.click(SHOWSOCIALINTEGRATIONDATABUTTON);

        common.logPrint("Step:: Verify 'AUTOPLAY VIDEO' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(AUTOPLAYVIDEO));
        common.assertElementDisplayed(AUTOPLAYVIDEO);

        common.logPrint("Step:: Verify 'AUTOPLATVIDEOBUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(AUTOPLAYVIDEOBUTTON));
        common.assertElementDisplayed(AUTOPLAYVIDEOBUTTON);
        common.click(AUTOPLAYVIDEOBUTTON);
        common.pause(5);
        common.click(AUTOPLAYVIDEOBUTTON);

        common.logPrint("Step:: Verify 'LOOP VIDEO' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LOOPVIDEO));
        common.assertElementDisplayed(LOOPVIDEO);

        common.logPrint("Step:: Verify 'LOOP VIDEO BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LOOPVIDEOBUTTON));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);
        common.pause(5);
        common.click(LOOPVIDEOBUTTON);

        common.logPrint("Step:: Verify 'Genrate Code' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(GENERATECODE);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.verifyElementIsDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.click(CONFIRMFOREMBED);
    }

    public void verify_Embed_FeedStyle_For_PopUpView(){
        common.logPrint("Step:: Verify 'New' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWEMBED));
        common.click(NEWEMBED);

        common.logPrint("Step:: Verify 'Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'SELECT EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDSTYLE));
        common.assertElementDisplayed(SELECTEMBEDSTYLE);
        common.click(SELECTEMBEDSTYLE);

        common.logPrint("Step:: Verify 'STANDAED WALL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(STANDAEDWALL));
        common.assertElementDisplayed(STANDAEDWALL);

        common.logPrint("Step:: Verify 'Feed' Style is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(FEED));
        common.click(FEED);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);
        common.click(POPUPVIEW);

        common.logPrint("Step:: Verify 'VIEW SETTINGS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWSETTINGS));
        common.assertElementDisplayed(VIEWSETTINGS);

        common.logPrint("Step:: Verify 'ENABLE POPUP VIEW' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEPOPUPVIEW));
        common.assertElementDisplayed(ENABLEPOPUPVIEW);

        common.logPrint("Step:: Verify 'ENABLE POPUP VIEW BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEPOPUPVIEWBUTTON));
        common.assertElementDisplayed(ENABLEPOPUPVIEWBUTTON);
        common.click(ENABLEPOPUPVIEWBUTTON);
        common.pause(5);
        common.click(ENABLEPOPUPVIEWBUTTON);

        common.logPrint("Step:: Verify 'ENGAGEMENT DETAILS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENGAGEMENTDETAILS));
        common.assertElementDisplayed(ENGAGEMENTDETAILS);

        common.logPrint("Step:: Verify 'ENABLE ENGAGEMENT TOOL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEENGAGEMENTTOOL));
        common.assertElementDisplayed(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);
        common.pause(5);
        common.click(ENABLEENGAGEMENTTOOL);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTION));
        common.assertElementDisplayed(ENABLEREDIRECTION);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTIONBUTTON));
        common.assertElementDisplayed(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);
        common.pause(5);
        common.click(ENABLEREDIRECTIONBUTTON);

        common.logPrint("Step:: Verify 'LINKS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LINKS));
        common.assertElementDisplayed(LINKS);

        common.logPrint("Step:: Verify 'SHOW LINKS' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWLINKSBUTTON));
        common.assertElementDisplayed(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);
        common.pause(5);
        common.click(SHOWLINKSBUTTON);

        common.logPrint("Step:: Verify 'Genrate Code' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(GENERATECODE);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.verifyElementIsDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.click(CONFIRMFOREMBED);
    }

    public void verify_Embed_Carousel_Style_For_EmbedView(){
        common.logPrint("Step:: Verify 'New' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWEMBED));
        common.click(NEWEMBED);

        common.logPrint("Step:: Verify 'Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'SELECT EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDSTYLE));
        common.assertElementDisplayed(SELECTEMBEDSTYLE);
        common.click(SELECTEMBEDSTYLE);

        common.logPrint("Step:: Verify 'STANDAED WALL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(STANDAEDWALL));
        common.assertElementDisplayed(STANDAEDWALL);

        common.logPrint("Step:: Verify 'Feed' Style is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(FEED));
        common.assertElementDisplayed(FEED);

        common.logPrint("Step:: Verify 'CAROUSEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CAROUSEL));
        common.assertElementDisplayed(CAROUSEL);
        common.click(CAROUSEL);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);

        common.logPrint("Step:: Verify 'Title' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(TITLE));
        common.assertElementDisplayed(TITLE);

        common.logPrint("Step:: Verify 'Headline' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HEADLINE));
        common.assertElementDisplayed(HEADLINE);

        common.logPrint("Step:: Verify 'ENTER HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERHEADLINE));
        common.assertElementDisplayed(ENTERHEADLINE);
        String headline=common.generateRandomChars(4);
        common.type(ENTERHEADLINE,headline);

        common.logPrint("Step:: Verify 'HEADLINE TEXT COLOR' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(HEADLINETEXTCOLOR));
        common.assertElementDisplayed(HEADLINETEXTCOLOR);

        common.logPrint("Step:: Verify 'COLOR FOR HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COLORFORHEADLINE));
        common.assertElementDisplayed(COLORFORHEADLINE);

        common.logPrint("Step:: Verify 'Sub Headline' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SUBHEADLINE));
        common.assertElementDisplayed(SUBHEADLINE);

        common.logPrint("Step:: Verify 'ENTER SUB HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERSUBHEADLINE));
        common.assertElementDisplayed(ENTERSUBHEADLINE);
        String subheadline=common.generateRandomChars(4);
        common.type(ENTERHEADLINE,subheadline);

        common.logPrint("Step:: Verify 'SUB HEADLINE TEXT COLOR' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SUBHEADLINETEXTCOLOR));
        common.assertElementDisplayed(SUBHEADLINETEXTCOLOR);

        common.logPrint("Step:: Verify 'COLOR FOR SUB HEADLINE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COLORFORSUBHEADLINE));
        common.assertElementDisplayed(COLORFORSUBHEADLINE);

        common.logPrint("Step:: Verify 'BUTTON' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BUTTON));
        common.assertElementDisplayed(BUTTON);

        common.logPrint("Step:: Verify 'CHECK HIDE BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CHECKHIDEBUTTON));
        common.assertElementDisplayed(CHECKHIDEBUTTON);
        common.click(CHECKHIDEBUTTON);
        common.pause(5);
        common.click(CHECKHIDEBUTTON);

        common.logPrint("Step:: Verify 'VIEW SETTING SFOR FEED' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWSETTINGSFORFEED));
        common.assertElementDisplayed(VIEWSETTINGSFORFEED);

        common.logPrint("Step:: Verify 'Embed Size' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSIZE));
        common.assertElementDisplayed(EMBEDSIZE);

        common.logPrint("Step:: Verify 'Adjust the dimensions of the embed frame' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ADJUSTDIMENSION));
        common.assertElementDisplayed(ADJUSTDIMENSION);

        common.logPrint("Step:: Verify 'ENABLE FLOATING VIEW' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEFLOATINGVIEW));
        common.assertElementDisplayed(ENABLEFLOATINGVIEW);

        common.logPrint("Step:: Verify 'ENABLE FLOATING VIEW BUTTON'is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEFLOATINGVIEWBUTTON));
        common.assertElementDisplayed(ENABLEFLOATINGVIEWBUTTON);
        common.click(ENABLEFLOATINGVIEWBUTTON);
        common.click(ENABLEFLOATINGVIEWBUTTON);

        common.logPrint("Step:: Verify 'SHOW USERNAME' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWUSERNAME));
        common.assertElementDisplayed(SHOWUSERNAME);

        common.logPrint("Step:: Verify 'SHOW USERNAME BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWUSERNAMEBUTTON));
        common.assertElementDisplayed(SHOWUSERNAMEBUTTON);
        common.click(SHOWUSERNAMEBUTTON);
        common.pause(5);
        common.click(SHOWUSERNAMEBUTTON);

        common.logPrint("Step:: Verify 'SHOW VIEW COUNT' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWVIEWCOUNT));
        common.assertElementDisplayed(SHOWVIEWCOUNT);

        common.logPrint("Step:: Verify 'SHOW VIEW COUNT BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWVIEWCOUNTBUTTON));
        common.assertElementDisplayed(SHOWVIEWCOUNTBUTTON);
        common.click(SHOWVIEWCOUNTBUTTON);
        common.pause(5);
        common.click(SHOWVIEWCOUNTBUTTON);

        common.logPrint("Step:: Verify 'SHOW SOCIAL INTEGRATION DATA' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSOCIALINTEGRATIONDATA));
        common.assertElementDisplayed(SHOWSOCIALINTEGRATIONDATA);

        common.logPrint("Step:: Verify 'SHOW SOCIAL INTEGRATION DATA BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSOCIALINTEGRATIONDATABUTTON));
        common.assertElementDisplayed(SHOWSOCIALINTEGRATIONDATABUTTON);
        common.click(SHOWSOCIALINTEGRATIONDATABUTTON);
        common.pause(5);
        common.click(SHOWSOCIALINTEGRATIONDATABUTTON);

        common.logPrint("Step:: Verify 'AUTOPLAY VIDEO' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(AUTOPLAYVIDEO));
        common.assertElementDisplayed(AUTOPLAYVIDEO);

        common.logPrint("Step:: Verify 'AUTOPLATVIDEOBUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(AUTOPLAYVIDEOBUTTON));
        common.assertElementDisplayed(AUTOPLAYVIDEOBUTTON);
        common.click(AUTOPLAYVIDEOBUTTON);
        common.pause(5);
        common.click(AUTOPLAYVIDEOBUTTON);

        common.logPrint("Step:: Verify 'LOOP VIDEO' text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LOOPVIDEO));
        common.assertElementDisplayed(LOOPVIDEO);

        common.logPrint("Step:: Verify 'LOOP VIDEO BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LOOPVIDEOBUTTON));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);
        common.pause(5);
        common.click(LOOPVIDEOBUTTON);

        common.logPrint("Step:: Verify 'Genrate Code' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(GENERATECODE);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.verifyElementIsDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.click(CONFIRMFOREMBED);
    }

    public void verify_Embed_Carousel_Style_For_PopUpView(){
        common.logPrint("Step:: Verify 'New' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWEMBED));
        common.click(NEWEMBED);

        common.logPrint("Step:: Verify 'Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'SELECT EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDSTYLE));
        common.assertElementDisplayed(SELECTEMBEDSTYLE);
        common.click(SELECTEMBEDSTYLE);

        common.logPrint("Step:: Verify 'STANDAED WALL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(STANDAEDWALL));
        common.assertElementDisplayed(STANDAEDWALL);

        common.logPrint("Step:: Verify 'Feed' Style is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(FEED));
        common.assertElementDisplayed(FEED);

        common.logPrint("Step:: Verify 'CAROUSEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CAROUSEL));
        common.assertElementDisplayed(CAROUSEL);
        common.click(CAROUSEL);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);
        common.click(POPUPVIEW);

        common.logPrint("Step:: Verify 'VIEW SETTINGS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWSETTINGS));
        common.assertElementDisplayed(VIEWSETTINGS);

        common.logPrint("Step:: Verify 'ENABLE POPUP VIEW' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEPOPUPVIEW));
        common.assertElementDisplayed(ENABLEPOPUPVIEW);

        common.logPrint("Step:: Verify 'ENABLE POPUP VIEW BUTTON' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEPOPUPVIEWBUTTON));
        common.assertElementDisplayed(ENABLEPOPUPVIEWBUTTON);
        common.click(ENABLEPOPUPVIEWBUTTON);
        common.pause(5);
        common.click(ENABLEPOPUPVIEWBUTTON);

        common.logPrint("Step:: Verify 'ENGAGEMENT DETAILS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENGAGEMENTDETAILS));
        common.assertElementDisplayed(ENGAGEMENTDETAILS);

        common.logPrint("Step:: Verify 'ENABLE ENGAGEMENT TOOL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEENGAGEMENTTOOL));
        common.assertElementDisplayed(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);
        common.pause(5);
        common.click(ENABLEENGAGEMENTTOOL);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTION));
        common.assertElementDisplayed(ENABLEREDIRECTION);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTIONBUTTON));
        common.assertElementDisplayed(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);
        common.pause(5);
        common.click(ENABLEREDIRECTIONBUTTON);

        common.logPrint("Step:: Verify 'LINKS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LINKS));
        common.assertElementDisplayed(LINKS);

        common.logPrint("Step:: Verify 'SHOW LINKS' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWLINKSBUTTON));
        common.assertElementDisplayed(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);
        common.pause(5);
        common.click(SHOWLINKSBUTTON);

        common.logPrint("Step:: Verify 'Genrate Code' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(GENERATECODE);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.verifyElementIsDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.click(CONFIRMFOREMBED);
    }

    public void verify_Edit_Embed_For_BrandFeed(){

        common.logPrint("Step:: Verify 'Edit' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDIT));
        common.click(EDIT);

        common.logPrint("Step:: Verify 'Edit Embed' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITEMBEDNAME));
        common.click(EDITEMBEDNAME);

        common.logPrint("Step:: Verify 'Embed Name' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);
        common.click(POPUPVIEW);
        common.click(EMBEDVIEW);

        common.logPrint("Step:: Verify 'VIEW EMBED CODE' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(VIEWEMBEDCODE));
        common.assertElementDisplayed(VIEWEMBEDCODE);
        common.click(VIEWEMBEDCODE);

        common.logPrint("Step:: Verify 'Embed Code' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(UPCOMINGEDIT));
        common.assertElementDisplayed(UPCOMINGEDIT);

        common.logPrint("Step:: Verify 'Web Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(WEBBUTTON));
        common.assertElementDisplayed(WEBBUTTON);

        common.logPrint("Step:: Verify 'IOS Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(IOSBUTTON));
        common.assertElementDisplayed(IOSBUTTON);
        common.click(IOSBUTTON);

        common.logPrint("Step:: Verify 'Android Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(ANDROIDBUTTON));
        common.assertElementDisplayed(ANDROIDBUTTON);
        common.click(ANDROIDBUTTON);

        common.logPrint("Step:: Verify 'React Native Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(REACTNATIVEBUTON));
        common.assertElementDisplayed(REACTNATIVEBUTON);
        common.click(REACTNATIVEBUTON);

        common.logPrint("Step:: Verify 'Fluter Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(FLUTERBUTTON));
        common.assertElementDisplayed(FLUTERBUTTON);
        common.click(FLUTERBUTTON);

        common.logPrint("Step:: Verify 'Cancel Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(CANCEL));
        common.assertElementDisplayed(CANCEL);
        common.click(CANCEL);
        common.pause(5);

        common.logPrint("Step:: Verify 'Mark as Active Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(MARKASACTIVE));
        common.assertElementDisplayed(MARKASACTIVE);
        common.click(MARKASACTIVE);

        common.logPrint("Step:: Verify 'SAVE AND UPDATE Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEANDUPDATE));
        common.assertElementDisplayed(SAVEANDUPDATE);
        common.click(SAVEANDUPDATE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.verifyElementIsDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.click(CONFIRMFOREMBED);

    }

    public void verify_Edit_Embed_For_CommunityFeed(){

        common.logPrint("Step:: Verify 'Edit' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDIT));
        common.click(EDIT);

        common.logPrint("Step:: Verify 'Edit Embed' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITEMBEDNAME));
        common.click(EDITEMBEDNAME);

        common.logPrint("Step:: Verify 'Embed Name' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);
        common.click(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITY));
        common.assertElementDisplayed(COMMUNITY);

        common.logPrint("Step:: Verify 'Select Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITY));
        common.assertElementDisplayed(SELECTCOMMUNITY);
        common.click(SELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTONECOMMUNITY));
        common.assertElementDisplayed(SELECTONECOMMUNITY);
        common.click(SELECTONECOMMUNITY);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTTWOCOMMUNITY));
        common.assertElementDisplayed(SELECTTWOCOMMUNITY);
        common.click(SELECTTWOCOMMUNITY);

        common.logPrint("Step:: Verify 'Drop Down' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DROPDOWNFORSELECTCOMMUNITY));
        common.assertElementDisplayed(DROPDOWNFORSELECTCOMMUNITY);
        common.click(DROPDOWNFORSELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);
        common.click(POPUPVIEW);
        common.click(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Mark as Active Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(MARKASACTIVE));
        common.assertElementDisplayed(MARKASACTIVE);
        common.click(MARKASACTIVE);

        common.logPrint("Step:: Verify 'SAVE AND UPDATE Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEANDUPDATE));
        common.assertElementDisplayed(SAVEANDUPDATE);
        common.click(SAVEANDUPDATE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.verifyElementIsDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.click(CONFIRMFOREMBED);

    }

    public void verify_Edit_Embed_For_GroupFeed(){

        common.logPrint("Step:: Verify 'Edit' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDIT));
        common.click(EDIT);

        common.logPrint("Step:: Verify 'Edit Embed' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITEMBEDNAME));
        common.click(EDITEMBEDNAME);

        common.logPrint("Step:: Verify 'Embed Name' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);
        common.click(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITY));
        common.assertElementDisplayed(COMMUNITY);

        common.logPrint("Step:: Verify 'Select Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITY));
        common.assertElementDisplayed(SELECTCOMMUNITY);
        common.click(SELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Search Icon' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORCOMMUNITY));
        common.assertElementDisplayed(SEARCHICONFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Search Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHCOMMUNITY));
        common.assertElementDisplayed(SEARCHCOMMUNITY);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTONECOMMUNITY));
        common.assertElementDisplayed(SELECTONECOMMUNITY);
        common.click(SELECTONECOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTTWOCOMMUNITY));
        common.assertElementDisplayed(SELECTTWOCOMMUNITY);
        common.click(SELECTTWOCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Search Group' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHGROUP));
        common.assertElementDisplayed(SEARCHGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Groups' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTGROUP));
        common.assertElementDisplayed(SELECTGROUP);
        common.click(SELECTGROUP);

        common.logPrint("Step:: Verify 'Drop Down' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DROPDOWNFORSELECTCOMMUNITY));
        common.assertElementDisplayed(DROPDOWNFORSELECTCOMMUNITY);
        common.click(DROPDOWNFORSELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);
        common.click(POPUPVIEW);
        common.click(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Mark as Active Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(MARKASACTIVE));
        common.assertElementDisplayed(MARKASACTIVE);
        common.click(MARKASACTIVE);

        common.logPrint("Step:: Verify 'SAVE AND UPDATE Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEANDUPDATE));
        common.assertElementDisplayed(SAVEANDUPDATE);
        common.click(SAVEANDUPDATE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.verifyElementIsDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.click(CONFIRMFOREMBED);
    }

    public void create_Duplicate_Embed_For_BrandFeed(){

        common.logPrint("Step:: Verify 'Edit' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITEMBEDFORDUPLICATE));
        common.click(EDITEMBEDFORDUPLICATE);

        common.logPrint("Step:: Verify 'Duplicate Embed' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DUPLICATEEMBED));
        common.click(DUPLICATEEMBED);
        common.pause(5);

        common.logPrint("Step:: Verify 'Embed Name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.verifyElementIsDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.verifyElementIsDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.verifyElementIsDisplayed(GROUPFEED);
        common.click(BRANDFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'SELECT EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDSTYLE));
        common.click(SELECTEMBEDSTYLE);

        common.logPrint("Step:: Verify 'STANDAED WALL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(STANDAEDWALL));
        common.assertElementDisplayed(STANDAEDWALL);

        common.logPrint("Step:: Verify 'FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(FEED));
        common.assertElementDisplayed(FEED);

        common.logPrint("Step:: Verify 'CAROUSEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CAROUSEL));
        common.assertElementDisplayed(CAROUSEL);
        common.click(STANDAEDWALL);

        common.logPrint("Step:: Verify 'Monitor' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MONITORBUTTON));
        common.assertElementDisplayed(MONITORBUTTON);

        common.logPrint("Step:: Verify 'Mobile' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MOBILEBUTTON));
        common.assertElementDisplayed(MOBILEBUTTON);

        common.logPrint("Step:: Verify 'VIEW SETTINGS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWSETTINGS));
        common.assertElementDisplayed(VIEWSETTINGS);

        common.logPrint("Step:: Verify 'EMBED SIZE' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSIZE));
        common.assertElementDisplayed(EMBEDSIZE);

        common.logPrint("Step:: Verify 'SHOW HEADER' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWHEADER));
        common.assertElementDisplayed(SHOWHEADER);

        common.logPrint("Step:: Verify 'Display the top nav bar' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DISPLAYTOPNAVBAR));
        common.assertElementDisplayed(DISPLAYTOPNAVBAR);

        common.logPrint("Step:: Verify 'SHOW NEVIGATION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWNEVIGATIONBUTTON));
        common.assertElementDisplayed(SHOWNEVIGATIONBUTTON);
        common.click(SHOWNEVIGATIONBUTTON);
        common.click(SHOWNEVIGATIONBUTTON);

        common.logPrint("Step:: Verify 'SHOW SIDE PANEL' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSIDEPANEL));
        common.assertElementDisplayed(SHOWSIDEPANEL);

        common.logPrint("Step:: Verify 'SHOW SIDE PANEL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWSIDEPANELBUTTON));
        common.assertElementDisplayed(SHOWSIDEPANELBUTTON);
        common.click(SHOWSIDEPANELBUTTON);
        common.click(SHOWSIDEPANELBUTTON);

        common.logPrint("Step:: Verify 'SHOW JOIN COMMUNITY' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWJOINCOMMUNITY));
        common.assertElementDisplayed(SHOWJOINCOMMUNITY);

        common.logPrint("Step:: Verify 'SHOW JOIN COMMUNITY' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWJOINCOMMUNITYBUTTON));
        common.assertElementDisplayed(SHOWJOINCOMMUNITYBUTTON);
        common.click(SHOWJOINCOMMUNITYBUTTON);
        common.click(SHOWJOINCOMMUNITYBUTTON);

        common.logPrint("Step:: Verify 'SHOW COMMUNITY SHARE ' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWCOMMUNITYSHAREBUTTON));
        common.assertElementDisplayed(SHOWCOMMUNITYSHAREBUTTON);
        common.click(SHOWCOMMUNITYSHAREBUTTON);
        common.click(SHOWCOMMUNITYSHAREBUTTON);

        common.logPrint("Step:: Verify 'ENGAGEMENT DETAILS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENGAGEMENTDETAILS));
        common.assertElementDisplayed(ENGAGEMENTDETAILS);

        common.logPrint("Step:: Verify 'ENABLE ENGAGEMENT TOOL' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEENGAGEMENTTOOL));
        common.assertElementDisplayed(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTION));
        common.assertElementDisplayed(ENABLEREDIRECTION);

        common.logPrint("Step:: Verify 'ENABLE REDIRECTION' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEREDIRECTIONBUTTON));
        common.assertElementDisplayed(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);
        common.click(ENABLEREDIRECTIONBUTTON);

        common.logPrint("Step:: Verify 'LINKS' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LINKS));
        common.assertElementDisplayed(LINKS);

        common.logPrint("Step:: Verify 'SHOW LINKS' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWLINKSBUTTON));
        common.assertElementDisplayed(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);
        common.click(SHOWLINKSBUTTON);

        common.logPrint("Step:: Verify 'MEDIAPLAY' Text is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(MEDIAPLAY));
        common.assertElementDisplayed(MEDIAPLAY);

        common.logPrint("Step:: Verify 'LOOP VIDEO' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(LOOPVIDEOBUTTON));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);
        common.click(LOOPVIDEOBUTTON);

        common.logPrint("Step:: Verify 'GENERATE CODE' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(CONFIRMFOREMBED);
        common.click(CONFIRMFOREMBED);

        common.logPrint("Step:: Verify 'VIEW EMBED CODE' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(VIEWEMBEDCODE));
        common.assertElementDisplayed(VIEWEMBEDCODE);
        common.click(VIEWEMBEDCODE);

        common.logPrint("Step:: Verify 'Embed Code' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(UPCOMINGEDIT));
        common.assertElementDisplayed(UPCOMINGEDIT);

        common.logPrint("Step:: Verify 'Web Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(WEBBUTTON));
        common.assertElementDisplayed(WEBBUTTON);

        common.logPrint("Step:: Verify 'IOS Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(IOSBUTTON));
        common.assertElementDisplayed(IOSBUTTON);
        common.click(IOSBUTTON);

        common.logPrint("Step:: Verify 'Android Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(ANDROIDBUTTON));
        common.assertElementDisplayed(ANDROIDBUTTON);
        common.click(ANDROIDBUTTON);

        common.logPrint("Step:: Verify 'React Native Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(REACTNATIVEBUTON));
        common.assertElementDisplayed(REACTNATIVEBUTON);
        common.click(REACTNATIVEBUTON);

        common.logPrint("Step:: Verify 'Fluter Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(FLUTERBUTTON));
        common.assertElementDisplayed(FLUTERBUTTON);
        common.click(FLUTERBUTTON);

        common.logPrint("Step:: Verify 'Cancel Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(CANCEL));
        common.assertElementDisplayed(CANCEL);
        common.click(CANCEL);
        common.pause(5);

        common.logPrint("Step:: Verify 'Mark as Active Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(MARKASACTIVE));
        common.assertElementDisplayed(MARKASACTIVE);
        common.click(MARKASACTIVE);

        common.logPrint("Step:: Verify 'SAVE AND UPDATE Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEANDUPDATE));
        common.assertElementDisplayed(SAVEANDUPDATE);
        common.click(SAVEANDUPDATE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(CONFIRMFOREMBED);
        common.click(CONFIRMFOREMBED);
    }

    public void create_Duplicate_Embed_For_CommunityFeed(){
        common.logPrint("Step:: Verify 'Edit' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITEMBEDFORDUPLICATE));
        common.click(EDITEMBEDFORDUPLICATE);

        common.logPrint("Step:: Verify 'Duplicate Embed' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DUPLICATEEMBED));
        common.click(DUPLICATEEMBED);
        common.pause(5);

        common.logPrint("Step:: Verify 'Embed Name' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);
        common.click(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITY));
        common.assertElementDisplayed(COMMUNITY);

        common.logPrint("Step:: Verify 'Select Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITY));
        common.assertElementDisplayed(SELECTCOMMUNITY);
        common.click(SELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTONECOMMUNITY));
        common.assertElementDisplayed(SELECTONECOMMUNITY);
        common.click(SELECTONECOMMUNITY);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTTWOCOMMUNITY));
        common.assertElementDisplayed(SELECTTWOCOMMUNITY);
        common.click(SELECTTWOCOMMUNITY);

        common.logPrint("Step:: Verify 'Drop Down' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DROPDOWNFORSELECTCOMMUNITY));
        common.assertElementDisplayed(DROPDOWNFORSELECTCOMMUNITY);
        common.click(DROPDOWNFORSELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);
        common.click(POPUPVIEW);
        common.click(EMBEDVIEW);

        common.logPrint("Step:: Verify 'GENERATE CODE' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(CONFIRMFOREMBED);
        common.click(CONFIRMFOREMBED);

        common.logPrint("Step:: Verify 'VIEW EMBED CODE' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(VIEWEMBEDCODE));
        common.assertElementDisplayed(VIEWEMBEDCODE);
        common.click(VIEWEMBEDCODE);

        common.logPrint("Step:: Verify 'Embed Code' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(UPCOMINGEDIT));
        common.assertElementDisplayed(UPCOMINGEDIT);

        common.logPrint("Step:: Verify 'Web Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(WEBBUTTON));
        common.assertElementDisplayed(WEBBUTTON);

        common.logPrint("Step:: Verify 'IOS Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(IOSBUTTON));
        common.assertElementDisplayed(IOSBUTTON);
        common.click(IOSBUTTON);

        common.logPrint("Step:: Verify 'Android Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(ANDROIDBUTTON));
        common.assertElementDisplayed(ANDROIDBUTTON);
        common.click(ANDROIDBUTTON);

        common.logPrint("Step:: Verify 'React Native Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(REACTNATIVEBUTON));
        common.assertElementDisplayed(REACTNATIVEBUTON);
        common.click(REACTNATIVEBUTON);

        common.logPrint("Step:: Verify 'Fluter Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(FLUTERBUTTON));
        common.assertElementDisplayed(FLUTERBUTTON);
        common.click(FLUTERBUTTON);

        common.logPrint("Step:: Verify 'Cancel Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(CANCEL));
        common.assertElementDisplayed(CANCEL);
        common.click(CANCEL);
        common.pause(5);

        common.logPrint("Step:: Verify 'Mark as Active Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(MARKASACTIVE));
        common.assertElementDisplayed(MARKASACTIVE);
        common.click(MARKASACTIVE);

        common.logPrint("Step:: Verify 'SAVE AND UPDATE Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEANDUPDATE));
        common.assertElementDisplayed(SAVEANDUPDATE);
        common.click(SAVEANDUPDATE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(CONFIRMFOREMBED);
        common.click(CONFIRMFOREMBED);
    }

    public void create_Duplicate_Embed_For_Group_Feed(){
        common.logPrint("Step:: Verify 'Edit' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITEMBEDFORDUPLICATE));
        common.click(EDITEMBEDFORDUPLICATE);

        common.logPrint("Step:: Verify 'Duplicate Embed' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DUPLICATEEMBED));
        common.click(DUPLICATEEMBED);
        common.pause(5);

        common.logPrint("Step:: Verify 'Embed Name' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDNAME));
        common.assertElementDisplayed(EMBEDNAME);

        common.logPrint("Step:: Verify 'Select Embed name' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(NAMEOFEMBED));
        common.assertElementDisplayed(NAMEOFEMBED);

        common.logPrint("Step:: Verify 'Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDTYPE));
        common.assertElementDisplayed(EMBEDTYPE);

        common.logPrint("Step:: Verify 'Select Embed Type' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEMBEDTYPE));
        common.assertElementDisplayed(SELECTEMBEDTYPE);
        common.click(SELECTEMBEDTYPE);

        common.logPrint("Step:: Verify 'BRAND FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDFEED));
        common.assertElementDisplayed(BRANDFEED);

        common.logPrint("Step:: Verify 'COMMUNITY FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYFEED));
        common.assertElementDisplayed(COMMUNITYFEED);

        common.logPrint("Step:: Verify 'GROUP FEED' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPFEED));
        common.assertElementDisplayed(GROUPFEED);
        common.click(GROUPFEED);

        common.logPrint("Step:: Verify 'EMBED STYLE' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLE));
        common.assertElementDisplayed(EMBEDSTYLE);

        common.logPrint("Step:: Verify 'Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITY));
        common.assertElementDisplayed(COMMUNITY);

        common.logPrint("Step:: Verify 'Select Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITY));
        common.assertElementDisplayed(SELECTCOMMUNITY);
        common.click(SELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Search Icon' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORCOMMUNITY));
        common.assertElementDisplayed(SEARCHICONFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Search Community' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHCOMMUNITY));
        common.assertElementDisplayed(SEARCHCOMMUNITY);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTONECOMMUNITY));
        common.assertElementDisplayed(SELECTONECOMMUNITY);
        common.click(SELECTONECOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Communities' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTTWOCOMMUNITY));
        common.assertElementDisplayed(SELECTTWOCOMMUNITY);
        common.click(SELECTTWOCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Search Group' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHGROUP));
        common.assertElementDisplayed(SEARCHGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Groups' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTGROUP));
        common.assertElementDisplayed(SELECTGROUP);
        common.click(SELECTGROUP);

        common.logPrint("Step:: Verify 'Drop Down' is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(DROPDOWNFORSELECTCOMMUNITY));
        common.assertElementDisplayed(DROPDOWNFORSELECTCOMMUNITY);
        common.click(DROPDOWNFORSELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Embed View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(EMBEDVIEW));
        common.assertElementDisplayed(EMBEDVIEW);

        common.logPrint("Step:: Verify 'Pop Up View' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(POPUPVIEW));
        common.assertElementDisplayed(POPUPVIEW);
        common.click(POPUPVIEW);
        common.click(EMBEDVIEW);

        common.logPrint("Step:: Verify 'GENERATE CODE' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATECODE));
        common.assertElementDisplayed(LOOPVIDEOBUTTON);
        common.click(GENERATECODE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(CONFIRMFOREMBED);
        common.click(CONFIRMFOREMBED);

        common.logPrint("Step:: Verify 'VIEW EMBED CODE' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(VIEWEMBEDCODE));
        common.assertElementDisplayed(VIEWEMBEDCODE);
        common.click(VIEWEMBEDCODE);

        common.logPrint("Step:: Verify 'Embed Code' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(UPCOMINGEDIT));
        common.assertElementDisplayed(UPCOMINGEDIT);

        common.logPrint("Step:: Verify 'Web Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(WEBBUTTON));
        common.assertElementDisplayed(WEBBUTTON);

        common.logPrint("Step:: Verify 'IOS Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(IOSBUTTON));
        common.assertElementDisplayed(IOSBUTTON);
        common.click(IOSBUTTON);

        common.logPrint("Step:: Verify 'Android Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(ANDROIDBUTTON));
        common.assertElementDisplayed(ANDROIDBUTTON);
        common.click(ANDROIDBUTTON);

        common.logPrint("Step:: Verify 'React Native Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(REACTNATIVEBUTON));
        common.assertElementDisplayed(REACTNATIVEBUTON);
        common.click(REACTNATIVEBUTON);

        common.logPrint("Step:: Verify 'Fluter Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(FLUTERBUTTON));
        common.assertElementDisplayed(FLUTERBUTTON);
        common.click(FLUTERBUTTON);

        common.logPrint("Step:: Verify 'Cancel Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(CANCEL));
        common.assertElementDisplayed(CANCEL);
        common.click(CANCEL);
        common.pause(5);

        common.logPrint("Step:: Verify 'Mark as Active Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(MARKASACTIVE));
        common.assertElementDisplayed(MARKASACTIVE);
        common.click(MARKASACTIVE);

        common.logPrint("Step:: Verify 'SAVE AND UPDATE Button' is displayed on the Embed Page");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEANDUPDATE));
        common.assertElementDisplayed(SAVEANDUPDATE);
        common.click(SAVEANDUPDATE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREMBED));
        common.assertElementDisplayed(CANCELFOREMBED);

        common.logPrint("Step:: Verify 'Confirm' Button is displayed on the Embed Page");
        common.waitUntilElementToBeVisible(By.xpath(CONFIRMFOREMBED));
        common.assertElementDisplayed(CONFIRMFOREMBED);
        common.click(CONFIRMFOREMBED);
    }

    public void verify_OffSite_Page(){
        common.logPrint("Step:: Verify 'Off Site' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(OFFSITE));
        common.assertElementDisplayed(OFFSITE);
        common.click(OFFSITE);

        common.logPrint("Step:: Verify 'Add Creatives' Text is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ADDCREATIVES));
        common.assertElementDisplayed(ADDCREATIVES);

        common.logPrint("Step:: Verify 'Filter' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(FILTERBUTTON));
        common.assertElementDisplayed(FILTERBUTTON);
        common.click(FILTERBUTTON);

        common.logPrint("Step:: Verify 'All' is displayed on the Filter Button");
        common.waitUntilElementToBeVisible(By.xpath(ALLFILTER));
        common.assertElementDisplayed(ALLFILTER);

        common.logPrint("Step:: Verify 'Active Ads' is displayed on the Filter Button");
        common.waitUntilElementToBeVisible(By.xpath(ACTIVEADS));
        common.assertElementDisplayed(ACTIVEADS);
        common.click(ACTIVEADS);

        common.logPrint("Step:: Verify 'Deactive Ads' is displayed on the Filter Button");
        common.waitUntilElementToBeVisible(By.xpath(DEACTIVEADS));
        common.assertElementDisplayed(DEACTIVEADS);
        common.click(DEACTIVEADS);
        common.pause(5);
        common.pause(5);
        common.click(ALLFILTER);

        common.logPrint("Step:: Verify 'New Ad' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWAD));
        common.assertElementDisplayed(NEWAD);

        common.logPrint("Step:: Verify 'Adds' is displayed on the Off Site Page.");
        common.waitUntilElementToBeVisible(By.xpath(DISPLAYADS));
        common.assertElementDisplayed(DISPLAYADS);

        common.logPrint("Step:: Verify 'Adds Button' is displayed on the Off Site Page.");
        common.waitUntilElementToBeVisible(By.xpath(ADDSBUTTON));
        common.assertElementDisplayed(ADDSBUTTON);
        common.click(ADDSBUTTON);

        common.logPrint("Step:: Verify 'Edit Ad' Button is displayed on the Off Site Page.");
        common.waitUntilElementToBeVisible(By.xpath(EDITAD));
        common.assertElementDisplayed(EDITAD);

        common.logPrint("Step:: Verify 'Deactivate Ads Button' is displayed on the Off Site Page.");
        common.waitUntilElementToBeVisible(By.xpath(DEACTIVATEDADD));
        common.assertElementDisplayed(DEACTIVATEDADD);
        common.click(ADDSBUTTON);
    }

    public void clickOnNewAd(){
        common.logPrint("Step:: Verify 'New Ad' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(NEWAD));
        common.assertElementDisplayed(NEWAD);
        common.click(NEWAD);
    }

    public void create_NewAdd(){
        clickOnNewAd();

        common.logPrint("Step:: Verify 'Select posts for your ad creatives' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(SELCTPOSTFORAD));
        common.assertElementDisplayed(SELCTPOSTFORAD);

        common.logPrint("Step:: Verify 'SEARCH ICON FOR POST' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORPOST));
        common.assertElementDisplayed(SEARCHICONFORPOST);

        common.logPrint("Step:: Verify 'SEARCH INPUT' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHINPUTFORREORDER));
        common.assertElementDisplayed(SEARCHINPUTFORREORDER);

        common.logPrint("Step:: Verify 'FILTER Button' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(FILTERFORPOST));
        common.assertElementDisplayed(FILTERFORPOST);

        common.logPrint("Step:: Verify 'Posts' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTPOST));
        common.assertElementDisplayed(SELECTPOST);
        common.click(SELECTPOST);

        common.logPrint("Step:: Verify 'Cancel Button' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFORPOST));
        common.assertElementDisplayed(CANCELFORPOST);

        common.logPrint("Step:: Verify 'Next Button' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(NEXTBUTTONFORPOST));
        common.assertElementDisplayed(NEXTBUTTONFORPOST);
        common.click(NEXTBUTTONFORPOST);

        common.logPrint("Step:: Verify 'Additional Details' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ADDITINALDETAILS));
        common.assertElementDisplayed(ADDITINALDETAILS);

//        common.logPrint("Step:: Verify 'Posts' is displayed on the Off Site Page");
//        common.waitUntilElementToBeVisible(By.xpath(POSTS));
//        common.assertElementDisplayed(POSTS);

        common.logPrint("Step:: Verify 'ADCOPY' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ADCOPY));
        common.assertElementDisplayed(ADCOPY);

        common.logPrint("Step:: Verify 'CALL TO ACTION' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(CALLTOACTION));
        common.assertElementDisplayed(CALLTOACTION);

        common.logPrint("Step:: Verify 'FETCH METADATA' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(FETCHMETADATA));
        common.assertElementDisplayed(FETCHMETADATA);

        common.logPrint("Step:: Verify 'HASHTAGS' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(HASHTAGS));
        common.assertElementDisplayed(HASHTAGS);

        common.logPrint("Step:: Verify 'PIXELURL' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(PIXELURL));
        common.assertElementDisplayed(PIXELURL);

        common.logPrint("Step:: Verify 'IMAGE OF POST' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(IMAGEOFPOST));
        common.assertElementDisplayed(IMAGEOFPOST);

        common.logPrint("Step:: Verify 'EDIT POST' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITPOST));
        common.assertElementDisplayed(EDITPOST);
        WebElement homeLogo = common.findElement(EDITPOST);
        Actions actions = new Actions(driver);
        actions.moveToElement(homeLogo).perform();
        homeLogo.click();

        common.logPrint("Step:: Verify 'FITIHEIGHT' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(FITTIHEIGHT));
        common.assertElementDisplayed(FITTIHEIGHT);

        common.logPrint("Step:: Verify 'FIT TO WIDTH' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(FITTOWIDTH));
        common.assertElementDisplayed(FITTOWIDTH);
        common.click(FITTOWIDTH);
        common.pause(5);

        common.logPrint("Step:: Verify 'FILL' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(FILL));
        common.assertElementDisplayed(FILL);
        common.click(FILL);
        common.pause(5);

        common.click(FITTIHEIGHT);
        common.pause(5);
        common.click(SAVEBUTTON);

        common.logPrint("Step:: Verify 'ENTER AD COPY' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERADCOPY));
        common.assertElementDisplayed(ENTERADCOPY);
        String adcopy=common.generateRandomChars(10);
        common.type(ENTERADCOPY,adcopy);

        common.logPrint("Step:: Verify 'CALL ACTION TEXT' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(CALLACTIONTEXT));
        common.assertElementDisplayed(CALLACTIONTEXT);
        String caltotext=common.generateRandomChars(5);
        common.type(CALLACTIONTEXT,caltotext);

        common.logPrint("Step:: Verify 'CALL ACTION TEXT' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(CALLACTIONLINK));
        common.assertElementDisplayed(CALLACTIONLINK);
        String link=common.generateRandomChars(5);
        common.type(CALLACTIONLINK,"https://"+ link + ".com");


        common.logPrint("Step:: Verify 'Metadata' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(CLICKONMETADATA));
        common.assertElementDisplayed(CLICKONMETADATA);
        common.click(CLICKONMETADATA);

        common.logPrint("Step:: Verify 'ADD HASHTAGS'  is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ADDHASHTAGS));
        common.assertElementDisplayed(ADDHASHTAGS);
        String hashtag=common.generateRandomChars(4);
        common.type(ADDHASHTAGS,"#"+hashtag);

        common.logPrint("Step:: Verify 'Enter Pixel Url' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERPIXELURL));
        common.assertElementDisplayed(ENTERPIXELURL);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFORDETAILS));
        common.assertElementDisplayed(CANCELFORDETAILS);

        common.logPrint("Step:: Verify 'NEXT' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(NEXTBUTTONFORPOST));
        common.assertElementDisplayed(NEXTBUTTONFORPOST);
        common.click(NEXTBUTTONFORPOST);
        common.pause(5);

        common.logPrint("Step:: Verify 'Ad Name' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ADDNAME));
        common.assertElementDisplayed(ADDNAME);

        common.logPrint("Step:: Verify 'ENTER AD NAME' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERADNAME));
        common.assertElementDisplayed(ENTERADNAME);
        String adname=common.generateRandomChars(4);
        common.type(ENTERADNAME,adname);

        common.logPrint("Step:: Verify 'EDIT POSTS' Button is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITPOSTS));

        common.assertElementDisplayed(EDITPOSTS);

        common.logPrint("Step:: Verify 'TRACKING DETAILS' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(TRACKINGDETAILS));
        common.assertElementDisplayed(TRACKINGDETAILS);

        common.logPrint("Step:: Verify 'GOOGLE TAG MANAGER ID' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(GOOGLETAGMANAGERID));
        common.assertElementDisplayed(GOOGLETAGMANAGERID);

        common.logPrint("Step:: Verify 'GOOGLE TAG MANAGER ID' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ENTERMANAGERID));
        common.assertElementDisplayed(ENTERMANAGERID);
        int id=common.generateValidCPM();
        common.type(ENTERMANAGERID, String.valueOf(id));

        common.logPrint("Step:: Verify 'EDIT AD CREATIVE' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(EDITADCREATIVE));
        common.assertElementDisplayed(EDITADCREATIVE);

        common.logPrint("Step:: Verify 'SIZE' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(SIZE));
        common.assertElementDisplayed(SIZE);

        common.logPrint("Step:: Verify 'NUMBER OF SIZE' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(NUMBEROFSIZE));
        common.assertElementDisplayed(NUMBEROFSIZE);

        common.logPrint("Step:: Verify 'BUTTON DELAY' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(BUTTONDELAY));
        common.assertElementDisplayed(BUTTONDELAY);

        common.logPrint("Step:: Verify 'DEALY' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(DEALY));
        common.assertElementDisplayed(DEALY);

        common.logPrint("Step:: Verify 'VIEW DETAILS' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWDETAILS));
        common.assertElementDisplayed(VIEWDETAILS);

        common.logPrint("Step:: Verify 'REDIRECT TO PROFILE' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(REDIRECTTOPROFILE));
        common.assertElementDisplayed(REDIRECTTOPROFILE);
        common.click(REDIRECTTOPROFILE);
        common.click(REDIRECTTOPROFILE);

        common.logPrint("Step:: Verify 'ENABLE ENGAGEMENT TOOL' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(ENABLEENGAGEMENTTOOL));
        common.assertElementDisplayed(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);
        common.click(ENABLEENGAGEMENTTOOL);

        common.logPrint("Step:: Verify 'MEDIA PLAY' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(MEDIAPLAY));
        common.assertElementDisplayed(MEDIAPLAY);

        common.logPrint("Step:: Verify 'AUTO PLAY VIDEO BUTTON' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(AUTOPLAYVIDEOBUTTON));
        common.assertElementDisplayed(AUTOPLAYVIDEOBUTTON);
        common.click(AUTOPLAYVIDEOBUTTON);
        common.click(AUTOPLAYVIDEOBUTTON);

        common.logPrint("Step:: Verify 'VIEW CODE' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(VIEWCODE));
        common.assertElementDisplayed(VIEWCODE);
        common.click(VIEWCODE);

        common.logPrint("Step:: Verify 'Web Ad Creative Code' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(WEBAD));
        common.assertElementDisplayed(WEBAD);

        common.logPrint("Step:: Verify 'Close Button' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCEL));
        common.assertElementDisplayed(CANCEL);
        common.click(CANCEL);

        common.logPrint("Step:: Verify 'SAVE AND UPDATE' is displayed on the Off Site Page");
        common.waitUntilElementToBeVisible(By.xpath(SAVEANDUPDATE));
        common.assertElementDisplayed(SAVEANDUPDATE);
        common.click(SAVEANDUPDATE);
    }


}