package com.nextbase.step_definitions;

import com.nextbase.pages.DrivePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DriveStepDefs {
DrivePage drivePage = new DrivePage();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        drivePage.drive.click();

    }

    @When("the user clicks Drive")
    public void the_user_clicks_Drive() {

    }

    @Then("the user should be able to navigate to Drive page")
    public void the_user_should_be_able_to_navigate_to_Drive_page() {

    }


}
