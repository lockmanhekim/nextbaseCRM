package com.nextbase.step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.Color;
import com.nextbase.pages.CalendarPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.Arrays;

public class Calender2StepDefs {

    CalendarPage calendar = new CalendarPage();


    @When("the user navigate to calender page")
    public void the_user_navigate_to_calender_page() {

        new Actions(Driver.get()).moveToElement(calendar.Calendar).pause(200).doubleClick(calendar.Calendar).build().perform();
    }

    @When("the user click ADD")
    public void the_user_click_ADD() throws InterruptedException {

        new Actions(Driver.get()).moveToElement(calendar.add).pause(200).doubleClick(calendar.add).build().perform();
        Thread.sleep(1000);
    }

    @When("the user fill necessary sections")
    public void the_user_fill_necessary_sections() {

        calendar.importantIcon.click();

        calendar.eventName.clear();
        calendar.eventName.sendKeys("Lokman's event");

        calendar.dateBox1.clear();
        calendar.dateBox1.sendKeys("08/25/2022");
        BrowserUtils.waitFor(1);

        calendar.clock1.clear();
        calendar.clock1.sendKeys("01:10 pm");
        BrowserUtils.waitFor(1);

        calendar.dateBox2.clear();
        calendar.dateBox2.sendKeys("08/30/2022");
        BrowserUtils.waitFor(1);

        calendar.clock2.clear();
        calendar.clock2.sendKeys("02:10 pm");
        BrowserUtils.waitFor(1);

        calendar.timeZoneIcon.click();
        BrowserUtils.waitFor(1);

        Select time1 = new Select(calendar.timeZoneSelect1);

        time1.selectByIndex(45);
        BrowserUtils.waitFor(1);

        Select time2 = new Select(calendar.timeZoneSelect2);

        time2.selectByIndex(45);
        BrowserUtils.waitFor(1);

        calendar.locationIcon.click();
        BrowserUtils.waitFor(1);

        calendar.locationWanted.click();
        BrowserUtils.waitFor(1);

        BrowserUtils.scrollToElement(calendar.addIcon);
        BrowserUtils.waitFor(1);
        calendar.addIcon.click();

        calendar.addingZone.sendKeys("marketing1@cybertekschool.com" + Keys.ENTER);
        calendar.addIcon.click();
        calendar.addingZone.sendKeys("helpdesk1@cybertekschool.com" + Keys.ENTER);
        BrowserUtils.waitFor(1);

        calendar.moreIcon.click();

        // iframe içi
        Driver.get().switchTo().frame(calendar.iframe);

        BrowserUtils.scrollToElement(calendar.description);

        calendar.description.sendKeys("MY_FIRST_DESCRIPTION_OF_BIRTHDAY");
        BrowserUtils.waitFor(1);

        Driver.get().switchTo().defaultContent();
        // frameden çıktık


    }

