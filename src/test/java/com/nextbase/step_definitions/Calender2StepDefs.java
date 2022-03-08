package com.nextbase.step_definitions;

import com.nextbase.pages.CalendarPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;

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
    public void the_user_fill_necessary_sections() throws InterruptedException {

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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user search for AC's event's name")
    public void the_user_search_for_AC_s_event_s_name() {


    }
    @When("the user click the event")
    public void the_user_click_the_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user click EDIT")
    public void the_user_click_EDIT() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user click MORE")
    public void the_user_click_MORE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user click OTHER COLOR")
    public void the_user_click_OTHER_COLOR() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user select color of Navy Blue")
    public void the_user_select_color_of_Navy_Blue() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to edit the 1st AC's task color.")
    public void the_user_should_be_able_to_edit_the_1st_AC_s_task_color() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click Private event")
    public void the_user_click_Private_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("select Availability as Unsure")
    public void select_Availability_as_Unsure() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that user should be able to edit his\\/her availability from {string} to {string}.")
    public void verify_that_user_should_be_able_to_edit_his_her_availability_from_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user change event's name")
    public void the_user_change_event_s_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able to edit his\\/her event's name.")
    public void verify_that_user_should_be_able_to_edit_his_her_event_s_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user delete attendee")
    public void the_user_delete_attendee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able to delete attendee by editing the event.")
    public void verify_that_user_should_be_able_to_delete_attendee_by_editing_the_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user add attendee")
    public void the_user_add_attendee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able to add attendee by editing the event.")
    public void verify_that_user_should_be_able_to_add_attendee_by_editing_the_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click Filter and search")
    public void the_user_click_Filter_and_search() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user click I'M AN ORGANISER")
    public void the_user_click_I_M_AN_ORGANISER() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("verify that Marketing user can't display the 3rd AC's private event on his\\/her calendar.")
    public void verify_that_Marketing_user_can_t_display_the_3rd_AC_s_private_event_on_his_her_calendar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click Invitation")
    public void the_user_click_Invitation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user select Yes under Event with participants menu and Invited")
    public void the_user_select_Yes_under_Event_with_participants_menu_and_Invited() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that user should be able to edit the 1st AC's privacy as Private event.")
    public void verify_that_user_should_be_able_to_edit_the_1st_AC_s_privacy_as_Private_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able to edit his\\/her availability from Occupied to Unsure.")
    public void verify_that_user_should_be_able_to_edit_his_her_availability_from_Occupied_to_Unsure() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user select Repeat section as Daily")
    public void the_user_select_Repeat_section_as_Daily() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("veriy that user should be able to edit Repeat section as Daily.")
    public void veriy_that_user_should_be_able_to_edit_Repeat_section_as_Daily() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able display the events by using Filter and search box after clicking I'M AN ORGANISER button.")
    public void verify_that_user_should_be_able_display_the_events_by_using_Filter_and_search_box_after_clicking_I_M_AN_ORGANISER_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able to edit his or her event's name.")
    public void verify_that_user_should_be_able_to_edit_his_or_her_event_s_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that Marketing user can't display the 3rd AC's private event on his or her calendar.")
    public void verify_that_Marketing_user_can_t_display_the_3rd_AC_s_private_event_on_his_or_her_calendar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that user should be able to edit his or her availability from Occupied to Unsure.")
    public void verify_that_user_should_be_able_to_edit_his_or_her_availability_from_Occupied_to_Unsure() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
