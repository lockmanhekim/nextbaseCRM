package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.pages.WorkgroupsPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkingGroupsDefs {

    WorkgroupsPage workgroupsPage = new WorkgroupsPage();

    @When("the user enters the {string} information")
    public void the_user_enters_the_information(String userType) {

        switch (userType) {

            case "HR":
                new LoginPage().login(ConfigurationReader.get("HR_username"), ConfigurationReader.get("HR_password"));
                break;
            case "helpdesk":
                new LoginPage().login(ConfigurationReader.get("Helpdesk_username"), ConfigurationReader.get("Helpdesk_password"));
                break;
            case "marketing":
                new LoginPage().login(ConfigurationReader.get("Helpdesk_username"), ConfigurationReader.get("Helpdesk_password"));
                break;
        }

    }

    @When("the user click on Workgroups")
    public void the_user_click_on_Workgroups() {
        workgroupsPage.workGroupsButton.click();
    }

    @Then("Workgroups and projects page displayed")
    public void workgroups_and_projects_page_displayed() {
        Assert.assertTrue(Driver.get().getTitle().contains("Workgroups and projects"));
    }


    @When("the user click join button of {string}")
    public void the_user_click_join_button_of(String openWorkgroup) {

        if(openWorkgroup.equals("Corporate Christmas Party")){
            workgroupsPage.christmasJoin.click();
        }else if (openWorkgroup.equals("Soccer team")){
            workgroupsPage.soccerJoin.click();
        }

    }

    @Then("the user should able to see the {string} in My list")
    public void the_user_should_able_to_see_the_in_My_list(String openWorkgroup) {

       Assert.assertTrue(BrowserUtils.getElementsText(workgroupsPage.workgroupInMyList).contains(openWorkgroup));

    }

}