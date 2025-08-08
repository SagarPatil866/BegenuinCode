package Pages;

import Utils.MobileCommon;
import Utils.UserAction;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static java.time.Duration.ofSeconds;


public class MobileSDKPage {
    public MobileDriver driver;
    UserAction action = new UserAction();
    MobileCommon common = new MobileCommon();
    private Thread time;

    public MobileSDKPage(MobileDriver driver) {
        this.driver = driver;
    }

    // Locators
    String SDKHEADER = "//android.widget.TextView[@text=\"Genuin SDK\"]";
    String CommunityFeed = "//android.widget.FrameLayout[@content-desc=\"Home\"]|//XCUIElementTypeButton[@name=\"Community Feed\"]";
    String CommunityVideoView = "//android.widget.RelativeLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llRTAnimLayout\"]|//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage";
    String CarouselButton = "//android.widget.FrameLayout[@content-desc=\"Carousel\"]|//XCUIElementTypeButton[@name=\"Carousel\"]";
    String CarouselVideoView = "//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/exo_subtitles\"]/android.view.View|//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";
    String BrandFeedButton = "//android.widget.FrameLayout[@content-desc=\"Standard Wall\"]|//XCUIElementTypeButton[@name=\"Brand Feed\"]";
    String BrandFeedView = "//android.widget.RelativeLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llRTAnimLayout\"]";
    String LoadSDK = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnLoadSDK\"]";
    String HomeButton = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cvFeedSelector\"]|//XCUIElementTypeStaticText[@name=\"Home\"]";
    String CreateCommunity = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llCreateCommunity\"]|//XCUIElementTypeImage[@name=\"ic_add_community\"]";
    String CreateManually = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnCreateManually\"]|//XCUIElementTypeButton[@name=\"Create Manually\"]";
    String COMMUNITYNAMEFIELD = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\"]|//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]";
    String COMMUNITYHANDLEFIELD = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvGenerate\"]|//XCUIElementTypeStaticText[@name=\"Generate\"]";
    String CREATECOMMUNITY = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnPublish\"]|//XCUIElementTypeStaticText[@name=\"Create Community\"]";
    String COMMUNITYCREATEDTEXT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvLoadingMessage\"]|//XCUIElementTypeStaticText[@name=\"Community created!\"]";
    String CreateGroup = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnCreateNewLoop\"]|//XCUIElementTypeStaticText[@name=\"Create a Group\"]";
    String GroupNameField = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\" and @text=\"Try a topic, theme, or idea.\"]|//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]";
    String Description = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\" and @text=\"Tell your viewers what your conversation will be about.\"]|//XCUIElementTypeTextView";
    String CreateButton = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnCreate\"]|//XCUIElementTypeStaticText[@name=\"Create\"]";
    String RecordPost = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cardSuccessRecordPost\"]|//XCUIElementTypeStaticText[@name=\"Record a post\"]";
    String BACKCAMERA = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/imgSwitchBg\"]";
    String VIDEOSTARTBTN = "//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/frm_camera_record\"]";
    String VIDEOENDBTN = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/img_circle2\"]";
    String RIGHTCHECKBUTTON = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivRecordDone\"]";
    String NEXTBUTTONFORLOOP = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnPublish\"]";
    String POSTBUTTON = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnPost\"]";
    String Caption = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etVideoDescription\"]";
    String AddLink = "//android.widget.TextView[@text=\"Add link\"]";
    String Url = "(//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\"])[1]";
    String Done = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvDone\"]";
    String BecomeACreator = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llJoinAsCb\"]|//XCUIElementTypeStaticText[@name=\"Become a creator for Ankpal & Genuin \uD83D\uDE80\"]";
    String BecomeACreatorTab = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnRequest\"]";
    String EmailField = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\"]";
    String UsePhoneNumberField = "//android.widget.TextView[@text=\"Use phone number instead\"]";
    String PhoneField = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etMobileNo\"]";
    String Continue = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnProfileContinue\"]";
    String EnterCode = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/otpView\"]";
    String VerifyTab = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnLogin\"]";
    String CloseButton = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivClose\"]";
    String Home1 = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvFeedType\"]";
    String Spark = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivEmptyBulb\"]";
    String HomeTab = "(//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llMain\"])[1]";
    String AfterSpark = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivFilledBulb\"]";
    String Doubletab = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";
    String HOMEDROPDOWN = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cvFeedSelector\"]/android.widget.TableLayout/android.widget.TableRow";
    String POPULAROPTION = "(//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llMain\"])[2]";
    String REPOSTBTN = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivRTRepost\"]";
    String REPOSTPLUSICON = "//android.widget.ImageView[@content-desc=\"Groups\"]";
    String REPOSTHEADER = "(//android.widget.TextView[@text=\"Repost\"])[1]";
    String CLOSEBTN = "//android.widget.ImageView[@content-desc=\"Go back\"]";
    String SPARKCOUNT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvRTSparks\"]";
    String SPARCKBTNFILL = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivFilledBulb\"]";
    String SPARCKBTNEMPTY = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivEmptyBulb\"]";
    String COMMENTBTN = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llComments\"]/android.widget.ImageView";
    String COMMENTCOUNT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvComments\"]";
    String SHAREBTN = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivRTShare\"]";
    String MOREBTN = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivRTMoreOptions\"]";
    String GROUPDETAILBTN = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cvLoop\"]/android.widget.LinearLayout";
    String COMMUNITYBTN = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cvCommunity\"]/android.widget.LinearLayout";
    String GROUPDETAIL = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvRTDetails\"]";
    String NOTINTERSTED = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/txtNotInterested\"]";
    String REPORTPOST = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/txtReport\"]";
    String CANCELBTN = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/txtCancel1\"]";
    String DOWNLOADVIDEO = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvDownloadVideo\"]";
    String DELETEPOST = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/txtDelete\"]";
    String COMMENTHED = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCommentHeader\"]";
    String CANCELBTNCMT = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llCloseComment\"]";
    String COPYLINK = "//android.widget.ImageView[@content-desc=\"Copy\"]";
    String LATESTOPTION = "(//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llMain\"])[3]";
    String SEARCHICON = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/cvSearch\"]/android.widget.ImageView";
    String BACKBUTTON = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivBack\"]";
    String SEARCHTEXTFORPROFILE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvEmptyRecent\"]";
    String CLEARTEXTSEARCH = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivClearSearchText\"]";
    String SEARCHFIELD = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etSearch\"]";
    String TOPTAB = "//android.widget.TextView[contains(@text, 'Top')]";
    String POSTTAB = "//android.widget.TextView[contains(@text, 'Post')]";
    String COMMUNITIES = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvSubText\" and @text=\"Community・test\"]";
    String doneBtn = "//XCUIElementTypeButton[@name=\"Next:\"]";
    String SEEALLRESULT = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llSeeResults\"]";
    String COMMUNITIESTAB = "//android.widget.TextView[contains(@text, 'Communities')]";
    String GROUPTAB = "//android.widget.TextView[contains(@text, 'Groups')]\n";
    String PROFILESTAB = "//android.widget.TextView[contains(@text, 'Profiles')]";
    String JOINBTN = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llRole\"]";
    String SHAREBTNCOMMUNITY = "//android.widget.ImageView[@content-desc=\"Share\"]";
    String MEMBERLABEL = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvMembers\"]";
    String MEMBERCOMCOUNT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNoOfCommunityMembers\"]";
    String GROUPLABEL = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvLoops\"]";
    String GROUPCOUNT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNoOfLoops\"]";
    String POSTLABEL = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvVideos\"]";
    String POSTCOUNT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNoOfVideos\"]";
    String GROUPTABCOM = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Groups\"]";
    String MEMBERTABCOM = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Members\"]";
    String ABOUTTABCOM = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"About\"]";
    String COMMUNITYNAME = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCommunityName\"]";
    String GROUPBTN = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cvLoop\"]/android.widget.LinearLayout";
    String IICONONGROUP = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llLoopInfo\"]";
    String GROUPHEADER = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvHeaderText\"]";
    String MENUICONGROUP = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivBurgerOptions\"]";
    String SHAREOPTION = "//android.widget.TextView[@text=\"Share\"]";
    String JOINAMEMBER = "//android.widget.TextView[@text=\"Join as Member\"]";
    String CANCELOPTION = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/txtCancel1\"]";
    String VISIBLETOEVERONETEXT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvPrivacy\"]";
    String CREATEDBYLABEL = "//android.widget.TextView[@text=\"Created by\"]";
    String OWNERNICHENAME = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvOwnerNickname\"]";
    String POSTEDINLABEL = "//android.widget.TextView[@text=\"Posted in\"]";
    String POSTEDNAME = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCommunityHandle\"]";
    String GROUPNAME = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvLoopName\"]";
    String TOTALPOSTCOUNTGORUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNoOfPosts\"]";
    String POSTLABELGROUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNoOfPosts\"]";
    String TOTALMEMBERCOUT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNoOfPosts\"]";
    String MEMEBERLABELGROUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCollaborators\"]";
    String BELLICONGROUP = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivBell\"]";
    String JOINAMEMBERGROUP = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/llJoinAsCollaborator\"]";
    String SHAREBTNGROUP = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/llShareLoop\"]/android.widget.LinearLayout/android.widget.ImageView";
    String POSTTABGROUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Posts\"]";
    String MEMBERTABGROUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Members\"]";
    String GENERATEBTN = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvGenerate\"]";
    String CREATECOMMUNITYBTN = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnPublish\"]";
    String CREATEAGROUP = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnCreateNewLoop\"]";
    String CREATEMANUALLY = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnCreateManually\"]";
    String GROUPNAMEFIELD = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\" and @text=\"Try a topic, theme, or idea.\"]";
    String GROUPDECRIPTION = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\" and @text=\"Tell your viewers what your conversation will be about.\"]";
    String RECORDAPOST = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cardRecordPost\"]";
    String UPLOADBTN = "//android.widget.TextView[@text=\"Upload\"]\n";
    String CAMERAROLL = "//android.widget.TextView[@text=\"Camera Roll\"]\n";
    String CREATECOMMUNITYOPTION = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llCreateCommunity\"]";
    String COMMUNITYNAMEFIELDCREATE = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\"]";
    String CAMERABACKBTN = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llBottomLayoutCamera\"]/android.widget.LinearLayout[3]";
    String CAMERABACKBTN1 = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/imgSwitchBg\"]";
    String CAMERABACKBTN2 = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/img_switch_camera\"]";

    String PLAYANDPAUSEVIDEOBTN = "//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/flRecordButton\"]";
    String PAUSEBTN = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/img_circle2\"]";
    String PAUSEBTN2 = "//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/flRecordButton\"]";
    String PAUSEBTN3 = "//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/flRecordMain\"]";
    String SAVEVIDEOBTN = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivRecordDone\"]";
    String NEXTBTN = "//android.widget.Button[@text=\"Next\"]\n";
    String POSTBTN = "//android.widget.Button[@text=\"Post\"]\n";
    String DONEBTN = "//android.widget.Button[@text=\"Done\"]\n";
    String AUTOCREATECOM = "//android.widget.TextView[@text=\"Auto Create\"]";
    String AUTOCREATECOM2 = "//android.widget.TextView[@text=\"Auto Create\"]";

