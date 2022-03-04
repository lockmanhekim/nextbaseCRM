package com.nextbase.step_definitions;

import com.nextbase.pages.BasePage;
import com.nextbase.pages.GeneralRequestsPage;
import com.nextbase.pages.WorkflowsInActivityStreamPage;
import com.nextbase.pages.WorkflowsPage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WorkflowsStepDefs {

    @Then("the user accesses the {string}")
    public void the_user_accesses_the(String tab) {
        BrowserUtils.click(new WorkflowsPage().leftMenuMoreBtn);
        new WorkflowsPage().getTab(tab);
    }

    @Then("the user accesses the {string} under Workflows tab")
    public void the_user_accesses_the_under_Workflows_tab(String tab) {
        new WorkflowsPage().getTab(tab);
    }

    @Then("the user clicks on {string} module under Workflows in Activity Stream tab")
    public void the_user_clicks_on_module_under_Workflows_in_Activity_Stream_tab(String module) {
        new WorkflowsInActivityStreamPage().getModule(module);
    }

    @When("the user clicks on Add button under Workflows in Activity Stream tab")
    public void the_user_clicks_on_button_under_Workflows_in_Activity_Stream_tab() {
        BrowserUtils.click(new WorkflowsInActivityStreamPage().addButton);
    }

    @When("the user specifies the title as {string} under Workflows in Activity Stream tab")
    public void the_user_specifies_the_title_as_under_Workflows_in_Activity_Stream_tab(String title) {
        BrowserUtils.getElement(new WorkflowsInActivityStreamPage().title).sendKeys(title);
    }

    @When("the user enters description as {string} under Workflows in Activity Stream tab for General Request")
    public void the_user_enters_description_as_under_Workflows_in_Activity_Stream_tab_for_General_Request(String description) {
        BrowserUtils.getElement(new GeneralRequestsPage().description).sendKeys(description);
    }

    @When("the user sets priority level as {string} under Workflows in Activity Stream tab for General Request")
    public void the_user_sets_priority_level_as_under_Workflows_in_Activity_Stream_tab_for_General_Request(String option) {
        new GeneralRequestsPage().selectPriorityLevel(option);
    }

    @When("the user sends request to {string} under Workflows in Activity Stream tab for General Request")
    public void the_user_sends_request_to_under_Workflows_in_Activity_Stream_tab_for_General_Request(String id) {
        new GeneralRequestsPage().sendRequestTo(id);
    }

    @When("the user clicks on save button under Workflows in Activity Stream tab")
    public void the_user_clicks_on_save_button_under_Workflows_in_Activity_Stream_tab() {
        BrowserUtils.click(new WorkflowsInActivityStreamPage().saveBtn);
    }
    @Then("the user should verify the request {string} under Workflow Tasks")
    public void the_user_should_verify_the_request_under_Workflow_Tasks(String request) {
        new WorkflowsPage().requestLink(request);
    }
    @Then("the user refuses the request under Workflow Tasks")
    public void the_user_refuses_the_request_under_Workflow_Tasks() {
        BrowserUtils.click(new WorkflowsPage().refuseLink);
    }
    @Then("the error message {string} should be displayed under Workflows in Activity Stream tab for General Requests")
    public void the_error_message_should_be_displayed_under_Workflows_in_Activity_Stream_tab_for_General_Requests(String errorMessage) {
        Assert.assertEquals("Verifying the error message",errorMessage, BrowserUtils.getElement(new GeneralRequestsPage().errorMessage).getText());
    }
}
