package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class EngagePage extends Locators {
    Common common = new Common(driver);

    public EngagePage(WebDriver driver) {

        super(driver);
    }

    public void selectBrand() {
        common.click(SELECT_ANY_BRAND);
        common.logPrint("Step ::Select Any brand");
        common.assertTwoValuesAreEqual(driver.getTitle(), "Build");
        common.logPrint("Step ::Verify that Dashboard page is open ");
    }

    public void ClickOnImportVideo() {
        common.logPrint("Step ::Click on import video");
        common.click(importVideoButton);
    }

    public void clickOnEngageEngineButton() {
        common.click(engageEngineButton);
        common.logPrint("Step ::Click on engage engine button");
    }

    public void clickOnUploadFolderButton() {
        common.click(uploadFolderButton);
        common.logPrint("Step ::Click on Upload Folder");
    }

    //    public  void ClickONFileUploadButton(){
//        File filePath=null;
//        String osName = System.getProperty("os.name");
//        if (osName.contains("Window")) {
//            filePath = new File("videosuploadinffails.mp4");
//        } else {
//            filePath = new File("uploads/OneView.png");
//        }
//        String absolutePath = filePath.getAbsolutePath();
//       common.logPrint("Step ::Upload file on attachment One View Field");
//        fileInputPath.sendKeys(absolutePath);
//        }
    public void clickOnFileUploadButton() {
        // Initialize file path variable
        File filePath = null;
        // Get OS name
        String osName = System.getProperty("os.name");
        // Set file path based on OS
        if (osName.contains("Windows")) {
            filePath = new File("video.mp4"); // Update path accordingly
        } else {
            filePath = new File("video.mp4"); // Update path accordingly
        }
        // Get the absolute path of the file
        String absolutePath = filePath.getAbsolutePath();
        // Log the action (ensure your common.log works as expected)
        common.logPrint("Step ::Uploading file to the attachment field");
        // Locate the file input element using XPath (ensure XPath matches the file input)
        WebElement fileInputPath = driver.findElement(By.xpath("//label[@for='file']/input[@type='file']"));
        // Upload the file using sendKeys()
        fileInputPath.sendKeys(absolutePath);
        // This is the correct way to upload a file
        common.waitUntilElementToBeVisible(By.xpath("(//span[@class=\"small\"])[3][contains(normalize-space(text()), '100')]"));
    }

    public void clickOnImportButton() {
        common.waitUntilElementsToBeVisible(By.xpath(importButton));
        common.click(importButton);
        common.logPrint("Step ::Click on import Button");
    }

    public void verify_Message() {
        String messgae = common.getText(verifyMessage);
        common.logPrint("Message:" + messgae);
        String expectedMessage = "Import your uploaded videos";
        common.assertTwoValuesAreEqual(messgae, expectedMessage);
    }

    public void VerifyMessage1() {
        String messgae = common.getText(verifyMessage);
        common.logPrint("Message:" + messgae);
        String expectedMessage = "Brand profile updated successfully";
        common.assertTwoValuesAreEqual(messgae, expectedMessage);
    }

    public void ClickOnActivity() {
        common.click(activityButton);
        common.logPrint("Step :: Click on activity button");
    }

    public void ClickOnPendingButton() {
        common.click(pendingButton);
        common.logPrint("Step ::Click on pending button");
    }

    public void ClickOnNextButton() {
        common.click(NEXTBUTTON);
        common.logPrint("Step ::Click on next Button");
    }

    public void ClickOnSocialImportButton() {
        common.click(socialImportButton);
        common.logPrint("Step ::Click On social import button");
    }

    public void ClickOnExpandArrow() {
        common.click(exapandArrow);
        common.logPrint("Step ::Click on expand arrow");
    }

    public void ClickOnManageHandles() {
        common.click(MangeHandles);
        common.logPrint("Step ::Click On manage handles");
    }

    public void ClickOnAddSocialHandle() {
        common.scroll_To_Element(addSocialHandle);
        common.click(addSocialHandle);
        common.logPrint("Step ::Click on add social handle");
    }

    public void AddYoutubeHandle() {
        common.click(youtuubeHandle);
        common.type(youtuubeHandle, common.generateRandomChars(7));
    }

    public void ClickOnSaveButton() {
        common.click(saveButton);
        common.logPrint("Step ::Click on save button");
    }

    public void HelloVisible() {
        common.isElementDisplayed(helloVisible);
        common.logPrint("Step :: Hello Visible");
    }

    public void HelloVisibleInManageHandle() {
        common.isElementDisplayed(youtuubeHandle);
        common.logPrint("Step :: Hello Visible");
    }

    public void ClickOnDelete() {
        common.click(deleteButton);
        common.logPrint("Step :: Click on delete button");
    }

    public boolean verify_Video_Deletion_Availability() {
        while (true) {
            // Step 1: Check if the video element is displayed
            if (common.isElementDisplayed("//div[@class='d-flex gap-2']")) {
                common.logPrint("Video can be delete.");
                return true; // Return true if the video is deletable
            }

            // Step 2: Check if the next button is clickable
            boolean isNextClickable = true;
            try {
                common.waitUntilElementToBeClickable(RIGHTARROW);
            } catch (Exception e) {
                isNextClickable = false;
            }

            if (isNextClickable) {
                common.click(RIGHTARROW);
                common.pause(3); // Pause to allow the next page to load
            } else {
                common.logPrint("No video is delete.");
                return false; // Return false if no more pages to check
            }
        }
    }

    public void verify_Hover_On_Video() {
        WebElement firstBox = driver.findElement(By.xpath("//img[@alt='text'][last()]"));
        common.scroll_To_Element(firstBox);
        common.mouseOver(driver, firstBox); // Hover over the box
        common.logPrint("Step :: Hovered on the first video");
    }

    public void clickOnView() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement viewButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space(text())='View']")));
        common.mouseOverClick(viewButton);
        common.logPrint("Step :: Verify on View Button on Engage page");
    }

    public void clickOnReject() {
        common.logPrint("Step :: Verify 'Reject' button is displayed  on Engage page");
        common.waitUntilElementToBeVisible(By.xpath(REJECT));
        common.click(REJECT);
    }

    public void verify_To_Rejection() {
        common.logPrint("Step ::Verify 'Reason For Rejection' is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(REJECTDESC));
        common.click(REJECTDESC);
        common.type(REJECTDESC, common.generateRandomChars(10));
    }

    public void clickOnRejection() {
        common.logPrint("Step :: Verify 'Reject' button is displayed  on Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SUBMIT));
        common.click(SUBMIT);
    }

    public void verify_Engagepage() {
        common.logPrint("Step:: Verify 'Import Videos' tab is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTVIDEOS));
        common.assertElementDisplayed(IMPORTVIDEOS);

        common.logPrint("Step:: Verify 'Activity' tab is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ACTIVITY));
        common.assertElementDisplayed(ACTIVITY);

        common.logPrint("Step:: Verify 'Data Logs' tab is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(DATALOGSFORENAGE));
        common.assertElementDisplayed(DATALOGSFORENAGE);

        common.logPrint("Step:: Verify 'Processing' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(PROCESSINGFORENAGE));
        common.assertElementDisplayed(PROCESSINGFORENAGE);

        common.logPrint("Step:: Verify 'Await Approval' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(AWAITAPPROVAL));
        common.assertElementDisplayed(AWAITAPPROVAL);

        common.logPrint("Step:: Verify 'Approved' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(APPROVED));
        common.assertElementDisplayed(APPROVED);

        common.logPrint("Step:: Verify 'Rejected' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(REJECTED));
        common.assertElementDisplayed(REJECTED);

        common.logPrint("Step:: Verify 'All' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLBUTTON));
        common.assertElementDisplayed(ALLBUTTON);

        common.logPrint("Step:: Verify 'Pending' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(PENDINGBUTTON));
        common.assertElementDisplayed(PENDINGBUTTON);

        common.logPrint("Step:: Verify 'Approved' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(APPROVEDBUTTON));
        common.assertElementDisplayed(APPROVEDBUTTON);

        common.logPrint("Step:: Verify 'Rejected' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(REJECTEDBUTTON));
        common.assertElementDisplayed(REJECTEDBUTTON);

        common.logPrint("Step:: Verify 'Filter By' label is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(FILTERBY));
        common.assertElementDisplayed(FILTERBY);

        common.logPrint("Step:: Verify 'Dropdown' is visible on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(DROPDOWN));
        common.assertElementDisplayed(DROPDOWN);

        common.logPrint("Step:: Verify 'Communities' section is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITIES));
        common.assertElementDisplayed(COMMUNITIES);

        common.logPrint("Step:: Verify 'Showing Communities' section is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SHOWINGCOMMUNITIES));
        common.assertElementDisplayed(SHOWINGCOMMUNITIES);

        common.logPrint("Step:: Verify 'Left Arrow' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(LEFTARROW));
        common.assertElementDisplayed(LEFTARROW);

        common.logPrint("Step:: Verify 'Right Arrow' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(RIGHTARROW));
        common.assertElementDisplayed(RIGHTARROW);

        common.logPrint("Step:: Verify 'Circle Symbol' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CIRCLESYMBOL));
        common.assertElementDisplayed(CIRCLESYMBOL);

        common.logPrint("Step:: Verify 'Heading' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(HEADING));
        common.assertElementDisplayed(HEADING);

        common.logPrint("Step:: Verify 'All Communities Box' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITIESBOX));
        common.assertElementDisplayed(ALLCOMMUNITIESBOX);
    }

    public void clickOnEditCommunity() {

        common.logPrint("Step:: Verify 'Edit Button' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITBUTTON));
        common.assertElementDisplayed(EDITBUTTON);
        common.click(EDITBUTTON);
    }

    public String verify_Add_Community_Details() {
        String CommunityRandomGenrated = common.generateRandomChars(30);
        common.type(COMMUNITYINPUT, CommunityRandomGenrated);
        common.type(HANDLEINPUT, CommunityRandomGenrated);
        String Desc = common.generateRandomChars(200);
        common.type(DESCRIPTIONINPUT, Desc);
        return CommunityRandomGenrated;
    }


    /**
     * Validate All Negative and positive and scenarios
     * for Edit Community
     */
    public void verify_Edit_Community() {

        common.logPrint("Step:: Verify 'Edit Community' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITCOMMUNITY));
        common.assertElementDisplayed(EDITCOMMUNITY);

        common.logPrint("Step:: Verify 'Community Details' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYDETAILS));
        common.assertElementDisplayed(COMMUNITYDETAILS);

        common.logPrint("Step:: Verify 'Community Details' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYDETAILS));
        common.assertElementDisplayed(COMMUNITYDETAILS);

        common.logPrint("Step:: Verify 'Back Button' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(BACKBUTTON));
        common.assertElementDisplayed(BACKBUTTON);

        common.logPrint("Step:: Verify 'Photo Icon' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(PHOTOICON));
        common.assertElementDisplayed(PHOTOICON);

        common.logPrint("Step:: Verify 'Community Name' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYNAME));
        common.assertElementDisplayed(COMMUNITYNAME);

        common.logPrint("Step:: Verify 'Community Words' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYWORDS));
        common.assertElementDisplayed(COMMUNITYWORDS);

        common.logPrint("Step:: Verify 'Community Input' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYINPUT));
        common.assertElementDisplayed(COMMUNITYINPUT);

        common.logPrint("Step:: Verify 'Community Handle' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYHANDLE));
        common.assertElementDisplayed(COMMUNITYHANDLE);

        common.logPrint("Step:: Verify 'Community Handle Words' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYHANDLEWORDS));
        common.assertElementDisplayed(COMMUNITYHANDLEWORDS);

        common.logPrint("Step:: Verify 'Handle Input' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(HANDLEINPUT));
        common.assertElementDisplayed(HANDLEINPUT);

        common.logPrint("Step:: Verify 'Description' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTION));
        common.assertElementDisplayed(DESCRIPTION);

        common.logPrint("Step:: Verify 'Description Words' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(DESCRIPTIONWORDS));
        common.assertElementDisplayed(DESCRIPTIONWORDS);

        common.logPrint("Step:: Verify 'Save Button' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SAVEBUTTONFORCOMMUNITY));
        common.assertElementDisplayed(SAVEBUTTONFORCOMMUNITY);

        common.logPrint("Step:: Verify 'Cancel Button' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CANCELBUTTON));
        common.assertElementDisplayed(CANCELBUTTON);

        common.logPrint("Step :: Verify 'community name' is displayed  on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITYINPUT));
        common.type(COMMUNITYINPUT, common.generateRandomChars(45));

        common.logPrint("Step:: Verify 'Save Button' is displayed and on the Engage page");
        common.click(SAVEBUTTONFORCOMMUNITY);

        common.logPrint("Step :: Verify 'Name is too long' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(NAMEALERT);
        String actualNameAlertText = common.getText(NAMEALERT);
        common.assertTwoValuesAreEqual(actualNameAlertText, "Name is too long");

        //enter words to input in handle exceeding limit
        common.logPrint("Step :: Verify 'Community Handle' is displayed  on the Engage page");
        common.type(HANDLEINPUT, common.generateRandomChars(45));

        common.logPrint("Step:: Verify 'Save Button' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SAVEBUTTONFORCOMMUNITY));
        common.click(SAVEBUTTONFORCOMMUNITY);

        common.logPrint("Step :: Verify 'Handle is too long' is displayed  on the Engage page");
        common.waitUntilElementToBeVisible(HANDLEALERT);
        common.assertElementDisplayed(HANDLEALERT);
        String actualHandleAlertText = common.getText(HANDLEALERT);
        common.assertTwoValuesAreEqual(actualHandleAlertText, "Handle is too long");

        //enter words in description exceeding limit
        common.logPrint("Step :: Verify typing data in description on the Engage page");
        common.type(DESCRIPTIONINPUT, common.generateRandomChars(400));

        common.logPrint("Step:: Verify 'Save' Button is displayed on the Engage page");
        common.click(SAVEBUTTONFORCOMMUNITY);

        common.logPrint("Step :: Verify 'Description is too long' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(DESCRIPTIONALERT);
        common.assertElementDisplayed(DESCRIPTIONALERT);
        String actualDescAlertText = common.getText(DESCRIPTIONALERT);
        common.assertTwoValuesAreEqual(actualDescAlertText, "Description is too long");

        //re-entering data in fields according to its limits and saving
        common.logPrint("Step :: Verify 'Edit Community Details' displayed on the Engage page");
        String CommunityRandomGenrated = verify_Add_Community_Details();
        String NewlyAddedHeadingText = CommunityRandomGenrated;

        common.logPrint("Step :: Verify 'Save' button is displayed  on the Engage page");
        common.click(SAVEBUTTONFORCOMMUNITY);
        common.pause(3);

        common.logPrint("Step :: Verify 'Community Name' is displayed  on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(HEADING));
        String newheadingtext = common.getText(HEADING);
        common.assertTwoValuesAreEqual(newheadingtext, CommunityRandomGenrated);
        common.click(EDITBUTTON);

        common.logPrint("Step :: Verify 'Edit Community' Details is displayed on the Engage page");
        CommunityRandomGenrated = common.generateRandomChars(30);
        common.type(COMMUNITYINPUT, CommunityRandomGenrated);
        common.type(HANDLEINPUT, CommunityRandomGenrated);
        common.type(DESCRIPTIONINPUT, common.generateRandomChars(200));

        common.logPrint("Step :: Verify 'Cancel' button is displayed  on the Engage page");
        common.click(CANCELBUTTON);

        common.logPrint("Step :: Verify 'Community Name' is displayed  on the Engage page");
        common.assertTwoValuesAreNotEqual(newheadingtext, CommunityRandomGenrated);

        common.logPrint("Step :: Verify 'Community name' is displayed same on the Engage page");
        common.assertTwoValuesAreEqual(newheadingtext, NewlyAddedHeadingText);
        // re-entering data in fields according to its limits and clicking back
        common.click(EDITBUTTON);

        common.logPrint("Step :: Verify  'Community name' is displayed on the Engage page");
        CommunityRandomGenrated = common.generateRandomChars(30);
        common.type(COMMUNITYINPUT, CommunityRandomGenrated);
        common.type(HANDLEINPUT, CommunityRandomGenrated);
        common.type(DESCRIPTIONINPUT, common.generateRandomChars(200));

        common.logPrint("Step :: Verify 'back' button is displayed  on the Engage page");
        common.click(BACKBUTTON);

        common.logPrint("Step :: Verify 'Community Details' is not same  on the Engage page");
        common.assertTwoValuesAreNotEqual(newheadingtext, CommunityRandomGenrated);

        common.logPrint("Step :: Verify 'Community Name' is same on the Engage page");
        common.assertTwoValuesAreEqual(newheadingtext, NewlyAddedHeadingText);
        //now uploading image logo
        common.logPrint("Step :: Verify 'Edit' button is displayed  on the Engage page");
        common.click(EDITBUTTON);

        File filePath = null;
        String osName = System.getProperty("os.name");
        if (osName.contains("Window")) {
            filePath = new File("uploads\\PQ_log.png");
        } else {
            filePath = new File("uploads/PQ_log.png");
        }

        String absolutePath = filePath.getAbsolutePath();
        common.logPrint("Step ::Verify Uploading file on attachment photo field on the Engage page");
        WebElement fileInputPath = driver.findElement(By.xpath("//div[@class='overflow-hidden crop-image']//input"));

        fileInputPath.sendKeys(absolutePath);
        common.pause(2);

        common.logPrint("Step :: Verify 'Save' Button is displayed  on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(ICONLOGOSAVE));
        common.click(ICONLOGOSAVE);

        common.logPrint("Step :: Verify 'Save' Button is displayed  on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(SAVEBUTTONFORCOMMUNITY));
        common.click(SAVEBUTTONFORCOMMUNITY);
    }

    /**
     * Validate All Negative and positive and scenarios
     * for Edit Group
     **/
    public String Enter_Group_Details(int groupNameLength, int descriptionLength) {
        String generatedGroupName = common.generateRandomChars(groupNameLength);
        String generatedDescription = common.generateRandomChars(descriptionLength);
        common.type(GROUPNAMEINPUT, generatedGroupName);
        common.type(EDITDESCRIPTIONINPUT, generatedDescription);
        return generatedGroupName; // Returning only Group Name Input
    }

    public void verify_Edit_Group() {
        common.logPrint("Step:: Verify 'Edit Group' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(EDITGROUPBUTTON);
        common.assertElementDisplayed(EDITGROUPBUTTON);
        common.waitUntilElementToBeClickable(EDITGROUPBUTTON);
        common.click(EDITGROUPBUTTON);

        common.logPrint("Step:: Verify 'Edit Group' Text is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPTEXT));
        common.assertElementDisplayed(EDITGROUPTEXT);

        common.logPrint("Step:: Verify 'Edit Group Back' Button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPBACKBUTTON));
        common.assertElementDisplayed(EDITGROUPBACKBUTTON);

        common.logPrint("Step:: Verify 'Group Details' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPDETAILS));
        common.assertElementDisplayed(GROUPDETAILS);

        common.logPrint("Step:: Verify 'Edit Group Name' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPNAME));
        common.assertElementDisplayed(EDITGROUPNAME);

        common.logPrint("Step:: Verify 'Edit Group Name Count' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPNAMECOUNT));
        common.assertElementDisplayed(EDITGROUPNAMECOUNT);

        common.logPrint("Step:: Verify 'Group Name Input' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(GROUPNAMEINPUT));
        common.assertElementDisplayed(GROUPNAMEINPUT);

        common.logPrint("Step:: Verify 'Edit Description' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITDESCRIPTION));
        common.assertElementDisplayed(EDITDESCRIPTION);

        common.logPrint("Step:: Verify 'Edit Description Count' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITDESCRIPTIONCOUNT));
        common.assertElementDisplayed(EDITDESCRIPTIONCOUNT);

        common.logPrint("Step:: Verify 'Edit Description Input' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITDESCRIPTIONINPUT));
        common.assertElementDisplayed(EDITDESCRIPTIONINPUT);

        common.logPrint("Step:: Verify 'Cancel' Button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITCANCELBUTTON));
        common.assertElementDisplayed(EDITCANCELBUTTON);

        common.logPrint("Step :: Verify  'Edit Community Group Name' is displayed  on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(GROUPNAMEINPUT));
        common.type(GROUPNAMEINPUT, common.generateRandomChars(45));

        common.logPrint("Step :: Verify 'Save' button is displayed  on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(EDITSAVEBUTTON));
        common.click(EDITSAVEBUTTON);

        common.logPrint("Step:: Verify  'Name is too long' text is displayed on the Engage page");
        String EditGroupAlertText = common.getText(EDITGROUPNAMEALERT);
        common.assertTwoValuesAreEqual(EditGroupAlertText, "Name is too long");

        common.logPrint("Step :: Verify 'Edit Community Description' is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(EDITDESCRIPTIONINPUT));
        common.type(EDITDESCRIPTIONINPUT, common.generateRandomChars(400));

        common.logPrint("Step :: Verify 'Save' button is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(EDITSAVEBUTTON));
        common.click(EDITSAVEBUTTON);

        common.logPrint("Step:: Verify 'Description is too long' text is displayed on the Engage page");
        String EditGroupDescText = common.getText(EDITGROUPDESCRIPTIONALERT);
        common.assertTwoValuesAreEqual(EditGroupDescText, "Description is too long");

        common.logPrint("Step:: Verify 'Edit Group Details' displayed on the Engage page");
        String EditPageNewHeading = Enter_Group_Details(40, 300);

        common.logPrint("Step :: Verify  'Save' button is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(EDITSAVEBUTTON));
        common.click(EDITSAVEBUTTON);

        common.logPrint("Step :: Verify 'Group Name' is displayed on the Engage page");
        common.pause(3);
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPHEADING));
        common.assertElementDisplayed(EDITGROUPHEADING);
        common.assertTwoValuesAreEqual(EditPageNewHeading, common.getText(EDITGROUPHEADING));

        common.logPrint("Step :: Verify 'Edit Group' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPBUTTON));
        common.click(EDITGROUPBUTTON);

        common.logPrint("Step:: Verify 'Edit Group Details' displayed on the Engage page");
        String EditPageCancelledHeading = Enter_Group_Details(40, 300);

        common.logPrint("Step :: Verify 'Cancel' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITCANCELBUTTON));
        common.click(EDITCANCELBUTTON);

        common.logPrint("Step :: Verify 'Edit Group Name' text is displayed  on the Engage page");
        common.assertTwoValuesAreNotEqual(EditPageCancelledHeading, common.getText(EDITGROUPHEADING));
        common.assertTwoValuesAreEqual(EditPageNewHeading, common.getText(EDITGROUPHEADING));

        // re-entering data in fields according to its limits and clicking back
        common.logPrint("Step :: Verify 'Edit Group' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPBUTTON));
        common.click(EDITGROUPBUTTON);

        common.logPrint("Step:: Verify 'Edit Group Details' displayed on the Engage page");
        String EditPageBackHeading = Enter_Group_Details(40, 300);

        common.logPrint("Step :: Verify 'Back' button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(EDITGROUPBACKBUTTON));
        common.click(EDITGROUPBACKBUTTON);

        common.logPrint("Step :: Verify 'Edit Group Name' text is displayed  on the Engage page");
        common.assertTwoValuesAreNotEqual(EditPageBackHeading, common.getText(EDITGROUPHEADING));
        common.assertTwoValuesAreEqual(EditPageNewHeading, common.getText(EDITGROUPHEADING));
    }

    public int count_Videos() {
        int totalVideoBoxCount = 0;
        int pageCount = 0;  // Track the number of pages traversed

        while (true) {
            // Step 1: Check if video boxes exist
            List<WebElement> videoBoxes = common.findElements(VIDEOBOXES);
            int videoBoxCountOnPage;
            videoBoxCountOnPage = ((List<?>) videoBoxes).size();
            totalVideoBoxCount += videoBoxCountOnPage;
            common.logPrint("Page " + (pageCount + 1) + ": Found " + videoBoxCountOnPage +
                    (videoBoxCountOnPage == 1 ? " video " : " videos" + " on the Engage page"));
            // Step 2: Check if the right arrow is clickable
            boolean isClickable = true;
            try {
                common.waitUntilElementToBeClickable(RIGHTARROW);
            } catch (Exception e) {
                isClickable = false;
            }
            if (isClickable) {
                common.logPrint("Step :: Verify 'Next Page' button is displayed on the Engage page");
                common.click(RIGHTARROW);
                pageCount++; // Move to the next page
                common.pause(3);

            } else {
                // If the right arrow is not clickable, last page reached
                common.logPrint("Step ::Verify Last page reached  No more pages to traverse on the Engage page");
                break;
            }
        }
        common.logPrint("Total number of video boxes across all pages: " + totalVideoBoxCount);
        return totalVideoBoxCount;
    }

    public void verify_Video_Count_On_All_Tab() {
        common.logPrint("Step:: Verify 'All' button is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(ALLBUTTON));
        common.click(ALLBUTTON);

        int totalVideoBoxCount = count_Videos();
        int awaitApprovalCountDisplayed = Integer.parseInt(common.getText(AWAITAPPROVALCOUNT).trim());
        int approvedCountDisplayed = Integer.parseInt(common.getText(APPROVEDCOUNT).trim());
        int rejectedCountDisplayed = Integer.parseInt(common.getText(REJECTEDCOUNT).trim());
        int totalCount = awaitApprovalCountDisplayed + approvedCountDisplayed + rejectedCountDisplayed;

        common.logPrint("Await Approval: " + awaitApprovalCountDisplayed);
        common.logPrint("Approved: " + approvedCountDisplayed);
        common.logPrint("Rejected: " + rejectedCountDisplayed);
        common.logPrint("Total Count: " + totalCount);
        common.logPrint("Step:: Verify that the counted number of elements (" + totalVideoBoxCount + ") matches the expected number (" + totalCount + ")");
        common.assertTwoValuesAreEqual(totalVideoBoxCount, totalCount);
    }

    public void verify_Video_Count_On_Pending_Tab() {
        common.logPrint("Step:: Verify 'Pending' button is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(PENDINGBUTTON));
        common.click(PENDINGBUTTON);
        common.pause(3);

        int totalVideoBoxCount = count_Videos();
        int awaitApprovalCountDisplayed = Integer.parseInt(common.getText(AWAITAPPROVALCOUNT).trim());

        common.logPrint("Await Approval: " + awaitApprovalCountDisplayed);
        common.logPrint("Step:: Verify counted number of elements (" + totalVideoBoxCount + ") matches the expected number (" + awaitApprovalCountDisplayed + ")");
        common.assertTwoValuesAreEqual(totalVideoBoxCount, awaitApprovalCountDisplayed);
    }

    public void verify_Video_Count_On_Approved_Tab() {
        common.logPrint("Step:: Verify 'Approved' button is displayed on the Engage page");
        common.click(APPROVEDBUTTON);
        common.pause(3);
        int totalVideoBoxCount = count_Videos();
        int approvedCountDisplayed = Integer.parseInt(common.getText(APPROVEDCOUNT).trim());
        common.logPrint("Approved: " + approvedCountDisplayed);
        common.logPrint("Step:: Verify that the counted number of elements (" + totalVideoBoxCount + ") matches the expected number (" + approvedCountDisplayed + ")");
        common.assertTwoValuesAreEqual(totalVideoBoxCount, approvedCountDisplayed);
    }

    public void verify_Video_Count_On_Rejected_Tab() {
        common.click(REJECTEDBUTTON);
        common.pause(3);
        int totalVideoBoxCount = count_Videos();
        int rejectedCountDisplayed = Integer.parseInt(common.getText(REJECTEDCOUNT).trim());
        common.logPrint("Rejected: " + rejectedCountDisplayed);
        common.logPrint("Step:: Verify that the counted number of elements (" + totalVideoBoxCount + ") matches the expected number (" + rejectedCountDisplayed + ")");
        common.assertTwoValuesAreEqual(totalVideoBoxCount, rejectedCountDisplayed);
    }

    public void verify_Communities_For_All_Pages() {
        common.pause(5);
        while (true) {
            common.waitUntilElementToBeVisible(HEADING);
            common.verifyElementIsDisplayed(HEADING);
            String headingText = common.getText(HEADING);
            common.logPrint("Step:: Heading text retrieved: " + headingText + " is displayed on Engage page ");

            common.logPrint("Step:: Verify 'Communities dropdown' is displayed on Engage page");
            common.waitUntilElementToBeVisible(COMMUNITIES);
            common.verifyElementIsDisplayed(COMMUNITIES);
            common.click(COMMUNITIES);
            common.pause(2);
            common.scroll_To_Element("//p[normalize-space()='" + headingText + "']");

            boolean isHeadingPresent = common.isElementDisplayed("//p[normalize-space()='" + headingText + "']");
            if (isHeadingPresent) {
                common.logPrint(" Step ::'Community found' in dropdown on Engage page");
            } else {
                common.logPrint(" Step ::'Community not found' in dropdown on Engage page");
            }
            // Step 4: Check if the right arrow is clickable
            boolean isRightArrowClickable = true;
            try {
                common.waitUntilElementToBeClickable(RIGHTARROW);
            } catch (Exception e) {
                isRightArrowClickable = false;
            }
            // Step 5: Click the right arrow if possible, else break the loop
            if (isRightArrowClickable) {
                common.logPrint("Step :: Verify 'Forward' is displayed  on Engage page");
                common.click(RIGHTARROW);
                common.pause(3);
            } else {
                common.logPrint("Reached the last page Stopping navigation on Engage page");
                break;
            }
        }
    }

    public void verify_Data_Logs() {
        common.logPrint("Step:: Verify 'Activity' is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(activityButton));
        common.assertElementDisplayed(activityButton);

        common.logPrint("Step:: Verify 'Import Video' Button is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(importVideoButton));
        common.assertElementDisplayed(importVideoButton);

        common.logPrint("Step:: Verify 'Data Logs' is display on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(DATALOGS));
        common.assertElementDisplayed(DATALOGS);
        common.click(DATALOGS);

        common.logPrint("Step:: Verify 'Home Page' is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(HOMEPAGE));
        common.assertElementDisplayed(HOMEPAGE);

        common.logPrint("Step:: Verify 'Social Import' Button is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(SOCIALIMPORTONDATALOGS));
        common.assertElementDisplayed(SOCIALIMPORTONDATALOGS);

        common.logPrint("Step:: Verify 'UPLOADS' Button is displyed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(UPLOADS));
        common.verifyElementIsDisplayed(UPLOADS);

        common.logPrint("Step:: Verify 'Clip it' Button is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPIT));
        common.verifyElementIsDisplayed(CLIPIT);

        common.logPrint("Step:: Verify 'Imports' Text is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(IMPORTS));
        common.verifyElementIsDisplayed(IMPORTS);

        common.logPrint("Step:: Verify 'Duration Time' is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(DURATIONTIME));
        common.verifyElementIsDisplayed(DURATIONTIME);

        common.logPrint("Step:: Verify 'Status' is displyed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(STATUS));
        common.verifyElementIsDisplayed(STATUS);

        common.logPrint("Step:: Verify 'Select Status' is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(SELECTSTATUS));
        common.verifyElementIsDisplayed(SELECTSTATUS);
        common.click(SELECTSTATUS);

        common.logPrint("Step:: Verify 'All' is displayed on the Dropdown");
        common.waitUntilElementsToBeVisible(By.xpath(ALLSTATUS));
        common.verifyElementIsDisplayed(ALLSTATUS);

        common.click(SELECTSTATUS);
        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Processing' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(PROCESSING));
        common.click(PROCESSING);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Completed' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(COMPLETED));
        common.click(COMPLETED);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Failed' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(FAILED));
        common.click(FAILED);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'All' is click on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(ALLSTATUS));
        common.click(ALLSTATUS);

        common.logPrint("Step:: Verify 'FILTER' is displayed on the Engage Page ");
        common.waitUntilElementsToBeVisible(By.xpath(FILTER));
        common.verifyElementIsDisplayed(FILTER);

        common.logPrint("Step:: Verify 'Date' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(DATE));
        common.assertElementDisplayed(DATE);

        common.logPrint("Step:: Verify 'Import By' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTEDBY));
        common.assertElementDisplayed(IMPORTEDBY);

        common.logPrint("Step:: Verify 'Imports Status' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTSTATUS));
        common.assertElementDisplayed(IMPORTSTATUS);

        common.logPrint("Step:: Verify 'Total Brands' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(TOTALBRANDS));
        common.assertElementDisplayed(TOTALBRANDS);

        common.logPrint("Step:: Verify 'Total Submit' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(TOTALSUBMITTED));
        common.assertElementDisplayed(TOTALSUBMITTED);

        common.logPrint("Step:: Verify 'Total Imported' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(TOTALIMPORTED));
        common.assertElementDisplayed(TOTALIMPORTED);

        common.logPrint("Step:: Verify 'Total Approve' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(TOTALAPPROVED));
        common.assertElementDisplayed(TOTALAPPROVED);

        common.logPrint("Step:: Verify 'Note' is displayed on the Date Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(NOTE));
        common.assertElementDisplayed(NOTE);

        common.logPrint("Step:: Verify 'Pagination' is displayed on the Engage Page ");
        common.waitUntilElementsToBeVisible(By.xpath(PAGINATIONFOOTER));
        common.verifyElementIsDisplayed(PAGINATIONFOOTER);

        common.logPrint("Step:: Verify 'Page Count' is displayed on the Engage Page ");
        common.waitUntilElementsToBeVisible(By.xpath(PAGE_COUNT));
        common.verifyElementIsDisplayed(PAGE_COUNT);
    }

    public void verify_Data_Logs_For_Upload() {
        common.logPrint("Step:: Verify 'Data Logs' is display on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(DATALOGS));
        common.assertElementDisplayed(DATALOGS);
        common.click(DATALOGS);

        common.logPrint("Step:: Verify 'Home Page' is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(HOMEPAGE));
        common.verifyElementIsDisplayed(HOMEPAGE);

        common.logPrint("Step:: Verify 'Social Import' Button is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(SOCIALIMPORTONDATALOGS));
        common.assertElementDisplayed(SOCIALIMPORTONDATALOGS);

        common.logPrint("Step:: Verify 'UPLOADS' Button is displyed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(UPLOADS));
        common.verifyElementIsDisplayed(UPLOADS);

        common.logPrint("Step:: Verify 'Clip it' Button is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPIT));
        common.verifyElementIsDisplayed(CLIPIT);

        common.click(UPLOADS);

        common.logPrint("Step:: Verify 'Imports' Text is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(IMPORTS));
        common.verifyElementIsDisplayed(IMPORTS);

        common.logPrint("Step:: Verify 'Duration Time' is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(DURATIONTIME));
        common.verifyElementIsDisplayed(DURATIONTIME);

        common.logPrint("Step:: Verify 'Status' is displyed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(STATUS));
        common.verifyElementIsDisplayed(STATUS);
        common.pause(5);

        common.logPrint("Step:: Verify 'Select Status' is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(SELECTSTATUS));
        common.verifyElementIsDisplayed(SELECTSTATUS);
        common.click(SELECTSTATUS);

        common.logPrint("Step:: Verify 'All' is displayed on the Dropdown");
        common.waitUntilElementsToBeVisible(By.xpath(ALLSTATUS));
        common.verifyElementIsDisplayed(ALLSTATUS);

        common.click(SELECTSTATUS);
        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Processing' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(PROCESSING));
        common.click(PROCESSING);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Completed' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(COMPLETED));
        common.click(COMPLETED);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Failed' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(FAILED));
        common.click(FAILED);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'All' is click on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(ALLSTATUS));
        common.click(ALLSTATUS);

        common.logPrint("Step:: Verify 'Source' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(SOURCE));
        common.verifyElementIsDisplayed(SOURCE);
        common.pause(5);

        common.logPrint("Step :: Verify 'Select Source' is displayed on the Data Log Page ");
        common.waitUntilElementToBeVisible(By.xpath(SELECTSOURCE));
        common.verifyElementIsDisplayed(SELECTSOURCE);
        common.click(SELECTSOURCE);

        common.logPrint("Step :: Verify 'All' is displayed on the Data Log Page ");
        common.waitUntilElementToBeVisible(By.xpath(ALLSTATUS));
        common.verifyElementIsDisplayed(ALLSTATUS);
        common.click(ALLSTATUS);

        common.logPrint("Step:: Verify 'NAME' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(NAME));
        common.verifyElementIsDisplayed(NAME);

        common.logPrint("Step:: Verify 'Import By' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTBY));
        common.verifyElementIsDisplayed(IMPORTBY);

        common.logPrint("Step:: Verify 'Source Label' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(SOURCELABEL));
        common.verifyElementIsDisplayed(SOURCELABEL);

        common.logPrint("Step:: Verify 'Date Label' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(DATELABEL));
        common.verifyElementIsDisplayed(DATELABEL);

        common.logPrint("Step:: Verify 'Import Status' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTSTATUSLABEL));
        common.verifyElementIsDisplayed(IMPORTSTATUSLABEL);

        common.logPrint("Step:: Verify 'Posted' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(POSTED));
        common.verifyElementIsDisplayed(POSTED);

        common.logPrint("Step:: Verify 'Pagination' is displayed on the Engage Page ");
        common.waitUntilElementsToBeVisible(By.xpath(PAGINATIONFOOTER));
        common.verifyElementIsDisplayed(PAGINATIONFOOTER);

        common.logPrint("Step:: Verify 'Page Count' is displayed on the Engage Page ");
        common.waitUntilElementsToBeVisible(By.xpath(PAGE_COUNT));
        common.verifyElementIsDisplayed(PAGE_COUNT);
    }

    public void verify_Data_Logs_For_ClipIt(){
        common.logPrint("Step:: Verify 'Data Logs' is display on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(DATALOGS));
        common.assertElementDisplayed(DATALOGS);
        common.click(DATALOGS);

        common.logPrint("Step:: Verify 'Home Page' is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(HOMEPAGE));
        common.assertElementDisplayed(HOMEPAGE);

        common.logPrint("Step:: Verify 'Social Import' Button is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(SOCIALIMPORTONDATALOGS));
        common.assertElementDisplayed(SOCIALIMPORTONDATALOGS);

        common.logPrint("Step:: Verify 'UPLOADS' Button is displyed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(UPLOADS));
        common.verifyElementIsDisplayed(UPLOADS);

        common.logPrint("Step:: Verify 'Clip it' Button is displayed on the Engage Page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPIT));
        common.verifyElementIsDisplayed(CLIPIT);

        common.click(CLIPIT);

        common.logPrint("Step:: Verify 'Imports' Text is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(IMPORTS));
        common.verifyElementIsDisplayed(IMPORTS);

        common.logPrint("Step:: Verify 'Duration Time' is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(DURATIONTIME));
        common.verifyElementIsDisplayed(DURATIONTIME);

        common.logPrint("Step:: Verify 'Status' is displyed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(STATUS));
        common.verifyElementIsDisplayed(STATUS);
        common.pause(5);

        common.logPrint("Step:: Verify 'Select Status' is displayed on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(SELECTSTATUS));
        common.verifyElementIsDisplayed(SELECTSTATUS);
        common.click(SELECTSTATUS);

        common.logPrint("Step:: Verify 'All' is displayed on the Dropdown");
        common.waitUntilElementsToBeVisible(By.xpath(ALLSTATUS));
        common.verifyElementIsDisplayed(ALLSTATUS);

        common.click(SELECTSTATUS);
        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Processing' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(PROCESSING));
        common.click(PROCESSING);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Completed' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(COMPLETED));
        common.click(COMPLETED);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'Failed' is displayed on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(FAILED));
        common.click(FAILED);

        common.click(SELECTSTATUS);
        common.logPrint("Step:: Verify 'All' is click on the DropDown");
        common.waitUntilElementsToBeVisible(By.xpath(ALLSTATUS));
        common.click(ALLSTATUS);

        common.logPrint("Step:: Verify 'Source' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(SOURCE));
        common.verifyElementIsDisplayed(SOURCE);
        common.pause(5);

        common.logPrint("Step :: Verify 'Select Source' is displayed on the Data Log Page ");
        common.waitUntilElementToBeVisible(By.xpath(SELECTSOURCE));
        common.verifyElementIsDisplayed(SELECTSOURCE);
        common.click(SELECTSOURCE);

        common.logPrint("Step :: Verify 'All' is displayed on the Data Log Page ");
        common.waitUntilElementToBeVisible(By.xpath(ALLSTATUS));
        common.verifyElementIsDisplayed(ALLSTATUS);
        common.click(ALLSTATUS);

        common.logPrint("Step:: Verify 'Source Video' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(SOURCEVIDEO));
        common.verifyElementIsDisplayed(SOURCEVIDEO);

        common.logPrint("Step:: Verify 'Source Video' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTBY));
        common.verifyElementIsDisplayed(IMPORTBY);

        common.logPrint("Step:: Verify 'Source' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(SOURCEFORCLIPIT));
        common.verifyElementIsDisplayed(SOURCEFORCLIPIT);

        common.logPrint("Step:: Verify 'Import At' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTAT));
        common.verifyElementIsDisplayed(IMPORTAT);

        common.logPrint("Step:: Verify 'Import Status' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTSTATUSFORCLIP));
        common.verifyElementIsDisplayed(IMPORTSTATUSFORCLIP);

        common.logPrint("Step:: Verify 'Granted At' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATEDAT));
        common.verifyElementIsDisplayed(GENERATEDAT);

        common.logPrint("Step:: Verify 'Total Created' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(TOTALCREATED));
        common.verifyElementIsDisplayed(TOTALCREATED);

        common.logPrint("Step:: Verify 'Total Posted' is displayed on the Data Logs Page");
        common.waitUntilElementToBeVisible(By.xpath(TOTALPOSTED));
        common.verifyElementIsDisplayed(TOTALPOSTED);

        common.logPrint("Step:: Verify 'Pagination' is displayed on the Engage Page ");
        common.waitUntilElementsToBeVisible(By.xpath(PAGINATIONFOOTER));
        common.verifyElementIsDisplayed(PAGINATIONFOOTER);

        common.logPrint("Step:: Verify 'Page Count' is displayed on the Engage Page ");
        common.waitUntilElementsToBeVisible(By.xpath(PAGE_COUNT));
        common.verifyElementIsDisplayed(PAGE_COUNT);
    }

    public void clickOnImportVideos() {
        common.logPrint("Step:: Verify 'Import videos' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTVIDEOS));
        common.assertElementDisplayed(IMPORTVIDEOS);
        common.click(IMPORTVIDEOS);
    }

    public void verify_Import_Videos(){
        common.logPrint("Step:: Verify 'Social Imports' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SOCIALIMPORTFORIMPORTVIDEOS));
        common.assertElementDisplayed(SOCIALIMPORTFORIMPORTVIDEOS);

        common.logPrint("Step:: Verify 'Uploads' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(UPLOADSFORIMPORTVIDEOS));
        common.assertElementDisplayed(UPLOADSFORIMPORTVIDEOS);

        common.logPrint("Step:: Verify 'Clip It' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPITFORIMPORTVIDEOS));
        common.assertElementDisplayed(CLIPITFORIMPORTVIDEOS);

        common.logPrint("Step:: Verify 'From URL' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(FROMURL));
        common.assertElementDisplayed(FROMURL);

        common.logPrint("Step:: Verify 'Blog To Video' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(BLOGTOVIDEO));
        common.assertElementDisplayed(BLOGTOVIDEO);

        common.logPrint("Step:: Verify 'GeneratedVideos' text  is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(GENERATEDVIDEOSTITLE));
        common.assertElementDisplayed(GENERATEDVIDEOSTITLE);

        common.logPrint("Step:: Verify 'SearchInput' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHINPUT));
        common.assertElementDisplayed(SEARCHINPUT);

        common.logPrint("Step:: Verify 'Generated videos' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(GENRATEDVIDEOS));
        common.assertElementDisplayed(GENRATEDVIDEOS);
    }


    public void verify_Social_Imports(){
        common.logPrint("Step:: Verify 'Social Imports' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SOCIALIMPORTFORIMPORTVIDEOS));
        common.assertElementDisplayed(SOCIALIMPORTFORIMPORTVIDEOS);
        common.click(SOCIALIMPORTFORIMPORTVIDEOS);

        common.logPrint("Step:: Verify 'Imports in' is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(IMPORTINFORSOCIALIMPORT));
        common.assertElementDisplayed(IMPORTINFORSOCIALIMPORT);

        common.logPrint("Step:: Verify 'All Communities' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITIESFORSOCIALIMPORT));
        common.assertElementDisplayed(ALLCOMMUNITIESFORSOCIALIMPORT);

        common.logPrint("Step:: Verify 'All Groups' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLGROUPSFORSOCIALIMPORT));
        common.assertElementDisplayed(ALLGROUPSFORSOCIALIMPORT);

        common.logPrint("Step:: Verify 'Video Will Automatically' Text is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(VIDEOWILLTEXTFORSOCIALIMPORT));
        common.assertElementDisplayed(VIDEOWILLTEXTFORSOCIALIMPORT);

        common.logPrint("Step:: Verify 'To Data Logs' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(TODATALOGSBUTTON));
        common.assertElementDisplayed(TODATALOGSBUTTON);

        common.logPrint("Step:: Verify 'All' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLFORSOCIALIMPORT));
        common.assertElementDisplayed(ALLFORSOCIALIMPORT);

        common.logPrint("Step:: Verify 'My Brand' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(MYBRANDFORSOCIALIMPORT));
        common.assertElementDisplayed(MYBRANDFORSOCIALIMPORT);

        common.logPrint("Step:: Verify 'Consumer Brand' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CONSUMERBRANDFORSOCIALIMPORT));
        common.assertElementDisplayed(CONSUMERBRANDFORSOCIALIMPORT);

        common.logPrint("Step:: Verify 'Select All Checkbox' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTALLCHECKBOX));
        common.assertElementDisplayed(SELECTALLCHECKBOX);

        common.logPrint("Step:: Verify 'Select All Social Import' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SELECTALL));
        common.assertElementDisplayed(SELECTALL);

        common.logPrint("Step:: Verify 'Search For Brand' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHFORBRAND));
        common.assertElementDisplayed(SEARCHFORBRAND);

        common.logPrint("Step:: Verify 'Import' Button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTBUTTONFORSOCIALIMPORT));
        common.assertElementDisplayed(IMPORTBUTTONFORSOCIALIMPORT);
    }

    public void verify_Uploads(){
        common.logPrint("Verify 'Uploads' Button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(UPLOADSFORIMPORTVIDEOS));
        common.assertElementDisplayed(UPLOADSFORIMPORTVIDEOS);
        common.click(UPLOADSFORIMPORTVIDEOS);

        common.logPrint("Step:: Verify 'Import In' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTINFORUPLOADS));
        common.assertElementDisplayed(IMPORTINFORUPLOADS);

        common.logPrint("Step:: Verify 'All Communities' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITIESFORUPLOADS));
        common.assertElementDisplayed(ALLCOMMUNITIESFORUPLOADS);

        common.logPrint("Step:: Verify 'All Groups' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLGROUPSFORUPLOADS));
        common.assertElementDisplayed(ALLGROUPSFORUPLOADS);

        common.logPrint("Step:: Verify 'Video Will Text' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(VIDEOWILLTEXTFORUPLOADS));
        common.assertElementDisplayed(VIDEOWILLTEXTFORUPLOADS);

        common.logPrint("Step:: Verify 'File Upload Area' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(FILEUPLOADAREAFORUPLOADS));
        common.assertElementDisplayed(FILEUPLOADAREAFORUPLOADS);

        common.logPrint("Step:: Verify 'Settings ' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SETTINGSFORUPLOADS));
        common.assertElementDisplayed(SETTINGSFORUPLOADS);

        common.logPrint("Step:: Verify 'Settings Options' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SETTINGSOPTIONSBOXFORUPLOADS));
        common.assertElementDisplayed(SETTINGSOPTIONSBOXFORUPLOADS);

        common.logPrint("Step:: Verify 'Advanced ' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ADVANCEDFORUPLOADS));
        common.assertElementDisplayed(ADVANCEDFORUPLOADS);

        common.logPrint("Step:: Verify 'Advanced Options' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ADVANCEDOPTIONSBOXFORUPLOADS));
        common.assertElementDisplayed(ADVANCEDOPTIONSBOXFORUPLOADS);

        common.logPrint("Step:: Verify 'Import Button ' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTBUTTONFORUPLOADS));
        common.assertElementDisplayed(IMPORTBUTTONFORUPLOADS);

    }

    public void verify_Clip_It(){
        common.logPrint("Verify 'Clip it' Button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPITFORIMPORTVIDEOS));
        common.assertElementDisplayed(CLIPITFORIMPORTVIDEOS);
        common.click(CLIPITFORIMPORTVIDEOS);

        common.logPrint("Step:: Verify 'Import' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTINFORCLIPIT));
        common.assertElementDisplayed(IMPORTINFORCLIPIT);

        common.logPrint("Step:: Verify 'All Communities' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLCOMMUNITIESFORCLIPIT));
        common.assertElementDisplayed(ALLCOMMUNITIESFORCLIPIT);

        common.logPrint("Step:: Verify 'All Groups' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ALLGROUPSFORCLIPIT));
        common.assertElementDisplayed(ALLGROUPSFORCLIPIT);

        common.logPrint("Step:: Verify 'Videos Will Automatically' text is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(VIDEOWILLAUTOMATICALLYFORCLIPIT));
        common.assertElementDisplayed(VIDEOWILLAUTOMATICALLYFORCLIPIT);

        common.logPrint("Step:: Verify 'URL Icon' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(URLICONFORCLIPIT));
        common.assertElementDisplayed(URLICONFORCLIPIT);

        common.logPrint("Step:: Verify 'Video URL Input' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(VIDEOURLINPUT));
        common.assertElementDisplayed(VIDEOURLINPUT);

        common.logPrint("Step:: Verify 'Drop Link' text is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(DROPLINK));
        common.assertElementDisplayed(DROPLINK);

        common.logPrint("Step:: Verify 'Add Your Own Media' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ADDYOUROWNMEDIA));
        common.assertElementDisplayed(ADDYOUROWNMEDIA);

        common.logPrint("Step:: Verify 'Video Upload' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(FILEUPLOADAREAFORCLIPIT));
        common.assertElementDisplayed(FILEUPLOADAREAFORCLIPIT);

        common.logPrint("Step:: Verify 'Clipping Content' text is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPPINGCONTENT));
        common.assertElementDisplayed(CLIPPINGCONTENT);

        common.logPrint("Step:: Verify 'Settings' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SETTINGSFORCLIPIT));
        common.assertElementDisplayed(SETTINGSFORCLIPIT);

        common.logPrint("Step:: Verify 'Settings Options' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(SETTINGSOPTIONSBOXFORCLIPIT));
        common.assertElementDisplayed(SETTINGSOPTIONSBOXFORCLIPIT);

        common.logPrint("Step:: Verify 'Advanced' Text is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ADVANCEDFORCLIPIT));
        common.assertElementDisplayed(ADVANCEDFORCLIPIT);

        common.logPrint("Step:: Verify 'Advanced Options' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(ADVANCEDOPTIONSBOXFORCLIPIT));
        common.assertElementDisplayed(ADVANCEDOPTIONSBOXFORCLIPIT);

        common.logPrint("Step:: Verify 'Get Clips' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(GETCLIPSFORCLIPIT));
        common.assertElementDisplayed(GETCLIPSFORCLIPIT);
    }
    public void upload_Youtube_Link_For_Clip_It(){
        common.logPrint("Verify 'Clip it' Button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPITFORIMPORTVIDEOS));
        common.assertElementDisplayed(CLIPITFORIMPORTVIDEOS);
        common.click(CLIPITFORIMPORTVIDEOS);

        common.logPrint("Step:: Verify 'Youtube Link' Upload on the Engage Page");
        common.waitUntilElementsToBeVisible(By.xpath(VIDEOURLINPUT));
        common.assertElementDisplayed(VIDEOURLINPUT);
        common.type(VIDEOURLINPUT,"https://youtu.be/U4YNQjFfl7w?si=WoRb39joThdjDXLx");

        common.logPrint("Step:: Verify 'Get Clips' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(GETCLIPSFORCLIPIT));
        common.assertElementDisplayed(GETCLIPSFORCLIPIT);
        common.click(GETCLIPSFORCLIPIT);

        common.logPrint("Step:: Verify 'Clips Being Processing' is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(CLIPSBEINGPROCESING));
        common.assertElementDisplayed(CLIPSBEINGPROCESING);
    }

    public void upload_Video_For_Clip_It(){
        common.logPrint("Verify 'Clip it' Button is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(CLIPITFORIMPORTVIDEOS));
        common.assertElementDisplayed(CLIPITFORIMPORTVIDEOS);
        common.click(CLIPITFORIMPORTVIDEOS);

        common.pause(5);
        File filePath = null;
        // Get OS name
        String osName = System.getProperty("os.name");
        // Set file path based on OS
        if (osName.contains("Windows")) {
            filePath = new File("video.mp4"); // Update path accordingly
        } else {
            filePath = new File("video.mp4"); // Update path accordingly
        }
        // Get the absolute path of the file
        String absolutePath = filePath.getAbsolutePath();
        // Log the action (ensure your common.log works as expected)

        common.logPrint("Step ::Uploading video to the attachment field on Engage page");
        WebElement fileInputPath = driver.findElement(By.xpath(VIDEOUPLOADLOCATIONCLIPIT));
        fileInputPath.sendKeys(absolutePath);

        common.logPrint("Step :: Verify '100%' text is displayed on engage page");
        common.waitUntilElementToBeVisible(By.xpath(VIDEOUPLOADEDFORCLIPIT));
        common.assertElementDisplayed(VIDEOUPLOADEDFORCLIPIT);
        common.pause(4);

        common.logPrint("Step:: Verify 'Get Clips' is displayed on the Engage page");
        common.waitUntilElementToBeVisible(By.xpath(GETCLIPSFORCLIPIT));
        common.assertElementDisplayed(GETCLIPSFORCLIPIT);
        common.click(GETCLIPSFORCLIPIT);

        common.logPrint("Step:: Verify 'Clips Being Processing' is displayed on the Engage page");
        common.waitUntilElementsToBeVisible(By.xpath(CLIPSBEINGPROCESING));
        common.assertElementDisplayed(CLIPSBEINGPROCESING);
    }

}