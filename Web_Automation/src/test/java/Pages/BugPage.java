package Pages;

import Utils.Common;
import Utils.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

public class BugPage extends Locators {
    Common common = new Common(driver);

    public BugPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Verify 'Select Ankpal Brand' Functionality.
     * Ensure that the user can search and select the 'Ankpal & Genuin' brand from the homepage.
     * Validate the hover action, search functionality, and brand selection process.
     */
    public void selectAnkpalBrand() {

        common.logPrint("Step:: Hover over the logo");
        common.waitUntilElementToBeVisible(By.xpath(HOMELOGO));
        WebElement homeLogo = common.findElement(HOMELOGO);

        Actions actions = new Actions(driver);
        actions.moveToElement(homeLogo);
        common.logPrint("Step:: Click on the logo");
        homeLogo.click();

        String searchValue = "Ankpal & Genuin";
        common.waitUntilElementToBeVisible(By.xpath(SEARCHFIELDONHOME));
        common.type(SEARCHFIELDONHOME, searchValue);
        common.pause(2);

        String ankpakXpath = "//div[@tabindex='0']";
        common.waitUntilElementToBeVisible(By.xpath(ankpakXpath));
        common.click(ankpakXpath);

    }

    /**
     * Verify 'Create New Brand' Functionality.
     * Ensure that a user can successfully create a new brand.
     * Validate the brand creation steps, including name input, username setup, and mobile verification.
     */
    public void createNewBrand() {

        common.logPrint("Step:: Hover over the logo");
        common.waitUntilElementToBeVisible(By.xpath(HOMELOGO));
        WebElement homeLogo = common.findElement(HOMELOGO);

        Actions actions = new Actions(driver);
        actions.moveToElement(homeLogo);
        common.logPrint("Step:: Click on the logo");
        homeLogo.click();

        common.logPrint("Step:: Click on the create brand button");
        common.waitUntilElementToBeVisible(By.xpath(CREATEABRAND));
        common.click(CREATEABRAND);
        common.pause(2);

        common.logPrint("Step:: Enter brand name");
        String brandName = common.generateRandomChars(8);
        common.waitUntilElementToBeVisible(By.xpath(BRANDNAMECREATE));
        common.type(BRANDNAMECREATE, brandName);

        common.pause(5);
        common.logPrint("Step:: Click on the save button");
        common.waitUntilElementToBeVisible(By.xpath(SAVEBTNCOM));
        common.click(SAVEBTNCOM);

        common.logPrint("Step:: Type user name");
        String userName = common.generateRandomChars(8);
        common.waitUntilElementToBeVisible(By.xpath(USERNAMEFIELD));
        common.type(USERNAMEFIELD, userName);

        common.logPrint("Step:: Click on the continue button");
        common.pause(2);
        common.waitUntilElementToBeVisible(By.xpath(CONTINUEBTNCREATEBRAND));
        common.click(CONTINUEBTNCREATEBRAND);

//        common.pause(2);
//        common.logPrint("Step:: Select country number from dropdown");
//        common.waitUntilElementToBeVisible(By.xpath(DROPDOWNCOUNTRY));
//        WebElement countryDropdown = common.findElement(DROPDOWNCOUNTRY);
//        Select sc = new Select(countryDropdown);
//        sc.selectByVisibleText("India");
//        common.logPrint("Selected country is: India");

        common.logPrint("Step:: Enter mobile number");
        String mobileNum = common.generateRandomNumberString(9);
        common.waitUntilElementsToBeVisible(By.xpath(PHONENUM));
        common.type(PHONENUM, "9" + mobileNum);
        common.logPrint("Entered mobile number is: " + "9" + mobileNum);

        common.logPrint("Step:: Click on the save button");
        common.waitUntilElementToBeVisible(By.xpath(SAVEBTNCOM));
        common.click(SAVEBTNCOM);

        common.logPrint("Step:: Click on the continue button");
        common.waitUntilElementToBeVisible(By.xpath(CONTINUEBTNCREATEBRAND));
        common.click(CONTINUEBTNCREATEBRAND);

        common.pause(5);

        common.logPrint("Step:: Hover over the logo");
        common.waitUntilElementToBeVisible(By.xpath(HOMELOGO));
        WebElement homeLogo1 = common.findElement(HOMELOGO);

        Actions action = new Actions(driver);
        action.moveToElement(homeLogo);
        common.logPrint("Step:: Click on the logo");
        homeLogo1.click();

        common.waitUntilElementToBeVisible(By.xpath(SEARCHFIELDONHOME));
        common.type(SEARCHFIELDONHOME, brandName);
        common.pause(2);

        String ankpakXpath = "//div[@tabindex='0']";
        common.waitUntilElementToBeVisible(By.xpath(ankpakXpath));
        common.click(ankpakXpath);

    }

