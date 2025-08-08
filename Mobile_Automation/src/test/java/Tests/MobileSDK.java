package Tests;

import Pages.MobileSDKPage;
import Utils.MobileBasePage;
import Utils.MobileCommon;
import org.testng.annotations.Test;

public class MobileSDK extends MobileBasePage {
    MobileCommon common = new MobileCommon();

    @Test
    public void Verify_Community_Feed_SDK() {
        MobileSDKPage mobilesdkPage = new MobileSDKPage(driver);
        mobilesdkPage.ClickOnCommunityFeed();
        mobilesdkPage.StandardViewForCommunity();
    }

    @Test
    public void Verify_Carousel_View(){
        MobileSDKPage mobilesdkPage = new MobileSDKPage(driver);
        mobilesdkPage.ClickOnCarousel();
        mobilesdkPage.CarouselView();
    }

    @Test
    public void Verify_Brand_Feed_View(){
        MobileSDKPage mobilesdkPage = new MobileSDKPage(driver);
        mobilesdkPage.ClickOnBrandFeed();
        mobilesdkPage.BrandFeedView();
    }

    @Test
    public void Load_Sdk_Menu(){
        MobileSDKPage mobilesdkPage = new MobileSDKPage(driver);
        //mobilesdkPage.ClickOnBrandFeed();
//        mobilesdkPage.ClickOnHome();
//        mobilesdkPage.ClickOnCreateCommunity();
//        mobilesdkPage.ClickOnCreateManually();
//        mobilesdkPage.CreateCommunity();
    }

    @Test
    public void Verify_Spark_Section(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        common.pause(15);
        mobileSDKPage.ClickOnHome();
        mobileSDKPage.BecomeACretor();
        mobileSDKPage.VerifySpark();
    }

    @Test
    public void Verify_Populer_Field(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.checkPopularFields();
    }

    @Test
    public void Verify_Latest_Field(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.checkLatestFields();
    }

    @Test
    public void Verify_Search_Field(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifySearchFunctionality();
        mobileSDKPage.searchWithProfileName();
        mobileSDKPage.searchWithKeyword();
        mobileSDKPage.searchWithTopicName();
    }

    @Test
    public void Verify_Community_Fields(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.Community();
        mobileSDKPage.groupTabOnCommunityPage();
        mobileSDKPage.memberTabOnCommunityPage();
        mobileSDKPage.aboutTabOnCommunityPage();
    }

    @Test
    public void Verify_Group_Fields(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyGroupDetail();
        mobileSDKPage.postTabOnGroupPage();
        mobileSDKPage.memberTabOnGroupPage();
    }

    @Test
    public void Verify_Post(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.uploadPost();
    }

    @Test
    public void create_Auto_Community(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.createAutoCommunity();
    }

    @Test
    public void create_Public_Community_For_Admin(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.ClickOnHome();
        mobileSDKPage.ClickOnCreateCommunity();
        mobileSDKPage.ClickOnCreateManually();
        mobileSDKPage.createPublicCommunityForAdmin();
    }

    @Test
    public void create_Public_Community_For_AllMember(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.ClickOnHome();
        mobileSDKPage.ClickOnCreateCommunity();
        mobileSDKPage.ClickOnCreateManually();
        mobileSDKPage.createPublicCommunityForAllMembers();
    }

    @Test
    public void create_Private_Community_For_AllMember(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.ClickOnHome();
        mobileSDKPage.ClickOnCreateCommunity();
        mobileSDKPage.ClickOnCreateManually();
        mobileSDKPage.createPrivateCommunityForAllMembers();
    }

    @Test
    public void create_Private_Community_For_Admin(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.ClickOnHome();
        mobileSDKPage.ClickOnCreateCommunity();
        mobileSDKPage.ClickOnCreateManually();
        mobileSDKPage.createPrivateCommunityForAdmin();
    }

    @Test
    public void verify_To_Login_With_Email(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verify_Login_With_Email();
    }


    @Test
    public void verify_Login_With_Phone_Number(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verify_Login_With_Phone_Number();
    }

    @Test
    public void verify_Logout(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verify_Logout();
    }

    @Test
    public void verify_Account_Setting(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verify_Account_Setting();
    }

    @Test
    public void verify_To_Create_Group_By_Everyone_For_AllCommunity(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.createGroupManuallyByEveryone_ForAllCommunity();

    }
    @Test
    public void verify_To_Create_Group_By_Everyone_For_Group_Members_Only(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.createGroupManuallyByEveryone_ForGroupMembersOnly();

    }