    @When("the user click SAVE")
    public void the_user_click_SAVE() {
        calendar.save.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be able to add new important repeating event")
    public void the_user_should_be_able_to_add_new_important_repeating_event() {


        BrowserUtils.waitFor(1);
        calendar.filterAndSearchBox.click();
        calendar.I_Am_Organizer.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(calendar.searchedEvent.isDisplayed());

    }


    @When("the user search for AC's event's name")
    public void the_user_search_for_AC_s_event_s_name() {

        BrowserUtils.waitForVisibility(calendar.filterAndSearchBox, 5);
        calendar.filterAndSearchBox.sendKeys("Lokman" + Keys.ENTER);

        BrowserUtils.waitFor(4);
    }

    @When("the user click the event")
    public void the_user_click_the_event() {

        BrowserUtils.waitForVisibility(calendar.searchedEvent, 4);
        calendar.searchedEvent.click();
    }

    @When("the user click EDIT")
    public void the_user_click_EDIT() {

        BrowserUtils.scrollToElement(calendar.editIcon);
        calendar.editIcon.click();

    }

    @When("the user click MORE")
    public void the_user_click_MORE() {

        BrowserUtils.scrollToElement(calendar.moreIcon);
        BrowserUtils.waitFor(2);
        calendar.moreIcon.click();
    }

    @When("the user click OTHER COLOR")
    public void the_user_click_OTHER_COLOR() {

        calendar.otherColorIcon.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user select color of Navy Blue")
    public void the_user_select_color_of_Navy_Blue() {

        BrowserUtils.clickWithJS(calendar.otherColorIcon);

        BrowserUtils.clickWithJS(calendar.navyColorIcon);

        BrowserUtils.waitFor(1);

    }

    @Then("the user should be able to edit the 1st AC's task color.")
    public void the_user_should_be_able_to_edit_the_1st_AC_s_task_color() {

        BrowserUtils.waitForVisibility(calendar.filterAndSearchBox, 5);
        calendar.filterAndSearchBox.clear();
        calendar.filterAndSearchBox.sendKeys("lokman" + Keys.ENTER);
        BrowserUtils.waitFor(2);

        BrowserUtils.scrollToElement(calendar.searchedColorIcon);
        String att =calendar.searchedColorIcon.getAttribute("style");
        System.out.println(att);
        System.out.println("sdfsasdfgfdgx");

        Assert.assertTrue(att.contains("rgb(0, 0, 255)"));


    }

    @When("the user click Private event")
    public void the_user_click_Private_event() {

        calendar.privateIcon.click();
    }


    @When("select Availability as Unsure")
    public void select_Availability_as_Unsure() {

        BrowserUtils.scrollToElement(calendar.accesBox);
        Select occu = new Select(calendar.accesBox);

        occu.selectByIndex(1);
        BrowserUtils.waitFor(2);

        calendar.save.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user change event's name")
    public void the_user_change_event_s_name() {

        calendar.changeEventTitle.clear();
        calendar.changeEventTitle.sendKeys("Lokman");
        BrowserUtils.waitFor(1);
    }

    @Then("verify that user should be able to edit his\\/her event's name.")
    public void verify_that_user_should_be_able_to_edit_his_her_event_s_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user delete attendee")
    public void the_user_delete_attendee() {

        BrowserUtils.scrollToElement(calendar.delMarketingUser);
        calendar.delMarketingUser.click();
    }

    @Then("verify that user should be able to delete attendee by editing the event.")
    public void verify_that_user_should_be_able_to_delete_attendee_by_editing_the_event() {

        BrowserUtils.waitForVisibility(calendar.filterAndSearchBox, 5);
        calendar.filterAndSearchBox.click();
        calendar.I_Am_Organizer.click();
        BrowserUtils.waitFor(2);

        calendar.searchedColorIcon.click();

        BrowserUtils.scrollToElement(calendar.openIcon);
        calendar.openIcon.click();

        BrowserUtils.scrollToElement(calendar.displayMarketingUser);
        String marketing = calendar.displayMarketingUser.getText();

        Assert.assertFalse(marketing.equalsIgnoreCase("marketing1@cybertekschool.com"));
    }


    @When("the user add attendee")
    public void the_user_add_attendee() {

        BrowserUtils.scrollToElement(calendar.addIcon);
        BrowserUtils.waitFor(1);
        calendar.addIcon.click();

        BrowserUtils.scrollToElement(calendar.addingZone);
        calendar.addingZone.sendKeys("marketing1@cybertekschool.com" + Keys.ENTER);
        calendar.addIcon.click();

    }

    @Then("verify that user should be able to add attendee by editing the event.")
    public void verify_that_user_should_be_able_to_add_attendee_by_editing_the_event() {

        BrowserUtils.waitForVisibility(calendar.filterAndSearchBox, 5);
        calendar.filterAndSearchBox.click();
        calendar.I_Am_Organizer.click();
        BrowserUtils.waitFor(2);

        calendar.searchedColorIcon.click();

        BrowserUtils.scrollToElement(calendar.openIcon);
        calendar.openIcon.click();

        String actualMarketingUser= calendar.displayMarketingUser2.getText();

        Assert.assertEquals("same","marketing1@cybertekschool.com",actualMarketingUser);

    }

    @When("the user click Filter and search")
    public void the_user_click_Filter_and_search() {
        BrowserUtils.waitFor(1);
        calendar.filterAndSearchBox.click();
    }
    @When("the user click I'M AN ORGANISER")
    public void the_user_click_I_M_AN_ORGANISER() {

        BrowserUtils.waitFor(1);
        calendar.I_Am_Organizer.click();
    }


    @Then("verify that Marketing user can't display the 3rd AC's private event on his\\/her calendar.")
    public void verify_that_Marketing_user_can_t_display_the_3rd_AC_s_private_event_on_his_her_calendar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click Invitation")
    public void the_user_click_Invitation() {

        calendar.filterAndSearchBox.click();
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(calendar.invitationIcon);
        BrowserUtils.waitFor(1);
    }

    @When("the user click Search")
    public void the_user_click_Search() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user click Reset")
    public void the_user_click_Reset() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that user should be able to reset Filter and Search options.")
    public void verify_that_user_should_be_able_to_reset_Filter_and_Search_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able display the invitations by using Filter and search box after clicking Invitations button.")
    public void verify_that_user_should_be_able_display_the_invitations_by_using_Filter_and_search_box_after_clicking_Invitations_button() {

        BrowserUtils.waitFor(1);
        String actualTitle = calendar.newinvi.getText();

        Assert.assertEquals("same","New Event",actualTitle);
    }

    @When("the user select Yes under Event with participants menu and Invited")
    public void the_user_select_Yes_under_Event_with_participants_menu_and_Invited() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that user should be able to edit the 1st AC's privacy as Private event.")
    public void verify_that_user_should_be_able_to_edit_the_1st_AC_s_privacy_as_Private_event() {

        BrowserUtils.waitForVisibility(calendar.filterAndSearchBox, 5);
        calendar.filterAndSearchBox.click();
        calendar.I_Am_Organizer.click();
        BrowserUtils.waitFor(2);

        calendar.searchedColorIcon.click();

        BrowserUtils.scrollToElement(calendar.openIcon);
        calendar.openIcon.click();

        BrowserUtils.scrollToElement(calendar.privateText);
        String a= calendar.privateText.getText();

        Assert.assertEquals("Private Event", "Private Event",a);

    }

    @When("the user select Repeat section as Daily")
    public void the_user_select_Repeat_section_as_Daily() {

        Select repeat = new Select(calendar.repeat);
        repeat.selectByIndex(1);
        BrowserUtils.waitFor(2);


    }

    @Then("veriy that user should be able to edit Repeat section as Daily.")
    public void veriy_that_user_should_be_able_to_edit_Repeat_section_as_Daily() {

        Alert alert = Driver.get().switchTo().alert();
        System.out.println(alert.getText()); //Print Alert popup
        alert.accept(); //Close Alert popup
        BrowserUtils.waitFor(3);
        System.out.println("olmuyor");
    }

    @Then("verify that user should be able display the events by using Filter and search box after clicking I'M AN ORGANISER button.")
    public void verify_that_user_should_be_able_display_the_events_by_using_Filter_and_search_box_after_clicking_I_M_AN_ORGANISER_button() {

        BrowserUtils.waitFor(1);
        String actualTitle = calendar.newinvi.getText();

        Assert.assertEquals("same","Lokman",actualTitle);

    }

    @Then("verify that user should be able to edit his or her event's name.")
    public void verify_that_user_should_be_able_to_edit_his_or_her_event_s_name() {


        BrowserUtils.waitForVisibility(calendar.filterAndSearchBox, 5);
        calendar.filterAndSearchBox.click();
        calendar.I_Am_Organizer.click();
        BrowserUtils.waitFor(2);

        calendar.searchedColorIcon.click();

        BrowserUtils.scrollToElement(calendar.openIcon);
        calendar.openIcon.click();

        String realTitle= calendar.eventTitle.getText();

        Assert.assertEquals("see","Lokman",realTitle);


    }

    @Then("verify that Marketing user can't display the 3rd AC's private event on his or her calendar.")
    public void verify_that_Marketing_user_can_t_display_the_3rd_AC_s_private_event_on_his_or_her_calendar() {

        Assert.assertFalse(calendar.searchedEvent.isDisplayed());

    }

    @Then("verify that user should be able to edit his or her availability from Occupied to Unsure.")
    public void verify_that_user_should_be_able_to_edit_his_or_her_availability_from_Occupied_to_Unsure() {

        BrowserUtils.waitForVisibility(calendar.filterAndSearchBox, 5);
        calendar.filterAndSearchBox.clear();
        calendar.filterAndSearchBox.sendKeys("lokman" + Keys.ENTER);
        BrowserUtils.waitFor(2);

        calendar.searchedEvent.click();

        BrowserUtils.scrollToElement(calendar.openIcon);
        calendar.openIcon.click();

        BrowserUtils.scrollToElement(calendar.availability);
        calendar.availability.getText();

        Assert.assertTrue(calendar.availability.getText().equalsIgnoreCase("Undecided"));






    }


}