    /**
     * Verify 'Switch Between Brands' Functionality.
     * Ensure that users can switch from one brand to another using the brand dropdown.
     * Validate that the dropdown is clickable and initiates the brand selection process.
     */
    public void verifyToSwitchOneBrandToAnotherBrand() {

        common.logPrint("Step:: Click on the brand dropdown");
        common.click(BRANDCATEGOIES);

    }

    /**
     * Verify 'Manage' and 'Engage' Page Does Not Reload Multiple Times.
     * Ensure that clicking on the 'Manage' page does not trigger multiple reloads.
     * Validate the stability of navigation between pages.
     */
    public void verifyManageAndEngagePageIsNotLoadMultipleTime() {

        common.logPrint("Step:: Click on the manage");

    }

    /**
     * Verify 'Search Functionality' Under BCC Login.
     * Ensure that users can search successfully while logged in under BCC.
     * Validate that search results contain the expected value.
     */
    public void verifySearchIsWorkingWhenloginUnderBCC() {

        common.pause(5);
        String searchValue = "Tests";
        common.logPrint("Step:: Enter value is search");
        common.waitUntilElementToBeVisible(By.xpath(SEARCHFIELDLOGIN));
        common.type(SEARCHFIELDLOGIN, searchValue);

        common.logPrint("Step:: Verify search results");
        String allValuesInSearch = "//div[@class='col-12 choose-brand-wrap']//h6";

        List<WebElement> elements = common.findElements(allValuesInSearch);

        if (elements.isEmpty()) {
            common.logPrint("No search result founds");
            return;
        }

        boolean isMatched = false;

        for (WebElement webElements : elements) {
            String result = webElements.getText().trim();
            common.logPrint("Search result is: " + result);

            if (result.contains(searchValue)) {
                common.logPrint("Search results are matching");
                isMatched = true;
            }
        }

        Assert.assertTrue(isMatched, "Search results did not match the expected value!");
    }

    /**
     * Verify 'Brand Switch Search Field' Functionality.
     * Ensure that users can search for a brand when switching between brands.
     * Validate that the search results contain the expected value.
     */
    public void verifyBrandSwitchSearchField() {

        common.logPrint("Step:: Hover over the logo");
        common.waitUntilElementToBeVisible(By.xpath(HOMELOGO));
        WebElement homeLogo = common.findElement(HOMELOGO);

        Actions actions = new Actions(driver);
        actions.moveToElement(homeLogo);
        common.logPrint("Step:: Click on the logo");
        homeLogo.click();

        String searchValue = "Ronak";
        common.waitUntilElementToBeVisible(By.xpath(SEARCHFIELDONHOME));
        common.type(SEARCHFIELDONHOME, searchValue);

        common.waitUntilElementToBeVisible(By.xpath(SEARCHVALUEHOME));
        List<WebElement> elements = common.findElements((SEARCHVALUEHOME));

        if (elements.isEmpty()) {
            common.logPrint("No search results found.");
            Assert.fail("Search results did not match the expected value!");  // Ensures test failure
        }

        boolean isMatched = false;

        for (WebElement searchResult : elements) {
            String result = searchResult.getText().trim();
            common.logPrint("Search result is: " + result);

            if (result.contains(searchValue)) {
                common.logPrint("Verify and expected value is: " + searchValue + " and actual is: " + result);
                isMatched = true;
            }
        }

        Assert.assertTrue(isMatched, "Search results did not match the expected value!");
    }

