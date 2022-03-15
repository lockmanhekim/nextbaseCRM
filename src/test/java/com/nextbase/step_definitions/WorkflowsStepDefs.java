package com.nextbase.step_definitions;

import com.nextbase.pages.workflows.*;
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

    @When("the user enters description as {string} under Workflows in Activity Stream tab")
    public void the_user_enters_description_as_under_Workflows_in_Activity_Stream_tab_for_General_Request(String description) {
        BrowserUtils.getElement(new WorkflowsInActivityStreamPage().descriptionField).sendKeys(description);
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
    @When("the user enters {string} as {string} under Workflows in Activity Stream tab for Leave Request")
    public void the_user_enters_start_date_as_under_Workflows_in_Activity_Stream_tab_for_Leave_Request(String date, String date2) {
        String month = date2.split("/")[0];
        String day = date2.split("/")[1];
        String year = date2.split("/")[2];
      new WorkflowsInActivityStreamPage().datePicker(date, day, month, year);
    }

    @When("the user selects absence type as {string} under Workflows in Activity Stream tab for Leave Request")
    public void the_user_selects_absence_type_as_under_Workflows_in_Activity_Stream_tab_for_Leave_Request(String option) {
        new LeaveRequestPage().selectAbsenseType(option);
    }

    @When("the user specifies the reason for leave as {string} under Workflows in Activity Stream tab for Leave Request")
    public void the_user_specifies_the_reason_for_leave_as_under_Workflows_in_Activity_Stream_tab_for_Leave_Request(String reason) {
        BrowserUtils.getElement(new WorkflowsInActivityStreamPage().descriptionField).sendKeys(reason);
    }
    @When("the user enters destination as {string} under Workflows")
    public void the_user_enters_destination_as_under_Workflows(String destination) {
        BrowserUtils.getElement(new BusinessTripPage().destination).sendKeys(destination);
    }

    @When("the user enters {string} as {string} under Workflows in Activity Stream tab for Business Trip")
    public void the_user_enters_as_under_Workflows_in_Activity_Stream_tab_for_Business_Trip(String date, String date2) {
        String month = date2.split("/")[0];
        String day = date2.split("/")[1];
        String year = date2.split("/")[2];
        new BusinessTripPage().datePicker(date,day, month, year);
    }

    @When("the user enters planned expenses as {string} under Workflows in Activity Stream tab")
    public void the_user_enters_planned_expenses_under_Workflows_in_Activity_Stream_tab(String expanses) {
       BrowserUtils.getElement(new BusinessTripPage().plannedExpanses).sendKeys(expanses);
    }

    @When("the user sets currency as {string} under Workflows in Activity Stream tab for business trip")
    public void the_user_sets_currency_as_under_Workflows_in_Activity_Stream_tab(String option) {
       new BusinessTripPage().selectCurrency(option);
    }

    @When("the user uploads a file {string} under Workflows in Activity Stream tab for business trip")
    public void the_user_uploads_a_file_under_Workflows_in_Activity_Stream_tab(String fileName) {
        new BusinessTripPage().uploadFile(fileName);
    }

    @When("the user specifies amount as {string} under Workflows in Activity Stream tab")
    public void the_user_specifies_amount_as_under_Workflows_in_Activity_Stream_tab(String amount) {
        BrowserUtils.getElement(new PurchaseRequest().amount).sendKeys(amount);
    }

    @When("the user sets currency as {string} under Workflows in Activity Stream tab for purchase request")
    public void the_user_sets_currency_as_under_Workflows_in_Activity_Stream_tab_for_purchase_request(String option) {
        new PurchaseRequest().selectCurrency(option);
    }

    @When("the user uploads a file {string} under Workflows in Activity Stream tab for purchase request")
    public void the_user_uploads_a_file_under_Workflows_in_Activity_Stream_tab_for_purchase_request(String file) {
        new PurchaseRequest().uploadFile(file);
    }
    @When("the user specifies amount as {string} under Workflows in Activity Stream tab for expense report")
    public void the_user_specifies_amount_as_under_Workflows_in_Activity_Stream_tab_for_expense_report(String amount) {
      BrowserUtils.getElement(new ExpenseReportPage().amount).sendKeys(amount);
    }

    @When("the user sets currency as {string} under Workflows in Activity Stream tab for expense report")
    public void the_user_sets_currency_as_under_Workflows_in_Activity_Stream_tab_for_expense_report(String option) {
       new ExpenseReportPage().selectCurrency(option);
    }

    @When("the user uploads a file {string} under Workflows in Activity Stream tab for expense report")
    public void the_user_uploads_a_file_under_Workflows_in_Activity_Stream_tab_for_expense_report(String file) {
       new ExpenseReportPage().uploadFile(file);
    }
    @When("the user enters description as {string} under Workflows in Activity Stream tab for expense report")
    public void the_user_enters_description_as_under_Workflows_in_Activity_Stream_tab_for_expense_report(String description) {
        BrowserUtils.getElement(new ExpenseReportPage().description).sendKeys(description);
    }
}