    String DIGITALADDVANDTARGET = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCommunityCategory\" and @text=\"Digital Advertising and Targeting\"]";
    String SKIPBTN = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvSkip\"]";
    String CREATECOMMUNITYAUTO = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnPublish\"]";
    String CREATEAGRIUPAUTO = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnCreateNewLoop\"]";
    String AUTOCREATEGROUPBTN = "//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/flAutoCreate\"]";
    String TAXATIONONCRYPTO = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/label_txt\" and @text=\"Description\"]";
    String WHOCREATEGROUPS = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llWhoCanCreateLoops\"]/android.widget.LinearLayout";
    String ALLMEMBER = "(//android.widget.ImageView[@content-desc=\"Go next\"])[1]";
    String ADMINS = "(//android.widget.ImageView[@content-desc=\"Go next\"])[2]";
    String COMMUNITYTYPE = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llCommunityType\"]/android.widget.LinearLayout";
    String PUBLIC = "(//android.widget.ImageView[@content-desc=\"Go next\"])[1]";
    String PRIVATE = "(//android.widget.ImageView[@content-desc=\"Go next\"])[2]";
    String BANNER = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivBanner\"]";
    String PROFILEIMAGE = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivProfile\"]";
    String PURPOSEOFTHECOMMUNITY = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\" and @text=\"abc\"]";
    String LOGINORSIGNUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvHeader\"]";
    String SENDYOUCODE = "//android.widget.TextView[@text=\"We'll send you a code to log in or create an account.\"]";
    String CONTINUEWITHGOOGLE = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cvLoginWithGoogle\"]/android.widget.LinearLayout";
    String CONTINUEWITHBRAND = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnBrandLogin\"]";
    String PROFILE = "(//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivProfile\"])[3]";
    String LOGOUTBUTTON = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llLogout\"]";
    String LOGOUTTEXT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_title\"]";
    String CANCEL = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_btn_cancel\"]";
    String LOGOUT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_btn_yes\"]";
    String DAILOGMESSAGE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_message\"]";
    String VIEWPROFILE = "//android.widget.TextView[@text=\"View profile\"]";
    String ACCOUNTSETTINGS = "//android.widget.TextView[@text=\"Account Settings\"]";
    String USERNAME = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvUserName\"]";
    String EMAIL = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvEmailAddress\"]";
    String PHONE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvPhone\"]";
    String BIRTHDATE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvBirthdate\"]";
    String DELETEACCOUNT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvDeleteAccount\"]";
    String GROUPNAMETEXT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/label_txt\" and @text=\"Group Name\"]";
    String ENTERGROUPNAME = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\" and @text=\"Try a topic, theme, or idea.\"]";
    String DESCRIPTION = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/label_txt\" and @text=\"Description\"]";
    String CONVERSATION = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\" and @text=\"Tell your viewers what your conversation will be about.\"]";
    String WHOCANSEETHISGROUP = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llWhoCanSeeLoop\"]/android.widget.LinearLayout";
    String WHOCANPOSTINTHISGROUP = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llWhoCanPostInLoop\"]/android.widget.LinearLayout";
    String ADDMEMBERS = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llAddCollaborators\"]";
    String EVERYONE = "(//android.widget.ImageView[@content-desc=\"Go next\"])[1]";
    String GROUPMEMBERSONLY = "(//android.widget.ImageView[@content-desc=\"Go next\"])[2]";
    String ALLCOMMUNITYMEMBERS = "(//android.widget.ImageView[@content-desc=\"Go next\"])[1]";
    String GROUPMEMBERFORPOST = "(//android.widget.ImageView[@content-desc=\"Go next\"])[2]";
    String EMBED = "//android.widget.TextView[@text=\"Embed\"]";
    String EDITGROUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvEditDetails\"]";
    String DELETEGROUP = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNegativeAction1\"]";
    String VIDEOCOMMENT = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivVideoComment\"]";
    String ADDCOMMENT = "//android.widget.TextView[@text=\"Add a comment\"]";
    String POSTFORCOMMENT = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etTextComment\"]";
    String RECORDAUDIO = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivRecordAudio\"]";
    String POSTCOMMENT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvPostTextComment\"]";
    String DELETEVIDEOCOMMENT = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cardDeleteComment\"]/android.widget.ImageView";
    String POST = "//android.widget.TextView[@text=\"Post\"]";
    String DIALOGTITLE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_title\"]";
    String DIALOGMESSAGE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_message\"]";
    String DELETE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_btn_yes\"]";
    String CANCELFORDELETE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_btn_cancel\"]";
    String STOPRECORDING = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivAudioRecordDone\"]";
    String DELETERECORDING = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cardDeleteComment\"]/android.widget.ImageView";
    String ANIMATIONIMAGE = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/animationView\"]";
    String COMPLETEPROFILE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/btnEditProfile\"]";
    String SHAREPROFILE = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/llShareProfile\"]/android.widget.LinearLayout/android.widget.ImageView";
    String FULLNAME = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llFullName\"]";
    String BIO = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llBio\"]";
    String SOCIALPROFILE = "//android.widget.TextView[@text=\"Social Profiles\"]";
    String EDITNAME = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etText\"]";
    String DONE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvDone\"]";
    String TIKTOKUSERNAME = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etTiktokUsername\"]";
    String INSTAGRAMUSERNAME = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etInstagramUsername\"]";
    String TWITTERUSERNAME = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etTwitterUsername\"]";
    String YOUTUBEUSERNAME = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etYoutubeUsername\"]";
    String LINKEDINLINK = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etLinkedinUsername\"]";
    String SAVE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvSave\"]";
    String NOTIFICATIONHEADER = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvNotificationHeader\"]";
    String NOTIFICATION = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivNotifications\"]";
    String EDITUSERNAME = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/etText\"]";
    String THREEDOT = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivRTMoreOptions\"]";
    String JOINASMEMBER = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvJoinAsCollaborator\"]";
    String GROUPDETAILS = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvRTDetails\"]";
    String AUDIO = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Audio\"]";
    String TEXTBUTTON = "//android.view.View[@resource-id=\"com.begenuin.vishalnimralqa:id/viewRight\"]";
    String TAPANYWHERE = "//android.widget.TextView[@text=\"Tap anywhere to start typing\"]";
    String STARTTYPING = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvHint\"]";
    String TYPETEXT = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/editVideoText\"]";
    String SCALE = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivScale\"]";
    String ONEXSCALE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvScale1X\"]";
    String TWOXSCALE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvScale2X\"]";
    String FOURXSCALE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvScale4X\"]";
    String TIMER = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivTimer\"]";
    String THREESECOND = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvTimer3Sec\"]";
    String TENSECOND = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvTimer10Sec\"]";
    String STARTCOUNTDOWN = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnStartCountDown\"]";
    String USERISSUES = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvUserIssue\"]";
    String COMMUNITYISSUE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCommunityIssue\"]";
    String TOPICISSUE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvTopicIssue\"]";
    String OTHERISSUE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvOtherIssue\"]";
    String UNDONOTINTERESTED = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/txtNotInterested\"]";
    String INAPPROPRIATECONTENT = "//android.widget.RadioButton[@resource-id=\"com.begenuin.vishalnimralqa:id/rb1\"]";
    String NONPROFESSIONALCONTENT = "//android.widget.RadioButton[@resource-id=\"com.begenuin.vishalnimralqa:id/rb2\"]";
    String SPAM = "//android.widget.RadioButton[@resource-id=\"com.begenuin.vishalnimralqa:id/rb3\"]";
    String VIOLENT = "//android.widget.RadioButton[@resource-id=\"com.begenuin.vishalnimralqa:id/rb4\"]";
    String OTHER = "//android.widget.RadioButton[@resource-id=\"com.begenuin.vishalnimralqa:id/rb5\"]";
    String SUBMIT = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnContinue\"]";
    String OKAY = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnOkay\"]";
    String NAMEOFCOMMUNITY = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCommunityName\"]";
    String GROUPS = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Groups\"]";
    String MEMBERS = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Members\"]";
    String ABOUT = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"About\"]";
    String SAHREBTN = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/llShareCommunity\"]/android.widget.LinearLayout";
    String LEAVE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/dialog_btn_yes\"]";
    String WALLET = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvWalletAmount\"]";
    String CURRENTBALANCE = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvCurrentBalance\"]";
    String REWARDCREDIT = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cardViewRewardCredits\"]/android.widget.LinearLayout";
    String CASHEARNING = "//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cardViewCashEarnings\"]/android.widget.LinearLayout";
    String REDEEM = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnRedeem\"]";
    String CASHEARNINGS = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Cash earnings\"]";
    String REWARDCREDITS = "//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tabText\" and @text=\"Reward credits\"]";
    String WITHDRAW = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnWithdraw\"]";
    String GROUP = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llLoopIcon\"]";
    String INFO = "(//android.widget.ImageView[@content-desc=\"Go back\"])[2]";
    String ENABLENOTIFICATION = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivBell\"]";
    String DISABLENOTIFICATION = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/lottieBell\"]";
    String VIEWGROUP = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/appBarLayout\"]/android.widget.FrameLayout/android.view.ViewGroup";
    String SELECTTOPIC = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/appBarLayout\"]/android.widget.FrameLayout/android.widget.RelativeLayout";
    String ONETOPIC = "(//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llMain\"])[1]/android.widget.LinearLayout";
    String SECONDTOPIC = "(//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llMain\"])[2]/android.widget.LinearLayout";
    String NEXTFORGROUP = "//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llBottomLayout\"]";
    String QUESTIONANDANSWER = "//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivQuestion\"]";
    String ADDQUESTION = "//android.widget.TextView[@text=\"Add question\"]";
    String WRITEQUESTION = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edtAddQuestion\"]";
    String RECORDANSWER = "//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/flRecordAnswer\"]/android.widget.ImageView[1]";
    String CONTEXT = "//android.widget.EditText[@resource-id=\"com.begenuin.vishalnimralqa:id/edit_text\"]";
    String CAROUSEL = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnCarousel\"]";
    String STANDARDWALL = "//android.widget.Button[@resource-id=\"com.begenuin.vishalnimralqa:id/btnStandardWall\"]";
    String CUSTOM = "(//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/navigation_bar_item_icon_view\"])[4]";
    String CLICKONPOST="(//android.widget.ImageView[@content-desc=\"Genuin SDK\"])[4]";
    String UPLOADINPROGRESS="//android.widget.ProgressBar[@resource-id=\"com.begenuin.vishalnimralqa:id/ivUploadProgress\"]";
    String DOUBLETAPONVIDEOS="//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvGestureText\"]";
    String TRANSCRIPTION="//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivCC\"]";
    String SELECTTRANSCRIPTION="//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvTranscribedText\"]";
    String SHARETRANSCRIPTION="//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/cvShare\"]/android.widget.LinearLayout";
    String COPYLINKFORTRANSCRIPTION="//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llCopyLink\"]/androidx.cardview.widget.CardView";
    String SHARETO="//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llShareTo\"]/androidx.cardview.widget.CardView/android.widget.ImageView";
    String MESSAGE="//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llMessage\"]/androidx.cardview.widget.CardView";
    String TOURCH="//android.widget.LinearLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llBottomLayoutCamera\"]/android.widget.LinearLayout[1]";
    String SWIPUP="//android.widget.TextView[@resource-id=\"com.begenuin.vishalnimralqa:id/tvGestureText\"]";
    String BACKTOCOMMENT="//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/ivCollapse\"]";
    String COMMUNITYPOST = "(//android.widget.ImageView[@resource-id='com.begenuin.vishalnimralqa:id/ivThumbnail'])[3]";
    String SOUND="//android.widget.RelativeLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/llRTAnimLayout\"]";
    String HIGHLIGHT="//android.widget.ImageView[@content-desc=\"Genuin SDK\"]";
    String PIPMODE="//android.widget.TextView[@text=\"This video is playing in picture in picture view\"]";
    String SELECTPOST="(//android.widget.FrameLayout[@resource-id=\"com.begenuin.vishalnimralqa:id/exo_subtitles\"])[1]/android.view.View";

    public void VerifyHeader() {
        common.pause(3);
        common.isElementVisible(driver, By.xpath(SDKHEADER), 10);  // Pass the driver and locator
    }

    public void hideKeyboard() {
        UserAction action = new UserAction();
        if (driver.findElements(By.xpath(doneBtn)).size() > 0) {
            action.click(driver, doneBtn, "done Button");
        } else {
            driver.hideKeyboard();
        }
    }

    public void ClickOnCommunityFeed() {
        action.click(driver, CommunityFeed, "Community feed");
    }

    public void StandardViewForCommunity() {
        common.logPrint("Step ::Verify standard view");
    }

    public void ClickOnCarousel() {
        action.click(driver, CarouselButton, "Carousel");
    }

    public void CarouselView() {
        long startTime = common.startTime();
        action.waitForElement(driver, CarouselVideoView);
        common.endTime(startTime, "Carousel View for Community");
        action.verifyElementIsDisplayed(driver, CarouselVideoView);
        common.logPrint("Step :: Verify Carousel View");
    }

    public void ClickOnBrandFeed() {
        action.click(driver, BrandFeedButton, "Brand Feed");
        common.logPrint("Step :: Verify brand View");
    }

    public void BrandFeedView() {
        long startTime = common.startTime();
//        action.waitForElement(driver, BrandFeedView);
        common.endTime(startTime, "Brand feed view for Community");
//        action.verifyElementIsDisplayed(driver, BrandFeedView);
    }

    public void ClickOnLoadSDK() {
        action.click(driver, LoadSDK, "Load SDK");
    }

    public void ClickOnHome() {
        common.pause(10);
        action.waitForElement(driver, HomeButton);
        action.click(driver, HomeButton, "Home Button");
        common.pause(3);
    }

    public void ClickOnCreateCommunity() {
        System.out.println("Checking if BecomeACreator is visible...");
        if (action.isElementVisible(driver, BecomeACreator)) {
            System.out.println("BecomeACreator is visible.");
            common.pause(10);
            action.click(driver, BecomeACreator, "Become A Creator");
            action.waitForElement(driver, BecomeACreatorTab);
            action.click(driver, BecomeACreatorTab, "Become A Creator Tab");
            //action.doubleClick(driver, BecomeACreatorTab, "Become A Creator Tab");
            //action.click(driver, BecomeACreator, "Become A Creator");
            action.waitForElement(driver, UsePhoneNumberField);
            action.click(driver, UsePhoneNumberField, "Use phone number instead");
            common.pause(5);
            action.enter_text(driver, PhoneField, "9904204070");
            action.waitForElement(driver, Continue);
            action.click(driver, Continue, "Continue");
            action.waitForElement(driver, EnterCode);
            action.enter_text(driver, EnterCode, "123456");
            //action.waitForElement(driver, VerifyTab);
            //action.click(driver, VerifyTab, "Verify button");
            common.pause(10);
            System.out.println("Checking if Close Button is visible...");
            if (action.isElementVisible(driver, CloseButton)) {
                System.out.println("Close Button Visible - This is a BUG.");
                common.pause(4);
                action.clickImage(driver, CloseButton);
            }
            common.pause(5);
            action.waitForElement(driver, Home1);
            action.click(driver, Home1, "Home Tab");
            action.waitForElement(driver, CreateCommunity);
            action.click(driver, CreateCommunity, "Create Community");
        } else {
            System.out.println("BecomeACreator is not visible. Clicking CreateCommunity.");
            common.pause(10);
            action.touchTap(driver, CreateCommunity, "Create Community");
        }
    }

    public void ClickOnCreateManually() {
        common.pause(5);
        action.click(driver, CreateManually, "Create manually");
    }