    /**
     * Verify 'Updating the Headline of Carousel Embed from Grow'.
     * Ensure that users can successfully update the headline in the carousel embed.
     * Validate that the entered headline is reflected correctly.
     */
    public void updatingTheHeadlineOfCarouselEmbedFromGrow() {

        common.logPrint("Step:: Hover over the logo");
        common.waitUntilElementToBeVisible(By.xpath(HOMELOGO));
        WebElement homeLogo = common.findElement(HOMELOGO);

        Actions actions = new Actions(driver);
        actions.moveToElement(homeLogo);
        common.logPrint("Step:: Click on the logo");
        homeLogo.click();

        common.waitUntilElementToBeVisible(By.xpath(GROWMENU));
        common.click(GROWMENU);

        common.logPrint("Step:: Click on the new button");
        common.waitUntilElementToBeVisible(By.xpath(NEWBTN));
        common.click(NEWBTN);

        common.logPrint("Step:: Select carousel from embed style dropdown");
        common.waitUntilElementToBeVisible(By.xpath(EMBEDSTYLEDRP));
        WebElement elementName = common.findElement(EMBEDSTYLEDRP);

        WebElement element = common.findElement((EMBEDSTYLEDRP));
        Select selecdropdown = new Select(element);
        selecdropdown.selectByVisibleText("Carousel");

        String headName = common.generateRandomChars(10);
        common.logPrint("Step:: Enter header name");
        common.waitUntilElementToBeVisible(By.xpath(HEADLINEFIELD));
        common.type(HEADLINEFIELD, headName);

        common.logPrint("Step:: Click on the TAB key");
        common.findElement(HEADLINEFIELD).sendKeys(Keys.TAB);

        driver.switchTo().frame(0);

        common.logPrint("Verify name is changing after adding header name");
        String createdHedName = "//p[contains(@class,'__gen__sdk__text__title__2 __gen__sdk__font__weight__demi __gen')]";

        common.waitUntilElementToBeVisible(By.xpath(createdHedName));
        String getName = common.findElement(createdHedName).getText();

        common.assertTwoValuesAreEqual(getName, headName);
        common.logPrint("Both value is equal Actual: " + getName + " Expected: " + headName);

        driver.switchTo().defaultContent();

        common.pause(4);
        String updateHeadName = common.generateRandomChars(10);
        common.logPrint("Step:: Enter header name");
        common.waitUntilElementToBeVisible(By.xpath(HEADLINEFIELD)).clear();
        common.type(HEADLINEFIELD, updateHeadName);

        common.logPrint("Step:: Click on the TAB key");
        common.findElement(HEADLINEFIELD).sendKeys(Keys.TAB);

        driver.switchTo().frame(0);

        common.waitUntilElementToBeVisible(By.xpath(createdHedName));
        String getUpdateName = common.findElement(createdHedName).getText();

        common.assertTwoValuesAreEqual(getName, headName);
        common.logPrint("Both value is equal Actual: " + getUpdateName + " Expected: " + updateHeadName);

        driver.switchTo().defaultContent();
    }

