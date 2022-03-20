package com.nextbase.step_definitions;

import com.nextbase.pages.TaskPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TaskPageStepDefinitions {

    TaskPage taskPage = new TaskPage();

    @When("user navigates to Tasks page")
    public void user_navigates_to_Tasks_page() {
        taskPage.clickTaskButton();
        Assert.assertTrue(Driver.get().getTitle().contains("My tasks"));

    }


    @Then("{string} user should be able to display tasks {string} by clicking {string} tab.")
    public void user_should_be_able_to_display_tasks_by_clicking_tab(String userType, String taskStatus, String taskTab) {


        switch (userType) {
            case "HR":
                try {
                    taskPage.clickTabAll();
                } catch (Exception e) {
                    System.out.println("HR user can not  display tasks In Progress tasks by clicking All tab.");
                }
                try {
                    taskPage.clickOngoing();

                } catch (Exception e) {
                    System.out.println("HR user can not  display tasks Ongoing tasks by clicking Ongoing tab.");
                }

                break;
        }
        switch (userType) {
            case "Helpdesk":
                try {
                    taskPage.clickTabAll();
                } catch (Exception e) {
                    System.out.println("Helpdesk user can not  display tasks In Progress tasks by clicking All tab.");
                }
                try {
                    taskPage.clickOngoing();

                } catch (Exception e) {
                    System.out.println("Helpdesk user can not  display tasks Ongoing tasks by clicking Ongoing tab.");
                }
                break;
        }
        switch (userType) {
            case "Marketing":
                try {
                    taskPage.clickTabAll();
                } catch (Exception e) {
                    System.out.println("Marketing user can not  display tasks In Progress tasks by clicking All tab.");
                }
                try {
                    taskPage.clickOngoing();

                } catch (Exception e) {
                    System.out.println("Marketing user can not  display tasks Ongoing tasks by clicking Ongoing tab.");
                }

                break;
        }

    }

    @Then("clicks New Task button")
    public void clicks_New_Task_button() {
        taskPage.newTaskButton.click();

    }

    @Then("fills {string} in Things to do box")
    public void fills_in_Things_to_do_box(String taskName) {

        Driver.get().switchTo().frame(taskPage.iframe);

        taskPage.setTaskName.sendKeys(taskName);


    }

    @Then("checks High Priority check box")
    public void checks_High_Priority_check_box() {

        BrowserUtils.clickWithJS(taskPage.highPriorityCheckbox);

    }

    @Then("clicks person icon and selects {string} to mention")
    public void clicks_person_icon_and_selects_to_mention(String userMention) {
        taskPage.addMention.click();
        if (userMention.equalsIgnoreCase("marketing1")){
            taskPage.marketing1UserMail.click();
        } if (userMention.equalsIgnoreCase("marketing3")){
            taskPage.marketing3UserMail.click();
        }


    }

    @Then("clicks to add more button in Responsible person box")
    public void clicks_to_add_more_button_in_Responsible_person_box() {

        String text = taskPage.addMoreButtonR.getText();
        Assert.assertTrue(text.contains("add"));

        BrowserUtils.clickWithJS(taskPage.addMoreButtonR);

    }


    @Then("user selects a {string} user")
    public void user_selects_a(String person) {
        taskPage.selectPersonResponsible(person);
    }

    @When("user clicks to Deadline box")
    public void user_clicks_to_Deadline_box() {
        BrowserUtils.clickWithJS(taskPage.deadlineBox);

    }

    @Then("selects {string}, {string}, {string}, {string},{string} and {string}")
    public void selects_and(String month, String year, String day, String hour, String minutes, String ampm) {

        taskPage.selectHour(hour);
        taskPage.selectMinutes(minutes);
        taskPage.selectMonth(month);
        taskPage.selectYear(year);
        taskPage.findhiddenDays();
        taskPage.selectDay(day);


    }

    @Then("clicks select to set deadline")
    public void clicks_select_to_set_deadline() {

        BrowserUtils.clickWithJS(taskPage.submitDateDeadline);
    }

    @Then("clicks to  Add Task to create the task")
    public void clicks_to_Add_Task_to_create_the_task() {

        taskPage.deadlineBox.submit();
    }

    @Then("clicks to {string}")
    public void clicks_to(String taskname) {
        taskPage.clicksTask(taskname);

    }

    @Then("clicks to Edit button")
    public void clicks_to_Edit_button() {
        Driver.get().switchTo().frame(taskPage.iframe2);
        taskPage.getDeadlineDate();
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(taskPage.editButton);
        BrowserUtils.waitFor(4);
    }

    @Then("clicks to change in Responsible person box")
    public void clicks_to_change_in_Responsible_person_box() {
        BrowserUtils.clickWithJS(taskPage.changeResponsibleButton);

    }

    @Then("clicks to save changes")
    public void clicks_to_save_changes() {
        BrowserUtils.clickWithJS(taskPage.saveChangesButton);
    }

    @When("clicks More to display more settings")
    public void clicks_More_to_display_more_settings() {

        BrowserUtils.clickWithJS(taskPage.moreButton);

    }

    @Then("clicks Task Planned Time check box")
    public void clicks_Task_Planned_Time_check_box() {
        BrowserUtils.clickWithJS(taskPage.taskPlannedCheckBox);

    }

    @Then("enters {string} hours,{string} minutes to time tracking")
    public void enters_hours_minutes_to_time_tracking(String hour, String minutes) {
        BrowserUtils.clickWithJS(taskPage.timePlannedHour);
        taskPage.timePlannedHour.sendKeys(hour);
        BrowserUtils.clickWithJS(taskPage.timePlannedMinute);
        taskPage.timePlannedMinute.sendKeys(minutes);
    }

    @Then("clicks to Add reminder")
    public void clicks_to_Add_reminder() {

        BrowserUtils.clickWithJS(taskPage.AddReminderButton);
        BrowserUtils.waitFor(3);

    }


    @Then("selects {string} to remind")
    public void selects_to_remind(String remindtype) {
        if (remindtype.equalsIgnoreCase("deadline")) {
            BrowserUtils.clickWithJS(taskPage.dateOption);
            BrowserUtils.waitFor(3);
            BrowserUtils.clickWithJS(taskPage.deadlineOption);
        }


    }


    @Then("selects email option")
    public void selects_email_option() {
        BrowserUtils.clickWithJS(taskPage.emailOption);
        BrowserUtils.waitFor(4);


    }

    @Then("selects a {string} from calendar")
    public void selects_a_from_calendar(String date) {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(taskPage.calendarInputBox);

       // taskPage.setDeadLineDateDuringTask();

            if (date.equalsIgnoreCase("before deadline")){
                taskPage.setReminderDuring();

            }else if (date.equalsIgnoreCase("after deadline")){
                taskPage.setReminderFuture();
            }else if (date.equalsIgnoreCase("past date ")){
                taskPage.setReminderPast();
             }

        BrowserUtils.clickWithJS(taskPage.submitDateDeadline);


    }

    @Then("selects {string} the recipient")
    public void selects_the_recipient(String option) {

        BrowserUtils.clickWithJS(taskPage.recipientBox);
        BrowserUtils.waitFor(10);
        taskPage.setRecipientSelect(option);

    }

    @Then("clicks add")
    public void clicks_add() {
        BrowserUtils.clickWithJS(taskPage.addReminderSelections);

    }


    @Then("clicks to plus sign button of the {string} task")
    public void clicks_to_plus_sign_button_of_the_task(String string) {
        String aClass = taskPage.plusSignTestTask2.getAttribute("class");
        Assert.assertTrue(aClass.equalsIgnoreCase("main-grid-plus-button"));

        BrowserUtils.clickWithJS(taskPage.plusSignTestTask2);
    }

    @Then("clicks Participants")
    public void clicks_Participants() {
        BrowserUtils.clickWithJS(taskPage.participants);
    }

    @Then("clicks add in Participants")
    public void clicks_add_in_Participants() {
        BrowserUtils.clickWithJS(taskPage.addParticipant);

    }

    @Then("clicks Employees and departments in Participants")
    public void clicks_Employees_and_departments_in_Participants() {
        BrowserUtils.clickWithJS(taskPage.employeeDepartment);
    }

    @Then("selects {string}")
    public void selects(String participantUser) {
        taskPage.selectParticipant(participantUser);

    }

    @When("user clicks to Observers")
    public void user_clicks_to_Observers() {
        BrowserUtils.clickWithJS(taskPage.observers);
    }

    @When("clicks add in Observers")
    public void clicks_add_in_Observers() {
        BrowserUtils.clickWithJS(taskPage.addObserver);
    }

    @Then("clicks Employees and departments in Observers")
    public void clicks_Employees_and_departments_in_Observers() {
        BrowserUtils.clickWithJS(taskPage.employeeDepartment);
    }

    @Then("user selects {string}")
    public void user_selects(String observerUser) {
        taskPage.selectParticipant(observerUser);


    }

    @Then("Asserts {string} and {string} added")
    public void asserts_and_added(String participant, String observer) {

        Assert.assertTrue(taskPage.participantAdded.getText().equalsIgnoreCase(participant));
        Assert.assertTrue(taskPage.observerAdded.getText().equalsIgnoreCase(observer));
    }

    @Then("clicks to Add sign in Dependent task")
    public void clicks_to_Add_sign_in_Dependent_task() {
        BrowserUtils.clickWithJS(taskPage.addDependentTask);
        BrowserUtils.waitFor(3);
    }

    @Then("selects a {string} and clicks select")
    public void selects_a_and_clicks_select(String taskName) {
        if (taskName.contains("866.1")){
            BrowserUtils.clickWithJS(taskPage.task866_1);
        }

        if (taskName.contains("867")){
            BrowserUtils.clickWithJS(taskPage.task867_1);

        }



        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(taskPage.dependentTaskSelect);
        BrowserUtils.waitFor(3);

    }

    @Then("clicks to save changes displays error")
    public void clicks_to_save_changes_displays_error() {
        BrowserUtils.clickWithJS(taskPage.saveChangesButton);
        BrowserUtils.waitFor(4);
        Assert.assertTrue(taskPage.errorMessage.isDisplayed());
    }


    @Then("user checks the {string}")
    public void user_checks_the(String string) {
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(taskPage.checkBox871);


    }

    @Then("clicks select action dropdown")
    public void clicks_select_action_dropdown() {
        BrowserUtils.clickWithJS(taskPage.selectActionButton);
    }

    @Then("clicks delete")
    public void clicks_delete() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(taskPage.deleteSelectButon);
    }

    @Then("clicks Apply")
    public void clicks_Apply() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(taskPage.applyButtonControl);


    }

    @Then("clicks to continue in the pop up")
    public void clicks_to_continue_in_the_pop_up() {

        BrowserUtils.clickWithJS(taskPage.popUpContinue);
        Driver.get().navigate().refresh();

    }

    @Then("user clicks new task module")
    public void user_clicks_new_task_module() {
        BrowserUtils.clickWithJS(taskPage.newTaskModule);

    }

    @Then("clicks All templates")
    public void clicks_All_templates() {
        BrowserUtils.clickWithJS(taskPage.allTemplates);
    }

    @Then("clicks Add")
    public void clicks_Add() {
        BrowserUtils.clickWithJS(taskPage.addButtonTaskModule);
    }
    @Then("user able display New task template page")
    public void user_able_display_New_task_template_page() {

        Assert.assertTrue(taskPage.pageTitleNewTemplate.isDisplayed());

    }


    @Then("fills {string} in Things to do box in New task template")
    public void fills_in_Things_to_do_box_in_New_task_template(String taskName) {

       taskPage.setTaskName.sendKeys(taskName);
    }

    @Then("user can display themselves as Responsible person")
    public void user_can_display_themselves_as_Responsible_person() {

        String text = taskPage.responsiblePerson.getText();
        Assert.assertTrue(text.contains("hr3"));



    }


    @Then("selects {string} and enters {string}")
    public void selects_and_enters(String deadlineOption, String timeValue) {

        if (deadlineOption.equalsIgnoreCase("Day")) {
            BrowserUtils.clickWithJS(taskPage.daysOption);
            taskPage.timeInputBoxDeadlineIn.sendKeys(timeValue);
        } else if (deadlineOption.equalsIgnoreCase("Hour")){
            BrowserUtils.clickWithJS(taskPage.hoursOption);
            taskPage.timeInputBoxDeadlineIn.sendKeys(timeValue);

        }else if (deadlineOption.equalsIgnoreCase("Minute")){
            BrowserUtils.clickWithJS(taskPage.minutesOption);
            taskPage.timeInputBoxDeadlineIn.sendKeys(timeValue);

        }
    }

    @Then("clicks options")
    public void clicks_options() {
        BrowserUtils.waitFor(5);
        BrowserUtils.clickWithJS(taskPage.deadlineOptions);

    }

    @Then("selects {string} for deadline options")
    public void selects_for_deadline_options(String options) {
        taskPage.setDeadlineOption(options);
    }

    @Then("clicks Create Task Template {string}")
    public void clicks_Create_Task_Template(String taskname) {
        BrowserUtils.clickWithJS(taskPage.createTaskButton);
        taskPage.assertTemplateExists(taskname);

    }
    @Then("clicks to add for adding checklist")
    public void clicks_to_add_for_adding_checklist() {
        Driver.get().switchTo().frame(taskPage.iframe3);
        BrowserUtils.clickWithJS(taskPage.checkListAddButton);
    }

    @Then("fills input box with checklist data using separator")
    public void fills_input_box_with_checklist_data_using_separator() {
        taskPage.checklistSeparatorTest();
        taskPage.assertChechlistSeparatorTest();

    }
    @Then("selects deadline to remind")
    public void selects_deadline_to_remind() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("enters {string} to time input box")
    public void enters_to_time_input_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }










}