    public void CreateCommunity() {
        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);
        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
//        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void VerifySpark() {
        action.waitForElement(driver, Spark);
        action.isElementVisible(driver, Spark);
        action.click(driver, Spark, "Spark");
        common.pause(3);
        action.click(driver, AfterSpark, "after click on spark");
        common.pause(5);
        action.isElementVisible(driver, AfterSpark);
    }

    public void BecomeACretor() {
        if (action.isElementVisible(driver, BecomeACreator)) {
            System.out.println("BecomeACreator is visible.");
            action.click(driver, BecomeACreator, "Become a Creator");
            action.waitForElement(driver, BecomeACreatorTab);
            action.click(driver, BecomeACreatorTab, "Become a Creator Tab");

            action.waitForElement(driver, EmailField);
//            action.click(driver, EmailField, "Email Field");
//            common.pause(5);
//            action.enter_text(driver, EmailField, "ronak56@yopmail.com");
            action.waitForElement(driver, UsePhoneNumberField);
            action.click(driver, UsePhoneNumberField, "Use phone number instead");
            common.pause(5);
            action.enter_text(driver, PhoneField, "9904204070");

            action.waitForElement(driver, Continue);
            action.click(driver, Continue, "Continue");
            action.waitForElement(driver, EnterCode);
            action.enter_text(driver, EnterCode, "123456");
            common.pause(10);
            System.out.println("Checking if Close Button is visible...");
            if (action.isElementVisible(driver, CloseButton)) {
                System.out.println("Close Button Visible - This is a BUG.");
                common.pause(4);
                action.clickImage(driver, CloseButton);
            }

        } else {
            System.out.println("BecomeACreator is not visible. Clicking CreateCommunity.");
            action.click(driver, HomeTab, "Home Tab");
        }
    }

    public void checkPopularFields() {

        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "Click on the home dropdown");

        BecomeACretor();

        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "Click on the home dropdown");

        action.waitForElement(driver, POPULAROPTION);
        action.click(driver, POPULAROPTION, "Select popular option from dropdown");

        common.pause(4);
        common.logPrint("Step::Verify Repost button is visible");
        action.waitForElement(driver, REPOSTBTN);
        action.verifyElementIsDisplayed(driver, REPOSTBTN);
        action.click(driver, REPOSTBTN, "repost button");
        By roundTableDesc = By.xpath("//android.widget.TextView[@resource-id='com.begenuin.vishalnimralqa:id/tvRoundTableDesc']");
        boolean isElementVisible = action.waitForElementWithTimeout(driver, roundTableDesc, 10);

        if (isElementVisible) {
            common.logPrint("'tvRoundTableDesc' is now visible.");
            //action.verifyElementIsDisplayed(driver, roundTableDesc.toString());
        } else {
            common.logPrint("ERROR: 'tvRoundTableDesc' did not appear after clicking Repost button.");
        }

        common.pause(6);
        common.logPrint("Verify Repost header with plus icon is showing");
        action.click(driver, REPOSTPLUSICON, "Plus Icon.");
        action.waitForElement(driver, REPOSTHEADER);
        String repostHeaderName = action.findElementByXpath(driver, REPOSTHEADER).getText();
        common.assertTwoValuesAreEqual(repostHeaderName, "Repost");

        common.logPrint("Step:: Click on back button");
        action.waitForElement(driver, CLOSEBTN);
        action.click(driver, CLOSEBTN, "back button");

        if (action.isElementVisible(driver, SPARCKBTNFILL)) {
            action.click(driver, SPARCKBTNFILL, "spark button");
        } else {
            action.click(driver, SPARCKBTNEMPTY, "spark button");
        }

        common.logPrint("Verify spark counts are showing");
        common.logPrint("Spark counts are showing properly: " + action.findElementByXpath(driver, SPARKCOUNT).getText());

        common.logPrint("Step::Verify comment button is visible");
        action.waitForElement(driver, COMMENTBTN);
        action.verifyElementIsDisplayed(driver, COMMENTBTN);

        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "comment button");

        common.logPrint("Step::Verify comment button is visible");
        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, CANCELBTNCMT);
        action.click(driver, CANCELBTNCMT, "cancel button");

        common.logPrint("Step:: Verify the comment count is showing");
        common.logPrint("Comment count is showing: ");
        action.waitForElement(driver, COMMENTCOUNT);
        action.verifyElementIsDisplayed(driver, COMMENTCOUNT);

        common.logPrint("Step::Verify share button is visible");
        action.waitForElement(driver, SHAREBTN);
        action.verifyElementIsDisplayed(driver, SHAREBTN);

        action.waitForElement(driver, SHAREBTN);
        action.verifyElementIsDisplayed(driver, SHAREBTN);
        action.click(driver, SHAREBTN, "Share button");

        common.logPrint("Step::Verify share link is visible");
        action.waitForElement(driver, COPYLINK);

        driver.navigate().back();

        common.logPrint("Step::Verify more button is visible");
        action.waitForElement(driver, MOREBTN);
        action.verifyElementIsDisplayed(driver, MOREBTN);

        action.waitForElement(driver, MOREBTN);
        action.click(driver, MOREBTN, "more button");

        common.logPrint("Step::Verify Group detail option is visible");
        action.waitForElement(driver, GROUPDETAIL);
        action.verifyElementIsDisplayed(driver, GROUPDETAIL);

        common.logPrint("Step::Verify Not Interested option is visible");
        action.waitForElement(driver, NOTINTERSTED);
        action.verifyElementIsDisplayed(driver, NOTINTERSTED);

        common.logPrint("Step::Verify report post option is visible");
        action.waitForElement(driver, REPORTPOST);
        action.verifyElementIsDisplayed(driver, REPORTPOST);

        common.logPrint("Step::Verify cancel option is visible");
        action.waitForElement(driver, CANCELBTN);
        action.verifyElementIsDisplayed(driver, CANCELBTN);

        action.waitForElement(driver, CANCELBTN);
        action.click(driver, CANCELBTN, "Cancel button");

        common.logPrint("Step::Verify group detail button is visible");
        action.waitForElement(driver, GROUPDETAILBTN);
        action.verifyElementIsDisplayed(driver, GROUPDETAILBTN);

        common.logPrint("Step::Verify community button is visible");
        action.waitForElement(driver, COMMUNITYBTN);
        action.verifyElementIsDisplayed(driver, COMMUNITYBTN);
    }

    public void checkLatestFields() {

        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "Click on the home dropdown");

        BecomeACretor();

        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "Click on the home dropdown");

        action.waitForElement(driver, LATESTOPTION);
        action.click(driver, LATESTOPTION, "Select Latest option from dropdown");

        common.logPrint("Step::Verify Repost button is visible");
        action.waitForElement(driver, REPOSTBTN);
        common.pause(10);
        action.verifyElementIsDisplayed(driver, REPOSTBTN);
        action.click(driver, REPOSTBTN, "repost button");

        action.waitForElement(driver, REPOSTPLUSICON);
        action.click(driver, REPOSTPLUSICON, "repostpost button");
        action.click(driver, REPOSTPLUSICON, "Repost Button");

        common.logPrint("Verify Repost header is showing");
        action.waitForElement(driver, REPOSTHEADER);
        String repostHeaderName = action.findElementByXpath(driver, REPOSTHEADER).getText();
        common.assertTwoValuesAreEqual(repostHeaderName, "Repost");

        common.logPrint("Step:: Click on back button");
        action.waitForElement(driver, CLOSEBTN);
        action.click(driver, CLOSEBTN, "On back button");

        if (action.isElementVisible(driver, SPARCKBTNFILL)) {
            action.click(driver, SPARCKBTNFILL, "on spark button");
        } else {
            action.click(driver, SPARCKBTNEMPTY, "on spark button");
        }

        common.logPrint("Verify spark counts are showing");
        common.logPrint("Spark counts are showing properly: " + action.findElementByXpath(driver, SPARKCOUNT).getText());

        common.logPrint("Step::Verify comment button is visible");
        action.waitForElement(driver, COMMENTBTN);
        action.verifyElementIsDisplayed(driver, COMMENTBTN);

        common.logPrint("Step:: Verify the comment count is showing");
        common.logPrint("Comment count is showing: " + action.findElementByXpath(driver, COMMENTCOUNT).getText());

        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "On comment button");

        common.logPrint("Step::Verify comment button is visible");
        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, CANCELBTNCMT);
        action.click(driver, CANCELBTNCMT, "On cancel button");

        common.logPrint("Step::Verify share button is visible");
        action.waitForElement(driver, SHAREBTN);
        action.verifyElementIsDisplayed(driver, SHAREBTN);

        action.waitForElement(driver, SHAREBTN);
        action.click(driver, SHAREBTN, "On Share button");

        common.logPrint("Step::Verify share button is visible");
        action.waitForElement(driver, COPYLINK);
        action.verifyElementIsDisplayed(driver, COPYLINK);

        driver.navigate().back();

        common.logPrint("Step::Verify spark button is visible");
        action.waitForElement(driver, MOREBTN);
        action.verifyElementIsDisplayed(driver, MOREBTN);

        action.waitForElement(driver, MOREBTN);
        action.click(driver, MOREBTN, "On more button");

        common.logPrint("Step::Verify Group detail option is visible");
        action.waitForElement(driver, GROUPDETAIL);
        action.verifyElementIsDisplayed(driver, GROUPDETAIL);

        common.logPrint("Step::Verify Report Post option is visible");
        action.waitForElement(driver, REPORTPOST);
        action.verifyElementIsDisplayed(driver, REPORTPOST);

        common.logPrint("Step::Verify DELETE post option is visible");
        action.waitForElement(driver, DELETEPOST);
        action.verifyElementIsDisplayed(driver, DELETEPOST);

        common.logPrint("Step::Verify cancel option is visible");
        action.waitForElement(driver, CANCELBTN);
        action.verifyElementIsDisplayed(driver, CANCELBTN);

        action.waitForElement(driver, CANCELBTN);
        action.click(driver, CANCELBTN, "Cancel button");

    }

    public void verifySearchFunctionality() {

        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "the home dropdown.");
        BecomeACretor();

        action.waitForElement(driver, SEARCHICON);
        action.click(driver, SEARCHICON, "the search icon.");

        common.logPrint("Step:: Verify back button is displayed.");
        action.waitForElement(driver, BACKBUTTON);
        action.isElementVisible(driver, BACKBUTTON);

        String searchText = common.generateRandomChar(5);
        common.logPrint("Step::Enter text in the search field.");
        action.waitForElement(driver, SEARCHFIELD);
        action.enter_text(driver, SEARCHFIELD, searchText);
        common.logPrint("Search text value is: " + searchText);

        action.waitForElement(driver, SEEALLRESULT);
        action.click(driver, SEEALLRESULT, "the See all the result text.");

        common.logPrint("Verify clear text icon is visible.");
        action.waitForElement(driver, CLEARTEXTSEARCH);
        action.isElementVisible(driver, CLEARTEXTSEARCH);

        common.logPrint("Step::Verify Top tab is visible on the search page.");
        action.waitForElement(driver, TOPTAB);
        action.isElementVisible(driver, TOPTAB);
        action.click(driver, TOPTAB, "the Top tab.");

        common.pause(2);

        common.logPrint("Step::Verify the post tab is visible.");
        action.waitForElement(driver, POSTTAB);
        action.isElementVisible(driver, POSTTAB);
        action.click(driver, POSTTAB, "the Post tab");

        common.pause(2);

        common.logPrint("Step::Verify communities tab is visible.");
        action.waitForElement(driver, COMMUNITIESTAB);
        action.isElementVisible(driver, COMMUNITIESTAB);
        action.click(driver, COMMUNITIESTAB, "the Communities tab");

        common.pause(2);

        common.logPrint("Step::Verify group tab is visible.");
        action.waitForElement(driver, GROUPTAB);
        action.isElementVisible(driver, GROUPTAB);
        action.click(driver, GROUPTAB, "the Group tab");

        common.pause(2);

        common.logPrint("Step::Verify profiles tab is visible.");
        action.waitForElement(driver, PROFILESTAB);
        action.isElementVisible(driver, PROFILESTAB);
        action.click(driver, PROFILESTAB, "the Profiles tab");

    }

    public void searchWithProfileName() {

        common.logPrint("Search with the profile name");

        String searchTextProfile = common.generateRandomChar(5);
        action.waitForElement(driver, SEARCHFIELD);
        action.click(driver, CLEARTEXTSEARCH, "clear text");
        action.enter_text(driver, SEARCHFIELD, searchTextProfile);
        common.logPrint("Search text value is: " + searchTextProfile);

        action.waitForElement(driver, SEEALLRESULT);
        action.click(driver, SEEALLRESULT, "see all the result");
    }

    public void searchWithKeyword() {

        common.logPrint("Search with the keywords");
        action.waitForElement(driver, SEARCHFIELD);
        action.click(driver, CLEARTEXTSEARCH, "clear text");
        String searchTextKeyword = common.generateRandomChar(5);
        action.enter_text(driver, SEARCHFIELD, searchTextKeyword);
        common.logPrint("Search text value is: " + searchTextKeyword);

        action.waitForElement(driver, SEEALLRESULT);
        action.click(driver, SEEALLRESULT, "see all the result");

    }

    public void searchWithTopicName() {

        common.logPrint("Search with the topic name");
        action.waitForElement(driver, SEARCHFIELD);
        String searchTextTopic = common.generateRandomChar(5);
        action.click(driver, CLEARTEXTSEARCH, "clear text");
        action.enter_text(driver, SEARCHFIELD, searchTextTopic);
        common.logPrint("Search text value is: " + searchTextTopic);

        action.waitForElement(driver, SEEALLRESULT);
        action.click(driver, SEEALLRESULT, "see all the result");

    }

    public void Community() {

        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "the home dropdown");

        BecomeACretor();

        action.waitForElement(driver, COMMUNITYBTN);
        action.click(driver, COMMUNITYBTN, "the community");

        action.waitForElement(driver, COMMUNITYNAME);
        common.logPrint("Community name is: " + action.findElementByXpath(driver, COMMUNITYNAME).getText());

        common.logPrint("Step:: Verify the join button is visible");
        action.waitForElement(driver, JOINBTN);
        action.verifyElementIsDisplayed(driver, JOINBTN);

        common.logPrint("Step:: Verify the Share button is visible");
        action.waitForElement(driver, SHAREBTNCOMMUNITY);
        action.verifyElementIsDisplayed(driver, SHAREBTNCOMMUNITY);

        common.logPrint("Step:: Verify the Member label is visible");
        action.waitForElement(driver, MEMBERLABEL);
        action.verifyElementIsDisplayed(driver, MEMBERLABEL);

        common.logPrint("Step:: Verify the total number of Member");
        action.waitForElement(driver, MEMBERCOMCOUNT);
        common.logPrint("Total member is: " + action.findElementByXpath(driver, MEMBERCOMCOUNT).getText());

        common.logPrint("Step:: Verify the group label is visible");
        action.waitForElement(driver, GROUPLABEL);
        action.verifyElementIsDisplayed(driver, GROUPLABEL);

        common.logPrint("Step:: Verify the total number of group");
        action.waitForElement(driver, GROUPCOUNT);
        common.logPrint("Total group is: " + action.findElementByXpath(driver, GROUPCOUNT).getText());

        common.logPrint("Step:: Verify the Post label is visible");
        action.waitForElement(driver, POSTLABEL);
        action.verifyElementIsDisplayed(driver, POSTLABEL);

        common.logPrint("Step:: Verify the total number of Post");
        action.waitForElement(driver, POSTCOUNT);
        common.logPrint("Total group is: " + action.findElementByXpath(driver, POSTCOUNT).getText());
    }

    public void groupTabOnCommunityPage() {

        common.logPrint("Step:: Click on the group tab");
        action.waitForElement(driver, GROUPTABCOM);
        action.click(driver, GROUPTABCOM, "Group tab on community");

    }

    public void memberTabOnCommunityPage() {

        common.logPrint("Step:: Click on the member tab");
        action.waitForElement(driver, MEMBERTABCOM);
        action.click(driver, MEMBERTABCOM, "Member tab on community");

    }

    public void aboutTabOnCommunityPage() {

        common.logPrint("Step:: Click on the about tab");
        action.waitForElement(driver, ABOUTTABCOM);
        action.click(driver, ABOUTTABCOM, "about tab on community");

    }

    public void verifyGroupDetail() {

        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "Click on the home dropdown");

        BecomeACretor();

        common.logPrint("Step:: Click on the group button");
        action.waitForElement(driver, GROUPBTN);
        action.click(driver, GROUPBTN, "Group button");

        action.waitForElement(driver, IICONONGROUP);
        action.click(driver, IICONONGROUP, "I icon");

        common.logPrint("Step:: Verify the group header is visible");
        action.waitForElement(driver, GROUPHEADER);
        common.logPrint("Group header name is visible: " + action.findElementByXpath(driver, GROUPHEADER).getText());
        action.verifyElementIsDisplayed(driver, GROUPHEADER);

        common.logPrint("Step:: Verify the menu icon for group is visible");
        action.waitForElement(driver, MENUICONGROUP);
        action.verifyElementIsDisplayed(driver, MENUICONGROUP);
        common.pause(5);
        action.click(driver, MENUICONGROUP, "3 dots menu");

        common.logPrint("Step:: Verify menu options is visible");
        common.logPrint("Step:: Verify share option is showing");
        action.waitForElement(driver, SHAREOPTION);
        action.isElementVisible(driver, SHAREOPTION);