    @Test
    public void verify_To_Create_Group_By_Group_Members_For_Group_Members_Only(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.createGroupManuallyByGroupMembers_ForGroupMembersOnly();

    }

    @Test
    public void verify_To_Add_Comment_For_Post(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.addCommentOnPost();
    }

    @Test
    public void verify_To_Add_Video_Comment_For_Post(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.addVideoComment();
    }

    @Test
    public void verify_To_Delete_Video_Comment_For_Post(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.deleteVideoCommnet();
    }

    @Test
    public void verify_To_Add_Audio_Comments_For_Post(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.captureAudioComment();
    }

    @Test
    public void verify_To_Delete_Audio_Comments_For_Post(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.deleteAudioComment();
    }

    @Test
    public void verify_User_Profile(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.checkUserProfile();
    }

    @Test
    public void verify_To_Update_User_Name(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.modifyUsername();
    }

    @Test
    public void verify_To_Update_User_Bio(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.updateUserBio();
    }

    @Test
    public void verify_To_Update_User_SocialProfiles(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.updateUserSocialProfile();
    }

    @Test
    public void verify_Repost_Specific_Post_For_PopularField(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.repostParticularPostForPopularField();
    }

    @Test
    public void verify_Repost_Specific_Post_For_LatestField(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.repostParticularPostForLatestField();
    }

    @Test
    public void verify_Count_Notifications(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.countNotifications();
    }

    @Test
    public void verify_Record_Post_By_Audio(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.RecordPostByAudio();
    }

    @Test
    public void verify_Record_Post_By_Text(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.RecordPostByText();
    }

    @Test
    public void verify_Record_Post_By_Adjustable_Scale(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.recordPostWithAdjustableScale();
    }

    @Test
    public void verify_Record_Post_By_Adjustable_Time(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.recordPostWithCountdown();
    }

    @Test
    public void verify_Record_Text_Post_With_Styles(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.createPostWithTextVariations();
    }

    @Test
    public void verify_Mark_Post_As_NotInterested(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.markPostAsNotInterested();
    }

    @Test
    public void verify_UnMark_Post_As_NotInterested(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.undoNotInterestedOnPost();
    }

    @Test
    public void verify_Report_Post_Functionality(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.sendReportForPost();
    }

    @Test
    public void verify_To_Joined_Community(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyCommunityJoined();
    }

    @Test
    public void verify_Wallet_Functionality(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.checkWalletFeature();
    }

    @Test
    public void verify_Group_Notification_Functionality(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.enableGroupNotifications();
    }

    @Test
    public void verify_Auto_Generated_Group(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.generateAutoCreatedGroup();
    }

    @Test
    public void verify_Record_Post_With_Question_And_Answer(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.recordPostWithQuestionAndAnswer();
    }

    @Test
    public void verify_Carousel_In_Custom_Feed(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.checkCarouselInCustomFeed();
    }

    @Test
    public void verify_StandardWall_In_Custom_Feed(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.checkStandardWallInCustomFeed();
    }

    @Test
    public void verify_Video_Comment_After_Two_Minutes(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyVideoCommentAfterTwoMinutes();
    }

    @Test
    public void verify_Audio_Commnet_After_Two_Minutes(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyAudioCommentAfterTwoMinutes();
    }

    @Test
    public void verify_Post_Comment(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.createPostComment();
    }

    @Test
    public void verify_Transcription(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyTranscription();
    }

    @Test
    public void verify_Post_With_Torch_Processing(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.postWithTorchProcessing();
    }

    @Test
    public void verify_Gesture_Features(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyGestureFeatures();
    }

    @Test
    public void verify_Post_With_Five_Minutes_Dealy(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyPostWithFiveMinuteDelay();
    }

    @Test
    public void verify_Audio_Post_With_Five_Minutes_Dealy(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.verifyAudioPostWithFiveMinutesDealy();
    }


    @Test
    public void verify_Communities_Posts_In_Comments(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.checkCommunityPostInComments();
    }

    @Test
    public void verify_Sound_Status(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.manageSoundStatus();
    }

    @Test
    public void verify_Record_Text_Post_With_Style(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.recordTextPostWithStyle();
    }

    @Test
    public void verify_To_Enable_PIP_Mode_For_Carousel(){
        MobileSDKPage mobileSDKPage = new MobileSDKPage(driver);
        mobileSDKPage.enablePipModeForCarousel();
    }
}
