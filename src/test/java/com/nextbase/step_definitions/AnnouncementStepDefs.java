package com.nextbase.step_definitions;

import com.github.javafaker.Faker;
import com.nextbase.pages.AnnouncementModule;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnnouncementStepDefs {
    @When("the user clicks on more and announcement")
    public void the_user_clicks_on_more_and_announcement() {
        AnnouncementModule announcementModule = new AnnouncementModule();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(announcementModule.more));
        announcementModule.more.click();
        wait.until(ExpectedConditions.elementToBeClickable(announcementModule.announcement));
        announcementModule.announcement.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks on upload files and clicks on {string}")
    public void the_user_clicks_on_upload_files_and_clicks_on(String string) {
         AnnouncementModule announcementModule = new AnnouncementModule();
         announcementModule.uploadFiles.click();

         WebElement uploadFilesAndImages = Driver.get().findElement(By.xpath("(//input[@class='diskuf-fileUploader wd-test-file-light-inp '])[1]")); //*[@*='wd-fa-add-file-light']
         //BrowserUtils.waitForClickablility(uploadFilesAndImages,5);
         //uploadFilesAndImages.click();
        /*JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("arguments[0].click()", uploadFilesAndImages);*/
         BrowserUtils.waitFor(4);
         String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        String filePath = "src\\test\\resources\\Test.txt";
         String fullPath = projectPath+"\\"+ filePath;
        System.out.println(fullPath);
        //BrowserUtils.waitForClickablility(uploadFilesAndImages,10);
        uploadFilesAndImages.sendKeys(fullPath);
         BrowserUtils.waitFor(8);


    }

    @When("the user clicks on upload files and clicks on Select document from Bitrix24")
    public void the_user_clicks_on_upload_files_and_clicks_on_Select_document_from_Bitrix24() {
        AnnouncementModule announcementModule = new AnnouncementModule();
        announcementModule.uploadFiles.click();

        WebElement Bitrix24 = Driver.get().findElement(By.xpath("//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link']"));
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("arguments[0].click()", Bitrix24);
        BrowserUtils.waitFor(5);
        WebElement file6txt = Driver.get().findElement(By.xpath("//*[@*='bx-file-dialog-column-row bx-file-dialog-column-name']"));
        BrowserUtils.waitForVisibility(file6txt,5);
        file6txt.click();
        BrowserUtils.waitFor(3);

        WebElement selectDocument = Driver.get().findElement(By.xpath("//span[@class='popup-window-button popup-window-button-accept']"));
        selectDocument.click();
        BrowserUtils.waitFor(3);


    }

    @When("clicks on send announcenment")
    public void clicks_on_send_announcenment() {
        AnnouncementModule announcementModule = new AnnouncementModule();
        BrowserUtils.waitForClickablility(announcementModule.sendButton,3);
        BrowserUtils.waitForVisibility(announcementModule.sendButton,3);
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        //announcementModule.sendButton.click();
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("arguments[0].click()", announcementModule.sendButton);
        BrowserUtils.waitFor(3);
    }

    @Then("user should be send announcement by Uploading Bitrix24")
    public void user_should_be_send_announcement_by_Uploading_Bitrix24() {
        List<WebElement> bitrixCheck = new ArrayList<>();
        WebElement textFile = Driver.get().findElement(By.xpath("//*[@title=\"File (6).txt\"]"));
        bitrixCheck.add(textFile);
        boolean flag ;
        if (bitrixCheck.size()>0) {
            flag= true;
        } else {
            flag= false;
        }
        Assert.assertTrue(flag);
    }

    @Then("user should be send announcement")
    public void user_should_be_send_announcement() {
        AnnouncementModule announcementModule = new AnnouncementModule();
        boolean flag = true ;
        try {
            announcementModule.sendButton.isDisplayed();
            flag= false;
        } catch (NoSuchElementException elementException) {
            System.out.println("exception caught");
        }
        Assert.assertTrue(flag);


    }

    @Then("user should send announcement to users")
    public void user_should_send_announcement_to_users() {
        WebElement lastPost = Driver.get().findElement(By.id("dest_1204_512"));
        System.out.println(lastPost.getText());
        String postText = lastPost.getText();
        Assert.assertEquals("helpdesk22@cybertekschool.com",postText);
    }






    @Then("user should be send announcement the {string}")
    public void user_should_be_send_announcement_the(String text) {
        WebElement lastPost = Driver.get().findElement(By.xpath("//div[@class='feed-post-text-block-inner-inner' and text()='E-mail user - Employees and Departments - Recent contact lists' ]"));
        System.out.println(lastPost.getText());
        String postText = lastPost.getText();
        Assert.assertEquals(text,postText);

    }

    @When("User adds other users and recipients from selecting contact from {string}, {string} and {string}")
    public void user_adds_other_users_and_recipients_from_selecting_contact_from_and(String string, String string2, String string3) {
        AnnouncementModule announcementModule = new AnnouncementModule();

        WebElement addMore = Driver.get().findElement(By.id("bx-destination-tag"));
        addMore.click();

        WebElement allEmployees = Driver.get().findElement(By.xpath("//*[text()='All employees']"));
        allEmployees.click();

        WebElement departments = Driver.get().findElement(By.xpath("(//*[contains(text(),'Employees and departments')])[2]"));
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        departments.click();
        BrowserUtils.waitFor(5);
        WebElement hd22 = Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name' and text()='helpdesk22@cybertekschool.com' ]       "));
        hd22.click();
        BrowserUtils.waitFor(3);

        /*WebElement emailUsers = Driver.get().findElement(By.xpath("(//*[contains(text(),'E-mail users')])[2]"));
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        emailUsers.click();
        WebElement alperMail = Driver.get().findElement(By.xpath("(//*[@class='bx-finder-box-item-t7-name' and contains(text(),'alper@cybertekschool.com') ] ) [2]"));
        alperMail.click();
        */
        Driver.get().findElement(By.xpath("//span[@class='popup-window-close-icon']")).click();

        Faker faker = new Faker();
        String generateText = faker.lordOfTheRings().character() + " " + faker.lordOfTheRings().location();

        Driver.get().switchTo().frame(0);
        announcementModule.body.sendKeys(generateText);

        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();
    }

    @When("User attaches link by clicking on the link icon")
    public void user_attaches_link_by_clicking_on_the_link_icon() {
        WebElement linkButton = Driver.get().findElement(By.xpath("//span[@title='Link']"));
        linkButton.click();

        WebElement text = Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-text"));
        WebElement URL =  Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-href"));
        WebElement saveButton = Driver.get().findElement(By.id("undefined"));

        Faker faker = new Faker();

        text.sendKeys(faker.rockBand().name());
        URL.sendKeys("https://www.youtube.com/watch?v=1vrEljMfXYo&ab_channel=JohnDenverVEVO");
        saveButton.click();


    }

    @Then("the link should be clickable")
    public void the_link_should_be_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User inserts videos by clicking on the video icon and entering the video URL.")
    public void user_inserts_videos_by_clicking_on_the_video_icon_and_entering_the_video_URL() {
        AnnouncementModule announcementModule = new AnnouncementModule();

        WebElement insertVideoButton = Driver.get().findElement(By.xpath("//span[@title='Insert video']"));
        Driver.get().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        insertVideoButton.click();

        WebElement videoSource = Driver.get().findElement(By.cssSelector("#video_idPostFormLHE_blogPostForm-source"));
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        videoSource.sendKeys(announcementModule.vimeoURL);

        WebElement videoTitle = Driver.get().findElement(By.cssSelector("#video_idPostFormLHE_blogPostForm-title"));
        //BrowserUtils.waitForVisibility(videoTitle,10);
        BrowserUtils.waitFor(5);

        WebElement saveButton = Driver.get().findElement(By.cssSelector(".adm-btn-save"));
        saveButton.click();

        Faker faker = new Faker();
        String generateText = faker.lordOfTheRings().character() + " " + faker.lordOfTheRings().location();

        Driver.get().switchTo().frame(0);
        announcementModule.body.sendKeys(generateText);

        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();



    }

    @When("User creates a quote by clicking on the Comma icon.")
    public void user_creates_a_quote_by_clicking_on_the_Comma_icon() {
        AnnouncementModule announcementModule =new AnnouncementModule();

        WebElement quoteText = Driver.get().findElement(By.xpath("//span[@title='Quote text']"));
        Driver.get().manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        quoteText.click();

        Faker faker = new Faker();
        String generateText = "First Book: " + faker.book().title() + " ,Second Book: " + faker.book().title();

        Driver.get().switchTo().frame(0);
        announcementModule.body.sendKeys(generateText);

        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();



    }

    @When("User adds mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown")
    public void user_adds_mention_by_clicking_on_the_Add_mention_icon_and_select_contacts_from_the_lists_provided_in_dropdown() {
    }

    @When("User adds mention by clicking on the Add mention icon and select {string} from the lists provided in dropdown")
    public void user_adds_mention_by_clicking_on_the_Add_mention_icon_and_select_from_the_lists_provided_in_dropdown(String contact) {
        WebElement addMention = Driver.get().findElement(By.cssSelector("#bx-b-mention-blogPostForm"));
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        addMention.click();

        String user = "//div[contains(text(),'" + contact + "')]";
        Driver.get().findElement(By.xpath(user)).click();
    }

    @When("User click on Visual Editor and see the editor text-bar displays on top of the message box")
    public void user_click_on_Visual_Editor_and_see_the_editor_text_bar_displays_on_top_of_the_message_box() {
        AnnouncementModule announcementModule =new AnnouncementModule();

        WebElement visualEditor = Driver.get().findElement(By.xpath("//span[@title='Visual editor']"));
        WebElement textBar = Driver.get().findElement(By.cssSelector(".bxhtmled-top-bar-wrap"));
        WebElement bold = Driver.get().findElement(By.xpath("//span[@title='Bold']"));

        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        visualEditor.click();

        Assert.assertTrue(textBar.isDisplayed());
        System.out.println(textBar.isDisplayed());

        bold.click();

        Faker faker = new Faker();
        String generateText = "First Book: " + faker.book().title() + " ,Second Book: " + faker.book().title();

        Driver.get().switchTo().frame(0);
        announcementModule.body.sendKeys(generateText);

        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();

    }

    @When("User clicks on the Topic icon to see the announcement Topic text box displays on top of the message box")
    public void user_clicks_on_the_Topic_icon_to_see_the_announcement_Topic_text_box_displays_on_top_of_the_message_box() {
        Faker faker = new Faker();
        AnnouncementModule announcementModule =new AnnouncementModule();
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        WebElement topicIcon = Driver.get().findElement(By.cssSelector("#lhe_button_title_blogPostForm"));
        topicIcon.click();
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        //topicIcon.click();

        WebElement topicBar = Driver.get().findElement(By.cssSelector("#POST_TITLE"));
        topicBar.sendKeys(faker.country().name());
        Assert.assertTrue(topicBar.isDisplayed());

        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.cssSelector(".bxhtmled-textarea")).sendKeys(faker.name().fullName());

    }

    @When("Other User clicks on the Topic icon to see the announcement Topic text box displays on top of the message box")
    public void other_User_clicks_on_the_Topic_icon_to_see_the_announcement_Topic_text_box_displays_on_top_of_the_message_box() {
        Faker faker = new Faker();
        AnnouncementModule announcementModule =new AnnouncementModule();
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        WebElement topicIcon = Driver.get().findElement(By.cssSelector("#lhe_button_title_blogPostForm"));
        topicIcon.click();
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        topicIcon.click();

        WebElement topicBar = Driver.get().findElement(By.cssSelector("#POST_TITLE"));
        topicBar.sendKeys(faker.country().name());
        Assert.assertTrue(topicBar.isDisplayed());

        BrowserUtils.waitFor(3);

        Driver.get().switchTo().frame(0);
        Driver.get().findElement(By.xpath("//body[@contenteditable='true']")).sendKeys(faker.name().fullName());

        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();


    }

    @Then("Verify that topic is seen")
    public void verify_that_topic_is_seen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User creates new tag")
    public void user_creates_new_tag() {
        AnnouncementModule announcementModule = new AnnouncementModule();
        Faker faker = new Faker();

        WebElement tagAdd = Driver.get().findElement(By.cssSelector("#bx-b-tag-input-blogPostForm"));
        tagAdd.click();

        WebElement tagBar = Driver.get().findElement(By.cssSelector("#TAGS_blogPostForm67abSn"));
        tagBar.sendKeys(faker.gameOfThrones().house());

        WebElement addButton = Driver.get().findElement(By.xpath("//*[@class=\"popup-window-buttons\"]/span"));
        addButton.click();

        BrowserUtils.waitFor(3);

        Driver.get().findElement(By.xpath("//textarea[@class=\"bxhtmled-textarea\"]")).sendKeys(faker.gameOfThrones().character());

    }

    @When("Other User creates new tag")
    public void other_User_creates_new_tag() {
        AnnouncementModule announcementModule = new AnnouncementModule();
        Faker faker = new Faker();

        WebElement tagAdd = Driver.get().findElement(By.cssSelector("#bx-b-tag-input-blogPostForm"));
        tagAdd.click();

        WebElement tagBar = Driver.get().findElement(By.cssSelector("#TAGS_blogPostForm67abSn"));
        tagBar.sendKeys(faker.gameOfThrones().house());

        WebElement addButton = Driver.get().findElement(By.xpath("//*[@class=\"popup-window-buttons\"]/span"));
        addButton.click();

        BrowserUtils.waitFor(3);

        Driver.get().switchTo().frame(0);
        Driver.get().findElement(By.xpath("//body[@contenteditable='true']")).sendKeys(faker.gameOfThrones().character());

        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();

    }

    @Then("Verify that tag is created")
    public void verify_that_tag_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
