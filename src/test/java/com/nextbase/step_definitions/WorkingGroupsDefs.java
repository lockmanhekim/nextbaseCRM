package com.nextbase.step_definitions;

import com.nextbase.pages.WorkgroupsPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingGroupsDefs {

    WorkgroupsPage workgroupsPage = new WorkgroupsPage();

    @When("the user click on Workgroups")
    public void the_user_click_on_Workgroups() {

        workgroupsPage.workGroupsButton.click();
    }

    @Then("Workgroups and projects page displayed")
    public void workgroups_and_projects_page_displayed() {

        Assert.assertTrue(Driver.get().getTitle().contains("Workgroups and projects"));
    }

    @Then("the user should able to see the {string} in My list")
    public void the_user_should_able_to_see_the_in_My_list(String str) {

        workgroupsPage.search.click();
        workgroupsPage.myList.click();

        Assert.assertTrue(workgroupsPage.getWorkgroup(str).isDisplayed());
    }

    @When("the user click join button of a {string}")
    public void the_user_click_join_button_of_a(String str) {

        try{
            workgroupsPage.getJoinButtons(str).click();
        }catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }

    @Then("the user should able to join the {string}")
    public void theUserShouldAbleToJoinThe(String str) {
        try{
            if (str.equals("PR and advertising")){
                Assert.assertTrue(workgroupsPage.sendMessagePR.isDisplayed());
            }else if(str.equals("Soccer team")){
                Assert.assertTrue(workgroupsPage.sendMessageSales.isDisplayed());
            }
        }catch (NoSuchElementException e){
            workgroupsPage.search.click();
            workgroupsPage.myList.click();
            Assert.assertTrue(workgroupsPage.getWorkgroup(str).isDisplayed());
        }
    }

    @When("the user click on add favorite icon of {string}")
    public void the_User_Click_On_Add_Favorite_Icon_Of(String str) {

        if(workgroupsPage.getFavIcon(str).getAttribute("title").equals("Add to favorites")){
            workgroupsPage.getFavIcon(str).click();
        }
    }

    @Then("the user should able to see the {string} in Favorites list")
    public void theUserShouldAbleToSeeTheInFavoritesList(String str) {

        workgroupsPage.search.click();
        workgroupsPage.favoriteList.click();

        Assert.assertTrue(workgroupsPage.getFavIcon(str).isDisplayed());

    }
}