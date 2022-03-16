package com.nextbase.step_definitions;

import com.nextbase.pages.ActivityStreamPage;
import com.nextbase.pages.AppreciationPage;
import com.nextbase.pages.MarketplacePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppreciationStepDefs {

    AppreciationPage appreciationPage = new AppreciationPage();


        //870
    @When("click the More button")
    public void click_the_More_button() {
        appreciationPage.moreInput.click();
        BrowserUtils.waitFor(2);

    }

    @When("click the Appreciation")
    public void click_the_Appreciation() {
        appreciationPage.appreciationInput.click();
        BrowserUtils.waitFor(2);
    }

    @When("click the Upload File button")
    public void click_the_Upload_File_button() {
        appreciationPage.uploadInput.click();
        BrowserUtils.waitFor(2);
    }

    @When("upload a file")
    public void upload_a_file() {
        BrowserUtils.waitFor(2);

        WebElement fileUploadXpath =Driver.get().findElement(By.xpath("//input[@name='bxu_files[]']"));

        fileUploadXpath.sendKeys("C:\\Users\\Yusuf\\Desktop\\File.txt");

        BrowserUtils.waitFor(2);

        appreciationPage.sendInput.click();

        BrowserUtils.waitFor(2);
        //Assert.assertTrue(appreciationPage.verifyUploadFile.isDisplayed());


    }

    //892
    @When("click the upload files button")
    public void click_the_upload_files_button() {
        appreciationPage.uploadInput.click();
        BrowserUtils.waitFor(2);
    }

    @When("click the download from external drive button")
    public void click_the_download_from_external_drive_button() {
        appreciationPage.externalButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("click the all drive buttons")
    public void click_the_all_drive_buttons() {

       List<WebElement> allButtons = Driver.get().findElements(By.xpath("//*[@class='bx-file-dialog-tab-item']"));

        for (WebElement allButton : allButtons) {

            Assert.assertTrue(allButton.isDisplayed());

            allButton.click();
            BrowserUtils.waitFor(2);
        }

    }

        //893
    @When("click the select document from Btrix24 button")
    public void click_the_select_document_from_Btrix24_button() {
        appreciationPage.Bitrex24File.click();
    }

    @When("click the sales and marketing button")
    public void click_the_sales_and_marketing_button() {
        appreciationPage.salesAndMarketingButoon.click();
        BrowserUtils.waitFor(2);
    }

    @When("click the Quotes button")
    public void click_the_Quotes_button() {
        appreciationPage.quotesButtoon.click();
        BrowserUtils.waitFor(2);
    }

    @Then("click the docx file")
    public void click_the_docx_file() {
        appreciationPage.docxFile.click();
        BrowserUtils.waitFor(2);
    }


    @Then("click the select document button")
    public void click_the_select_document_button() {
        appreciationPage.Bitrex24SelectDocument.click();
        BrowserUtils.waitFor(2);

    }

    //910
    @When("click to choose button")
    public void click_to_choose_button() {
        appreciationPage.chooseButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("typed {string} in the choose button1")
    public void typed_in_the_choose_button1(String string) {

    }

    @When("click the employees button")
    public void click_the_employees_button() {
        appreciationPage.employeesButton.click();
        BrowserUtils.waitFor(2);

        appreciationPage.employeesButton.click();
        BrowserUtils.waitFor(2);


    }
    @When("click the send button")
    public void click_the_send_button() {
        appreciationPage.exitButton.click();
        BrowserUtils.waitFor(2);

        appreciationPage.sendButton.click();
        BrowserUtils.waitFor(2);
    }

    //923
    @When("typed {string} in the choose button2")
    public void typed_in_the_choose_button2(String string) {
        appreciationPage.employeesButton.click();

        appreciationPage.chooseButton2.sendKeys(string);

        BrowserUtils.waitFor(2);
    }

    @When("click the department button")
    public void click_the_department_button() {
        appreciationPage.employeesButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("click the send button2")
    public void click_the_send_button2() {

        appreciationPage.sendButton.click();
        BrowserUtils.waitFor(2);
    }



    //924
    @Then("typed {string} in the choose button3")
    public void typed_in_the_choose_button3(String string) {
        appreciationPage.employeesButton.click();

        appreciationPage.chooseButton2.sendKeys(string);

        BrowserUtils.waitFor(2);
    }

    @Then("click the email button")
    public void click_the_email_button() {
        appreciationPage.employeesButton.click();
        BrowserUtils.waitFor(2);

        appreciationPage.chooseButton2.click();
        BrowserUtils.waitFor(2);
    }

    //925
    @When("click to link button")
    public void click_to_link_button() {
        appreciationPage.linkButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("typed {string} in the link bar")
    public void typed_in_the_link_bar(String string) {

        appreciationPage.linkBar.sendKeys(string);
        BrowserUtils.waitFor(2);
    }

    @Then("click the save button")
    public void click_the_save_button() {
        appreciationPage.saveButton.click();
        BrowserUtils.waitFor(2);
    }

    //926
    @When("click to insert video button")
    public void click_to_insert_video_button() {

        appreciationPage.videoInsertButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("typed {string} in the video source bar")
    public void typed_in_the_video_source_bar(String string) {

        appreciationPage.videoSourceBar.sendKeys(string);
        BrowserUtils.waitFor(15);

    }

    @Then("click the save button2")
    public void click_the_save_button2() {

        appreciationPage.saveButton.click();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(appreciationPage.verifyVideoSave.isDisplayed());

        BrowserUtils.waitFor(2);
        appreciationPage.sendButton.click();

    }

    //938
    @When("click to comma button")
    public void click_to_comma_button() {

        appreciationPage.commaButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("typed {string} in the comma button2")
    public void typed_in_the_comma_button2(String string) {

        Driver.get().switchTo().frame(appreciationPage.iframe);
        BrowserUtils.waitFor(2);

        appreciationPage.commaButtoninside.sendKeys(string);
        BrowserUtils.waitFor(2);

        Driver.get().switchTo().defaultContent();

    }

    //939
    @When("click to add mention button")
    public void click_to_add_mention_button() {
        appreciationPage.addmentionButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("typed {string} in the add mention button")
    public void typed_in_the_add_mention_button(String string) {

        Driver.get().switchTo().frame(appreciationPage.iframe);
        BrowserUtils.waitFor(2);
        appreciationPage.addMention.sendKeys(string);
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().defaultContent();

    }

    @When("select contacts from the lists provided in dropdown")
    public void select_contacts_from_the_lists_provided_in_dropdown() {

        appreciationPage.addmentionButton.click();
        BrowserUtils.waitFor(2);



    }

    //940
    @When("click to visual editor button")
    public void click_to_visual_editor_button() {

        appreciationPage.visualEditorButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("see the editor text-bar displays on top of the message box")
    public void see_the_editor_text_bar_displays_on_top_of_the_message_box() {

        Assert.assertTrue(appreciationPage.textBar.isDisplayed());

        BrowserUtils.waitFor(2);
    }

    //941
    @When("click to topic button")
    public void click_to_topic_button() {
        appreciationPage.topicButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("the topic section can be seen above the message box.")
    public void the_topic_section_can_be_seen_above_the_message_box() {

        //Assert.assertTrue(appreciationPage.topic.isDisplayed());
        BrowserUtils.waitFor(2);
    }

    //960
    @When("click to record video button")
    public void click_to_record_video_button() {

        appreciationPage.recordVideoButton.click();
        BrowserUtils.waitFor(5);
    }

    @When("click to allow button")
    public void click_to_allow_button() {

        appreciationPage.allowButton.click();
        BrowserUtils.waitFor(5);

    }


    @When("video recording should be possible")
    public void video_recording_should_be_possible() {

        Assert.assertFalse(appreciationPage.verifyVideoRecordig.isDisplayed());
        BrowserUtils.waitFor(2);

    }

    //980
    @When("click to add tag button")
    public void click_to_add_tag_button() {
        appreciationPage.addTagButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("typed {string} in the add tag button")
    public void typed_in_the_add_tag_button(String string) {
        appreciationPage.testSend.sendKeys(string);
        BrowserUtils.waitFor(2);
    }

    @When("click to add button")
    public void click_to_add_button() {
        appreciationPage.addButton.click();
        BrowserUtils.waitFor(2);
    }

    //990

    @When("click to thumbs up button and see the whole illustration")
    public void click_to_thumbs_up_button_and_see_the_whole_illustration() {
            appreciationPage.illustrationButton.click();

        for (int i = 1; i <8; i++) {
            WebElement allEmoji = Driver.get()
                    .findElement(By.
                            xpath("//*[@id=\"popup-window-content-BXSocNetGratSelector\"]/div/div[2]/div[1]/span["+i+"]"));
            System.out.println(allEmoji.getAttribute("title"));
            BrowserUtils.waitFor(2);
        }
        for (int i = 1; i <8; i++) {
            WebElement allEmoji = Driver.get()
                    .findElement(By.
                            xpath("//*[@id=\"popup-window-content-BXSocNetGratSelector\"]/div/div[2]/div[1]/span["+i+"]"));
            System.out.println(allEmoji.getAttribute("title"));
            BrowserUtils.waitFor(2);

        }
    }
}
