package com.nextbase.step_definitions;

import com.nextbase.pages.DrivePage;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DriveStepDefs {
    DrivePage drivePage= new DrivePage();

    @When("the user clicks Drive")
    public void the_user_clicks_Drive() {
        drivePage.drive.click();


    }



    @Then("the user should be able to display My Drive")
    public void theUserShouldBeAbleToDisplayMyDrive() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "My Drive";

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }

    @Then("the user should be able to display Company Drive")
    public void theUserShouldBeAbleToDisplayCompanyDrive() throws InterruptedException {
        drivePage.companyDrive.click();

        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Company drive";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Thread.sleep(3000);

    }

    @Then("the user should be able to navigate to Drive page")
    public void theUserShouldBeAbleToNavigateToDrivePage() {


    }
}
