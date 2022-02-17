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
        wait.until(ExpectedConditions.textToBePresentInElement(new ActivityStreamPage().firstPostOnActivityStream, string ));
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Veryfing message is " + string,string, new ActivityStreamPage().firstPostOnActivityStream.getText());
    }
    @When("the user click on message button on the ActivityStream page")
    public void the_user_click_on_message_button_on_the_ActivityStream_page() {
        BrowserUtils.clickWithTimeOut(new ActivityStreamPage().messageButton, 5);
        BrowserUtils.waitFor(1);

    }
}