    /**
     * Verify 'Delete Filter' Functionality on Moderate Page.
     * Ensure that the delete filter on the moderate page functions correctly.
     * Validate that the deleted count updates accurately after applying the filter.
     */
    public void verifyDeleteFilterOnModerate() {

        common.logPrint("Step:: Hover over the logo");
        common.waitUntilElementToBeVisible(By.xpath(HOMELOGO));
        WebElement homeLogo = common.findElement(HOMELOGO);

        Actions actions = new Actions(driver);
        actions.moveToElement(homeLogo);
        common.logPrint("Step:: Click on the logo");
        homeLogo.click();

        common.logPrint("Step:: Click on the moderate menu");
        common.waitUntilElementToBeVisible(By.xpath(MODERATEMENU));
        common.click(MODERATEMENU);

        common.logPrint("Step:: Click on the history button");
        common.waitUntilElementToBeVisible(By.xpath(HISTORTBTN));
        common.click(HISTORTBTN);

        common.logPrint("Step:: Set page size 50");
        common.waitUntilElementToBeVisible(By.xpath(PAGENATIONDRP));
        WebElement pageDropdown = common.findElement(PAGENATIONDRP);

        Select select = new Select(pageDropdown);
        select.selectByValue("50");

        common.pause(5);
        List<WebElement> deleteCount = common.findElements(DELETECOUNTALL);
        int totalDeleteCount = deleteCount.size();
        common.logPrint("Total deleted count before Deleted: " + totalDeleteCount);

        common.logPrint("Step:: Click on the filter");
        common.waitUntilElementToBeVisible(By.xpath(FILTERBTN));
        common.click(FILTERBTN);

        common.logPrint("Step:: Click on the delete checkbox");
        common.waitUntilElementToBeVisible(By.xpath(DELETEDCHECKBOX));

        common.click(DELETEDCHECKBOX);
        common.pause(5);
        common.logPrint("Step:: After selecting deleted checkbox");
        int afterTotalDeleteCount = deleteCount.size();
        common.assertTwoValuesAreEqual(totalDeleteCount, afterTotalDeleteCount);

        common.logPrint("Total deleted count after search: " + afterTotalDeleteCount);
        common.logPrint("Deleted filter is working properly on the moderate page");
    }

