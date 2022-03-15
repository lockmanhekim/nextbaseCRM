package com.nextbase.step_definitions;


import com.nextbase.pages.SearchBarPage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBarBoxStepDefs {

    SearchBarPage searchBarPage = new SearchBarPage();

    @When("click the search bar")
    public void click_the_search_bar() {

        searchBarPage.searchInput.click();
    }

    @When("typed {string} in the search bar")
    public void typed_in_the_search_bar(String conver) {
        searchBarPage.searchInput.sendKeys(conver);
        BrowserUtils.waitFor(2);
    }

    @When("click the Conversations button")
    public void click_the_Conversations_button() {
        searchBarPage.searchResult.click();
    }

    @Then("the	Conversations page	should	be	displayed")
    public void the_Conversations_page_should_be_displayed() {
            BrowserUtils.waitFor(2);
    }

    @When("click the search bar button")
    public void click_the_search_bar_button() {
        searchBarPage.searchResult2.click();

    }

    @Then("typed keyword should be displayed")
    public void typed_keyword_should_be_displayed() {
        BrowserUtils.waitFor(2);
    }


}