//        common.logPrint("Step:: Verify Embed option is showing");
//        action.waitForElement(driver, EMBED);
//        action.isElementVisible(driver,EMBED);
//
//        common.logPrint("Step:: Verify Edit Group option is showing");
//        action.waitForElement(driver,EDITGROUP );
//        action.isElementVisible(driver,EDITGROUP);
//
//        common.logPrint("Step:: Verify Delete Group option is showing");
//        action.waitForElement(driver,DELETEGROUP );
//        action.isElementVisible(driver,DELETEGROUP);

        common.logPrint("Step:: Verify Cancel button is showing");
        action.waitForElement(driver, CANCELOPTION);
        action.isElementVisible(driver, CANCELOPTION);

        action.click(driver, CANCELOPTION, "Cancel button");

        common.logPrint("Step:: Verify the group name is visible");
        action.waitForElement(driver, GROUPNAME);
        common.logPrint("Group name is: " + action.findElementByXpath(driver, GROUPNAME).getText());

        common.logPrint("Step:: Verify Visible to everyone text is visible");
        action.waitForElement(driver, VISIBLETOEVERONETEXT);
        common.logPrint("Text is showing: " + action.findElementByXpath(driver, VISIBLETOEVERONETEXT).getText());

        common.logPrint("Step:: Verify created by label is showing");
        action.isElementVisible(driver, CREATEDBYLABEL);

        common.logPrint("Step:: Verify Created by name is visible");
        action.waitForElement(driver, OWNERNICHENAME);
        String createdByName = action.findElementByXpath(driver, OWNERNICHENAME).getText();
        common.logPrint("Created by name is: " + createdByName);

        common.logPrint("Step:: Verify Posted in label is showing");
        action.isElementVisible(driver, POSTEDINLABEL);

        common.logPrint("Step:: Verify posted name is visible");
        action.waitForElement(driver, POSTEDNAME);
        String postedByName = action.findElementByXpath(driver, OWNERNICHENAME).getText();
        common.logPrint("Posted in name is: " + postedByName);

        common.logPrint("Step:: Verify the total post count is visible");
        action.waitForElement(driver, TOTALPOSTCOUNTGORUP);
        common.logPrint("Total posts count: " + action.findElementByXpath(driver, TOTALPOSTCOUNTGORUP).getText());

        common.logPrint("Step:: Verify the post label is visible");
        action.waitForElement(driver, POSTLABELGROUP);
        action.verifyElementIsDisplayed(driver, POSTLABELGROUP);

        common.logPrint("Step:: Verify the total member count is visible");
        action.waitForElement(driver, TOTALMEMBERCOUT);
        common.logPrint("Total members: " + action.findElementByXpath(driver, TOTALMEMBERCOUT).getText());

        common.logPrint("Step:: Verify the member label is visible");
        action.waitForElement(driver, MEMEBERLABELGROUP);
        action.verifyElementIsDisplayed(driver, MEMEBERLABELGROUP);

//        common.logPrint("Step:: Verify the bell icon is visible");
//        action.waitForElement(driver, BELLICONGROUP);
//        action.verifyElementIsDisplayed(driver, BELLICONGROUP);

//        common.logPrint("Step:: Verify the join as collaborator button is visible");
//        action.waitForElement(driver, JOINAMEMBERGROUP);
//        action.verifyElementIsDisplayed(driver, JOINAMEMBERGROUP);

        common.logPrint("Step:: Verify the share button is visible");
        action.waitForElement(driver, SHAREBTNGROUP);
        action.verifyElementIsDisplayed(driver, SHAREBTNGROUP);
    }

    public void postTabOnGroupPage() {

        common.logPrint("Step:: Click on the post tab");
        action.waitForElement(driver, POSTTABGROUP);
        action.click(driver, POSTTABGROUP, "Post tab on group page");
    }

    public void memberTabOnGroupPage() {

        common.logPrint("Step:: Click on the member tab");
        action.waitForElement(driver, MEMBERTABGROUP);
        action.click(driver, MEMBERTABGROUP, "Member tab on group page");
    }

    public void uploadPost() {

        common.logPrint("Step:: Click on the home dropdown");
        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "create community");

        BecomeACretor();

        common.logPrint("Step:: Click on the home dropdown");
        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "create community");

        action.waitForElement(driver, CREATECOMMUNITYOPTION);
        action.click(driver, CREATECOMMUNITYOPTION, "create community");

        common.pause(2);

        if (action.isElementVisible(driver, CREATEMANUALLY)) {
            action.waitForElement(driver, CREATEMANUALLY);
            action.click(driver, CREATEMANUALLY, "create Manually");
        }

        String communityName = common.generateRandomChar(10);
        common.logPrint("Step:: Enter community name");
        action.waitForElement(driver, COMMUNITYNAMEFIELDCREATE);
        action.enter_text(driver, COMMUNITYNAMEFIELDCREATE, communityName);
        common.logPrint("Community name is: " + communityName);

        hideKeyboard();

        action.waitForElement(driver, GENERATEBTN);
        action.click(driver, GENERATEBTN, "generate button");

        common.pause(4);

        action.waitForElement(driver, CREATECOMMUNITYBTN);
        action.click(driver, CREATECOMMUNITYBTN, "create community");

        action.waitForElement(driver, CREATEAGROUP);
        action.click(driver, CREATEAGROUP, "create group");

        if (action.isElementVisible(driver, CREATEMANUALLY)) {
            action.waitForElement(driver, CREATEMANUALLY);
            action.click(driver, CREATEMANUALLY, "create Manually");
        }

        common.logPrint("Step:: Enter group name");
        String groupName = common.generateRandomChar(10);
        action.waitForElement(driver, GROUPNAMEFIELD);
        action.enter_text(driver, GROUPNAMEFIELD, groupName);
        common.logPrint("Entered group name is: " + groupName);

        common.logPrint("Step:: Enter group Description");
        String groupDescription = common.generateRandomChar(30);
        action.waitForElement(driver, GROUPDECRIPTION);
        action.enter_text(driver, GROUPDECRIPTION, groupDescription);
        common.logPrint("Group description is: " + groupDescription);

        action.waitForElement(driver, RECORDAPOST);
        action.click(driver, RECORDAPOST, "Record a video");

        common.pause(5);

        action.waitForElement(driver, CAMERABACKBTN1);
        action.click(driver, CAMERABACKBTN1, "back camera button");

        action.waitForElement(driver, PLAYANDPAUSEVIDEOBTN);
        action.click(driver, PLAYANDPAUSEVIDEOBTN, "Play video button");

        common.pause(4);

        action.waitForElement(driver, PAUSEBTN2);
        action.click(driver, PAUSEBTN2, "pause button");

        action.waitForElement(driver, SAVEVIDEOBTN);
        action.click(driver, SAVEVIDEOBTN, "Save button");

        action.waitForElement(driver, NEXTBTN);
        action.click(driver, NEXTBTN, "Next button");

        action.waitForElement(driver, POSTBTN);
        action.click(driver, POSTBTN, "Post button");

        action.waitForElement(driver, DONEBTN);
        action.click(driver, DONEBTN, "Done button");
    }

    public void createAutoCommunity() {

        common.logPrint("Step:: Click on the home dropdown");
        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "On create community");

        BecomeACretor();

        common.logPrint("Step:: Click on the home dropdown");
        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "On home dropdown");

        action.waitForElement(driver, CreateCommunity);
        action.click(driver, CreateCommunity, "on create community");

        common.pause(2);

        action.waitForElement(driver, AUTOCREATECOM);
        action.click(driver, AUTOCREATECOM, "on auto create");

//        action.waitForElement(driver, DIGITALADDVANDTARGET);
//        action.click(driver, DIGITALADDVANDTARGET,"Digital Advertising and Targeting");
//
//        action.waitForElement(driver, NEXTBTN);
//        action.click(driver, NEXTBTN,"on next button");
//
//        action.waitForElement(driver, SKIPBTN);
//        action.click(driver, SKIPBTN,"on skip button");
//
//        common.pause(7);
//
//        action.waitForElement(driver, CREATECOMMUNITYAUTO);
//        action.click(driver, CREATECOMMUNITYAUTO,"on create community button");
//
//        action.waitForElement(driver, CREATEAGRIUPAUTO);
//        action.click(driver, CREATEAGRIUPAUTO,"on create a group");
//
//        action.waitForElement(driver, AUTOCREATECOM);
//        action.click(driver, AUTOCREATECOM,"on auto create");
//
//        common.pause(7);
//
//        action.waitForElement(driver, TAXATIONONCRYPTO);
//        action.click(driver, TAXATIONONCRYPTO,"on topics");
//
//        action.waitForElement(driver, NEXTBTN);
//        action.click(driver, NEXTBTN,"on next button");
    }

    public void createPublicCommunityForAdmin() {
        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, COMMUNITYTYPE);
        action.click(driver, COMMUNITYTYPE, "Community Types");
        common.pause(5);

        action.waitForElement(driver, PUBLIC);
        action.verifyElementIsDisplayed(driver, PUBLIC);

        action.waitForElement(driver, PRIVATE);
        action.verifyElementIsDisplayed(driver, PRIVATE);
        common.pause(5);
        action.click(driver, PUBLIC, "Click on Public");

        action.waitForElement(driver, WHOCREATEGROUPS);
        action.verifyElementIsDisplayed(driver, WHOCREATEGROUPS);
        action.click(driver, WHOCREATEGROUPS, "Who can create Groups");
        common.pause(5);

        action.waitForElement(driver, ALLMEMBER);
        action.verifyElementIsDisplayed(driver, ALLMEMBER);

        action.waitForElement(driver, ADMINS);
        action.verifyElementIsDisplayed(driver, ADMINS);
        action.click(driver, ADMINS, "Click on Admin");
        common.pause(5);

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
//        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void createPublicCommunityForAllMembers() {
        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, COMMUNITYTYPE);
        action.click(driver, COMMUNITYTYPE, "Community Types");
        common.pause(5);

        action.waitForElement(driver, PUBLIC);
        action.verifyElementIsDisplayed(driver, PUBLIC);

        action.waitForElement(driver, PRIVATE);
        action.verifyElementIsDisplayed(driver, PRIVATE);
        common.pause(5);
        action.click(driver, PUBLIC, "Click on Public");

        action.waitForElement(driver, WHOCREATEGROUPS);
        action.verifyElementIsDisplayed(driver, WHOCREATEGROUPS);
        action.click(driver, WHOCREATEGROUPS, "Who can create Groups");
        common.pause(5);

        action.waitForElement(driver, ALLMEMBER);
        action.verifyElementIsDisplayed(driver, ALLMEMBER);

        action.waitForElement(driver, ADMINS);
        action.verifyElementIsDisplayed(driver, ADMINS);
        action.click(driver, ALLMEMBER, "Click on All Member");
        common.pause(5);

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
//        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void createPrivateCommunityForAllMembers() {
        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, COMMUNITYTYPE);
        action.click(driver, COMMUNITYTYPE, "Community Types");
        common.pause(5);

        action.waitForElement(driver, PUBLIC);
        action.verifyElementIsDisplayed(driver, PUBLIC);

        action.waitForElement(driver, PRIVATE);
        action.verifyElementIsDisplayed(driver, PRIVATE);
        common.pause(5);
        action.click(driver, PRIVATE, "Click on Private");

        action.waitForElement(driver, WHOCREATEGROUPS);
        action.verifyElementIsDisplayed(driver, WHOCREATEGROUPS);
        action.click(driver, WHOCREATEGROUPS, "Who can create Groups");
        common.pause(5);

        action.waitForElement(driver, ALLMEMBER);
        action.verifyElementIsDisplayed(driver, ALLMEMBER);

        action.waitForElement(driver, ADMINS);
        action.verifyElementIsDisplayed(driver, ADMINS);
        action.click(driver, ALLMEMBER, "Click on All Member");
        common.pause(5);

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
//        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void createPrivateCommunityForAdmin() {
        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, COMMUNITYTYPE);
        action.click(driver, COMMUNITYTYPE, "Community Types");
        common.pause(5);

        action.waitForElement(driver, PUBLIC);
        action.verifyElementIsDisplayed(driver, PUBLIC);

        action.waitForElement(driver, PRIVATE);
        action.verifyElementIsDisplayed(driver, PRIVATE);
        common.pause(5);
        action.click(driver, PRIVATE, "Click on Private");

        action.waitForElement(driver, WHOCREATEGROUPS);
        action.verifyElementIsDisplayed(driver, WHOCREATEGROUPS);
        action.click(driver, WHOCREATEGROUPS, "Who can create Groups");
        common.pause(5);

        action.waitForElement(driver, ALLMEMBER);
        action.verifyElementIsDisplayed(driver, ALLMEMBER);

        action.waitForElement(driver, ADMINS);
        action.verifyElementIsDisplayed(driver, ADMINS);
        action.click(driver, ADMINS, "Click on Admin");
        common.pause(5);

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
//        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void verify_Login_With_Email() {
        action.waitForElement(driver, Spark);
        action.isElementVisible(driver, Spark);
        action.click(driver, Spark, "Spark");
        common.pause(3);

        common.logPrint("Step:: Verify 'Login or Sign up' is display on login page");
        action.waitForElement(driver, LOGINORSIGNUP);
        action.verifyElementIsDisplayed(driver, LOGINORSIGNUP);

        action.waitForElement(driver, SENDYOUCODE);
        action.verifyElementIsDisplayed(driver, SENDYOUCODE);

        common.logPrint("Step:: Verify 'Email field' is display on login page.");
