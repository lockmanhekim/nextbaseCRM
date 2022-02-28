package com.nextbase.step_definitions;

import com.nextbase.pages.CalendarPage;
import com.nextbase.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.nextbase.pages.EmployeePage;
import com.nextbase.utilities.Driver;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.ConfigurationReader;
import org.junit.Assert;


public class EmployeeStepDefs {


    @When("user clicks on {string} link from left menu")
    public void user_clicks_on_link_from_left_menu(String string) throws InterruptedException {
        Thread.sleep(10000);
        if(string.equalsIgnoreCase("employees")){
            new EmployeePage().employeeLink.click();
        }
    }

    @When("user clicks on {string}")
    public void user_clicks_on(String string) {
        if(string.equalsIgnoreCase("Company Structure")){
            new EmployeePage().companyStructureLink.click();
        }else if(string.equalsIgnoreCase("Telephone Directory")){
            new EmployeePage().telephoneDirectoryLink.click();
        }
    }

    @Then("user should see {string} text")
    public void user_should_see_text(String string) {
        Assert.assertEquals(string, new EmployeePage().pageTitle.getText());

    }



}
