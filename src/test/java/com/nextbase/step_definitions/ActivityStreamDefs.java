package com.nextbase.step_definitions;

import com.nextbase.pages.ActivityStreamPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActivityStreamDefs {
    @When("sends {string} message on ActivityStream page")
    public void sends_message_on_ActivityStream_page(String string) {
       new ActivityStreamPage().sendMessage(string);
    }

    @Then("the message should contain {string} as a text")
    public void the_message_should_contain_as_a_text(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.textToBePresentInElement(new ActivityStreamPage().firstPostOnActivityStreamText, string ));
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Veryfing message is " + string,string, new ActivityStreamPage().firstPostOnActivityStreamText.getText());
    }
    @When("the user click on message button on the ActivityStream page")
    public void the_user_click_on_message_button_on_the_ActivityStream_page() {
        new ActivityStreamPage().getTab("Message");
        BrowserUtils.waitFor(1);

    }
    @When("the user navigates to file menu on activity stream page")
    public void the_user_navigates_to_file_menu_on_activity_stream_page() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

        new ActivityStreamPage().getTab("More");
        new ActivityStreamPage().getMoreMenu("File");
    }


    @Then("file is uploaded and the post with {string} should appear on the Activity Stream {string}")
    public void the_post_with_should_appear_on_the_Activity_Stream(String string, String string2) {
        String filePath = "src/test/resources/Test.txt";
        BrowserUtils.fileUpload(filePath, new ActivityStreamPage().uploadFilesAndImagesBox);
        BrowserUtils.waitFor(2);
        BrowserUtils.click(new ActivityStreamPage().sendUploadedFile);
        BrowserUtils.waitFor(1);
        String text = BrowserUtils.getElement(new ActivityStreamPage().firstPostWithFileOnActivityStream).getText();
        Assert.assertTrue("Verifying post contains text" + string,text.contains(string.substring(0, 4)));
        String userTypeExpected = string2.toLowerCase();
        String userTypeActual = BrowserUtils.getElement(new ActivityStreamPage().nameOnFirstPost).getText();
        Assert.assertTrue("Verifying the usertype",userTypeActual.contains(userTypeExpected));
    }

    @When("selects appreciation on Activity Stream page")
    public void selects_appreciation_on_Activity_Stream_page() {
     new ActivityStreamPage().getTab("More");
     new ActivityStreamPage().getMoreMenu("Appreciation");
    }

    @When("writes {string} message to {string} and clicks submit")
    public void writes_message(String text, String recipient) {
       new ActivityStreamPage().sendMessage(text, recipient);
       BrowserUtils.waitFor(3);
       Driver.get().navigate().refresh();
    }

    @Then("message is sent and the post with {string} and thumbsUp should appear on the Activity Stream {string}")
    public void message_is_sent_and_the_post_with_and_thumbsUp_should_appear_on_the_Activity_Stream(String string, String string2) {
        Assert.assertEquals("Verifying text of appreciation", string,new ActivityStreamPage().firstPostOnActivityStreamText.getText());
        Assert.assertTrue(BrowserUtils.getElement(new ActivityStreamPage().thumbsUpInMessageOnActivityStream).isDisplayed());
        String userTypeExpected = string2.toLowerCase();
        String userTypeActual = BrowserUtils.getElement(new ActivityStreamPage().nameOnFirstPost).getText();
        Assert.assertTrue("Verifying the usertype" + userTypeActual + "//" + userTypeExpected,userTypeActual.contains(userTypeExpected));
    }


}
