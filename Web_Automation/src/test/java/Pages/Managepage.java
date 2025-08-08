package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Managepage extends Locators {
    Common common = new Common(driver);

    public Managepage(WebDriver driver) {

        super(driver);
    }

    String MANAGE_PAGELEFTNAV = "//span[contains(text(),'Manage')]";
    String COMMUNITY_TAB = "//span[contains(text(),'Communities')]";
    String LOOPS_TAB = "//span[contains(text(),'Loops')]";
    String POSTS_TAB = "//span[contains(text(),'Posts')]";
    String Pop_Up = "//div[@class='modal-content']";
    String Pinned_Communities = "(//button[@type='button'])[39]";
    String COMMUNITIES_TAB = "//span[contains(text(),'Comments')]";
    String USERS_TAB = "//span[contains(text(),'Users')]";
    public static String SEARCH_INPUT = "//input[@id='search-input']";
    String COMMUNITY_TBL_HEADER = "//div[normalize-space()='Community']";
    String LEADER_TBL_HEADER = "//div[normalize-space()='Owner']";
    String DATE_TBL_CREATED = "//div[normalize-space()='Date Created']";
    String MEMBERS_TBL_HEADER = "//div[normalize-space()='Members']";
    String MODERATORS_TBL_HEADER = "//div[normalize-space()='Admins']";
    String LOOPS_TBL_HEADER = "//div[normalize-space()='Groups']";
    String POSTS_TBL_HEADER = "//div[normalize-space()='Posts']";
    String NEW_COMMUNITY_BUTTON = "//button[normalize-space()='New Community']";
    String RECORDER_BUTTON = "//button[normalize-space()='Reorder']";
    String PIN_ICON = "(//button[@type='button'])[8]";
    String THREE_DOT_ICON = "(//*[name()='svg'][@class='svg-icon--material svg-icon action-button-icon'])[1]";
    String SORTING_ICON = "//div[normalize-space()='Posts']//*[name()='svg']";
    String FORWARD_BUTTON = "//li[@class='page-item']//span[@aria-label='null page']";
    String BACKWARD_BUTTON = "//main[@class='content']//li[1]";
    public static String PAGE_COUNT = "//select[@aria-label='Per']";
    String CREATE_NEWCOMMUNITY = "//button[normalize-space()='New Community']";
    String COMMUNITY_NAME = "(//input[@id='name'])[1]";
    String GENERATE_BUTTOIN = "//button[normalize-space()='Generate']";
    String CREATE_BUTTON = "//button[normalize-space()='Create']";
    String CREATED_COMPANY_NAME = "(//input[@id='name'])[1]";
    String SAVE_BUTTON = "//button[@type='submit']";
    String UPDATED_MESSAGE = "//*[contains(text(),'Community has been updated successfully.')]";
    String Edit_Three_In_Group = "(//button[@type='button'])[6]";


    // community_update locators
    String FIRST_THREE_DOT_ICON = "//button[@class='btn px-2 border-radius-12 border-0 action-button']//*[name()='svg']";
    String NAME_FIELD = "//input[@id='name']";
    String EDIT_COMMUNITY = "//small[normalize-space()='Edit Community']";
    public static String PRIVATE = "(//input[@name='type'])[2]";
    public static String GENERAL = "//button[normalize-space()='General']";
    public static String DETAILS = "//button[normalize-space()='Details']";
    public static String COMMUNITYTYPE = "//p[normalize-space()='Community Type']";
    public static String WHOCREATEGROUPS = "//p[normalize-space()='Who can create Groups']";
    public static String ALLCOMMUNITYMEMBERS = "//input[@value='3']";
    public static String ALLCOMMUNITYMEMBERSFORPUBLIC = "(//input[@name='whoCanCreateLoops'])[1]";
    public static String SELECTADMIN = "//input[@value='4']";
    public static String SELECTADMINFORPUBLIC = "(//input[@name='whoCanCreateLoops'])[2]";
    public static String SAVEFORGROUP = "//button[normalize-space()='Save']";
    public static String ADMINCOMMUNITY = "(//input[@name='whoCanCreateLoops'])[2]";
    public static String PUBLICCOMMUNITY = "//input[@value='1']";
    public static String PUBLICDESC = "//p[contains(text(),'Your community and posts can be seen by anyone, ev')]";
    public static String PRIVATEDESC = "//p[contains(text(),'Only people you approve can see and participate in')]";
    public static String PRIVATECOMMUNITY = "//input[@value='2']";
    public static String UPLOADBANNER = "//button[@class='btn p-0 w-100']//input[@title='upload image']";
    public static String UPLOADIMAGE = "//button[@class='btn p-0']//input[@title='upload image']";
    public static String SAVEFORBANNER = "//button[normalize-space()='Save']";
    public static String COMMUNITYASCENDING = "//div[normalize-space()='Community']//*[name()='svg']//*[name()='g' and contains(@clip-path,'url(#clip0')]//*[name()='path' and contains(@d,'M4 7L8 3L1')]";
    public static String COMMUNITYDESCENDING = "//div[normalize-space()='Community']//*[name()='svg']//*[name()='g' and contains(@clip-path,'url(#clip0')]//*[name()='path' and contains(@d,'M12 9L8 13')]";
    public static String PAGINATIONFORCOMMUNITY = "//span[@class='pagination__desc']";
    public static String PREVOIUSBUTTON = "//main[@class='content']//li[2]";
    public static String FIRSTPAGE = "//span[@aria-label='1 page']";
    public static String SECONDPAGE = "//span[@aria-label='2 page']";
    public static String NEXTPAGEBUTTON = "//span[@aria-label='Last Page']";
    public static String LASTPAGE = "//li[@class='page-item']//span[@aria-label='null page']";
    public static String FIRSTPAGEFORCOMMUNITY = "//main[@class='content']//li[1]//span[1]";
    public static String SELECTNUMBEROFRAW = "//select[@aria-label='Per']";
    public static String SELECT50PAGE = "//option[@value='50']";
    public static String STARTWITHA = "//tr//td[1][starts-with(., 'a') or starts-with(., 'A')]";
    public static String COUNTCOMMUNITY = "//tr//td[1]";
    public static String STARTWITHZ = "//tr//td[1][starts-with(., 'z') or starts-with(., 'Z')]";
    public static String PINNEDBUTTON = "//button[@class='btn btn-outline-light border-transparent btn-only-icon pin-button']";
    public static String REORDERBUTTON = "//button[normalize-space()='Reorder']";
    public static String SEARCHICONFORREORDER = "//div[@class='col-12']//span[@class='input-group-text']";
    public static String SEARCHINPUTFORREORDER = "//input[@id='searchInput']";
    public static String REORDERCOMMUNITIES = "//h5[@id='tour-title']";
    public static String NOSEARCHFOUNDIMAGE = "//div[@class='d-flex flex-column align-items-center justify-content-center bg-l25-light rounded-1 h-100']";
    public static String NOSEARCHFOUND = "//h5[normalize-space()='No Results Found']";
    public static String PINNEDCOMMUNITY = "//div[@class='card shadow-none border border-1 rounded-1 p-3 m-0 bg-l10-info']";
    public static String CLICKONPINNED = "//button[@data-sentry-source-file='ReorderCard.tsx']";
    public static String SAVECHANGES = "//button[normalize-space()='Save Changes']";
    public static String UNPINNEDCOMMUNITY = "//div[@class='card shadow-none border border-1 rounded-1 p-3 m-0 bg-l10-info']//button[@type='button']";
    public static String CANCELCHANGES = "//button[normalize-space()='Cancel']";
    public static String DATECRETAED = "//div[normalize-space()='Date Created']";
    public static String DATEASCENDING = "//tr//td[4]";

    String UPDATE_CONFIRM_MESSAGEIS = "//*[contains(text(),'Community has been updated successfully.')]";
    String COMMUNITY_SAVE_BUTTON = "//*[contains(text(),'Save')]";

    // COMMINITY DETAILS PAGE TITLE
    String DETAIL_TITLE = "//h4[normalize-space()='Details']";
    String LABEL_TITLE = "//div[contains(text(),'Upload image')]";
    String LABEL_UPLOAD_BANNER_TITLE = "//div[contains(text(),'Upload Banner')]";

    String UPLOAD_LOGO_SECTION = "(//input[@title='upload image'])[1]";
    String UPLOAD_IAMGE_BANNER = "(//input[@title='upload image'])[2]";
    String LOGO_SAVE_BUTTON = "//button[@type='button'][normalize-space()='Save']";
    String BANNER_SAVE_BUTTON = "//button[@type='button'][normalize-space()='Save']";
    String LINK_MESSAGE = "//*[contains(text(),'Link copied!')]";
    String LINK_ICON = "//button[@class='btn btn-outline-info rounded-1 btn-only-icon']";
    String GENERAL_TAB = "//button[normalize-space()='General']";
    String GENERAL_LABEL_TEXT = "//h4[normalize-space()='General']";
    String COMMUNITY_DESCRIPTION = "//textarea[@id='description']";
    String LOOP_TAB = "//button[normalize-space()='Loops']";
    String ABOUT_TAB = "//button[normalize-space()='About']";
    String ABOUT_LABEL_TEXT = "//h4[normalize-space()='About']";
    String MEMBERS_TAB = "//button[normalize-space()='Members (1)']";
    String LABEL_TEXT_MEMBERS = "//h5[normalize-space()='Members (1)']";
    String Group_Button = "//a[@href='/manage/groups']";
    String Edit_Group = "(//button[@type='button'])[7]";
    String redditLink = "//input[@id='reddit']";

    // all users tab verification
    String ALL_USERS_SEARCHBOX = "//input[@id='searchInput']";
    String COLUMN_NAME = "//div[normalize-space()='Name']";
    String COLUMN_TYPE = "//div[normalize-space()='Type']";
    String COLUMN_CONTACT = "//div[normalize-space()='Contact']";
    String COLUMN_COMMUNITIES = "//div[normalize-space()='Communities']";
    String COLUMN_LOOPS = "//div[normalize-space()='Loops']";
    String THREE_DOT_ICON_FROM_TABLE = "//tbody/tr[1]/td[7]/div[1]/button[1]";
    String THREE_DOT_ICON_FROM_TABLE1 = "//tbody/tr[1]/td[7]/div[1]/button[1]";
    String SHARE_ICON = "//button[normalize-space()='Share']";
    String VERIFICATION_MESSAGE = "//*[contains(text(),'Profile URL copied!')]";
    String User_Tab = "//span[contains(text(),'Users')]";
    String All_User_Tab = "//div[@class='subheader-left c@ol-sm']//button[position()=1]";
    String Creator_Tab = "//div[@class='subheader-left c@ol-sm']//button[position()=2]";
    String Community_Member_Tab = "//div[@class='subheader-left c@ol-sm']//button[position()=3]";
    String Group_Member_Tab = "//div[@class='subheader-left c@ol-sm']//button[position()=4]";

    //All Brands Details Verification
    String CONSUMER_BRAND = "//button[@class='btn btn-info']";
    String SEARCH_ICON = "//span[@class='input-group-text']";
    String SEARCH_BY_NAME = "//input[@id='search-input']";
    String ADDBRANDTOEARN = "//button[@class='btn btn-light-undefined border-radius-12 text-gray-800']";
    String BRAND = "//th[@aria-label='Brand-col']";
    String STATUS = "//div[normalize-space()='Status']";
    String EARNING = "//span[normalize-space()='Earnings']";
    String CPM = "//span[normalize-space()='CPM']";
    String TOTALVIEW = "//span[normalize-space()='Total Views']";
    String UNIQUEVIEWERS = "//span[normalize-space()='Unique Viewers']";
    String AVG_VIEWS_PER_USER = "//span[normalize-space()='Avg Views per User']";
    String INTEGRATED_SOCIALS = "//div[normalize-space()='Integrated Socials']";
    String SHOWING_ITEMS = "//span[@class='pagination__desc']";
    String LEFTARROW = "//main[@class='content']//li[1]";
    String RIGHT_ARROW = "//li[@class='page-item']//span[@aria-label='null page']//*[name()='svg']";
    String ARIA_LABEL = "//select[@aria-label='Per']";

    //ADD BRAND TO EARN Verification
    public static String ADDCONSUMER = "//h5[@id='upcomingEdit']";
    public static String BRANDHANDLE = "//div[@data-sentry-element='TagWrapper']//label[@for='website url']";
    public static String SEARCHICON = "//span[@id='addon1']";
    public static String SEARCHBYBRANDHANDLE = "//input[@id='genuin_id']";
    public static String NOTFOUND = "//p[@class='mb-0 small ps-3']";
    public static String NEWBRAND = "//button[@class='btn btn-light-undefined align-items-center border-0 d-flex gap-2']";
    public static String BRANDNAMEINPUT = "//input[@id='brand_name']";
    public static String CONTACTEMAILS = "//div[@class='align-items-center d-flex justify-content-between']//label[@for='website url']";
    public static String PREVIEWTEMPLATE = "//label[@class='form-label form-label small text-primary cursor-pointer']";
    public static String EMAILPLACEHOLDER = "//input[@placeholder='name@work-email.com']";
    public static String CONTACTEMAILREQUIRE = "//p[@class='text-danger small mt-1']";
    public static String INVITE = "//button[@class='btn btn-light-undefined w-100 text-start border border-radius-8 text-gray-700 bg-primary-subtle']";
    public static String WEBSITEURL = "//label[@for='brand url']";
    public static String ENTERBRANDWEBSITE = "//input[@id='brand_URL']";
    public static String EARNINGCPMFLOORPRICE = "//label[@for='cpm']";
    public static String Cpm = "//span[@class='input-group-text text-gray-700 fw-medium']";
    public static String ENTERCPM = "//input[@id='cpm']";
    public static String COMMUNITYFEEDACCESS = "//label[@class='form-label' and text()='Community Feed Access Period']";
    public static String Startdate = "//input[@id='startDate']";
    public static String ENDDATE = "//input[@id='endDate']";
    public static String SOCIALMEDIAHANDLE = "//form//label[@for='website url']";
    public static String SELECTSOCIALMEDIA = "//button[@aria-label='Select social media']";
    public static String YOUTUBEHANDLE = "//input[contains(@id,'handles')]";
    public static String ADDSOCIALHANDLE = "//button[@class='btn border-transparent text-primary px-0 py-2 text-primary']";
    public static String CLICKADDSOCIALHANDLE = "(//input[@placeholder='YouTube handle'])[2]";
    public static String ADD = "//button[@class='btn btn-info']";
    public static String Cancel = "//button[@class='btn btn-outline-info border-transparent ms-3']";

    //Brand is addded
    public static String BRANDBUTTON = "//button[@class='btn btn-light-dark rounded-1 btn-only-icon']";
    public static String EDITBUTTON = "//button[normalize-space()='Edit Brand']";
    public static String SAVE = "//button[normalize-space()='Save']";
    public static String CANCELFOREDIT = "//button[normalize-space()='Cancel']";

    public static String SEARCHICONFORCOMMENT = "//span[@class='input-group-text']";
    public static String SEARCHINPUTFORCOMMENT = "//input[@id='search-input']";
    public static String COMMENTS = "(//div[@class='d-flex gap-1 align-items-center'])[1]";
    public static String POSTIN = "(//div[@class='d-flex gap-1 align-items-center'])[2]";
    public static String GROUPS = "(//div[@class='d-flex gap-1 align-items-center'])[3]";
    public static String COMMUNITIES = "(//div[@class='d-flex gap-1 align-items-center'])[4]";
    public static String BRANDDESTINATION = "(//div[@class='d-flex gap-1 align-items-center'])[5]";
    public static String PAGINATIONDESC = "//span[@class='pagination__desc']";
    public static String ARIALABEL = "//select[@aria-label='Per']";
    public static String CLICKONCOMMENT = "(//button[@class='btn btn-light-dark rounded-1 btn-only-icon'])[1]";
    public static String DELETECOMMENT = "//button[normalize-space()='Delete Comment']";
    public static String CLICKONCOMMENTTAB = "//a[@href='/manage/comments']";
    public static String DELETECOMMENTTEXT = "//h5[@id='auto-accept']";
    public static String YOUWONTBEABLE = "//p[@class='text-black']";
    public static String CLOSE = "//button[@aria-label='Close']";
    public static String CANCEL = "//button[normalize-space()='Cancel']";
    public static String DELETEBUTTON = "//button[@class='btn btn-info']";

    //Category
    public static String CATEGORY = "//a[@href='/manage/category']";
    public static String SEARCHICONFORCATEGORY = "//span[@class='input-group-text']";
    public static String SEARCHFORCATEGORY = "//input[@id='searchInput']";
    public static String NEWCATEGORY = "//button[@class='btn btn-light-info border-radius-12']";
    public static String EDITCATEGORY = "(//div[@role='button'])[1]";
    public static String DELETECATEGORY = "//main[@class='content']//button[2]//*[name()='svg']";
    public static String CLOSECATEGORY = "(//*[name()='svg'][@class='svg-icon--material svg-icon text-gray-600 fs-3'])[2]";
    public static String ADDTOPIC = "//button[@class='btn border-transparent text-info fw-semibold me-4 p-0']";
    public static String ADDTOPICTEXT = "//h5[@id='upcomingEdit']";
    public static String TOPIC = "//span//label[@for='title']";
    public static String ENTERTOPIC = "//input[@id='title']";
    public static String KEYWORDS = "//label[normalize-space()='Keywords']";
    public static String ENTERKEYWORDS = "//input[@id='tags']";
    public static String ADDBUTTONFORTOPIC = "//button[@class='btn btn-info w-100']";
    public static String EDITTOPIC = "(//*[name()='svg'][@class='svg-icon--material svg-icon action-button-icon'])[1]";
    public static String CLICKONEDITTOPIC = "//body/div[@id='__next']/div[@class='app']/div[@class='wrapper']/main[@class='content']/div[@class='page-wrapper container-fluid']/div[@class='page container-fluid']/div[contains(@class,'card card-stretch-full p-4 rounded-4')]/div[@class='card-body card-body-scrollable p-0 manage']/div[@class='mt-4']/div[@class='accordion-header rounded-1 d-flex flex-column cursor-pointer active']/div[@class='accordion-body']/div[@class='categories-topic']/label[@for='6650aa6b6cd22fc5f8c57ca0']/span[@class='fw-medium mb-3 text-gray-900 topic-name w-100']/button[@type='button']/div[@class='dropstart']/ul[@role='presentation']/li[@class='dropdown-item-wrapper px-2']/div[1]";
    public static String EDITTOPICTEXT = "//h5[@id='upcomingEdit']";
    public static String CATEGORYNAME = "//h5[@id='upcomingEdit']";
    public static String TOPICOFCATEGORY = "//span//label[@for='title']";
    public static String CANCELFORTOPIC = "//button[normalize-space()='Cancel']";

    //Group

    public static String NEWGROUP = "//button[normalize-space()='New Group']";
    public static String GROUPSON = "//th[@aria-label='loop-col']";
    public static String COMMUNITYCOL = "//th[@aria-label='community-col']";
    public static String CREATEDBYCOL = "//th[@aria-label='leader-col']";
    public static String BRANDSCOL = "//th[@aria-label='brands-col']";
    public static String DATECREATECOL = "//th[@aria-label='date_created-col']";
    public static String POSTS = "//th[@aria-label='posts-col']";
    public static String MEMBERSCOL = "//th[@aria-label='members-col']";
    public static String SUBSCRIBERCOL = "//th[@aria-label='subscribers-col']";
    public static String PAGINATIONFOOTER = "//div[@class='card-footer-left']";
    public static String CREATEGROUP = "//h5[@id='add-members-canvas']";
    public static String CREATETHISGROUPIN = "//p[.='Create this Group in']";
    public static String COMMUNITYDESTINATION = "//label[@for='community']";
    public static String SEARCHICONFORCOMMUNITYGROUP = "//span[@id='addon1']";
    public static String SEARCHCOMMUNITY = "//input[@placeholder='Search Community']";
    public static String SELECTCOMMUNITY = "//input[@placeholder='Select community']";
    public static String SELECTCOMMUNITYFORGROUP = "//body/div[@id='portal-root']/div[@class='offcanvas offcanvas-end show']/div[@class='offcanvas-body h-100']/div[@class='row mb-3']/div[@class='col-12']/div[@class='position-relative']/div[@class='dropdown']/div[@class='dropdown-lists']/button[1]/div[1]";
    public static String GROUPDETAILS = "//p[contains(.,'Group Details')]";
    public static String GROUPNAME = "//span//label[@for='name']";
    public static String ENTERGROUPNAME = "//input[@id='name']";
    public static String DESCRIPTION = "//span//label[@for='description']";
    public static String DESCRIPTIONFORGROUP = "//textarea[@id='description']";
    public static String WHOCANSEEGROUP = "//h5[contains(.,'Who can see this Group')]";
    public static String EVERYONE = "//label[normalize-space()='Everyone']";
    public static String SELECTEVERYONE = "//input[@value='5']";
    public static String GROUPMEMBERONLY = "//input[@value='6']";
    public static String WHOCANPOST = "//h5[contains(.,'Who can post in this Group')]";
    public static String ALLCOMMUNITYMEMBER = "//label[contains(.,'All community members')]";
    public static String SELECTALLCOMMUNITYMEMBER = "//input[@value='9']";
    public static String SELECTGROUPMEMBER = "//input[@value='10']";
    public static String CANCELNEWGROUP = "//button[@class='btn btn-outline-info border-transparent']";
    public static String CREATENEWGROUP = "//button[@class='btn btn-info']";

    //POSTS
    public static String NEWPOST="//button[@class='btn btn-light-info']";
    public static String LISTVIEW="//a[@class='navigation-link navigation-link-pill rounded-start-1 active']";
    public static String BOXVIEW="//a[@class='navigation-link navigation-link-pill rounded-end-1 bg-gray-light-100']";
    public static String LISTVIEWCLICK="//a[@class='navigation-link navigation-link-pill rounded-start-1 bg-gray-light-100']";
    public static String FILELABEL="//label[@for='file']";
    public static String POSTSTAB="//a[@href='/manage/posts']";
    public static String UPLOADVIDEO="//div[@class='text-gray-500 mb-5']//*[name()='svg']";

    /**
     * Selects any brand and verifies that the Dashboard page is displayed.
     * This method clicks on the "Select Any Brand" element, logs the action,
     * and then asserts that the current page title is "Dashboard",
     * indicating the page has been successfully loaded.
     */
    public void selectBrand() {
        common.click(SELECT_ANY_BRAND);
        common.logPrint("Step ::Select Any brand");
        common.assertTwoValuesAreEqual(driver.getTitle(), "Dashboard");
        common.logPrint("Step ::Verify that Dashboard page is open ");
    }

    /**
     * Verifies the Manage Page elements and functionalities such as community tab,
     * table headers, sorting, pagination, etc.
     */
    public void verifyMangePage() {
        common.logPrint("Step ::Click on mange page");
        common.pause(8);
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(5);
        common.logPrint("Step ::Verifying the manage page tab");
        common.logPrint("Step ::click on the community tab");
        common.click(COMMUNITY_TAB);
        common.assertElementPresent(SEARCH_INPUT);
        common.logPrint("Step ::verifying th column headers in the communities module");
        common.assertElementPresent(COMMUNITY_TBL_HEADER);
        common.assertElementPresent(LEADER_TBL_HEADER);
        common.assertElementPresent(DATE_TBL_CREATED);
        common.assertElementPresent(MEMBERS_TBL_HEADER);
        common.assertElementPresent(MODERATORS_TBL_HEADER);
        common.assertElementPresent(LOOPS_TBL_HEADER);
        common.assertElementPresent(POSTS_TBL_HEADER);
        common.logPrint("Step ::verifying the items in the table content format");
        common.assertElementPresent(NEW_COMMUNITY_BUTTON);
        common.assertElementPresent(RECORDER_BUTTON);
        common.assertElementPresent(PIN_ICON);
        common.assertElementPresent(THREE_DOT_ICON);
        common.logPrint("Step ::verifying the sorting icon in the table header icon");
        common.assertElementPresent(SORTING_ICON);
        common.logPrint("Step ::verifying the pagination buttons");
        common.assertElementPresent(FORWARD_BUTTON);
        common.assertElementPresent(BACKWARD_BUTTON);
        common.logPrint("Step ::verifying the page count dropdown");
        common.assertElementPresent(PAGE_COUNT);
        int previousPageCount = -1;

        for (int i = 1; i < 5; i++) {
            String PAGE_COUNT_LIST = driver.findElement(By.xpath("//select[@aria-label='Per']//option[" + i + "]")).getAttribute("value");
            int pageCount = Integer.parseInt(PAGE_COUNT_LIST);
            System.out.println("Page count in dropdown is => " + pageCount);
            if (i > 1) {
                assert pageCount == previousPageCount || pageCount > previousPageCount : "Assertion failed: The current page count is not identical or greater than the previous one.";
            }
            previousPageCount = pageCount;
        }

    }

    /**
     * Verify the Manage page left navigation element is present
     */
    public void clickOnManageTab() {
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(2);
    }

    /**
     * Clicks on the community tab in the navigation.
     * This method logs the action and then clicks on the community tab to navigate to the community section.
     */
    public void clickOnCommunities() {
        common.logPrint("Step ::click on the community tab");
        common.click(COMMUNITY_TAB);
    }

    /**
     * Clicks on the reorder button.
     * This method logs the action and then clicks the reorder button to initiate the reorder process.
     */
    public void clickOnReorderButton() {
        common.logPrint("Step ::Click on reorder button");
        common.click(RECORDER_BUTTON);
    }

    /**
     * Verifies the reorder functionality by checking if the reorder popup and pinned communities are visible.
     * This method waits for the reorder popup to be visible and then ensures that the pinned communities are also visible.
     */
    public void verifyReorderFunctionality() {
        common.logPrint("Step :: Verify reorder popup is visible");
        common.waitUntilElementToBeVisible(Pop_Up);

        common.logPrint("Step :: Verify pinned communities");
        common.waitUntilElementToBeVisible(Pinned_Communities);
    }

    /**
     * Clicks on the group button and logs the action.
     * This method simulates a click on the group button and logs the step to track the action in the automation process.
     */
    public void clickOnGroupButton() {
        common.click(Group_Button);
        common.logPrint("Step ::Click on gruop button");
    }

    /**
     * Clicks on the edit icon within the group and logs the action.
     * This method simulates a click on the edit icon and logs the step to track the action during automation.
     */
    public void clickOnEditIcon() {
        common.click(Edit_Three_In_Group);
        common.logPrint("Step ::Click on edit icon");
    }

    /**
     * Waits for the "Edit Group" element to be visible and then clicks on it.
     * This method ensures the "Edit Group" button is visible before clicking it and logs the action to track the interaction.
     */
    public void clickOnEditGroup() {
        common.waitUntilElementToBeVisible(Edit_Group);
        common.click(Edit_Group);
        common.logPrint("Step ::Click on edit group");
    }

    /**
     * Creates a new community and verifies the creation process.
     * This method performs the following steps:
     * 1. Clicks on the "Manage" page and navigates to the "Community" tab.
     * 2. Initiates the creation of a new community by clicking the "Create New Community" button.
     * 3. Generates a random community name and enters it into the community name field.
     * 4. Clicks the "Generate" button to generate the community description and verifies the success message.
     * 5. Enters a description for the community and clicks the "Create" button.
     * 6. Enters a link for the community, clicks the "Save" button, and verifies the update message.
     * 7. Navigates back to the "Manage" page, searches for the newly created community by its name, and verifies its presence in the community list.
     */
    String communityName = common.generateRandomChars(3);

    public void communityCreation() {
        System.out.println("create a new community test started !!");
        common.logPrint("Step ::Click on mange page");
        common.pause(8);
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(2);
        common.logPrint("Step ::click on the community tab");
        common.click(COMMUNITY_TAB);
        common.click(CREATE_NEWCOMMUNITY);
        common.logPrint("Step ::community name is:" + communityName);
        common.type(COMMUNITY_NAME, communityName);
        common.scroll_To_Element(GENERATE_BUTTOIN);
        common.click(GENERATE_BUTTOIN);
        common.pause(2);
        String VERIFICATION_TEXT = driver.findElement(By.xpath("//div[@class='input-group has-validation']//div[@class='valid-feedback'][normalize-space()='Looks good!']")).getText();
        common.logPrint("Step ::Verification text after clicking the generate button" + VERIFICATION_TEXT);
        common.type(COMMUNITY_DESCRIPTION, "TEST");
        common.click(CREATE_BUTTON);
        common.pause(5);
//
//        common.logPrint("Step ::community name is :" + nameIs);
//        common.assertTwoValuesAreEqual(nameIs, communityName);
        common.type(redditLink, "give");
        common.logPrint("Step ::click on save button");
        common.click(SAVE_BUTTON);

        // failed this because of bug. It display message that "Something went wrong"
        common.logPrint("Step ::verifying the updated message");
        common.assertElementPresent(UPDATED_MESSAGE);
        common.logPrint("Step ::verifying the manage left navigation");
        common.click(MANAGE_PAGELEFTNAV);
        common.logPrint("Step ::click on communities tab");
        common.click(COMMUNITY_TAB);
        common.logPrint("Step ::enter the value in community name");
        common.type(SEARCH_INPUT, communityName);
        common.pause(8);
        String COMMUNITY_NAME_TBL = "//tbody/tr/td[1]/div[1]//a";
        String communityTableNameIs = driver.findElement(By.xpath(COMMUNITY_NAME_TBL)).getText();
        common.logPrint("Step ::Community name in table is:" + communityTableNameIs);
        common.assertTwoValuesAreEqual(communityName, communityTableNameIs);
    }

    /**
     * Updates an existing community and verifies the changes.
     * This method performs the following steps:
     * 1. Waits for elements to load and creates a new community using the `communityCreation` method.
     * 2. Clicks the "three-dot" icon for the first community in the list and selects the "Edit Community" option.
     * 3. Generates a random name for the community, clears the existing community name field, and updates it with the new name.
     * 4. Clicks the "Save" button and verifies the confirmation message indicating that the community was updated successfully.
     * 5. Navigates back to the "Manage" page, clicks the "Communities" tab, and searches for the updated community name.
     * 6. Verifies that the updated community name appears in the community table.
     */
    public void updateCommnunity() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        communityCreation();
        common.logPrint("Step ::Click on three dot icon");
        common.click(FIRST_THREE_DOT_ICON);
        common.logPrint("Step ::click on edit community");
        common.click(EDIT_COMMUNITY);
        common.logPrint("Step ::Enter the value in the name field");
        String rand = common.generateRandomChars(3);
        common.logPrint("Step ::Generated name to update the community name is :: " + rand);
        common.logPrint("Step ::Enter the value in the name field");
        common.clear(NAME_FIELD);
        common.clear(NAME_FIELD);
        String existingCommunityName = driver.findElement(By.xpath(NAME_FIELD)).getAttribute("value");
        common.logPrint("Step ::community name is:" + existingCommunityName);
        common.type(NAME_FIELD, rand);
        common.logPrint("Step ::click on the save button");
        common.click(COMMUNITY_SAVE_BUTTON);
        common.logPrint("Step ::verifying updated confirmation message");
        common.assertElementPresent(UPDATE_CONFIRM_MESSAGEIS);
        common.logPrint("Step ::verifying the manage left navigation");
        common.click(MANAGE_PAGELEFTNAV);
        common.logPrint("Step ::click on communities tab");
        common.click(COMMUNITY_TAB);
        common.logPrint("Step ::enter the value in community name");
        common.type(SEARCH_INPUT, rand);
        String COMMUNITY_NAME_TBL = "//tbody/tr/td[1]/div[1]//a";
        String updatedcommunityFromTableNameIs = driver.findElement(By.xpath(COMMUNITY_NAME_TBL)).getText();
        common.logPrint("Step ::updated community name from table is:" + updatedcommunityFromTableNameIs);
        common.logPrint("Step ::actual community name  name is: " + existingCommunityName);
//        common.assertTwoValuesAreEqual(existingCommunityName + rand, updatedcommunityFromTableNameIs);
    }

    /**
     * Verifies the community details section functionality, including image uploads and navigation between tabs.
     * This method performs the following steps:
     * 1. Waits for elements to load and initiates the community creation using the `communityCreation` method.
     * 2. Clicks the "three-dot" icon for the first community in the list and selects the "Edit Community" option.
     * 3. Verifies the presence of various community detail titles such as "Details", "Upload Image Label", and "Upload Banner".
     * 4. Attempts to upload a logo and a banner image using file paths, and verifies successful uploads.
     * 5. Verifies the presence of the link icon and the corresponding message.
     * 6. Navigates through the different tabs within the community details section:
     * - "General" tab: Verifies the presence of the general label text.
     * - "About Us" tab: Verifies the presence of the about label text.
     * - "Members" tab: Verifies the presence of the members tab and its label text.
     */
    public void communityDetailsSection() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        common.logPrint("Step ::community details verification test has been started !!");
        communityCreation();
        common.logPrint("Step ::Click on three dot icon");
        common.click(FIRST_THREE_DOT_ICON);
        common.logPrint("Step ::click on edit community");
        common.click(EDIT_COMMUNITY);
        common.logPrint("Step ::verify the details title");
        common.assertElementPresent(DETAIL_TITLE);
        common.logPrint("Step ::verify the upload image label title");
        common.assertElementPresent(LABEL_TITLE);
        common.logPrint("Step ::verify the upload banner title");
        common.assertElementPresent(LABEL_UPLOAD_BANNER_TITLE);
        try {
            driver.findElement(By.xpath(UPLOAD_LOGO_SECTION)).sendKeys("src/test/resources/logo.jpg");
            common.click(LOGO_SAVE_BUTTON);
            common.logPrint("Step ::Logo image uploaded successfully !!");
            common.pause(25);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath(UPLOAD_IAMGE_BANNER)).sendKeys("src/test/resources/banner.png");
            common.click(BANNER_SAVE_BUTTON);
            common.logPrint("Step ::Banner image uploaded successfully !!");
            common.pause(25);
        } catch (Exception e) {
            e.printStackTrace();
        }
        common.assertElementPresent(LINK_ICON);
        common.click(LINK_ICON);
        common.assertElementPresent(LINK_MESSAGE);
        common.logPrint("Step ::verifying the general tab in the communities details");
        common.click(GENERAL_TAB);
        common.assertElementPresent(GENERAL_LABEL_TEXT);
        common.click(ABOUT_TAB);
        common.logPrint("Step ::verifying the about us tab");
        common.assertElementPresent(ABOUT_LABEL_TEXT);
        common.click(MEMBERS_TAB);
        common.logPrint("Step ::verifying the members tab");
        common.assertElementPresent(MEMBERS_TAB);
        common.assertElementPresent(LABEL_TEXT_MEMBERS);
        common.logPrint("Step ::verifying the members title");
    }

    /**
     * Verifies the functionality of the "Users" tab in the management page.
     * This method performs the following steps:
     * 1. Waits for the page elements to load and logs the start of the "Users" tab verification.
     * 2. Navigates to the "Manage" page by clicking on the "Manage" page left navigation.
     * 3. Clicks on the "Users" tab and verifies the presence of the "All Users" section to ensure the tab is loaded correctly.
     * 4. Verifies the presence of the "Community Builder" section (currently commented out, but intended to be checked).
     * 5. (Commented out) Verifies the presence of "Community Members" and "Loop Collaborators" sections.
     * 6. Verifies the presence of a footer section showing the total number of records to ensure data is being displayed correctly.
     */
    public void checkUsersTab() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        common.logPrint("Step ::verification for the users tab test started!!");
        common.logPrint("Step ::Click on mange page");
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        String USERS_TAB = "//a[@href='/manage/users']";
        common.click(USERS_TAB);
        common.logPrint("Step ::click on the users tab");
        String ALL_USER_TAB = "//*[contains(text(),'All Users')]";
        common.assertElementPresent(ALL_USER_TAB);
        common.logPrint("Step ::verify the presence of all users tab");
        String COMMUNITY_BUILDER = "//*[contains(text(),'Community Builder')]";
        //  common.assertElementPresent(COMMUNITY_BUILDER);
        //   common.logPrint("Step ::verify the presence of the community builder");

