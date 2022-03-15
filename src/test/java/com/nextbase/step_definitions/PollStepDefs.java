package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.pages.PollPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class PollStepDefs {

    PollPage pollPage = new PollPage();

    @Given("User is logged in as {string}")
    public void user_Is_Logged_In_As(String userType) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String username = null;
        String password = null;

        if (userType.equals("HR")) {
            username = ConfigurationReader.get("HR_username");
            password = ConfigurationReader.get("HR_password");
        } else if (userType.equals("Helpdesk")) {
            username = ConfigurationReader.get("Helpdesk_username");
            password = ConfigurationReader.get("Helpdesk_password");
        } else if (userType.equals("Marketing")) {
            username = ConfigurationReader.get("Marketing_username");
            password = ConfigurationReader.get("Marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }
    @When("User navigates to Poll page")
    public void user_Navigates_To_PollPage() {
        pollPage.pollButton.click();
    }
    @And("click Add more link")
    public void click_Add_More_Link() {
        pollPage.AddMoreButton.click();
    }
    @Then("click Employees and departments button")
    public void click_Employees_And_Departments_Button() {
        pollPage.employeesAndDepartmentsButton.click();
    }
    @And("user should be able to select multiple contacts")
    public void user_should_Be_Able_To_select_Multiple_Contacts() {
        pollPage.hr22UserButton.click();
        pollPage.hr23UserButton.click();
    }

//2.scenario

    @And("click link icon")
    public void clickLinkIcon() {
        pollPage.linkIcon.click();
    }

    @When("enter link info")
    public void enter_Link_Info() {
        pollPage.linkTextBox.click();
        pollPage.linkTextBox.sendKeys("ebay");
        pollPage.linkURLBox.click();
        pollPage.linkURLBox.sendKeys("https://www.ebay.com");
        pollPage.saveButton.click();
    }
    @Then("click send button")
    public void clickSendButton() throws InterruptedException {
        Thread.sleep(10);
        pollPage.sendButton.click();
    }
    @Then("User should verify the attaching from link")
    public void userShouldVerifyTheAttachingFromLink() {
        BrowserUtils.waitForPageToLoad(20);
        pollPage.linkEbay.click();


        BrowserUtils.waitForPageToLoad(20);
        String currentWindowHandle = Driver.get().getWindowHandle();

        Set<String> windowHandles = Driver.get().getWindowHandles();
        for (String handle : windowHandles) {
            if(!handle.equals(currentWindowHandle)){
                Driver.get().switchTo().window(handle);
            }
        }
        Assert.assertTrue(Driver.get().getTitle().contains("Electronics"));
    }

    //3.scenario
    @And("click Add mention icon")
    public void clickAddMentionIcon() {
        pollPage.addMentionIcon.click();
    }
   /* @Then("click Employees and departments button")
    public void click_Employees_And_Departments_Button() {
        pollPage.employeesAndDepartmentsButton.click();
    }*/

   @And("select contact from list")
    public void selectContactFromList() {
       List<WebElement> dropdownOptions = Driver.get().findElements(By.className("bx-finder-company-department-employee-name"));
       dropdownOptions.get(1).click();
    }
    /*@Then("click send button")
    public void clickSendButton() {
        pollPage.sendButton.click();
    }*/

   @Then("user should see the message on the page")
    public void userShouldSeeMessageOnThePage() {
        String expectedContactInform = "hr3  ";
        BrowserUtils.waitFor(2);
        String actualContactInfo = pollPage.addMentionUser.getText();
        Assert.assertEquals(expectedContactInform, actualContactInfo);
    }
    //4.scenario
    @And("click question box and write question")
    public void clickQuestionBoxAndWriteQuestion() {
        pollPage.questionBox.click();
        pollPage.questionBox.sendKeys("How are you today?");
    }
    @And("click answer boxes and write answers")
    public void clickAnswerBoxesAndWriteAnswers() {
        pollPage.answer1Box.click();
        pollPage.answer1Box.sendKeys("Good");
        pollPage.answer2Box.click();
        pollPage.answer2Box.sendKeys("Not bad");
    }
    @Then("click Add question link")
    public void clickAddQuestionLink() {
        pollPage.addQuestionLink.click();
    }
    @And("click second question box and write question")
    public void clickSecondQuestionBoxAndWriteQuestion() {
        pollPage.question2Box.click();
        pollPage.question2Box.sendKeys("How is the weather?");
    }
    @And("click second answer boxes and write answers")
    public void clickSecondAnswerBoxesAndWriteAnswers() {
        pollPage.answer2_1Box.click();
        pollPage.answer2_1Box.sendKeys("Sunny");
        pollPage.answer2_2Box.click();
        pollPage.answer2_2Box.sendKeys("Windy");
    }
   /*@And("click message box and write a message")
    public void clickMessageBoxAndWriteAMessage() {
        Driver.get().switchTo().frame(0);
        pollPage.iframeBox.sendKeys("Try please");
        Driver.get().switchTo().parentFrame();
    }*/
    /*@Then("verify the message")
    public void verifyTheMessage() {
        String expectedMessage = "Try please";
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().frame(pollPage.iframeBox);
        String actualMessage = pollPage.link.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));

    }*/
    //5.scenario

    /*@And("click question box and write question")
    public void clickQuestionBoxAndWriteQuestion() {
        pollPage.questionBox.click();
        pollPage.questionBox.sendKeys("How are you today?");
    }
    /*@And("click answer boxes and write answers")
    public void clickAnswerBoxesAndWriteAnswers() {
        pollPage.answer1Box.click();
        pollPage.answer1Box.sendKeys("Good");
        pollPage.answer2Box.click();
        pollPage.answer2Box.sendKeys("Not bad");
    }*/
    @Then("User should be able to click delete answer icon and delete question icon")
    public void userShouldBeAbleToClickDeleteAnswerIconAndDeleteQuestionIcon() {

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click();", pollPage.answer2Delete);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();

        javascriptExecutor.executeScript("arguments[0].click();", pollPage.answer1Delete);
        Alert alert2 = Driver.get().switchTo().alert();
        alert.accept();

        javascriptExecutor.executeScript("arguments[0].click();", pollPage.question1Delete);
        Alert alert3 = Driver.get().switchTo().alert();
        alert.accept();
    }

    //6.scenario
    /*@And("click question box and write question")
    public void clickQuestionBoxAndWriteQuestion() {
        pollPage.questionBox.click();
        pollPage.questionBox.sendKeys("How are you today?");
    }
    /*@And("click answer boxes and write answers")
    public void clickAnswerBoxesAndWriteAnswers() {
        pollPage.answer1Box.click();
        pollPage.answer1Box.sendKeys("Good");
        pollPage.answer2Box.click();
        pollPage.answer2Box.sendKeys("Not bad");
    }*/
    @And("click Allow multiple choice checkbox")
    public void clickAllowMultipleChoiceCheckbox() {
        pollPage.allowMultipleChoice.click();
    }
    @And("click message box and write a message")
    public void clickMessageBoxAndWriteAMessage() {
        Driver.get().switchTo().frame(pollPage.iframe);
        pollPage.iframeBox1.sendKeys("Try please");
        Driver.get().switchTo().defaultContent();
    }
    /*@Then("click send button")
    public void clickSendButton() {
        pollPage.sendButton.click();
    }*/

    @Then("User should be able to provide multiple choice to attendees")
    public void userShouldBeAbleToProvideMultipleChoiceToAttendees() {
        BrowserUtils.waitFor(3);
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click();", pollPage.goodCheckBox);
        //pollPage.goodCheckBox.click();
        Assert.assertTrue(pollPage.goodCheckBox.isSelected());

        javascriptExecutor.executeScript("arguments[0].click();", pollPage.notBadCheckBox);
        //pollPage.notBadCheckBox.click();
        Assert.assertTrue(pollPage.notBadCheckBox.isSelected());
    }

    //7.scenario
    @And("click message box and write a poll message")
    public void clickMessageBoxAndWriteAPollMessage() {
        Driver.get().switchTo().frame(pollPage.iframe);
        pollPage.iframeBox1.sendKeys("First Poll");
        Driver.get().switchTo().defaultContent();

    }

    /*@And("click question box and write question")
  public void clickQuestionBoxAndWriteQuestion() {
      pollPage.questionBox.click();
      pollPage.questionBox.sendKeys("How are you today?");
  }
  /*@And("click answer boxes and write answers")
  public void clickAnswerBoxesAndWriteAnswers() {
      pollPage.answer1Box.click();
      pollPage.answer1Box.sendKeys("Good");
      pollPage.answer2Box.click();
      pollPage.answer2Box.sendKeys("Not bad");
    }*/

      /*@Then("click send button")
        public void clickSendButton() {
            pollPage.sendButton.click();
    }*/

    @Then("user should see the poll on the page")
    public void userShouldSeeThePollOnThePage() {
        String expectedPoll = "First Poll";
        String actualPoll = pollPage.firstPoll.getText();
        Assert.assertEquals(expectedPoll, actualPoll);

    }


}





