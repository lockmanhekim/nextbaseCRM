package com.nextbase.step_definitions;

import com.nextbase.pages.AnnouncementModule;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
         WebElement uploadFiles =  Driver.get().findElement(By.id("bx-b-uploadfile-blogPostForm"));
         uploadFiles.click();
         WebElement uploadFilesAndImages = Driver.get().findElement(By.xpath("//*[@*='#bx-b-uploadfile-blogPostForm']"));
         BrowserUtils.waitForClickablility(uploadFilesAndImages,5);
         uploadFilesAndImages.click();
         String projectPath = System.getProperty("user.dir");
         String filePath = "src\\test\\resources\\Test.txt";
         String fullPath = projectPath+"\\"+ filePath;
         uploadFilesAndImages.sendKeys(fullPath);
         BrowserUtils.waitFor(2);


    }

    @When("clicks on send announcenment")
    public void clicks_on_send_announcenment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be send announcement")
    public void user_should_be_send_announcement() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User adds other users and recipients from selecting contact from {string}, {string} and {string}")
    public void user_adds_other_users_and_recipients_from_selecting_contact_from_and(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User attaches link by clicking on the link icon")
    public void user_attaches_link_by_clicking_on_the_link_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the link should be clickable")
    public void the_link_should_be_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User inserts videos by clicking on the video icon and entering the video URL.")
    public void user_inserts_videos_by_clicking_on_the_video_icon_and_entering_the_video_URL() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User creates a quote by clicking on the Comma icon.")
    public void user_creates_a_quote_by_clicking_on_the_Comma_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User adds mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown")
    public void user_adds_mention_by_clicking_on_the_Add_mention_icon_and_select_contacts_from_the_lists_provided_in_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click on Visual Editor and see the editor text-bar displays on top of the message box")
    public void user_click_on_Visual_Editor_and_see_the_editor_text_bar_displays_on_top_of_the_message_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on the Topic icon to see the announcement Topic text box displays on top of the message box")
    public void user_clicks_on_the_Topic_icon_to_see_the_announcement_Topic_text_box_displays_on_top_of_the_message_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that topic is seen")
    public void verify_that_topic_is_seen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User creates new tag")
    public void user_creates_new_tag() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that tag is created")
    public void verify_that_tag_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