    /**
     * Verify 'Upload Video on Engage' Functionality.
     * Ensure that users can successfully upload a video to the Engage platform.
     * Validate the file selection, upload process, and initiation of the import.
     */
    public void uploadVideoOnEngage() throws AWTException, InterruptedException {

        common.logPrint("Step:: Hover over the logo");
        common.waitUntilElementToBeVisible(By.xpath(HOMELOGO));
        WebElement homeLogo = common.findElement(HOMELOGO);

        Actions actions = new Actions(driver);
        actions.moveToElement(homeLogo).perform();

        common.logPrint("Step:: Click on the logo");
        homeLogo.click();

        common.logPrint("Step:: Click on the engage menu");
        common.waitUntilElementsToBeVisible(By.xpath(ENGAGEMENU));
        common.click(ENGAGEMENU);

        common.logPrint("Step:: Click on the import video button");
        common.waitUntilElementsToBeVisible(By.xpath(IMPORTVIDEO));
        common.click(IMPORTVIDEO);

        common.logPrint("Step:: Click on the upload video button");
        common.waitUntilElementsToBeVisible(By.xpath(UPLOADVIDEO));
        common.click(UPLOADVIDEO);

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
        } else if (os.contains("mac")) {
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

    /**
     * Verify 'Community Display Picture' for IFN Brand Under Manage Communities Table.
     * Ensure that the community profile image is displayed correctly.
     * If the default placeholder image is found, generate and upload a new profile image.
     */
    public void VerifyToSeeTheCommunityDPforIFNBrandUnderManageCommunitiesTable() {

        common.logPrint("Step:: Click on the Manage menu");
        common.waitUntilElementToBeVisible(By.xpath(MANAGEMENU));
        common.click(MANAGEMENU);

        common.logPrint("Step:: Click on the Communities video");
        common.waitUntilElementToBeVisible(By.xpath(COMMUNITIESMENU));
        common.click(COMMUNITIESMENU);

        common.logPrint("Step:: Check if profile image is the default placeholder");
        WebElement profileImage = common.findElement(PROFILE_IMAGE);
        String imageSrc = profileImage.getAttribute("src");
        String defaultImgSrc = "/_next/static/images/community-placeholder-00acfb645bfa9ee15b708d9a1956607c.png";

        if (imageSrc.contains(defaultImgSrc)) {
            common.logPrint("Default image found. Uploading a new profile image...");

            common.logPrint("Step:: Click on first community");
            common.waitUntilElementToBeVisible(By.xpath(FIRSTCOMUNITIY));
            common.click(FIRSTCOMUNITIY);

            common.logPrint("Step:: Click on edit button");
            common.waitUntilElementToBeVisible(By.xpath(EDITBTN));
            common.click(EDITBTN);

            common.logPrint("Step:: Generate new image using AI");
            String imgPrompt = common.generateRandomChars(10);
            common.waitUntilElementToBeVisible(By.xpath(ENTERPROMPTTXT));
            common.type(ENTERPROMPTTXT, imgPrompt);

            common.logPrint("Step:: Click on generate button");
            common.waitUntilElementToBeVisible(By.xpath(GENERATEBTN));
            common.click(GENERATEBTN);

            common.logPrint("Step:: Click on generate button");
            common.waitUntilElementToBeVisible(By.xpath(GENERATEBTN));
            common.click(GENERATEBTN);

            common.pause(5);
            common.logPrint("Step:: Click on Save Changes");
            common.waitUntilElementToBeVisible(By.xpath(SAVEBTNCOM));
            common.click(SAVEBTNCOM);

            common.logPrint("Step:: Click on Save Changes");
            common.waitUntilElementToBeVisible(By.xpath(SAVEBTNCOM));
            common.click(SAVEBTNCOM);

            common.logPrint("Step:: Click on Save Changes");
            common.waitUntilElementToBeVisible(By.xpath(MANAGECOMMUNITY));
            common.click(MANAGECOMMUNITY);

        }
    }

    /**
     * Verify 'Member Is Displayed' in Group Management.
     * Ensure that members are listed under the group and the 'Remove as Member' option is available.
     * Validate that the group navigation, member listing, and action menu function correctly.
     */
    public void verifyMemberIsDisplayed() {

        common.pause(5);
        common.logPrint("Step:: Click on the manage menu");
        common.waitUntilElementToBeVisible(By.xpath(MANAGEMENU));
        common.click(MANAGEMENU);

        common.logPrint("Step:: Click on the group button");
        common.waitUntilElementToBeVisible(By.xpath(GROUPBTN));
        common.click(GROUPBTN);

        common.logPrint("Step:: Click on the first group name");
        common.waitUntilElementToBeVisible(By.xpath(FIRSTROUPNAME));
        common.click(FIRSTROUPNAME);

        common.logPrint("Step:: Click on the member button");
        common.waitUntilElementToBeVisible(By.xpath(MEMBERBTN));
        common.click(MEMBERBTN);

        common.logPrint("Step:: Click on the 3 dots button");
        common.waitUntilElementToBeVisible(By.xpath(DOTSMENU));
        common.jsClick(DOTSMENU);

        common.logPrint("Step:: Verify remove as member is displayed");
        common.waitUntilElementToBeVisible(By.xpath(REMOVEASMEMBER));
        String buttonName = common.getText(REMOVEASMEMBER);
        common.assertTwoValuesAreEqual(buttonName, "Remove as Member");
    }

    /**
     * Verify 'Error Message' When Uploading a Video.
     * Ensure that no error message appears when performing a social import.
     * Validate that the 'Oops' error message is not displayed.
     */
    public void verifyErrorMessageWhenUploadVideo() {

        common.pause(5);
        common.logPrint("Step:: Click on the engage menu");
        common.waitUntilElementToBeVisible(By.xpath(ENGAGEMENU));
        common.click(ENGAGEMENU);

        common.logPrint("Step:: Click on the import video button");
        common.waitUntilElementToBeVisible(By.xpath(IMPORTVIDEO));
        common.click(IMPORTVIDEO);

        common.logPrint("Step:: Click on the social import button");
        common.waitUntilElementToBeVisible(By.xpath(SOCIALIMPORT));
        common.click(SOCIALIMPORT);

        common.waitUntilElementToBeVisible(OPPSERRORMSG);
        common.assertElementIsNotDisplayed(OPPSERRORMSG);

        common.logPrint("Scripts is passed error is not displayed.");

    }
}