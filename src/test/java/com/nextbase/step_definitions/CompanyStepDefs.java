package com.nextbase.step_definitions;


import com.nextbase.pages.CompanyPage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CompanyStepDefs {

    @When("user clicks on {string} link from left side")
    public void user_clicks_on_link_from_left_side(String string) {
        BrowserUtils.waitFor(2);
        if(string.equalsIgnoreCase("Company")){
            new CompanyPage().companyLink.click();
        }
        BrowserUtils.waitFor(2);
    }

    @When("the user should display {string} button on the page title menu")
    public void the_user_should_display_button_on_the_page_title_menu(String string) {

        Assert.assertEquals(string, new CompanyPage().addNewsButton.getText());

    }

    @When("the user click {string} button")
    public void the_user_click_button(String string) {
        BrowserUtils.waitFor(2);
        new CompanyPage().addNewsButton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the user clicks {string} tab on the work area")
    public void the_user_clicks_tab_on_the_work_area(String string) {
        BrowserUtils.waitFor(3);
        if(string.equalsIgnoreCase("Preview text")){
            new CompanyPage().previewTextTab.click();
        }else if(string.equalsIgnoreCase("Details")){
            new CompanyPage().detailsTab.click();
        }

    }

    @Then("user should clicks {string} field on the work area")
    public void user_should_clicks_field_on_the_work_area(String fields) {
        BrowserUtils.waitFor(3);
        switch (fields){
            case "Type of information":
                new CompanyPage().selectTypeOfInfo.click();
                break;
            case "calendar icon":
                new CompanyPage().calendarIcon.click();
                break;
//            case"add picture":
//                BrowserUtils.waitFor(2);
//                new CompanyPage().fileInput.sendKeys("C:/Users/rabia/Desktop/CRM24/crm24.jpeg");
//                BrowserUtils.waitFor(4);
//                break;
//            case"remove picture":
//                new CompanyPage().fileInput.sendKeys("C:/Users/rabia/Desktop/CRM24/crm24.jpeg");
//                BrowserUtils.waitFor(3);
//                new CompanyPage().fileRemove.click();
//                break;
            case"edit picture":
                BrowserUtils.waitFor(3);
                new CompanyPage().fileInput.sendKeys("C:/Users/rabia/Desktop/CRM24/crm24.jpeg");
                BrowserUtils.waitFor(2);
                new CompanyPage().fileEdit.click();
                BrowserUtils.waitFor(2);
                new CompanyPage().rightRotate.click();
                BrowserUtils.waitFor(2);
                new CompanyPage().leftRotate.click();
                BrowserUtils.waitFor(2);
                break;
            case"Tags":
                new CompanyPage().tags.click();
                break;
//            case"textRadioBtn":
//                new CompanyPage().textRadioBtn.click();
//                break;
//            case"htmlRadioBtn":
//                new CompanyPage().htmlRadioBtn.click();
//                break;
//            case"visualEditorRadioBtn":
//                new CompanyPage().visualEditorRadioBtn.click();
//                break;
//            case"titleBox":
//                new CompanyPage().titleBox.click();
//                break;
//            case"saveButton":
//                new CompanyPage().saveButton.click();
//                break;
        }

    }

    @Then("User should be able to select type of information under preview text")
    public void user_should_be_able_to_select_type_of_information_under_preview_text() {

        BrowserUtils.waitFor(2);

        WebElement selectTypeOfElement = new CompanyPage().selectTypeOfInfo;

        Select selectDropDown = new Select(selectTypeOfElement);

        selectDropDown.selectByVisibleText("Announcement");
        BrowserUtils.waitFor(2);
        selectDropDown.selectByVisibleText("Notice");
        BrowserUtils.waitFor(2);
        selectDropDown.selectByVisibleText("Order");
        BrowserUtils.waitFor(2);
        selectDropDown.selectByVisibleText("News");

        String expectedOption = "News";

        String actualOption = selectDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption);

        BrowserUtils.waitFor(2);

    }

    @Then("user should be able to select a date and set a time")
    public void user_should_be_able_to_select_a_date_and_set_a_time() {

        BrowserUtils.waitFor(10);

        new CompanyPage().dateBox.clear();

        new CompanyPage().dateBox.sendKeys("03/13/2022");

        new CompanyPage().dateBox.sendKeys(Keys.TAB);

        new CompanyPage().dateBox.sendKeys(" 05:30:00 pm");

        new CompanyPage().dateBox.submit();

        BrowserUtils.waitFor(10);
    }

    @Then("user should be able to add or remove the picture")
    public void user_should_be_able_to_add_or_remove_the_picture() {

        BrowserUtils.waitFor(5);
        new CompanyPage().fileInput.sendKeys("C:/Users/rabia/Desktop/CRM24/crm24.jpeg");
        BrowserUtils.waitFor(5);
        new CompanyPage().fileRemove.click();
        BrowserUtils.waitFor(3);

    }

    @Then("user should be able to edit a picture under details")
    public void user_should_be_able_to_edit_a_picture_under_details()  {

        BrowserUtils.waitFor(3);
//        new CompanyPage().fileInput.sendKeys("C:/Users/rabia/Desktop/CRM24/crm24.jpeg");
//
//        BrowserUtils.waitFor(2);
//
//        new CompanyPage().fileEdit.click();

    }

    @Then("user should be able to add tags under details")
    public void user_should_be_able_to_add_tags_under_details() {

        BrowserUtils.waitFor(3);
        new CompanyPage().tags.sendKeys("Test Automation");
        BrowserUtils.waitFor(3);

    }

    @Then("user should be able to select Text, HTML and Visual Editor")
    public void user_should_be_able_to_select_Text_HTML_and_Visual_Editor() {
        BrowserUtils.waitFor(2);
        new CompanyPage().textRadioBtn.click();
        BrowserUtils.waitFor(1);
        new CompanyPage().htmlRadioBtn.click();
        BrowserUtils.waitFor(1);
        new CompanyPage().visualEditorRadioBtn.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user should be able to send news")
    public void user_should_be_able_to_send_news() {

        WebElement selectTypeOfElement = new CompanyPage().selectTypeOfInfo;
        BrowserUtils.waitFor(2);
        Select selectDropDown = new Select(selectTypeOfElement);
        selectDropDown.selectByVisibleText("News");
        BrowserUtils.waitFor(2);
        new CompanyPage().titleBox.sendKeys("news");
        BrowserUtils.waitFor(2);
        new CompanyPage().typeArea.sendKeys("HelloWorld!");
        BrowserUtils.waitFor(2);
        new CompanyPage().saveButton.click();
        BrowserUtils.waitFor(3);
    }


}