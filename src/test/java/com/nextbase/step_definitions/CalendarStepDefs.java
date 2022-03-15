package com.nextbase.step_definitions;

import com.nextbase.pages.CalendarPage;
import com.nextbase.pages.EmployeePage;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefs {



    @When("user clicks on {string} link from left menu.")
    public void user_clicks_on_link_from_left_menu(String string) throws InterruptedException {
        if(string.equalsIgnoreCase("calendar")){
            new CalendarPage().calendarLink.click();
        }
        Thread.sleep(2000);
    }

    @When("the user clicks {string} tab on the page header")
    public void the_user_clicks_tab_on_the_page_header(String string) throws InterruptedException {
        Thread.sleep(5000);
        if(string.equalsIgnoreCase("My Calendar")){
            new CalendarPage().myCalendarTab.click();
        }else if (string.equalsIgnoreCase("Company Calendar")){
            new CalendarPage().companyCalendarTab.click();
        }
        Thread.sleep(2000);
    }


    @Then("the user should display {string} on the content area.")
    public void the_user_should_display_on_the_content_area(String string) {

        Assert.assertEquals(string, new CalendarPage().pageTitle2.getText());


    }



}