//        action.waitForElement(driver, EmailField);
//        action.click(driver, EmailField, "Email Field");
//        common.pause(5);
//
//        action.enter_text(driver, EmailField, "ronak56@yopmail.com");
        action.waitForElement(driver, UsePhoneNumberField);
        action.click(driver, UsePhoneNumberField, "Use phone number instead");
        common.pause(5);
        action.enter_text(driver, PhoneField, "9904204070");

        action.waitForElement(driver, Continue);

        common.logPrint("Step:: Verify 'Continue' Button is display on login page.");
        action.waitForElement(driver, Continue);
        action.verifyElementIsDisplayed(driver, Continue);

        common.logPrint("Step:: Verify 'Continue with Google' Button is displaye.");
        action.waitForElement(driver, CONTINUEWITHGOOGLE);
        action.verifyElementIsDisplayed(driver, CONTINUEWITHGOOGLE);

        common.logPrint("Step:: Verify 'Continue with Brand' Button is display.");
        action.waitForElement(driver, CONTINUEWITHBRAND);
        action.verifyElementIsDisplayed(driver, CONTINUEWITHBRAND);

        common.logPrint("Step:: Verify 'Use Phone Number' Button is display.");
        action.waitForElement(driver, UsePhoneNumberField);
        action.verifyElementIsDisplayed(driver, UsePhoneNumberField);

        action.click(driver, EmailField, "Email Field");
        common.pause(5);
        action.enter_text(driver, EmailField, "ronak56@yopmail.com");
        action.click(driver, Continue, "Continue");

        action.waitForElement(driver, EnterCode);
        action.enter_text(driver, EnterCode, "123456");
        common.pause(10);

    }

    public void verify_Login_With_Phone_Number() {
        action.waitForElement(driver, Spark);
        action.isElementVisible(driver, Spark);
        action.click(driver, Spark, "Spark");
        common.pause(3);

        common.logPrint("Step:: Verify 'Login or Sign up' is display on login page");
        action.waitForElement(driver, LOGINORSIGNUP);
        action.verifyElementIsDisplayed(driver, LOGINORSIGNUP);

        action.waitForElement(driver, SENDYOUCODE);
        action.verifyElementIsDisplayed(driver, SENDYOUCODE);

        common.logPrint("Step:: Verify 'Email field' is display on login page.");
        action.waitForElement(driver, EmailField);
        action.verifyElementIsDisplayed(driver, EmailField);

        common.logPrint("Step:: Verify 'Continue with Google' Button is display.");
        action.waitForElement(driver, CONTINUEWITHGOOGLE);
        action.verifyElementIsDisplayed(driver, CONTINUEWITHGOOGLE);

        common.logPrint("Step:: Verify 'Continue with Brand' Button is display.");
        action.waitForElement(driver, CONTINUEWITHBRAND);
        action.verifyElementIsDisplayed(driver, CONTINUEWITHBRAND);

        common.logPrint("Step:: Verify 'Use Phone Number' Button is display.");
        action.waitForElement(driver, UsePhoneNumberField);
        action.verifyElementIsDisplayed(driver, UsePhoneNumberField);

        action.click(driver, UsePhoneNumberField, "Use phone number instead");
        common.pause(5);
        action.enter_text(driver, PhoneField, "9904204070");
        action.waitForElement(driver, Continue);
        action.click(driver, Continue, "Continue");
        action.waitForElement(driver, EnterCode);
        action.enter_text(driver, EnterCode, "123456");
    }

    public void verify_Logout() {
        verify_Login_With_Phone_Number();

        action.waitForElement(driver, PROFILE);
        action.click(driver, PROFILE, "Click on Profile");

        action.waitForElement(driver, VIEWPROFILE);
        action.verifyElementIsDisplayed(driver, VIEWPROFILE);

        action.waitForElement(driver, ACCOUNTSETTINGS);
        action.verifyElementIsDisplayed(driver, ACCOUNTSETTINGS);

        action.waitForElement(driver, LOGOUTBUTTON);
        action.click(driver, LOGOUTBUTTON, "Click on Logout Button");

        action.waitForElement(driver, LOGOUTTEXT);
        action.verifyElementIsDisplayed(driver, LOGOUTTEXT);

        action.waitForElement(driver, DAILOGMESSAGE);
        action.verifyElementIsDisplayed(driver, DAILOGMESSAGE);

        action.waitForElement(driver, CANCEL);
        action.verifyElementIsDisplayed(driver, CANCEL);

        action.waitForElement(driver, LOGOUT);
        action.click(driver, LOGOUT, "Log out");

    }

    public void verify_Account_Setting() {
        verify_Login_With_Phone_Number();

        action.waitForElement(driver, PROFILE);
        action.verifyElementIsDisplayed(driver, PROFILE);
        action.click(driver, PROFILE, "Click on Profile");

        action.waitForElement(driver, VIEWPROFILE);
        action.verifyElementIsDisplayed(driver, VIEWPROFILE);

        action.waitForElement(driver, ACCOUNTSETTINGS);
        action.click(driver, ACCOUNTSETTINGS, "Click on Account Settings.");

        action.waitForElement(driver, USERNAME);
        action.verifyElementIsDisplayed(driver, USERNAME);

        action.waitForElement(driver, EMAIL);
        action.verifyElementIsDisplayed(driver, EMAIL);

        action.waitForElement(driver, PHONE);
        action.verifyElementIsDisplayed(driver, PHONE);

        action.waitForElement(driver, BIRTHDATE);
        action.verifyElementIsDisplayed(driver, BIRTHDATE);

        action.waitForElement(driver, DELETEACCOUNT);
        action.click(driver, DELETEACCOUNT, "Click on Delete");

        action.waitForElement(driver, LOGOUTTEXT);
        action.verifyElementIsDisplayed(driver, LOGOUTTEXT);

        action.waitForElement(driver, DAILOGMESSAGE);
        action.verifyElementIsDisplayed(driver, DAILOGMESSAGE);

        action.waitForElement(driver, CANCEL);
        action.verifyElementIsDisplayed(driver, CANCEL);

        action.waitForElement(driver, LOGOUT);
        action.click(driver, LOGOUT, "Log out");
    }

    public void createGroupManuallyByEveryone_ForAllCommunity() {

        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);
        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);

        ClickOnCreateManually();
        common.pause(10);

        action.waitForElement(driver, GROUPNAMETEXT);
        action.verifyElementIsDisplayed(driver, GROUPNAMETEXT);

        action.waitForElement(driver, ENTERGROUPNAME);
        String groupname = common.generateRandomChar(40);
        action.enter_text(driver, ENTERGROUPNAME, groupname);

        action.waitForElement(driver, DESCRIPTION);
        action.verifyElementIsDisplayed(driver, DESCRIPTION);

        action.waitForElement(driver, CONVERSATION);
        String description = common.generateRandomChar(300);
        action.enter_text(driver, CONVERSATION, description);
        hideKeyboard();

        action.waitForElement(driver, WHOCANSEETHISGROUP);
        action.click(driver, WHOCANSEETHISGROUP, "Click on Who can see this group");

        action.waitForElement(driver, EVERYONE);
        action.verifyElementIsDisplayed(driver, EVERYONE);

        action.waitForElement(driver, GROUPMEMBERSONLY);
        action.verifyElementIsDisplayed(driver, GROUPMEMBERSONLY);
        action.click(driver, EVERYONE, "Click on Everyone");

        action.waitForElement(driver, WHOCANPOSTINTHISGROUP);
        action.verifyElementIsDisplayed(driver, WHOCANPOSTINTHISGROUP);
        action.click(driver, WHOCANPOSTINTHISGROUP, "Click on Who can Post in this Group");

        action.waitForElement(driver, ALLCOMMUNITYMEMBERS);
        action.verifyElementIsDisplayed(driver, ALLCOMMUNITYMEMBERS);

        action.waitForElement(driver, GROUPMEMBERFORPOST);
        action.verifyElementIsDisplayed(driver, GROUPMEMBERFORPOST);
        action.click(driver, ALLCOMMUNITYMEMBERS, "Click on All Community Members");

        action.waitForElement(driver, ADDMEMBERS);
        action.verifyElementIsDisplayed(driver, ADDMEMBERS);

        action.waitForElement(driver, RECORDAPOST);
        action.click(driver, RECORDAPOST, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");

    }

    public void createGroupManuallyByEveryone_ForGroupMembersOnly() {

        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);
        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);

        ClickOnCreateManually();
        common.pause(10);

        action.waitForElement(driver, GROUPNAMETEXT);
        action.verifyElementIsDisplayed(driver, GROUPNAMETEXT);

        action.waitForElement(driver, ENTERGROUPNAME);
        String groupname = common.generateRandomChar(40);
        action.enter_text(driver, ENTERGROUPNAME, groupname);

        action.waitForElement(driver, DESCRIPTION);
        action.verifyElementIsDisplayed(driver, DESCRIPTION);

        action.waitForElement(driver, CONVERSATION);
        String description = common.generateRandomChar(300);
        action.enter_text(driver, CONVERSATION, description);
        hideKeyboard();

        action.waitForElement(driver, WHOCANSEETHISGROUP);
        action.click(driver, WHOCANSEETHISGROUP, "Click on Who can see this group");

        action.waitForElement(driver, EVERYONE);
        action.verifyElementIsDisplayed(driver, EVERYONE);

        action.waitForElement(driver, GROUPMEMBERSONLY);
        action.verifyElementIsDisplayed(driver, GROUPMEMBERSONLY);
        action.click(driver, EVERYONE, "Click on Everyone");

        action.waitForElement(driver, WHOCANPOSTINTHISGROUP);
        action.verifyElementIsDisplayed(driver, WHOCANPOSTINTHISGROUP);
        action.click(driver, WHOCANPOSTINTHISGROUP, "Click on Who can Post in this Group");

        action.waitForElement(driver, ALLCOMMUNITYMEMBERS);
        action.verifyElementIsDisplayed(driver, ALLCOMMUNITYMEMBERS);

        action.waitForElement(driver, GROUPMEMBERFORPOST);
        action.verifyElementIsDisplayed(driver, GROUPMEMBERFORPOST);
        action.click(driver, GROUPMEMBERFORPOST, "Click on All Community Members");

        action.waitForElement(driver, ADDMEMBERS);
        action.verifyElementIsDisplayed(driver, ADDMEMBERS);

        action.waitForElement(driver, RECORDAPOST);
        action.click(driver, RECORDAPOST, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");

    }


    public void createGroupManuallyByGroupMembers_ForGroupMembersOnly() {

        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);
        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);

        ClickOnCreateManually();
        common.pause(10);

        action.waitForElement(driver, GROUPNAMETEXT);
        action.verifyElementIsDisplayed(driver, GROUPNAMETEXT);

        action.waitForElement(driver, ENTERGROUPNAME);
        String groupname = common.generateRandomChar(40);
        action.enter_text(driver, ENTERGROUPNAME, groupname);

        action.waitForElement(driver, DESCRIPTION);
        action.verifyElementIsDisplayed(driver, DESCRIPTION);

        action.waitForElement(driver, CONVERSATION);
        String description = common.generateRandomChar(300);
        action.enter_text(driver, CONVERSATION, description);
        hideKeyboard();

        action.waitForElement(driver, WHOCANSEETHISGROUP);
        action.click(driver, WHOCANSEETHISGROUP, "Click on Who can see this group");

        action.waitForElement(driver, EVERYONE);
        action.verifyElementIsDisplayed(driver, EVERYONE);

        action.waitForElement(driver, GROUPMEMBERSONLY);
        action.verifyElementIsDisplayed(driver, GROUPMEMBERSONLY);
        action.click(driver, GROUPMEMBERSONLY, "Click on Everyone");

        action.waitForElement(driver, WHOCANPOSTINTHISGROUP);
        action.verifyElementIsDisplayed(driver, WHOCANPOSTINTHISGROUP);
        action.click(driver, WHOCANPOSTINTHISGROUP, "Click on Who can Post in this Group");

        action.waitForElement(driver, GROUPMEMBERFORPOST);
        action.verifyElementIsDisplayed(driver, GROUPMEMBERFORPOST);
        action.click(driver, GROUPMEMBERFORPOST, "Click on All Community Members");

        action.waitForElement(driver, ADDMEMBERS);
        action.verifyElementIsDisplayed(driver, ADDMEMBERS);

        action.waitForElement(driver, RECORDAPOST);
        action.click(driver, RECORDAPOST, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");
        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");

    }

    public void addCommentOnPost() {
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, VIDEOCOMMENT);

        action.waitForElement(driver, ADDCOMMENT);
        action.click(driver, ADDCOMMENT, "Click on Comments");
        String comment = common.generateRandomChar(50);
        action.click(driver, POSTFORCOMMENT, "Click on Comments");
        action.enter_text(driver, POSTFORCOMMENT, comment);
        common.pause(5);
        hideKeyboard();

        action.waitForElement(driver, POSTCOMMENT);
        action.click(driver, POSTCOMMENT, "Click on Post Comment");
        common.pause(5);

        action.waitForElement(driver, RECORDAUDIO);
        action.verifyElementIsDisplayed(driver, RECORDAUDIO);
    }

    public void addVideoComment() {
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, VIDEOCOMMENT);

        action.waitForElement(driver, ADDCOMMENT);
        action.verifyElementIsDisplayed(driver, ADDCOMMENT);

        action.waitForElement(driver, RECORDAUDIO);
        action.verifyElementIsDisplayed(driver, RECORDAUDIO);

        action.click(driver, VIDEOCOMMENT, "Click on Video Comment");
        common.pause(30);
        action.waitForElement(driver, PLAYANDPAUSEVIDEOBTN);
        action.click(driver, PLAYANDPAUSEVIDEOBTN, "Click on Push Button");

        action.waitForElement(driver, DELETEVIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, DELETEVIDEOCOMMENT);

        action.waitForElement(driver, POST);
        action.click(driver, POST, "Post the video comment");
        common.pause(10);
    }

    public void deleteVideoCommnet() {
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, VIDEOCOMMENT);

        action.waitForElement(driver, ADDCOMMENT);
        action.verifyElementIsDisplayed(driver, ADDCOMMENT);

        action.waitForElement(driver, RECORDAUDIO);
        action.verifyElementIsDisplayed(driver, RECORDAUDIO);

        action.click(driver, VIDEOCOMMENT, "Click on Video Comment");
        common.pause(30);
        action.waitForElement(driver, PLAYANDPAUSEVIDEOBTN);
        action.click(driver, PLAYANDPAUSEVIDEOBTN, "Click on Push Button");

        action.waitForElement(driver, DELETEVIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, DELETEVIDEOCOMMENT);

        action.waitForElement(driver, POST);
        action.verifyElementIsDisplayed(driver, POST);

        action.click(driver, DELETEVIDEOCOMMENT, "Delete video comment");

        action.waitForElement(driver, DIALOGTITLE);
        action.verifyElementIsDisplayed(driver, DIALOGTITLE);

        action.waitForElement(driver, DIALOGMESSAGE);
        action.verifyElementIsDisplayed(driver, DIALOGMESSAGE);

        action.waitForElement(driver, DELETE);
        action.verifyElementIsDisplayed(driver, DELETE);

        action.waitForElement(driver, CANCELFORDELETE);
        action.verifyElementIsDisplayed(driver, CANCELFORDELETE);
        action.click(driver, DELETE, "Delete Video Comments");
    }

    public void captureAudioComment() {
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, VIDEOCOMMENT);

        action.waitForElement(driver, ADDCOMMENT);
        action.verifyElementIsDisplayed(driver, ADDCOMMENT);

        action.waitForElement(driver, RECORDAUDIO);
        action.click(driver, RECORDAUDIO, "Capture Audio Comment");
        common.pause(30);

        action.waitForElement(driver, STOPRECORDING);
        action.click(driver, STOPRECORDING, "Stop Recording");

        action.waitForElement(driver, DELETERECORDING);
        action.verifyElementIsDisplayed(driver, DELETERECORDING);

        action.waitForElement(driver, POST);
        action.click(driver, POST, "Post Audio Cpmment");
        common.pause(10);

    }

    public void deleteAudioComment() {
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, VIDEOCOMMENT);

        action.waitForElement(driver, ADDCOMMENT);
        action.verifyElementIsDisplayed(driver, ADDCOMMENT);

        action.waitForElement(driver, RECORDAUDIO);
        action.click(driver, RECORDAUDIO, "Capture Audio Comment");
        common.pause(30);

        action.waitForElement(driver, STOPRECORDING);
        action.click(driver, STOPRECORDING, "Stop Recording");

        action.waitForElement(driver, DELETERECORDING);
        action.verifyElementIsDisplayed(driver, DELETERECORDING);

        action.waitForElement(driver, POST);
        action.verifyElementIsDisplayed(driver, POST);
        action.click(driver, DELETERECORDING, "Delete Audio Comment");
    }

    public void checkUserProfile() {

        verify_Login_With_Phone_Number();

        action.waitForElement(driver, PROFILE);
        action.click(driver, PROFILE, "Click on Profile");

        action.waitForElement(driver, VIEWPROFILE);
        action.click(driver, VIEWPROFILE, "View User Profile");

        action.waitForElement(driver, ANIMATIONIMAGE);
        action.verifyElementIsDisplayed(driver, ANIMATIONIMAGE);
        action.click(driver, ANIMATIONIMAGE, "View Animation Image");
        common.pause(5);
        driver.navigate().back();

        action.waitForElement(driver, COMPLETEPROFILE);
        action.click(driver, COMPLETEPROFILE, "View Profile");
        common.pause(5);


        action.waitForElement(driver, SHAREPROFILE);
        action.click(driver, SHAREPROFILE, "Share Profile");

        action.waitForElement(driver, COPYLINK);
        action.click(driver, COPYLINK, "Copy Share Link");
        common.pause(5);
        driver.navigate().back();
    }

    public void modifyUsername() {
        verify_Login_With_Phone_Number();

        action.waitForElement(driver, PROFILE);
        action.click(driver, PROFILE, "Click on Profile");

        action.waitForElement(driver, VIEWPROFILE);
        action.click(driver, VIEWPROFILE, "View User Profile");

        action.waitForElement(driver, ANIMATIONIMAGE);
        action.verifyElementIsDisplayed(driver, ANIMATIONIMAGE);

        action.waitForElement(driver, COMPLETEPROFILE);
        action.click(driver, COMPLETEPROFILE, "View Profile");

        action.waitForElement(driver, FULLNAME);
        action.verifyElementIsDisplayed(driver, FULLNAME);

        action.waitForElement(driver, BIO);
        action.verifyElementIsDisplayed(driver, BIO);

        action.waitForElement(driver, SOCIALPROFILE);
        action.verifyElementIsDisplayed(driver, SOCIALPROFILE);

        action.click(driver, FULLNAME, "Edit Full Name");

        action.waitForElement(driver, EDITNAME);
        action.click(driver, EDITNAME, "Change Name");
        String editname = common.generateRandomChar(5);
        action.enter_text(driver, EDITNAME, editname);
        hideKeyboard();
        common.pause(5);

        action.waitForElement(driver, DONE);
        action.click(driver, DONE, "Click on Done Button");
        common.pause(5);
        driver.navigate().back();
        common.pause(5);
    }

    public void updateUserBio() {
        verify_Login_With_Phone_Number();

        action.waitForElement(driver, PROFILE);
        action.click(driver, PROFILE, "Click on Profile");

        action.waitForElement(driver, VIEWPROFILE);
        action.click(driver, VIEWPROFILE, "View User Profile");

        action.waitForElement(driver, ANIMATIONIMAGE);
        action.verifyElementIsDisplayed(driver, ANIMATIONIMAGE);

        action.waitForElement(driver, COMPLETEPROFILE);
        action.click(driver, COMPLETEPROFILE, "View Profile");

        action.waitForElement(driver, FULLNAME);
        action.verifyElementIsDisplayed(driver, FULLNAME);

        action.waitForElement(driver, BIO);
        action.verifyElementIsDisplayed(driver, BIO);

        action.waitForElement(driver, SOCIALPROFILE);
        action.verifyElementIsDisplayed(driver, SOCIALPROFILE);

        action.click(driver, BIO, "Click on Bio");


        action.waitForElement(driver, EDITNAME);
        action.click(driver, EDITNAME, "Change Bio");
        String editname = common.generateRandomChar(150);
        action.enter_text(driver, EDITNAME, editname);
        hideKeyboard();
        common.pause(5);

        action.waitForElement(driver, DONE);
        action.click(driver, DONE, "Click on Done Button");
        common.pause(5);
        driver.navigate().back();
        common.pause(5);

    }

    public void updateUserSocialProfile() {
        verify_Login_With_Phone_Number();

        action.waitForElement(driver, PROFILE);
        action.click(driver, PROFILE, "Click on Profile");

        action.waitForElement(driver, VIEWPROFILE);
        action.click(driver, VIEWPROFILE, "View User Profile");

        action.waitForElement(driver, ANIMATIONIMAGE);
        action.verifyElementIsDisplayed(driver, ANIMATIONIMAGE);

        action.waitForElement(driver, COMPLETEPROFILE);
        action.click(driver, COMPLETEPROFILE, "View Profile");

        action.waitForElement(driver, FULLNAME);
        action.verifyElementIsDisplayed(driver, FULLNAME);

        action.waitForElement(driver, BIO);
        action.verifyElementIsDisplayed(driver, BIO);

        action.waitForElement(driver, SOCIALPROFILE);
        action.verifyElementIsDisplayed(driver, SOCIALPROFILE);

        action.click(driver, SOCIALPROFILE, "Click on Social Profile");

        action.waitForElement(driver, TIKTOKUSERNAME);
        action.click(driver, TIKTOKUSERNAME, "Tiktok Username");
        action.enter_text(driver, TIKTOKUSERNAME, "thetestingacademy");
        hideKeyboard();
        common.pause(5);

        action.waitForElement(driver, INSTAGRAMUSERNAME);
        action.click(driver, INSTAGRAMUSERNAME, "Instagram Username");
        action.enter_text(driver, INSTAGRAMUSERNAME, "perfectqaservices_");
        hideKeyboard();
        common.pause(5);

        action.waitForElement(driver, TWITTERUSERNAME);
        action.click(driver, TWITTERUSERNAME, "Twitter Username");
        action.enter_text(driver, TWITTERUSERNAME, "PQaServices");
        hideKeyboard();
        common.pause(5);

        action.waitForElement(driver, LINKEDINLINK);
        action.click(driver, LINKEDINLINK, "Linked Profile");
        action.enter_text(driver, LINKEDINLINK, "https://www.linkedin.com/company/perfectqa/");
        hideKeyboard();
        common.pause(5);

        action.waitForElement(driver, YOUTUBEUSERNAME);
        action.click(driver, YOUTUBEUSERNAME, "Youtube Username");
        action.enter_text(driver, YOUTUBEUSERNAME, "TestReport-io");
        hideKeyboard();
        common.pause(5);

        action.waitForElement(driver, SAVE);
        action.click(driver, SAVE, "Click on Save");
        common.pause(5);

        driver.navigate().back();
    }

    public String getRandomRepostXPath() {
        Random random = new Random();
        int randomIndex = random.nextInt(5) + 1; // Generates a number between 1 and 5
        return "(//android.widget.TextView[@resource-id='com.begenuin.vishalnimralqa:id/tvRepost'])[" + randomIndex + "]";
    }

    public void repostParticularPostForPopularField() {

        verify_Login_With_Phone_Number();
        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "Click on the home dropdown");

        action.waitForElement(driver, POPULAROPTION);
        action.click(driver, POPULAROPTION, "Select popular option from dropdown");

        common.pause(4);

        common.logPrint("Step::Verify Repost button is visible");
        action.waitForElement(driver, REPOSTBTN);
        action.verifyElementIsDisplayed(driver, REPOSTBTN);
        action.click(driver, REPOSTBTN, "repost button");
        By roundTableDesc = By.xpath("//android.widget.TextView[@resource-id='com.begenuin.vishalnimralqa:id/tvRoundTableDesc']");
        boolean isElementVisible = action.waitForElementWithTimeout(driver, roundTableDesc, 10);

        if (isElementVisible) {
            common.logPrint("'tvRoundTableDesc' is now visible.");
            //action.verifyElementIsDisplayed(driver, roundTableDesc.toString());
        } else {
            common.logPrint("ERROR: 'tvRoundTableDesc' did not appear after clicking Repost button.");
        }

        common.pause(6);
        common.logPrint("Verify Repost header with plus icon is showing");
        action.click(driver, REPOSTPLUSICON, "Plus Icon.");
        action.waitForElement(driver, REPOSTHEADER);
        String repostHeaderName = action.findElementByXpath(driver, REPOSTHEADER).getText();
        common.assertTwoValuesAreEqual(repostHeaderName, "Repost");
        common.pause(5);

        String randomRepostXPath = getRandomRepostXPath(); // Get random repost button XPath
        action.click(driver, randomRepostXPath, "Random Repost Button");
        common.logPrint("Step:: Click on back button");
        action.waitForElement(driver, CLOSEBTN);
        action.click(driver, CLOSEBTN, "back button");
    }

    public void repostParticularPostForLatestField() {

        verify_Login_With_Phone_Number();
        action.waitForElement(driver, HOMEDROPDOWN);
        action.click(driver, HOMEDROPDOWN, "Click on the home dropdown");

        action.waitForElement(driver, LATESTOPTION);
        action.click(driver, LATESTOPTION, "Select Latest option from dropdown");

        common.pause(4);

        common.logPrint("Step::Verify Repost button is visible");
        action.waitForElement(driver, REPOSTBTN);
        action.verifyElementIsDisplayed(driver, REPOSTBTN);
        action.click(driver, REPOSTBTN, "repost button");
        By roundTableDesc = By.xpath("//android.widget.TextView[@resource-id='com.begenuin.vishalnimralqa:id/tvRoundTableDesc']");
        boolean isElementVisible = action.waitForElementWithTimeout(driver, roundTableDesc, 10);
        if (isElementVisible) {
            common.logPrint("'tvRoundTableDesc' is now visible.");
            //action.verifyElementIsDisplayed(driver, roundTableDesc.toString());
        } else {
            common.logPrint("ERROR: 'tvRoundTableDesc' did not appear after clicking Repost button.");
        }

        common.pause(6);
        common.logPrint("Verify Repost header with plus icon is showing");
        action.click(driver, REPOSTPLUSICON, "Plus Icon.");
        action.waitForElement(driver, REPOSTHEADER);
        String repostHeaderName = action.findElementByXpath(driver, REPOSTHEADER).getText();
        common.assertTwoValuesAreEqual(repostHeaderName, "Repost");
        common.pause(5);

        String randomRepostXPath = getRandomRepostXPath(); // Get random repost button XPath
        action.click(driver, randomRepostXPath, "Random Repost Button");
        common.logPrint("Step:: Click on back button");
        action.waitForElement(driver, CLOSEBTN);
        action.click(driver, CLOSEBTN, "back button");
    }

    public void countNotifications() {
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, NOTIFICATION);
        action.click(driver, NOTIFICATION, "Click on Notification");
        // Find all notification elements
        List<WebElement> notifications = driver.findElements(By.xpath("(//androidx.cardview.widget.CardView[@resource-id=\"com.begenuin.vishalnimralqa:id/llMainNotification\"])/android.widget.LinearLayout"));
        // Get the count of notifications
        int notificationCount = notifications.size();
        System.out.println("Total Notifications: " + notificationCount);
    }

    public void RecordPostByAudio() {

        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, AUDIO);
        action.click(driver, AUDIO, "Click on Audio");

        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void RecordPostByText() {
        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, TEXTBUTTON);
        action.click(driver, TEXTBUTTON, "Click on Text");

        action.waitForElement(driver, TAPANYWHERE);
        action.click(driver, TAPANYWHERE, "Tap Anywhere");

        action.waitForElement(driver, STARTTYPING);
        action.click(driver, STARTTYPING, "Start Typing");

        action.waitForElement(driver, TYPETEXT);
        String starttyping = common.generateRandomChar(50);
        action.enter_text(driver, TYPETEXT, starttyping);


        action.waitForElement(driver, Done);
        action.click(driver, Done, "Click on Done");

        action.waitForElement(driver, NEXTBTN);
        action.click(driver, NEXTBTN, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void recordPostWithAdjustableScale() {

        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        common.pause(5);

        action.waitForElement(driver, CAMERABACKBTN1);
        action.click(driver, CAMERABACKBTN1, "back camera button");

        action.waitForElement(driver, SCALE);
        action.click(driver, SCALE, "Adjust Scale");
        action.click(driver, SCALE, "Adjust Scale");

        action.waitForElement(driver, ONEXSCALE);
        action.click(driver, ONEXSCALE, "Adjust 1x Scale");

        action.waitForElement(driver, TWOXSCALE);
        action.click(driver, TWOXSCALE, "Adjust 2x Scale");

        action.waitForElement(driver, FOURXSCALE);
        action.click(driver, FOURXSCALE, "Adjust 3x Scale");

        action.waitForElement(driver, ONEXSCALE);
        action.click(driver, ONEXSCALE, "Adjust 1x Scale");

        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void recordPostWithCountdown() {
        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        common.pause(5);

        action.waitForElement(driver, CAMERABACKBTN1);
        action.click(driver, CAMERABACKBTN1, "back camera button");

        action.waitForElement(driver, TIMER);
        action.click(driver, TIMER, "Adjust Time");
        action.click(driver, TIMER, "Adjust Time");

        action.waitForElement(driver, THREESECOND);
        action.click(driver, THREESECOND, "Adjust 3 Second");

        action.waitForElement(driver, TENSECOND);
        action.click(driver, TENSECOND, "Adjust 10 Second");

        action.waitForElement(driver, THREESECOND);
        action.click(driver, THREESECOND, "Adjust 3 Second");

        action.waitForElement(driver, STARTCOUNTDOWN);
        action.click(driver, STARTCOUNTDOWN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void createPostWithTextVariations() {
        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, TEXTBUTTON);
        action.click(driver, TEXTBUTTON, "Click on Text");

        action.waitForElement(driver, TAPANYWHERE);
        action.click(driver, TAPANYWHERE, "Tap Anywhere");

        action.waitForElement(driver, STARTTYPING);
        action.click(driver, STARTTYPING, "Start Typing");

        action.waitForElement(driver, TYPETEXT);
        String starttyping = common.generateRandomChar(50);
        action.enter_text(driver, TYPETEXT, starttyping);

        for (int i = 1; i <= 7; i++) {
            String fontXPath = "(//android.widget.TextView[@resource-id='com.begenuin.vishalnimralqa:id/tvFontToApply'])[" + i + "]";
            MobileElement fontOption = (MobileElement) driver.findElementByXPath(fontXPath);

            if (fontOption.isDisplayed()) {
                fontOption.click();  // Click on the font
                common.pause(2);  // Small delay for UI transition
            }
        }
        common.pause(5);
        hideKeyboard();

        action.waitForElement(driver, Done);
        action.click(driver, Done, "Click on Done");

        action.waitForElement(driver, NEXTBTN);
        action.click(driver, NEXTBTN, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void markPostAsNotInterested() {
        verify_Login_With_Phone_Number();

        action.waitForElement(driver, THREEDOT);
        action.click(driver, THREEDOT, "Click on Three Dot.");
        common.pause(5);

        action.waitForElement(driver, GROUPDETAILS);
        action.verifyElementIsDisplayed(driver, GROUPDETAILS);

        action.waitForElement(driver, NOTINTERSTED);
        action.verifyElementIsDisplayed(driver, NOTINTERSTED);

        action.waitForElement(driver, REPORTPOST);
        action.verifyElementIsDisplayed(driver, REPORTPOST);

        action.waitForElement(driver, CANCELBTN);
        action.verifyElementIsDisplayed(driver, CANCELBTN);

        action.waitForElement(driver, NOTINTERSTED);
        action.click(driver, NOTINTERSTED, "Click on Not Interested.");
        common.pause(5);

        List<String> issues = List.of(USERISSUES, COMMUNITYISSUE, TOPICISSUE, OTHERISSUE);

        Random random = new Random();
        int randomIndex = random.nextInt(issues.size());

        String selectedIssueXPath = issues.get(randomIndex);
        MobileElement issueElement = (MobileElement) driver.findElementByXPath(selectedIssueXPath);

        if (issueElement.isDisplayed()) {
            issueElement.click();

        }
        common.pause(5);
    }

    public void undoNotInterestedOnPost() {
        markPostAsNotInterested();
        action.waitForElement(driver, THREEDOT);
        action.click(driver, THREEDOT, "Click on Three Dot.");
        common.pause(5);

        action.waitForElement(driver, UNDONOTINTERESTED);
        action.click(driver, UNDONOTINTERESTED, "Click on Undo 'Not Interested'");
    }

    public void sendReportForPost() {

        verify_Login_With_Phone_Number();

        action.waitForElement(driver, THREEDOT);
        action.click(driver, THREEDOT, "Click on ThreeDot");
        common.pause(5);

        action.waitForElement(driver, GROUPDETAILS);
        action.verifyElementIsDisplayed(driver, GROUPDETAILS);

        action.waitForElement(driver, NOTINTERSTED);
        action.verifyElementIsDisplayed(driver, NOTINTERSTED);

        action.waitForElement(driver, REPORTPOST);
        action.verifyElementIsDisplayed(driver, REPORTPOST);

        action.waitForElement(driver, CANCELBTN);
        action.verifyElementIsDisplayed(driver, CANCELBTN);

        action.waitForElement(driver, REPORTPOST);
        action.click(driver, REPORTPOST, "Click on Not Interested.");
        common.pause(5);

        List<String> randomreports = List.of(INAPPROPRIATECONTENT, NONPROFESSIONALCONTENT, SPAM, VIOLENT, OTHER);

        Random random = new Random();
        int randomIndex = random.nextInt(randomreports.size());

        String selectedreportXPath = randomreports.get(randomIndex);
        MobileElement reportElement = (MobileElement) driver.findElementByXPath(selectedreportXPath);

        if (reportElement.isDisplayed()) {
            reportElement.click();

        }
        common.pause(5);

        action.waitForElement(driver, SUBMIT);
        action.click(driver, SUBMIT, "Click on Submit");
        common.pause(5);

        action.waitForElement(driver, OKAY);
        action.click(driver, OKAY, "Click on Okay");
        common.pause(2);
    }

    public void verifyCommunityJoined() {
        verify_Login_With_Phone_Number();

        action.waitForElement(driver, NAMEOFCOMMUNITY);
        action.click(driver, NAMEOFCOMMUNITY, "Click On Community");

        action.waitForElement(driver, GROUPS);
        action.click(driver, GROUPS, "Click On Groups");
        common.pause(5);

        action.waitForElement(driver, MEMBERS);
        action.click(driver, MEMBERS, "Click On Members");
        common.pause(5);

        action.waitForElement(driver, ABOUT);
        action.click(driver, ABOUT, "Click On About");
        common.pause(5);

        action.waitForElement(driver, JOINBTN);
        action.click(driver, JOINBTN, "Click On Join Button");
        common.pause(5);

        action.waitForElement(driver, SAHREBTN);
        action.click(driver, SAHREBTN, "Click On Share Button.");
        common.pause(5);

        action.waitForElement(driver, COPYLINK);
        action.click(driver, COPYLINK, "Copy Link");
        common.pause(5);

        action.waitForElement(driver, JOINBTN);
        action.click(driver, JOINBTN, "Joined Button");
        common.pause(5);

        action.waitForElement(driver, LEAVE);
        action.click(driver, LEAVE, "Leave Community");
        common.pause(5);
        driver.navigate().back();
    }

    public void checkWalletFeature() {

        verify_Login_With_Phone_Number();
        action.waitForElement(driver, WALLET);
        action.click(driver, WALLET, "Click On Wallet");
        common.pause(5);

        action.waitForElement(driver, CURRENTBALANCE);
        action.verifyElementIsDisplayed(driver, CURRENTBALANCE);

        action.waitForElement(driver, REWARDCREDIT);
        action.click(driver, REWARDCREDIT, "Click On Reward Credit");
        common.pause(5);

        action.waitForElement(driver, REDEEM);
        action.verifyElementIsDisplayed(driver, REDEEM);

        action.waitForElement(driver, CASHEARNINGS);
        action.click(driver, CASHEARNINGS, "Click On Cash Earning");
        common.pause(5);

        action.waitForElement(driver, WITHDRAW);
        action.verifyElementIsDisplayed(driver, WITHDRAW);

        action.waitForElement(driver, REWARDCREDITS);
        action.click(driver, REWARDCREDITS, "Click On Reward Credit");
        common.pause(5);
        driver.navigate().back();

        action.waitForElement(driver, CASHEARNING);
        action.click(driver, CASHEARNING, "Cash Earnings");
        common.pause(5);

        action.waitForElement(driver, WITHDRAW);
        action.verifyElementIsDisplayed(driver, WITHDRAW);

        action.waitForElement(driver, REWARDCREDITS);
        action.click(driver, REWARDCREDITS, "Reward Credit");
        common.pause(5);

        action.waitForElement(driver, REDEEM);
        action.verifyElementIsDisplayed(driver, REDEEM);

        action.waitForElement(driver, CASHEARNINGS);
        action.click(driver, CASHEARNINGS, "Cash Earnings");
        common.pause(5);
        driver.navigate().back();
        driver.navigate().back();

    }

    public void enableGroupNotifications() {

        verify_Login_With_Phone_Number();

        action.waitForElement(driver, GROUP);
        action.click(driver, GROUP, "Click On Group");

        action.waitForElement(driver, INFO);
        action.click(driver, INFO, "Click On Info");
        common.pause(5);

        action.waitForElement(driver, ENABLENOTIFICATION);
        action.click(driver, ENABLENOTIFICATION, "Turn On Notification");
        action.click(driver, ENABLENOTIFICATION, "Turn On Notification");
        common.pause(5);

        action.waitForElement(driver, DISABLENOTIFICATION);
        action.click(driver, DISABLENOTIFICATION, "Turn Off Notification");
        action.click(driver, DISABLENOTIFICATION, "Turn Off Notification");

        common.pause(5);
        driver.navigate().back();
        driver.navigate().back();
        common.pause(5);
    }

    public void generateAutoCreatedGroup() {

        verify_Login_With_Phone_Number();

        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();
        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);
        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();

        action.waitForElement(driver, VIEWGROUP);
        action.click(driver, VIEWGROUP, "Click On Auto Create");

        action.waitForElement(driver, SELECTTOPIC);
        action.click(driver, SELECTTOPIC, "Select Topic");

        List<String> topics = List.of(ONETOPIC, SECONDTOPIC);
        Random random = new Random();
        int randomIndex = random.nextInt(topics.size());

        String selectedreportXPath = topics.get(randomIndex);
        MobileElement reportElement = (MobileElement) driver.findElementByXPath(selectedreportXPath);

        if (reportElement.isDisplayed()) {
            reportElement.click();

        }
        common.pause(5);

        action.waitForElement(driver, NEXTFORGROUP);
        action.click(driver, NEXTFORGROUP, "Click On Next");
    }

    public void recordPostWithQuestionAndAnswer() {

        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, QUESTIONANDANSWER);
        action.click(driver, QUESTIONANDANSWER, "Click on Q&A");

        action.waitForElement(driver, ADDQUESTION);
        action.click(driver, ADDQUESTION, "Click On Add Question");

        action.waitForElement(driver, WRITEQUESTION);
        action.click(driver, WRITEQUESTION, "Type Question");
        String question = common.generateRandomChar(75);
        action.enter_text(driver, WRITEQUESTION, question);
        common.pause(5);

        action.waitForElement(driver, DONE);
        action.click(driver, DONE, "Click On Done");

        action.waitForElement(driver, RECORDANSWER);
        action.click(driver, RECORDANSWER, "Click on Record Answer");

        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void checkCarouselInCustomFeed() {

        verify_Login_With_Phone_Number();

        action.waitForElement(driver, CUSTOM);
        action.click(driver, CUSTOM, "Click on Custom Feed.");

        action.waitForElement(driver, CONTEXT);
        action.click(driver, CONTEXT, "Click on Context");
        List<String> contexts = List.of("Dance", "Cricket", "Sports", "Music", "Gaming", "Travel", "Technology", "Fitness");
        Random random = new Random();
        int randomIndex = random.nextInt(contexts.size());
        String context = contexts.get(randomIndex);
        action.enter_text(driver, CONTEXT, context);
        hideKeyboard();

        action.waitForElement(driver, CAROUSEL);
        action.click(driver, CAROUSEL, "Click ON Carousel");
        common.pause(5);

        action.waitForElement(driver, CLICKONPOST);
        action.click(driver, CLICKONPOST, "Click ON Post");
        common.pause(5);

        driver.navigate().back();
        driver.navigate().back();
    }

    public void checkStandardWallInCustomFeed() {

        verify_Login_With_Phone_Number();

        action.waitForElement(driver, CUSTOM);
        action.click(driver, CUSTOM, "Click on Custom Feed.");

        action.waitForElement(driver, CONTEXT);
        action.click(driver, CONTEXT, "Click on Context");
        List<String> contexts = List.of("Dance", "Cricket", "Sports", "Music", "Gaming", "Travel", "Technology", "Fitness");
        Random random = new Random();
        int randomIndex = random.nextInt(contexts.size());
        String context = contexts.get(randomIndex);
        action.enter_text(driver, CONTEXT, context);
        hideKeyboard();

        action.waitForElement(driver, STANDARDWALL);
        action.click(driver, STANDARDWALL, "Click ON Standard ");
        common.pause(5);

        driver.navigate().back();
        driver.navigate().back();
    }

    public void verifyVideoCommentAfterTwoMinutes (){

        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.click(driver,VIDEOCOMMENT,"Click On Video Comment");
        common.pause(3);

        action.waitForElementToBeInvisible(driver,PLAYANDPAUSEVIDEOBTN);
        action.click(driver,POST,"Pause Button");

        action.waitForElement(driver,UPLOADINPROGRESS);
        action.waitForElementToBeInvisible(driver,UPLOADINPROGRESS);
        driver.navigate().back();
    }
    
    public void verifyAudioCommentAfterTwoMinutes(){
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, VIDEOCOMMENT);

        action.waitForElement(driver, ADDCOMMENT);
        action.verifyElementIsDisplayed(driver, ADDCOMMENT);

        action.waitForElement(driver, RECORDAUDIO);
        action.click(driver, RECORDAUDIO, "Capture Audio Comment");

        action.waitForElementToBeInvisible(driver, STOPRECORDING);

        action.waitForElement(driver, DELETERECORDING);
        action.verifyElementIsDisplayed(driver, DELETERECORDING);

        action.waitForElement(driver, POST);
        action.click(driver, POST, "Post Audio Comment");

        action.waitForElement(driver,UPLOADINPROGRESS);
        action.waitForElementToBeInvisible(driver,UPLOADINPROGRESS);
        driver.navigate().back();
    }
    public void createPostComment(){
        verify_Login_With_Phone_Number();
        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "Click on Comment");

        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver, VIDEOCOMMENT);
        action.verifyElementIsDisplayed(driver, VIDEOCOMMENT);

        action.waitForElement(driver, ADDCOMMENT);
        action.click(driver, ADDCOMMENT, "Click on Comments");
        String comment = common.generateRandomChar(100);
        action.click(driver, POSTFORCOMMENT, "Click on Comments");
        action.enter_text(driver, POSTFORCOMMENT, comment);
        hideKeyboard();

        action.waitForElement(driver, POSTCOMMENT);
        action.click(driver, POSTCOMMENT, "Click on Post Comment");
        common.pause(5);

        action.waitForElement(driver, RECORDAUDIO);
        action.verifyElementIsDisplayed(driver, RECORDAUDIO);
    }

    public void verifyTranscription(){

        verify_Login_With_Phone_Number();
        action.waitForElement(driver, CUSTOM);
        action.click(driver, CUSTOM, "Click on Custom Feed.");

        action.waitForElement(driver, CONTEXT);
        action.click(driver, CONTEXT, "Click on Context");
//        List<String> contexts = List.of("Dance", "Cricket", "Sports", "Music", "Gaming", "Travel", "Technology", "Fitness");
//        Random random = new Random();
//        int randomIndex = random.nextInt(contexts.size());
//        String context = contexts.get(randomIndex);
        action.enter_text(driver, CONTEXT, "Sports");
        hideKeyboard();

        action.waitForElement(driver, STANDARDWALL);
        action.click(driver, STANDARDWALL, "Click ON Standard ");
        common.pause(5);

        action.waitForElement(driver,TRANSCRIPTION);
        action.click(driver,TRANSCRIPTION,"Click on Transcription");
        common.pause(5);

        action.waitForElement(driver,SELECTTRANSCRIPTION);
        action.click(driver,SELECTTRANSCRIPTION,"Select Transcription");

        action.waitForElement(driver,SHARETRANSCRIPTION);
        action.click(driver,SHARETRANSCRIPTION,"Share Transcription");

        action.waitForElement(driver,COPYLINKFORTRANSCRIPTION);
        action.click(driver,COPYLINKFORTRANSCRIPTION,"Click on Copy Link");

        action.waitForElement(driver,SHARETO);
        action.click(driver,SHARETO,"Click on Share to");
        common.pause(5);
        driver.navigate().back();

        action.waitForElement(driver,MESSAGE);
        action.click(driver,MESSAGE,"Click on Message.");
        common.pause(5);
        driver.navigate().back();
    }

    public void postWithTorchProcessing(){
        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, BACKCAMERA);
        action.click(driver, BACKCAMERA, "Back camera icon");

        action.waitForElement(driver,TOURCH);
        action.click(driver,TOURCH,"On Tourch");

        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "start");
        common.pause(20);
        action.waitForElement(driver, VIDEOENDBTN);
        action.click(driver, VIDEOENDBTN, "END");

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
//        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void verifyGestureFeatures(){

        action.waitForElement(driver,SWIPUP);
        action.verifyElementIsDisplayed(driver,SWIPUP);
        common.pause(5);
        action.scrollToElement(driver, By.xpath("//android.widget.ImageView[@resource-id='com.begenuin.vishalnimralqa:id/ivGestureLottie']"));
        common.pause(5);
        action.waitForElement(driver,DOUBLETAPONVIDEOS);
        action.verifyElementIsDisplayed(driver,DOUBLETAPONVIDEOS);
        action.click(driver,Spark,"Click on Spark");
    }

    public void verifyPostWithFiveMinuteDelay(){
        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(5);
        ClickOnCreateManually();
        common.pause(5);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, CAMERABACKBTN1);
        action.click(driver, CAMERABACKBTN1, "back camera button");

        action.waitForElement(driver, PLAYANDPAUSEVIDEOBTN);
        action.click(driver, PLAYANDPAUSEVIDEOBTN, "Play video button");
        common.pause(4);

        action.waitForElementToDisappear(driver, VIDEOENDBTN);

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");

    }

    public void verifyAudioPostWithFiveMinutesDealy(){
        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(5);
        ClickOnCreateManually();
        common.pause(5);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, AUDIO);
        action.click(driver, AUDIO, "Click on Audio");

        action.waitForElement(driver, VIDEOSTARTBTN);
        action.click(driver, VIDEOSTARTBTN, "Start Audio");

        action.waitForElementToDisappear(driver, VIDEOENDBTN);

        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Check it ok");
        action.waitForElement(driver, RIGHTCHECKBUTTON);
        action.click(driver, RIGHTCHECKBUTTON, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void checkCommunityPostInComments(){

        verify_Login_With_Phone_Number();
        common.logPrint("Step::Verify comment button is visible");
        action.waitForElement(driver, COMMENTBTN);
        action.verifyElementIsDisplayed(driver, COMMENTBTN);

        action.waitForElement(driver, COMMENTBTN);
        action.click(driver, COMMENTBTN, "comment button");

        common.logPrint("Step::Verify comment button is visible");
        action.waitForElement(driver, COMMENTHED);
        action.verifyElementIsDisplayed(driver, COMMENTHED);

        action.waitForElement(driver,COMMUNITYPOST);
        action.click(driver,COMMUNITYPOST,"Click on Community Post");
        common.pause(5);

        action.waitForElement(driver,BACKTOCOMMENT);
        action.click(driver,BACKTOCOMMENT,"Back to Comment");
        common.pause(5);
        driver.navigate().back();

    }

    public void manageSoundStatus(){

        verify_Login_With_Phone_Number();
        action.waitForElement(driver,SOUND);
        action.click(driver,SOUND,"Mute");
        common.pause(10);

        action.waitForElement(driver,SOUND);
        action.click(driver,SOUND,"Unmute");
        common.pause(10);

    }
    public void recordTextPostWithStyle(){
        verify_Login_With_Phone_Number();
        ClickOnHome();
        ClickOnCreateCommunity();
        ClickOnCreateManually();

        action.waitForElement(driver, COMMUNITYNAMEFIELD);
        String CommunityNameManually = action.generateRandomChars(7);
        action.enter_text(driver, COMMUNITYNAMEFIELD, CommunityNameManually);

        hideKeyboard();
        action.waitForElement(driver, COMMUNITYHANDLEFIELD);
        action.click(driver, COMMUNITYHANDLEFIELD, "Generate");
        common.pause(10);

        action.waitForElement(driver, PURPOSEOFTHECOMMUNITY);
        action.verifyElementIsDisplayed(driver, PURPOSEOFTHECOMMUNITY);
        String purpose = action.generateRandomChars(300);
        action.enter_text(driver, PURPOSEOFTHECOMMUNITY, purpose);
        hideKeyboard();

        action.waitForElement(driver, CREATECOMMUNITY);
        action.click(driver, CREATECOMMUNITY, "Create Community...");

        common.pause(7);
        action.waitForElement(driver, COMMUNITYCREATEDTEXT);
        String communityCreated = action.findElementByXpath(driver, COMMUNITYCREATEDTEXT).getText();
        Assert.assertEquals(communityCreated, "Community created!");
        common.pause(5);
        action.click(driver, CreateGroup, "Create a group");
        common.pause(10);
        ClickOnCreateManually();
        common.pause(10);
        action.enter_text(driver, GroupNameField, CommunityNameManually);

        action.enter_text(driver, Description, CommunityNameManually);

        action.click(driver, CreateButton, "Create Button");
        common.pause(10);
        action.click(driver, RecordPost, "Record Post");

        action.waitForElement(driver, TEXTBUTTON);
        action.click(driver, TEXTBUTTON, "Click on Text");

        action.waitForElement(driver, TAPANYWHERE);
        action.click(driver, TAPANYWHERE, "Tap Anywhere");

        action.waitForElement(driver, STARTTYPING);
        action.click(driver, STARTTYPING, "Start Typing");

        action.waitForElement(driver, TYPETEXT);
        String starttyping = common.generateRandomChar(50);
        action.enter_text(driver, TYPETEXT, starttyping);


        action.waitForElement(driver,HIGHLIGHT);
        action.click(driver,HIGHLIGHT,"Highlight Text");

        for (int i = 1; i <= 7; i++) {
            String color = "(//android.widget.ImageView[@resource-id=\"com.begenuin.vishalnimralqa:id/viewColor\"])[" + i + "]";
            MobileElement fontOption = (MobileElement) driver.findElementByXPath(color);

            if (fontOption.isDisplayed()) {
                fontOption.click();  // Click on the font
                common.pause(2);  // Small delay for UI transition
            }
        }
        common.pause(5);
        hideKeyboard();

        action.waitForElement(driver, NEXTBTN);
        action.click(driver, NEXTBTN, "Next ");

        common.pause(10);
        String Captionchar = action.generateRandomChars(2000);
        action.enter_text(driver, Caption, Captionchar);
        common.pause(10);
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, AddLink);
        action.click(driver, AddLink, "Link add");
        action.waitForElement(driver, Url);

        action.enter_text(driver, Url, "www.testreport.io");
        driver.hideKeyboard();
        common.pause(10);
        action.waitForElement(driver, Done);
        action.click(driver, Done, "Done Button");

        action.waitForElement(driver, POSTBUTTON);
        action.click(driver, POSTBUTTON, "Post video");
    }

    public void enablePipModeForCarousel(){

        verify_Login_With_Phone_Number();
        common.pause(10);
        ClickOnCarousel();
        common.pause(10);

        action.waitForElement(driver,SELECTPOST);
        action.click(driver,SELECTPOST,"Click on Post");
        common.pause(5);
        driver.navigate().back();

        action.waitForElement(driver,PIPMODE);
        action.verifyElementIsDisplayed(driver,PIPMODE);

    }
}