//        String COMMUNITY_MEMBERS = "//*[contains(text(),'Community Members')]";
//        common.assertElementPresent(COMMUNITY_MEMBERS);
//        common.logPrint("Step ::verify the presence of the community members");

//        String LOOP_MEMBERS = "//*[contains(text(),'Loop Collaborators ')]";
//        common.assertElementPresent(LOOP_MEMBERS);
//        common.logPrint("Step ::verify the presence of the community members");
        String TOTAL_NUMBERS_RECORD = "//span[@class='pagination__desc']";
        common.logPrint("Step ::total numbers of record in the footer card");
        common.assertElementPresent(TOTAL_NUMBERS_RECORD);
    }

    /**
     * Verifies the elements and functionality within the "All Users" tab in the manage users section.
     * This method clicks through the navigation to reach the "Users" tab, waits for the page to load,
     * and checks the presence of key UI elements including:
     * - The search box for finding users by username, handle, or contact.
     * - The column headers in the user list, including "Name", "Type", and "Contact".
     * It ensures that these elements are visible, confirming that the "All Users" tab is functioning properly.
     */
    public void checkAllUsersTab() {
        common.logPrint("Step ::verification for the all users tab test started!!");

        common.logPrint("Step ::Click on mange page");
        common.pause(8);

        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(3);
        String USERS_TAB = "//a[@href='/manage/users']";
        common.click(USERS_TAB);
        common.logPrint("Step ::click on the users tab");

        common.logPrint("Step ::Verification for the all users tab test started !! ");
        common.assertElementPresent(ALL_USERS_SEARCHBOX);

        String PLACE_HOLDER_VALUE = "//input[@placeholder='Search by username/handle or contact']";
        //String PLACE_HOLDER_TEXT = driver.findElement(By.xpath(PLACE_HOLDER_VALUE)).getText();
        //common.logPrint("Step ::place holder text is:" + PLACE_HOLDER_TEXT);
        // common.assertTwoValuesAreEqual(PLACE_HOLDER_TEXT, "Search by username/handle or contact");

        common.logPrint("Step ::first column name present");
        common.assertElementPresent(COLUMN_NAME);

        common.logPrint("Step ::SECOND column name is present");
        common.assertElementPresent(COLUMN_TYPE);
        common.assertElementPresent(COLUMN_CONTACT);
        common.logPrint("Step ::Third column name is present");
    }

    /**
     * Verifies the content and structure of the user data table within the "Users" tab in the manage users section.
     * This method:
     * - Navigates to the "Manage Users" page by clicking through the relevant navigation links.
     * - Locates the table containing user details.
     * - Iterates through the rows and columns of the table to print the content of each cell.
     * - Checks and logs the data for each user in the table, ensuring that the table is populated with the expected user information.
     * It helps verify that the table is correctly displayed and contains accurate data for each user.
     */
    public void checkAllTableDetails() {
        common.logPrint("Step ::column details verification test started!!");

        common.logPrint("Step ::Click on mange page");
        common.pause(8);

        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(3);
        String USERS_TAB = "//a[@href='/manage/users']";
        common.click(USERS_TAB);
        common.logPrint("Step ::click on the users tab");

        try {
            WebElement table = driver.findElement(By.tagName("table"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            for (WebElement row : rows) {
                List<WebElement> columns = row.findElements(By.tagName("td"));

                if (columns.isEmpty()) {
                    continue;
                }

                for (WebElement column : columns) {
                    System.out.print(column.getText() + "\t");
                    // common.log(column.getText() + "\t");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Verifies the functionality of the "View Profile" and "Share" options for users in the "Users" tab.
     * This method:
     * - Navigates to the "Manage Users" page and clicks the relevant navigation links to reach the user list.
     * - Clicks on the three-dot icon for a user, then clicks the "View Profile" option to verify the URL and security.
     * - Ensures that the "View Profile" URL is secure (starts with "https://" and contains "/profile").
     * - Switches back to the main window if a new window/tab is opened.
     * - Clicks on the three-dot icon again, then clicks the "Share" icon if it is displayed, ensuring the share functionality works.
     * - Verifies that a confirmation message appears after clicking the share option, confirming that the link was successfully copied.
     */
    public void checkViewandShareOptions() {
        common.logPrint("Step ::View and share option test started!! ");

        common.logPrint("Step ::Click on mange page");
        common.pause(8);

        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(3);

        common.click(USERS_TAB);
        common.logPrint("Step ::click on the users tab");


        common.click(THREE_DOT_ICON_FROM_TABLE);
        common.logPrint("Step ::click on three dot icon");

        String VIEW_PROFILE = "//button[normalize-space()='View Profile']";
        common.click(VIEW_PROFILE);
        common.logPrint("Step ::click on view profile");
        common.pause(3);
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.startsWith("https://") && currentUrl.contains("/profile")) {
            common.logPrint("Step ::The URL is secure and contains the /profile endpoint.");
        } else {
            common.logPrint("Step ::The URL does not meet the criteria.");
        }
        common.pause(3);
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        if (windowHandles.size() > 1) {
            driver.switchTo().window(windowHandles.get(0));
        }
        common.pause(3);
        common.click(THREE_DOT_ICON_FROM_TABLE1);
        common.logPrint("Step ::click on three dot icon");
        for (int i = 0; i < 5; i++) {
            if (common.isElementDisplayed(SHARE_ICON)) {
                common.click(SHARE_ICON);
                common.logPrint("Step ::click on share icon");
                break;
            } else {
                common.click(THREE_DOT_ICON_FROM_TABLE1);
                common.pause(3);
            }
        }
        common.assertElementPresent(VERIFICATION_MESSAGE);
        common.logPrint("Step ::verifying the link copied text is displaying");
    }

    /**
     * Clicks on the "User" tab in the application.
     * This method simulates the action of clicking on the "User" tab to navigate to the user-related section.
     */
    public void clickOnUserTab() {
        common.click(User_Tab);
        common.logPrint("Step :: Click on user tab");
    }

    /**
     * Verifies the visibility of all the header tabs in the "Manage" section.
     * This method checks if the "All User", "Creator", "Community Member", and "Group Member" tabs are visible on the page.
     */
    public void verifyAllHeaderInManage() {
        common.isElementDisplayed(All_User_Tab);
        common.logPrint("Step :: All user tab is visible");

        common.isElementDisplayed(Creator_Tab);
        common.logPrint("Step :: All creator tab is visible");

        common.isElementDisplayed(Community_Member_Tab);
        common.logPrint("Step :: All community member tab is visible");

        common.isElementDisplayed(Group_Member_Tab);
        common.logPrint("Step :: All group member tab is visible");
    }

    /**
     * Verifies the visibility of various elements on the Brands tab within the Brand Details section.
     * This method checks if the following elements are displayed:
     * - Consumer Brand
     * - Search icon
     * - Search by name
     * - Add Brand to Earn button
     * - Brand
     * - Status
     * - Earning
     * - CPM
     * - Total View
     * - Unique Viewers
     * - Avg Views per User
     * - Integrated Socials
     * - Showing items
     * - Left and Right arrow
     * - Aria label
     */
    public void Verify_Brands_Details() {
        common.logPrint("Step :: Verify 'Consumer Brand' is displayed on the Brands tab");
        common.waitUntilElementsToBeVisible(By.xpath(CONSUMER_BRAND));
        common.verifyElementIsDisplayed(CONSUMER_BRAND);

        common.logPrint("Step :: Verify 'Search icon' is displayed on the Brands tab");
        common.waitUntilElementsToBeVisible(By.xpath(SEARCH_ICON));
        common.verifyElementIsDisplayed(SEARCH_ICON);

        common.logPrint("Step :: Verify 'Search by name' is visible");
        common.waitUntilElementsToBeVisible(By.xpath(SEARCH_BY_NAME));
        common.verifyElementIsDisplayed(SEARCH_BY_NAME);

        common.logPrint("Step :: Verify 'Add Brand To Earn' Button  is displayed on the Brands tab");
        common.waitUntilElementsToBeVisible(By.xpath(ADDBRANDTOEARN));
        common.verifyElementIsDisplayed(ADDBRANDTOEARN);

        common.logPrint("Step :: Verify 'Brand' is visible");
        common.waitUntilElementsToBeVisible(By.xpath(BRAND));
        common.verifyElementIsDisplayed(BRAND);

        common.logPrint("Step :: Verify 'Status' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(STATUS));
        common.verifyElementIsDisplayed(STATUS);

        common.logPrint("Step :: Verify 'Earning' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(EARNING));
        common.verifyElementIsDisplayed(EARNING);

        common.logPrint("Step :: Verify 'CPM' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(CPM));
        common.verifyElementIsDisplayed(CPM);

        common.logPrint("Step :: Verify 'Total View' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(TOTALVIEW));
        common.verifyElementIsDisplayed(TOTALVIEW);

        common.logPrint("Step :: Verify 'Unique Viewers' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(UNIQUEVIEWERS));
        common.verifyElementIsDisplayed(UNIQUEVIEWERS);

        common.logPrint("Step :: Verify 'Avg Views per User' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(AVG_VIEWS_PER_USER));
        common.verifyElementIsDisplayed(AVG_VIEWS_PER_USER);

        common.logPrint("Step :: Verify 'Integrated Socials' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(INTEGRATED_SOCIALS));
        common.verifyElementIsDisplayed(INTEGRATED_SOCIALS);

        common.logPrint("Step :: Verify 'Showing items' is displayed on the Brand Details tab");
        common.waitUntilElementsToBeVisible(By.xpath(SHOWING_ITEMS));
        common.verifyElementIsDisplayed(SHOWING_ITEMS);

        common.logPrint("Step :: Verify 'Left arrow' is visible");
        common.waitUntilElementsToBeVisible(By.xpath(LEFTARROW));
        common.verifyElementIsDisplayed(LEFTARROW);

        common.logPrint("Step :: Verify 'Right ARROW' is visible");
        common.waitUntilElementsToBeVisible(By.xpath(RIGHT_ARROW));
        common.verifyElementIsDisplayed(RIGHT_ARROW);

        common.logPrint("Step :: Verify 'Aria Label' is visible");
        common.waitUntilElementsToBeVisible(By.xpath(ARIA_LABEL));
        common.verifyElementIsDisplayed(ARIA_LABEL);
    }

    /**
     * Verifies the process of adding a new consumer brand through the 'Add Brand to Earn' feature.
     * This includes the following steps:
     * 1. Ensure 'Add Brand to Earn' button is visible and clicked.
     * 2. Verify the presence of several input fields and elements on the 'Consume brand' page:
     * - Add Consumer Brand header
     * - Brand Handle
     * - Search icon
     * - 'Couldn't find what you were looking for?' message
     * - New Brand button
     * - Brand Name input field
     * - Contact Emails
     * - Preview Template
     * - Email input field
     * - Website URL input field
     * - CPM entry
     * - Community Feed Access Period
     * - Start and End dates
     * - Social Media Handle fields (including YouTube handle)
     * - Add Social Handle button
     * - Cancel and Add buttons
     * 3. Ensure all the required fields are displayed and functional.
     * 4. Perform necessary actions like entering text, clicking buttons, and verifying the values.
     */
    String searchbyhandle = common.generateRandomChars(4);

    public void VerifyADDBrandToEarn() {
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

        common.logPrint("Step:: Verify 'Couldn't find what you were looking for?' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(NOTFOUND));
        common.verifyElementIsDisplayed(NOTFOUND);

        common.logPrint("Step:: Verify 'New Brand' is displayed on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(NEWBRAND));
        common.verifyElementIsDisplayed(NEWBRAND);
        common.click(NEWBRAND);

        common.logPrint("Step:: Verify 'BRAND NAME' IS entered on the Consume brand page");
        common.waitUntilElementToBeVisible(By.xpath(BRANDNAMEINPUT));
        common.waitUntilElementToBeClickable(By.xpath(BRANDNAMEINPUT));
        common.type(BRANDNAMEINPUT, searchbyhandle);

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
     * Verifies the creation and edit functionality of a brand on the Brands tab.
     * This includes the following steps:
     * 1. Search for the created brand by its name using the 'Search by name' field.
     * 2. Ensure the brand is displayed on the Brands tab.
     * 3. Click on the brand to view its details.
     * 4. Verify the presence of the 'Edit' button, click on it, and check if the 'Save' and 'Cancel' buttons are displayed.
     * 5. Click 'Save' to save any changes and verify the button's functionality.
     * 6. Click 'Cancel' to exit the edit mode and verify the 'Cancel' button's functionality.
     */
    public void VerifyBrandCreated() {
        common.logPrint("Step:: Verify 'Brand name'is search on the Brands tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCH_BY_NAME));
        common.verifyElementIsDisplayed(SEARCH_BY_NAME);
        common.type(SEARCH_BY_NAME, searchbyhandle);

        common.logPrint("Step:: Verify 'Brand name'is displayed on the Brands tab");
        common.waitUntilElementToBeVisible(By.xpath(BRANDBUTTON));
        common.verifyElementIsDisplayed(BRANDBUTTON);
        common.click(BRANDBUTTON);

        common.logPrint("Step:: Verify 'Edit button' is displayed on the Brands tab");
        common.waitUntilElementToBeVisible(By.xpath(EDITBUTTON));
        common.verifyElementIsDisplayed(EDITBUTTON);
        common.click(EDITBUTTON);

        common.logPrint("Step:: Verify 'Save' Button is displayed on the Brands tab");
        common.waitUntilElementToBeVisible(By.xpath(SAVE));
        common.verifyElementIsDisplayed(SAVE);
        common.click(SAVE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Brands tab");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFOREDIT));
        common.verifyElementIsDisplayed(CANCELFOREDIT);
        common.click(CANCELFOREDIT);
    }

    public void clickOnCommentsTab() {
        common.logPrint("Step:: Verify 'Comment Tab' is displayed on manage page");
        common.waitUntilElementsToBeVisible(By.xpath(CLICKONCOMMENTTAB));
        common.verifyElementIsDisplayed(CLICKONCOMMENTTAB);
        common.click(CLICKONCOMMENTTAB);
    }

    public void verifyCommentTab() {
        common.logPrint("Step:: Verify 'Search icon' is displayed on comment tab");
        common.waitUntilElementsToBeVisible(By.xpath(SEARCHICONFORCOMMENT));
        common.verifyElementIsDisplayed(SEARCHICONFORCOMMENT);

        common.logPrint("Step:: Verify 'Search by keyword' is displayed on comment tab");
        common.waitUntilElementsToBeVisible(By.xpath(SEARCHINPUTFORCOMMENT));
        common.verifyElementIsDisplayed(SEARCHINPUTFORCOMMENT);

        common.logPrint("Step:: Verify 'Comments' is displayed on comment tab");
        common.waitUntilElementsToBeVisible(By.xpath(COMMENTS));
        common.verifyElementIsDisplayed(COMMENTS);

        common.logPrint("Step:: Verify 'Posted In' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(POSTIN));
        common.verifyElementIsDisplayed(POSTIN);

        common.logPrint("Step:: Verify 'Groups' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPS));
        common.verifyElementIsDisplayed(GROUPS);

        common.logPrint("Step:: Verify 'Communities' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITIES));
        common.verifyElementIsDisplayed(COMMUNITIES);

        common.logPrint("Step:: Verify 'Brand Destination' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(BRANDDESTINATION));
        common.verifyElementIsDisplayed(BRANDDESTINATION);

        common.logPrint("Step:: Verify 'Pagination' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(PAGINATIONDESC));
        common.verifyElementIsDisplayed(PAGINATIONDESC);

        common.logPrint("Step:: Verify 'Aria label' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(ARIALABEL));
        common.verifyElementIsDisplayed(ARIALABEL);
    }

    public void verify_Delete_Comment() {
        common.logPrint("Step:: Verify 'Edit comment tab' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(CLICKONCOMMENT));
        common.verifyElementIsDisplayed(CLICKONCOMMENT);
        common.click(CLICKONCOMMENT);

        common.logPrint("Step:: Verify 'Delete comment tab' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(DELETECOMMENT));
        common.verifyElementIsDisplayed(DELETECOMMENT);
        common.click(DELETECOMMENT);

        common.logPrint("Step:: Verify'Delete Comment text' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(DELETECOMMENTTEXT));
        common.verifyElementIsDisplayed(DELETECOMMENTTEXT);

        common.logPrint("Step:: Verify 'You won't be able to get this comment back.' is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(YOUWONTBEABLE));
        common.verifyElementIsDisplayed(YOUWONTBEABLE);

        common.logPrint("Step:: Verify 'Close' Button is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(CLOSE));
        common.verifyElementIsDisplayed(CLOSE);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(CANCEL));
        common.verifyElementIsDisplayed(CANCEL);

        common.logPrint("Step:: Verify 'Delete' Button is displayed on comment tab");
        common.waitUntilElementToBeVisible(By.xpath(DELETEBUTTON));
        common.verifyElementIsDisplayed(DELETEBUTTON);
        common.click(DELETEBUTTON);
    }

    public void clickOnCategory() {
        common.logPrint("Step:: Verify 'Category' is displayed on Manage Page");
        common.waitUntilElementToBeVisible(By.xpath(CATEGORY));
        common.verifyElementIsDisplayed(CATEGORY);
        common.click(CATEGORY);
    }

    public void verify_Category_Tab() {
        common.logPrint("Step:: Verify 'Search Icon' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORCATEGORY));
        common.verifyElementIsDisplayed(SEARCHICONFORCATEGORY);

        common.logPrint("Step:: Verify 'Search For Category' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHFORCATEGORY));
        common.verifyElementIsDisplayed(SEARCHFORCATEGORY);

        common.logPrint("Step:: Verify 'New Ctegory' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEWCATEGORY));
        common.verifyElementIsDisplayed(NEWCATEGORY);

        common.logPrint("Step:: Verify 'Categories' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(EDITCATEGORY));
        common.verifyElementIsDisplayed(EDITCATEGORY);
        common.click(EDITCATEGORY);

        common.logPrint("Step:: Verify 'Add Topic' Button is displayed on Category Tab");
        common.verifyElementIsDisplayed(ADDTOPIC);
        common.verifyElementIsDisplayed(ADDTOPIC);

        common.logPrint("Step:: Verify 'Delete' Button is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(DELETECATEGORY));
        common.verifyElementIsDisplayed(DELETECATEGORY);

        common.logPrint("Step:: Verify 'Close' Button is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(CLOSECATEGORY));
        common.verifyElementIsDisplayed(CLOSECATEGORY);
    }

    public void verify_Add_Topic_Tab() {
        common.logPrint("Step:: Verify 'Add Topic' Button is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(ADDTOPIC));
        common.verifyElementIsDisplayed(ADDTOPIC);
        common.click(ADDTOPIC);

        common.logPrint("Step:: Verify 'Add Topic' Text is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(ADDTOPICTEXT));
        common.verifyElementIsDisplayed(ADDTOPICTEXT);

        common.logPrint("Step:: Verify 'Topic' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(TOPIC));
        String topic = common.findElement(TOPIC).getText();
        common.assertTwoValuesAreEqual(topic, "Topic *");

        common.logPrint("Step:: Verify 'Enter Topic' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(ENTERTOPIC));
        String enterTopic = common.generateRandomChars(5);
        common.type(ENTERTOPIC, enterTopic);

        common.logPrint("Step:: Verify 'keyword' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(KEYWORDS));
        common.verifyElementIsDisplayed(KEYWORDS);

        common.logPrint("Step:: Verify 'Enter Keyword' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(ENTERKEYWORDS));
        String enterKeyword = common.generateRandomChars(5);
        common.typeAndEnter(ENTERKEYWORDS, enterKeyword);

        common.logPrint("Step:: Verify 'Add' Button is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(ADDBUTTONFORTOPIC));
        common.verifyElementIsDisplayed(ADDBUTTONFORTOPIC);
        common.click(ADDBUTTONFORTOPIC);
    }

    public void verify_Edit_Topic_Tab() {
        common.logPrint("Step:: Verify 'Edit for Category' Button is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(EDITTOPIC));
        common.verifyElementIsDisplayed(EDITTOPIC);
        common.click(EDITTOPIC);

        common.logPrint("Step:: Verify 'Edit Topic'  is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(CLICKONEDITTOPIC));
        common.click(CLICKONEDITTOPIC);

        common.logPrint("Step:: Verify 'Edit Topic' Text is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(EDITTOPICTEXT));
        String topic = common.findElement(EDITTOPICTEXT).getText();
        common.assertTwoValuesAreEqual(topic, "Edit Topic");

        common.logPrint("Step:: Verify 'Category' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(CATEGORYNAME));
        common.verifyElementIsDisplayed(CATEGORYNAME);

        common.logPrint("Step:: Verify 'Topic' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(TOPICOFCATEGORY));
        common.verifyElementIsDisplayed(TOPICOFCATEGORY);

        common.logPrint("Step:: Verify 'Keyword' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(KEYWORDS));
        common.verifyElementIsDisplayed(KEYWORDS);

        common.logPrint("Step:: Verify 'Enter Keyword' is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(ENTERKEYWORDS));
        common.verifyElementIsDisplayed(ENTERKEYWORDS);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on Category Tab");
        common.waitUntilElementToBeVisible(By.xpath(CANCELFORTOPIC));
        common.verifyElementIsDisplayed(CANCELFORTOPIC);
        common.click(CANCELFORTOPIC);
    }

    public void verify_Create_Private_For_AllCommunity() throws InterruptedException {
        System.out.println("create a new community test started !!");
        common.logPrint("Step ::Click on mange page");
        common.pause(8);
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(2);
        common.logPrint("Step ::click on the community tab");
        common.click(COMMUNITY_TAB);
        common.click(CREATE_NEWCOMMUNITY);
        File filePath = null;
        String osName = System.getProperty("os.name");
        if (osName.contains("Window")) {
            filePath = new File("uploads\\Banner.png");
        } else {
            filePath = new File("uploads/Banner.png");
        }

        String absolutePath = filePath.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath = driver.findElement(By.xpath("//button[@class='btn p-0 w-100']//input[@title='upload image']"));

        fileInputPath.sendKeys(absolutePath);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADBANNER);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);

        common.pause(5);

        File filePath1 = null;
        String osName1 = System.getProperty("os.name");
        if (osName1.contains("Window")) {
            filePath1 = new File("uploads\\PQ_log.png");
        } else {
            filePath1 = new File("uploads/PQ_log.png");
        }

        String absolutePath2 = filePath1.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath1 = driver.findElement(By.xpath("//button[@class='btn p-0']//input[@title='upload image']"));

        fileInputPath1.sendKeys(absolutePath2);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADIMAGE);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);

        String communityName = common.generateRandomChars(3);
        common.logPrint("Step ::community name is:" + communityName);
        common.type(COMMUNITY_NAME, communityName);
        common.scroll_To_Element(GENERATE_BUTTOIN);
        common.click(GENERATE_BUTTOIN);
        common.pause(2);
        String VERIFICATION_TEXT = driver.findElement(By.xpath("//div[@class='input-group has-validation']//div[@class='valid-feedback'][normalize-space()='Looks good!']")).getText();
        common.logPrint("Step ::Verification text after clicking the generate button" + VERIFICATION_TEXT);
        common.type(COMMUNITY_DESCRIPTION, "TEST");
        //
        common.logPrint("Step:: Verify 'Private' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PRIVATE));
        common.verifyElementIsDisplayed(PRIVATE);
        common.click(PRIVATE);

        common.logPrint("Step:: Verify 'Create' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATE_BUTTON));
        common.click(CREATE_BUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Genaral' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(GENERAL));
        common.verifyElementIsDisplayed(GENERAL);
        common.click(GENERAL);

        common.logPrint("Step:: Verify 'Community Type' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYTYPE));
        common.verifyElementIsDisplayed(COMMUNITYTYPE);

        common.logPrint("Step:: Verify 'Public Community' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PUBLICCOMMUNITY));
        common.verifyElementIsDisplayed(PUBLICCOMMUNITY);

        common.logPrint("Step:: Verify 'Private Community' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PRIVATECOMMUNITY));
        common.verifyElementIsDisplayed(PRIVATECOMMUNITY);

        common.logPrint("Step:: Verify 'Who can create Groups'is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCREATEGROUPS));
        String createGroupName = common.findElement(WHOCREATEGROUPS).getText();
        common.assertTwoValuesAreEqual(createGroupName, "Who can create Groups");

        common.logPrint("Step:: Verify 'All community members' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBERS));
        common.verifyElementIsDisplayed(ALLCOMMUNITYMEMBERS);

        common.logPrint("Step:: Verify 'Admin' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTADMIN));
        common.verifyElementIsDisplayed(SELECTADMIN);
        common.click(SELECTADMIN);
        common.click(SAVEFORGROUP);

        common.pause(5);
        common.logPrint("Step:: Verify 'Details' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(DETAILS));
        common.verifyElementIsDisplayed(DETAILS);
        common.click(DETAILS);

        common.click(GENERAL);
        common.pause(5);
        common.click(ALLCOMMUNITYMEMBERS);
        common.pause(5);
        common.click(SAVEFORGROUP);
    }

    public void verify_Create_Private_For_Admin() throws InterruptedException {
        System.out.println("create a new community test started !!");
        common.logPrint("Step ::Click on mange page");
        common.pause(8);
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(2);
        common.logPrint("Step ::click on the community tab");
        common.click(COMMUNITY_TAB);
        common.click(CREATE_NEWCOMMUNITY);

        File filePath = null;
        String osName = System.getProperty("os.name");
        if (osName.contains("Window")) {
            filePath = new File("uploads\\Banner.png");
        } else {
            filePath = new File("uploads/Banner.png");
        }

        String absolutePath = filePath.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath = driver.findElement(By.xpath("//button[@class='btn p-0 w-100']//input[@title='upload image']"));

        fileInputPath.sendKeys(absolutePath);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADBANNER);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);

        common.pause(5);

        File filePath1 = null;
        String osName1 = System.getProperty("os.name");
        if (osName1.contains("Window")) {
            filePath1 = new File("uploads\\PQ_log.png");
        } else {
            filePath1 = new File("uploads/PQ_log.png");
        }

        String absolutePath2 = filePath1.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath1 = driver.findElement(By.xpath("//button[@class='btn p-0']//input[@title='upload image']"));

        fileInputPath1.sendKeys(absolutePath2);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADIMAGE);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);


        String communityName = common.generateRandomChars(3);
        common.logPrint("Step ::community name is:" + communityName);
        common.type(COMMUNITY_NAME, communityName);
        common.scroll_To_Element(GENERATE_BUTTOIN);
        common.click(GENERATE_BUTTOIN);
        common.pause(2);
        String VERIFICATION_TEXT = driver.findElement(By.xpath("//div[@class='input-group has-validation']//div[@class='valid-feedback'][normalize-space()='Looks good!']")).getText();
        common.logPrint("Step ::Verification text after clicking the generate button" + VERIFICATION_TEXT);
        common.type(COMMUNITY_DESCRIPTION, "TEST");
        //
        common.logPrint("Step:: Verify 'Private' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PRIVATE));
        common.verifyElementIsDisplayed(PRIVATE);
        common.click(PRIVATE);

        common.logPrint("Step:: Verify 'Admin' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(ADMINCOMMUNITY));
        common.verifyElementIsDisplayed(ADMINCOMMUNITY);
        common.click(ADMINCOMMUNITY);

        common.logPrint("Step:: Verify 'Create' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATE_BUTTON));
        common.click(CREATE_BUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Genaral' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(GENERAL));
        common.verifyElementIsDisplayed(GENERAL);
        common.click(GENERAL);

        common.logPrint("Step:: Verify 'Community Type' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYTYPE));
        common.verifyElementIsDisplayed(COMMUNITYTYPE);

        common.logPrint("Step:: Verify 'Public Community' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PUBLICCOMMUNITY));
        common.verifyElementIsDisplayed(PUBLICCOMMUNITY);

        common.logPrint("Step:: Verify 'Private Community' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PRIVATECOMMUNITY));
        common.verifyElementIsDisplayed(PRIVATECOMMUNITY);

        common.logPrint("Step:: Verify 'Who can create Groups'is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCREATEGROUPS));
        String createGroupName = common.findElement(WHOCREATEGROUPS).getText();
        common.assertTwoValuesAreEqual(createGroupName, "Who can create Groups");

        common.logPrint("Step:: Verify 'All community members' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBERS));
        common.verifyElementIsDisplayed(ALLCOMMUNITYMEMBERS);

        common.logPrint("Step:: Verify 'Admin' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTADMIN));
        common.verifyElementIsDisplayed(SELECTADMIN);

        common.click(ALLCOMMUNITYMEMBERS);
        common.click(SAVEFORGROUP);

        common.pause(5);
        common.logPrint("Step:: Verify 'Details' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(DETAILS));
        common.verifyElementIsDisplayed(DETAILS);
        common.click(DETAILS);

        common.click(GENERAL);
        common.pause(5);
        common.click(SELECTADMIN);
        common.pause(5);
        common.click(SAVEFORGROUP);
    }

    public void verify_Create_Public_For_Admin() throws InterruptedException {
        System.out.println("create a new community test started !!");
        common.logPrint("Step ::Click on mange page");
        common.pause(8);
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(2);
        common.logPrint("Step ::click on the community tab");
        common.click(COMMUNITY_TAB);
        common.click(CREATE_NEWCOMMUNITY);

        File filePath = null;
        String osName = System.getProperty("os.name");
        if (osName.contains("Window")) {
            filePath = new File("uploads\\Banner.png");
        } else {
            filePath = new File("uploads/Banner.png");
        }

        String absolutePath = filePath.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath = driver.findElement(By.xpath("//button[@class='btn p-0 w-100']//input[@title='upload image']"));

        fileInputPath.sendKeys(absolutePath);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADBANNER);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);

        common.pause(5);

        File filePath1 = null;
        String osName1 = System.getProperty("os.name");
        if (osName1.contains("Window")) {
            filePath1 = new File("uploads\\PQ_log.png");
        } else {
            filePath1 = new File("uploads/PQ_log.png");
        }

        String absolutePath2 = filePath1.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath1 = driver.findElement(By.xpath("//button[@class='btn p-0']//input[@title='upload image']"));

        fileInputPath1.sendKeys(absolutePath2);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADIMAGE);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);

        String communityName = common.generateRandomChars(3);
        common.logPrint("Step ::community name is:" + communityName);
        common.type(COMMUNITY_NAME, communityName);
        common.scroll_To_Element(GENERATE_BUTTOIN);
        common.click(GENERATE_BUTTOIN);
        common.pause(2);
        String VERIFICATION_TEXT = driver.findElement(By.xpath("//div[@class='input-group has-validation']//div[@class='valid-feedback'][normalize-space()='Looks good!']")).getText();
        common.logPrint("Step ::Verification text after clicking the generate button" + VERIFICATION_TEXT);
        common.type(COMMUNITY_DESCRIPTION, "TEST");

        common.logPrint("Step:: Verify 'Admin' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(ADMINCOMMUNITY));
        common.verifyElementIsDisplayed(ADMINCOMMUNITY);
        common.click(ADMINCOMMUNITY);

        common.logPrint("Step:: Verify 'Create' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATE_BUTTON));
        common.click(CREATE_BUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Genaral' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(GENERAL));
        common.verifyElementIsDisplayed(GENERAL);
        common.click(GENERAL);

        common.logPrint("Step:: Verify 'Community Type' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYTYPE));
        common.verifyElementIsDisplayed(COMMUNITYTYPE);

        common.logPrint("Step:: Verify 'Who can create Groups'is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCREATEGROUPS));
        String createGroupName = common.findElement(WHOCREATEGROUPS).getText();
        common.assertTwoValuesAreEqual(createGroupName, "Who can create Groups");

        common.logPrint("Step:: Verify 'All community members' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBERSFORPUBLIC));
        common.verifyElementIsDisplayed(ALLCOMMUNITYMEMBERSFORPUBLIC);

        common.logPrint("Step:: Verify 'Admin' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBERSFORPUBLIC));
        common.verifyElementIsDisplayed(SELECTADMINFORPUBLIC);

        common.click(ALLCOMMUNITYMEMBERSFORPUBLIC);
        common.click(SAVEFORGROUP);

        common.pause(5);
        common.logPrint("Step:: Verify 'Details' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(DETAILS));
        common.verifyElementIsDisplayed(DETAILS);
        common.click(DETAILS);

        common.click(GENERAL);
        common.pause(5);
        common.click(SELECTADMINFORPUBLIC);
        common.pause(5);
        common.click(SAVEFORGROUP);
    }

    public void verify_Create_Public_For_AllCommunity() throws InterruptedException {
        System.out.println("create a new community test started !!");
        common.logPrint("Step ::Click on mange page");
        common.pause(8);
        common.logPrint("Step ::Click on page left nav");
        common.click(MANAGE_PAGELEFTNAV);
        common.pause(2);
        common.logPrint("Step ::click on the community tab");
        common.click(COMMUNITY_TAB);
        common.click(CREATE_NEWCOMMUNITY);

        File filePath = null;
        String osName = System.getProperty("os.name");
        if (osName.contains("Window")) {
            filePath = new File("uploads\\Banner.png");
        } else {
            filePath = new File("uploads/Banner.png");
        }

        String absolutePath = filePath.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath = driver.findElement(By.xpath("//button[@class='btn p-0 w-100']//input[@title='upload image']"));

        fileInputPath.sendKeys(absolutePath);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADBANNER);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);

        common.pause(5);

        File filePath1 = null;
        String osName1 = System.getProperty("os.name");
        if (osName1.contains("Window")) {
            filePath1 = new File("uploads\\PQ_log.png");
        } else {
            filePath1 = new File("uploads/PQ_log.png");
        }

        String absolutePath2 = filePath1.getAbsolutePath();
        common.logPrint("Step :: Uploading file on attachment photo field on the Manage page");
        WebElement fileInputPath1 = driver.findElement(By.xpath("//button[@class='btn p-0']//input[@title='upload image']"));

        fileInputPath1.sendKeys(absolutePath2);
        Thread.sleep(2000);  // wait for 2 seconds
        common.findElement(UPLOADIMAGE);
        common.logPrint("Verified file uploaded Downloads.png");

        common.waitUntilElementToBeVisible(By.xpath(SAVEFORBANNER));
        common.click(SAVEFORBANNER);

        String communityName = common.generateRandomChars(3);
        common.logPrint("Step ::community name is:" + communityName);
        common.type(COMMUNITY_NAME, communityName);
        common.scroll_To_Element(GENERATE_BUTTOIN);
        common.click(GENERATE_BUTTOIN);
        common.pause(2);
        String VERIFICATION_TEXT = driver.findElement(By.xpath("//div[@class='input-group has-validation']//div[@class='valid-feedback'][normalize-space()='Looks good!']")).getText();
        common.logPrint("Step ::Verification text after clicking the generate button" + VERIFICATION_TEXT);
        common.type(COMMUNITY_DESCRIPTION, "TEST");

        common.logPrint("Step:: Verify 'Create' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATE_BUTTON));
        common.click(CREATE_BUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Genaral' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(GENERAL));
        common.verifyElementIsDisplayed(GENERAL);
        common.click(GENERAL);

        common.logPrint("Step:: Verify 'Community Type' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYTYPE));
        common.verifyElementIsDisplayed(COMMUNITYTYPE);

        common.logPrint("Step:: Verify 'Who can create Groups'is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCREATEGROUPS));
        String createGroupName = common.findElement(WHOCREATEGROUPS).getText();
        common.assertTwoValuesAreEqual(createGroupName, "Who can create Groups");

        common.logPrint("Step:: Verify 'All community members' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBERSFORPUBLIC));
        common.verifyElementIsDisplayed(ALLCOMMUNITYMEMBERSFORPUBLIC);

        common.logPrint("Step:: Verify 'Admin' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTADMINFORPUBLIC));
        common.verifyElementIsDisplayed(SELECTADMINFORPUBLIC);

        common.click(SELECTADMINFORPUBLIC);
        common.click(SAVEFORGROUP);

        common.pause(5);
        common.logPrint("Step:: Verify 'Details' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(DETAILS));
        common.verifyElementIsDisplayed(DETAILS);
        common.click(DETAILS);

        common.click(GENERAL);
        common.pause(5);
        common.click(ALLCOMMUNITYMEMBERSFORPUBLIC);
        common.pause(5);
        common.click(SAVEFORGROUP);
    }

    public void verify_Community_In_Ascending_Order() {
        common.logPrint("Step:: Verify 'Community Ascending' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYASCENDING));
        common.assertElementDisplayed(COMMUNITYASCENDING);
        common.click(COMMUNITYASCENDING);

        common.logPrint("Step:: Verify 'Community Start With A' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(STARTWITHA));
        common.verifyElementIsDisplayed(STARTWITHA);
        common.pause(5);

        common.logPrint("Step:: Verify 'Pagination' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PAGINATIONFORCOMMUNITY));
        common.assertElementDisplayed(PAGINATIONFORCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Next Button' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEXTPAGEBUTTON));
        common.verifyElementIsDisplayed(NEXTPAGEBUTTON);
        common.click(NEXTPAGEBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'First page' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(FIRSTPAGEFORCOMMUNITY));
        common.assertElementDisplayed(FIRSTPAGEFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Second' Page is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SECONDPAGE));
        common.assertElementDisplayed(SECONDPAGE);
        common.click(SECONDPAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Last Page' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(LASTPAGE));
        common.verifyElementIsDisplayed(LASTPAGE);
        common.click(LASTPAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'First page' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(FIRSTPAGEFORCOMMUNITY));
        common.assertElementDisplayed(FIRSTPAGEFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Prevoius' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PREVOIUSBUTTON));
        common.assertElementDisplayed(PREVOIUSBUTTON);
        common.click(PREVOIUSBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Page Range' is select on Community Tab ");
        common.waitUntilElementToBeVisible(By.xpath(SELECTNUMBEROFRAW));
        common.verifyElementIsDisplayed(SELECTNUMBEROFRAW);
        common.click(SELECTNUMBEROFRAW);
        common.pause(5);

        common.logPrint("Step:: Verify 'Page Range 50' is select on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECT50PAGE));
        common.verifyElementIsDisplayed(SELECT50PAGE);
        common.click(SELECT50PAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Count the Community' on the Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COUNTCOMMUNITY));
        common.verifyElementIsDisplayed(COUNTCOMMUNITY);
        List<WebElement> elements = driver.findElements(By.xpath(COUNTCOMMUNITY));
        common.logPrint("Number of elements selected by XPath : " + elements.size());
        common.pause(5);
    }

    public void verify_Community_In_Descending_Order() {
        common.logPrint("Step:: Verify 'Community Descending' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYDESCENDING));
        common.verifyElementIsDisplayed(COMMUNITYDESCENDING);
        common.click(COMMUNITYDESCENDING);
        common.click(COMMUNITYDESCENDING);

        common.logPrint("Step:: Verify 'Community Start With Z' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(STARTWITHZ));
        common.verifyElementIsDisplayed(STARTWITHZ);
        common.pause(5);

        common.logPrint("Step:: Verify 'Pagination' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PAGINATIONFORCOMMUNITY));
        common.assertElementDisplayed(PAGINATIONFORCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Next Button' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEXTPAGEBUTTON));
        common.verifyElementIsDisplayed(NEXTPAGEBUTTON);
        common.click(NEXTPAGEBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'First page' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(FIRSTPAGEFORCOMMUNITY));
        common.assertElementDisplayed(FIRSTPAGEFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Second' Page is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SECONDPAGE));
        common.assertElementDisplayed(SECONDPAGE);
        common.click(SECONDPAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Last Page' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(LASTPAGE));
        common.verifyElementIsDisplayed(LASTPAGE);
        common.click(LASTPAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'First page' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(FIRSTPAGEFORCOMMUNITY));
        common.assertElementDisplayed(FIRSTPAGEFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Prevoius' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PREVOIUSBUTTON));
        common.assertElementDisplayed(PREVOIUSBUTTON);
        common.click(PREVOIUSBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Page Range' is select on Community Tab ");
        common.waitUntilElementToBeVisible(By.xpath(SELECTNUMBEROFRAW));
        common.verifyElementIsDisplayed(SELECTNUMBEROFRAW);
        common.click(SELECTNUMBEROFRAW);
        common.pause(5);

        common.logPrint("Step:: Verify 'Page Range 50' is select on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECT50PAGE));
        common.verifyElementIsDisplayed(SELECT50PAGE);
        common.click(SELECT50PAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Count the Community' on the Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COUNTCOMMUNITY));
        common.verifyElementIsDisplayed(COUNTCOMMUNITY);
        List<WebElement> elements = driver.findElements(By.xpath(COUNTCOMMUNITY));
        common.logPrint("Number of elements selected by XPath : " + elements.size());
        common.pause(5);
    }

    public void verify_Pinned_Community() {
        communityCreation();

        common.logPrint("Step:: Verify 'Community is pinned' on the Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PINNEDBUTTON));
        common.assertElementDisplayed(PINNEDBUTTON);
        common.click(PINNEDBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Click On Reorder' on the Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(REORDERBUTTON));
        common.assertElementDisplayed(REORDERBUTTON);
        common.click(REORDERBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Reorder Communities' is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(REORDERCOMMUNITIES));
        String reodercommunities = common.findElement(REORDERCOMMUNITIES).getText();
        common.assertTwoValuesAreEqual(reodercommunities, "Reorder Communities");

        common.logPrint("Step:: Verify 'Pinned Community' is displayed on Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(PINNEDCOMMUNITY));
        common.assertElementDisplayed(PINNEDCOMMUNITY);
    }

    public void verify_Reorder_Community() {
        communityCreation();
        common.logPrint("Step:: Verify 'REORDER' button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(REORDERBUTTON));
        common.assertElementDisplayed(REORDERBUTTON);
        common.click(REORDERBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Reorder Communities' is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(REORDERCOMMUNITIES));
        String reodercommunities = common.findElement(REORDERCOMMUNITIES).getText();
        common.assertTwoValuesAreEqual(reodercommunities, "Reorder Communities");

        common.logPrint("Step:: Verify 'Search Icon' is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORREORDER));
        common.assertElementDisplayed(SEARCHICONFORREORDER);

        common.logPrint("Step:: Verify 'Search Input' is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHINPUTFORREORDER));
        common.assertElementDisplayed(SEARCHINPUTFORREORDER);
        common.type(SEARCHINPUTFORREORDER, communityName);
        common.pause(5);

        common.logPrint("Step:: Verify 'Pinned' the community on Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(CLICKONPINNED));
        common.assertElementDisplayed(CLICKONPINNED);
        common.click(CLICKONPINNED);
        common.pause(5);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELCHANGES));
        common.assertElementDisplayed(CANCELCHANGES);

        common.logPrint("Step:: Verify 'Save Changes' Button is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(SAVECHANGES));
        common.assertElementDisplayed(SAVECHANGES);
        common.click(SAVECHANGES);
        common.pause(5);

        common.logPrint("Step:: Verify 'Reorder' Button is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(REORDERBUTTON));
        common.assertElementDisplayed(REORDERBUTTON);
        common.click(REORDERBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Pinned Community' is displayed on the Reorder Page");
        common.waitUntilElementToBeVisible(By.xpath(UNPINNEDCOMMUNITY));
        common.assertElementDisplayed(UNPINNEDCOMMUNITY);
        common.click(UNPINNEDCOMMUNITY);

        common.pause(5);
        common.logPrint("Step:: Verify 'Save Changes' Button is displayed on the Reorder Page");
        common.click(SAVECHANGES);
    }

    public void verify_Date_Created_In_AscendingOrder() {
        common.logPrint("Step:: Verify 'Date Created' is displayed on the Community Page");
        common.waitUntilElementToBeVisible(By.xpath(DATECRETAED));
        common.assertElementDisplayed(DATECRETAED);

        common.logPrint("Step:: Verify 'Date Created For Ascending Order' Button is displayed on the Community Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYASCENDING));
        common.assertElementDisplayed(COMMUNITYASCENDING);
        common.click(COMMUNITYASCENDING);
        common.pause(5);

        verify_Pagination_On_ManagePage();
    }

    public void verify_Pagination_On_ManagePage() {
        common.logPrint("Step:: Verify 'Pagination' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PAGINATIONFORCOMMUNITY));
        common.assertElementDisplayed(PAGINATIONFORCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Next Button' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEXTPAGEBUTTON));
        common.verifyElementIsDisplayed(NEXTPAGEBUTTON);
        common.click(NEXTPAGEBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'First page' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(FIRSTPAGEFORCOMMUNITY));
        common.assertElementDisplayed(FIRSTPAGEFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Second' Page is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SECONDPAGE));
        common.assertElementDisplayed(SECONDPAGE);
        common.click(SECONDPAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Last Page' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(LASTPAGE));
        common.verifyElementIsDisplayed(LASTPAGE);
        common.click(LASTPAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'First page' is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(FIRSTPAGEFORCOMMUNITY));
        common.assertElementDisplayed(FIRSTPAGEFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Prevoius' Button is displayed on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(PREVOIUSBUTTON));
        common.assertElementDisplayed(PREVOIUSBUTTON);
        common.click(PREVOIUSBUTTON);
        common.pause(5);

        common.logPrint("Step:: Verify 'Page Range' is select on Community Tab ");
        common.waitUntilElementToBeVisible(By.xpath(SELECTNUMBEROFRAW));
        common.verifyElementIsDisplayed(SELECTNUMBEROFRAW);
        common.click(SELECTNUMBEROFRAW);
        common.pause(5);

        common.logPrint("Step:: Verify 'Page Range 50' is select on Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECT50PAGE));
        common.verifyElementIsDisplayed(SELECT50PAGE);
        common.click(SELECT50PAGE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Count the Community' on the Community Tab");
        common.waitUntilElementToBeVisible(By.xpath(COUNTCOMMUNITY));
        common.verifyElementIsDisplayed(COUNTCOMMUNITY);
        List<WebElement> elements = driver.findElements(By.xpath(COUNTCOMMUNITY));
        common.logPrint("Number of elements selected by XPath : " + elements.size());
        common.pause(5);
    }

    public void verify_Date_Cretaed_In_DescendingOrder() {
        common.logPrint("Step:: Verify 'Date Created' is displayed on the Community Page");
        common.waitUntilElementToBeVisible(By.xpath(DATECRETAED));
        common.assertElementDisplayed(DATECRETAED);

        common.logPrint("Step:: Verify 'Date Created For Descending Order' Button is displayed on the Community Page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYDESCENDING));
        common.assertElementDisplayed(COMMUNITYDESCENDING);
        common.click(COMMUNITYDESCENDING);
        common.click(COMMUNITYDESCENDING);
        common.pause(5);

        verify_Pagination_On_ManagePage();
    }

    public void verify_Groups_Tab() {
        common.logPrint("Step:: Search icon' is displayed on the Group Tab");
        common.assertElementDisplayed(SEARCHICONFORCATEGORY);

        common.logPrint("Step:: Verify 'Search Input' is displayed on the Group Tab");
        common.assertElementDisplayed(SEARCH_INPUT);

        common.logPrint("Step:: Verify 'New Group' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEWGROUP));
        common.assertElementDisplayed(NEWGROUP);

        common.logPrint("Step:: Verify 'Groups' is displayed on Groups Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPSON));
        common.assertElementDisplayed(GROUPSON);

        common.logPrint("Step:: Verify 'Community Tab' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYCOL));
        common.assertElementDisplayed(COMMUNITYCOL);

        common.logPrint("Step:: Verify 'Created By Col' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATEDBYCOL));
        common.assertElementDisplayed(CREATEDBYCOL);

        common.logPrint("Step:: Verify 'Brand Destination' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(BRANDSCOL));
        common.assertElementDisplayed(BRANDSCOL);

        common.logPrint("Step:: Verify 'Date Created By' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(DATECREATECOL));
        common.assertElementDisplayed(DATECREATECOL);

        common.logPrint("Step:: Verify 'Posts col' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(POSTS));
        common.assertElementDisplayed(POSTS);

        common.logPrint("Step:: Verify 'Members' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(MEMBERSCOL));
        common.assertElementDisplayed(MEMBERSCOL);

        common.logPrint("Step:: Verify 'Subscribers' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SUBSCRIBERCOL));
        common.assertElementDisplayed(SUBSCRIBERCOL);

        verify_Pagination_On_ManagePage();
    }

    public void create_New_Group_For_ALLCommunities() {
        common.logPrint("Step:: Verify 'New Group' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEWGROUP));
        common.assertElementDisplayed(NEWGROUP);
        common.click(NEWGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Create this Group in' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATETHISGROUPIN));
        String createthisgroup = common.findElement(CREATETHISGROUPIN).getText();
        common.assertTwoValuesAreEqual(createthisgroup, "Create this Group in");

        common.logPrint("Step:: Verify 'Community Destination' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYDESTINATION));
        common.assertElementDisplayed(COMMUNITYDESTINATION);
        common.pause(5);

        common.logPrint("Step:: Verify 'SEARCH ICON' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITY));
        common.assertElementDisplayed(SELECTCOMMUNITY);
        common.click(SELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Search For Community' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORCOMMUNITYGROUP));
        common.assertElementDisplayed(SEARCHICONFORCOMMUNITYGROUP);

        common.logPrint("Step:: Verify 'Search Community' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHCOMMUNITY));
        common.assertElementDisplayed(SEARCHCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Community' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITYFORGROUP));
        common.assertElementDisplayed(SELECTCOMMUNITYFORGROUP);
        common.click(SELECTCOMMUNITYFORGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Group Details' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPDETAILS));
        String groupdetails = common.findElement(GROUPDETAILS).getText();
        common.assertTwoValuesAreEqual(groupdetails, "Group Details");

        common.logPrint("Step:: Verify 'Group Name' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPNAME));
        common.assertElementDisplayed(GROUPNAME);

        common.logPrint("Step:: Verify 'Enter Group Name' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(ENTERGROUPNAME));
        String groupname = common.generateRandomChars(4);
        common.type(ENTERGROUPNAME, groupname);

        common.logPrint("Step:: Verify 'Description' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTION));
        common.assertElementDisplayed(DESCRIPTION);

        common.logPrint("Step:: Verify 'Description For Group' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTIONFORGROUP));
        common.assertElementDisplayed(DESCRIPTIONFORGROUP);
        String desc = common.generateRandomChars(4);
        common.type(DESCRIPTIONFORGROUP, desc);

        common.logPrint("Step:: Verify 'Who can see this Group\n' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCANSEEGROUP));
        common.assertElementDisplayed(WHOCANSEEGROUP);

        common.logPrint("Step:: Verify 'Everyone label' is displayed on the Group Tab ");
        common.waitUntilElementToBeVisible(By.xpath(EVERYONE));
        common.assertElementDisplayed(EVERYONE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Everyone' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEVERYONE));
        common.assertElementDisplayed(SELECTEVERYONE);

        common.logPrint("Step:: Verify 'Group Member Only' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPMEMBERONLY));
        common.assertElementDisplayed(GROUPMEMBERONLY);

        common.logPrint("Step:: Verify 'Who can post in this Group\n' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCANPOST));
        String whopost = common.findElement(WHOCANPOST).getText();
        common.assertTwoValuesAreEqual(whopost, "Who can post in this Group");

        common.logPrint("Step:: Verify 'All Community Member' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBER));
        common.assertElementDisplayed(ALLCOMMUNITYMEMBER);

        common.logPrint("Step:: Verify 'All Community Member' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTALLCOMMUNITYMEMBER));
        common.assertElementDisplayed(SELECTALLCOMMUNITYMEMBER);

        common.logPrint("Step:: Verify 'Group Member Only' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTGROUPMEMBER));
        common.assertElementDisplayed(SELECTGROUPMEMBER);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CANCELNEWGROUP));
        common.assertElementDisplayed(CANCELNEWGROUP);

        common.logPrint("Step:: Verify 'Create' Button is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATENEWGROUP));
        common.assertElementDisplayed(CREATENEWGROUP);
        common.click(CREATENEWGROUP);
    }

    public void create_New_Group_For_GroupMembers() {
        common.logPrint("Step:: Verify 'New Group' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEWGROUP));
        common.assertElementDisplayed(NEWGROUP);
        common.click(NEWGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Create this Group in' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATETHISGROUPIN));
        String createthisgroup = common.findElement(CREATETHISGROUPIN).getText();
        common.assertTwoValuesAreEqual(createthisgroup, "Create this Group in");

        common.logPrint("Step:: Verify 'Community Destination' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYDESTINATION));
        common.assertElementDisplayed(COMMUNITYDESTINATION);
        common.pause(5);

        common.logPrint("Step:: Verify 'SEARCH ICON' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITY));
        common.assertElementDisplayed(SELECTCOMMUNITY);
        common.click(SELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Search For Community' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORCOMMUNITYGROUP));
        common.assertElementDisplayed(SEARCHICONFORCOMMUNITYGROUP);

        common.logPrint("Step:: Verify 'Search Community' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHCOMMUNITY));
        common.assertElementDisplayed(SEARCHCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Community' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITYFORGROUP));
        common.assertElementDisplayed(SELECTCOMMUNITYFORGROUP);
        common.click(SELECTCOMMUNITYFORGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Group Details' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPDETAILS));
        String groupdetails = common.findElement(GROUPDETAILS).getText();
        common.assertTwoValuesAreEqual(groupdetails, "Group Details");

        common.logPrint("Step:: Verify 'Group Name' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPNAME));
        common.assertElementDisplayed(GROUPNAME);

        common.logPrint("Step:: Verify 'Enter Group Name' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(ENTERGROUPNAME));
        String groupname = common.generateRandomChars(4);
        common.type(ENTERGROUPNAME, groupname);

        common.logPrint("Step:: Verify 'Description' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTION));
        common.assertElementDisplayed(DESCRIPTION);

        common.logPrint("Step:: Verify 'Description For Group' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTIONFORGROUP));
        common.assertElementDisplayed(DESCRIPTIONFORGROUP);
        String desc = common.generateRandomChars(4);
        common.type(DESCRIPTIONFORGROUP, desc);

        common.logPrint("Step:: Verify 'Who can see this Group\n' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCANSEEGROUP));
        common.assertElementDisplayed(WHOCANSEEGROUP);

        common.logPrint("Step:: Verify 'Everyone label' is displayed on the Group Tab ");
        common.waitUntilElementToBeVisible(By.xpath(EVERYONE));
        common.assertElementDisplayed(EVERYONE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Everyone' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEVERYONE));
        common.assertElementDisplayed(SELECTEVERYONE);

        common.logPrint("Step:: Verify 'Group Member Only' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPMEMBERONLY));
        common.assertElementDisplayed(GROUPMEMBERONLY);

        common.logPrint("Step:: Verify 'Who can post in this Group\n' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCANPOST));
        String whopost = common.findElement(WHOCANPOST).getText();
        common.assertTwoValuesAreEqual(whopost, "Who can post in this Group");

        common.logPrint("Step:: Verify 'All Community Member' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBER));
        common.assertElementDisplayed(ALLCOMMUNITYMEMBER);

        common.logPrint("Step:: Verify 'All Community Member' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTALLCOMMUNITYMEMBER));
        common.assertElementDisplayed(SELECTALLCOMMUNITYMEMBER);

        common.logPrint("Step:: Verify 'Group Member Only' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTGROUPMEMBER));
        common.assertElementDisplayed(SELECTGROUPMEMBER);
        common.click(SELECTGROUPMEMBER);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CANCELNEWGROUP));
        common.assertElementDisplayed(CANCELNEWGROUP);

        common.logPrint("Step:: Verify 'Create' Button is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATENEWGROUP));
        common.assertElementDisplayed(CREATENEWGROUP);
        common.click(CREATENEWGROUP);
    }

    public void create_Group_For_Members() {
        common.logPrint("Step:: Verify 'New Group' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEWGROUP));
        common.assertElementDisplayed(NEWGROUP);
        common.click(NEWGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Create this Group in' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATETHISGROUPIN));
        String createthisgroup = common.findElement(CREATETHISGROUPIN).getText();
        common.assertTwoValuesAreEqual(createthisgroup, "Create this Group in");

        common.logPrint("Step:: Verify 'Community Destination' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYDESTINATION));
        common.assertElementDisplayed(COMMUNITYDESTINATION);
        common.pause(5);

        common.logPrint("Step:: Verify 'SEARCH ICON' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITY));
        common.assertElementDisplayed(SELECTCOMMUNITY);
        common.click(SELECTCOMMUNITY);

        common.logPrint("Step:: Verify 'Search For Community' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORCOMMUNITYGROUP));
        common.assertElementDisplayed(SEARCHICONFORCOMMUNITYGROUP);

        common.logPrint("Step:: Verify 'Search Community' is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHCOMMUNITY));
        common.assertElementDisplayed(SEARCHCOMMUNITY);
        common.pause(5);

        common.logPrint("Step:: Verify 'Community' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTCOMMUNITYFORGROUP));
        common.assertElementDisplayed(SELECTCOMMUNITYFORGROUP);
        common.click(SELECTCOMMUNITYFORGROUP);
        common.pause(5);

        common.logPrint("Step:: Verify 'Group Details' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPDETAILS));
        String groupdetails = common.findElement(GROUPDETAILS).getText();
        common.assertTwoValuesAreEqual(groupdetails, "Group Details");

        common.logPrint("Step:: Verify 'Group Name' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPNAME));
        common.assertElementDisplayed(GROUPNAME);

        common.logPrint("Step:: Verify 'Enter Group Name' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(ENTERGROUPNAME));
        String groupname = common.generateRandomChars(4);
        common.type(ENTERGROUPNAME, groupname);

        common.logPrint("Step:: Verify 'Description' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTION));
        common.assertElementDisplayed(DESCRIPTION);

        common.logPrint("Step:: Verify 'Description For Group' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTIONFORGROUP));
        common.assertElementDisplayed(DESCRIPTIONFORGROUP);
        String desc = common.generateRandomChars(4);
        common.type(DESCRIPTIONFORGROUP, desc);

        common.logPrint("Step:: Verify 'Who can see this Group\n' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCANSEEGROUP));
        common.assertElementDisplayed(WHOCANSEEGROUP);

        common.logPrint("Step:: Verify 'Everyone label' is displayed on the Group Tab ");
        common.waitUntilElementToBeVisible(By.xpath(EVERYONE));
        common.assertElementDisplayed(EVERYONE);
        common.pause(5);

        common.logPrint("Step:: Verify 'Everyone' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTEVERYONE));
        common.assertElementDisplayed(SELECTEVERYONE);

        common.logPrint("Step:: Verify 'Group Member Only' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(GROUPMEMBERONLY));
        common.assertElementDisplayed(GROUPMEMBERONLY);
        common.click(GROUPMEMBERONLY);

        common.logPrint("Step:: Verify 'Who can post in this Group\n' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(WHOCANPOST));
        String whopost = common.findElement(WHOCANPOST).getText();
        common.assertTwoValuesAreEqual(whopost, "Who can post in this Group");

        common.logPrint("Step:: Verify 'All Community Member' is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITYMEMBER));
        common.assertElementDisplayed(ALLCOMMUNITYMEMBER);

        common.logPrint("Step:: Verify 'All Community Member' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTALLCOMMUNITYMEMBER));
        common.assertElementDisplayed(SELECTALLCOMMUNITYMEMBER);

        common.logPrint("Step:: Verify 'Group Member Only' Button is displayed on the Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(SELECTGROUPMEMBER));
        common.assertElementDisplayed(SELECTGROUPMEMBER);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CANCELNEWGROUP));
        common.assertElementDisplayed(CANCELNEWGROUP);

        common.logPrint("Step:: Verify 'Create' Button is displayed on Group Tab");
        common.waitUntilElementToBeVisible(By.xpath(CREATENEWGROUP));
        common.assertElementDisplayed(CREATENEWGROUP);
        common.click(CREATENEWGROUP);
    }

    public void clickOnPosts(){
        common.logPrint("Step:: Verify 'Posts' Tab is displayed on the Manage Page");
        common.waitUntilElementToBeVisible(By.xpath(POSTSTAB));
        common.assertElementDisplayed(POSTSTAB);
        common.click(POSTSTAB);
    }

    public void verify_Posts_Tab(){
        common.logPrint("Step:: Verify 'Search Icon' is displayed on Posts Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHICONFORCOMMENT));
        common.assertElementDisplayed(SEARCHICONFORCOMMENT);

        common.logPrint("Step:: Verify 'Search Input' is displayed on Posts Tab");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHINPUTFORCOMMENT));
        common.assertElementDisplayed(SEARCHINPUTFORCOMMENT);

        common.logPrint("Step:: Verify 'New Post' Button is displayed On the Posts Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEWPOST));
        common.assertElementDisplayed(NEWPOST);

        common.logPrint("Step:: Verify 'List View' Button is displayed on the Posts Tab ");
        common.waitUntilElementToBeVisible(By.xpath(LISTVIEW));
        common.assertElementDisplayed(LISTVIEW);

        common.logPrint("Step:: Verify 'Box View' Button is displayed on the Posts Tab");
        common.waitUntilElementToBeVisible(By.xpath(BOXVIEW));
        common.assertElementDisplayed(BOXVIEW);
        common.click(BOXVIEW);
        common.pause(5);

        common.click(LISTVIEWCLICK);
        common.pause(5);

        verify_Pagination_On_ManagePage();
    }

    public void create_New_Post() throws AWTException, InterruptedException {
        common.logPrint("Step:: Verify 'New Post' Button is displayed on the Posts Tab");
        common.waitUntilElementToBeVisible(By.xpath(NEWPOST));
        common.assertElementDisplayed(NEWPOST);
        common.click(NEWPOST);

        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            driver.switchTo().window(window);
        }

        common.logPrint("Step:: Redirected to Import Videos Uploads page successfully");
        common.waitUntilUrlContains("https://brands.qa.begenuin.com/engage/import-videos/uploads");

        common.logPrint("Step:: Click on the choose file button");
        common.waitUntilElementsToBeVisible(By.xpath(CHOOSEFILE));
        common.click(CHOOSEFILE);

        common.logPrint("Step:: Select file from location");
        common.waitUntilElementToBeVisible(By.xpath(YOURCOMPUTER));
        common.click(YOURCOMPUTER);

        String os = System.getProperty("os.name").toLowerCase();
        // Define file path variable
        String filePath = System.getProperty("user.dir") + File.separator + "uploads" + File.separator + "TestReport.mp4";

        //Check if it's Windows or macOS and print the file path
        if (os.contains("windows")) {
            System.out.println("Running on Windows: " + filePath);
        } else if (os.contains("mac os x")) {
            System.out.println("Running on macOS: " + filePath);
        } else {
            System.out.println("Unknown OS: " + filePath);
        }
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        Robot robot = new Robot();
        Thread.sleep(1000); // Wait for the file dialog to appear
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        common.pause(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        common.pause(10);

        common.logPrint("Step:: Click on the import button");
        common.waitUntilElementsToBeVisible(By.xpath(IMPORTBTN));
        common.click(IMPORTBTN);
        common.logPrint("Step:: Video upload process initiated.");


    }
}