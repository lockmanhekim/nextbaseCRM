package com.nextbase.step_definitions;

import com.nextbase.pages.TaskPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TaskPageStepDefinitions {

        TaskPage taskPage= new TaskPage();

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
                       taskPage.clickTabAll();                   }
                   catch(Exception e) {
                       System.out.println("HR user can not  display tasks In Progress tasks by clicking All tab.");
                   }
                   try {
                       taskPage.clickOngoing();

                   }catch(Exception e) {
                       System.out.println("HR user can not  display tasks Ongoing tasks by clicking Ongoing tab.");
                   }

                   break;
           }
           switch (userType) {
               case "Helpdesk":
                   try {
                       taskPage.clickTabAll();                   }
                   catch(Exception e) {
                       System.out.println("Helpdesk user can not  display tasks In Progress tasks by clicking All tab.");
                   }
                   try {
                       taskPage.clickOngoing();

                   }catch(Exception e) {
                       System.out.println("Helpdesk user can not  display tasks Ongoing tasks by clicking Ongoing tab.");
                   }
                   break;
           }
           switch (userType) {
               case "Marketing":
                   try {
                       taskPage.clickTabAll();                   }
                   catch(Exception e) {
                       System.out.println("Marketing user can not  display tasks In Progress tasks by clicking All tab.");
                   }
                   try {
                       taskPage.clickOngoing();

                   }catch(Exception e) {
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
        BrowserUtils.selectCheckBox(taskPage.highPriorityCheckbox,true);
        Assert.assertTrue(taskPage.highPriorityCheckbox.isSelected());

    }

    @Then("clicks person icon and selects {string} to mention")
    public void clicks_person_icon_and_selects_to_mention(String string) {
        taskPage.addMention.click();
        taskPage.marketing1UserMail.click();


    }

    @Then("clicks to add more button in Responsible person box")
    public void clicks_to_add_more_button_in_Responsible_person_box() {

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
        BrowserUtils.waitFor(4);




    }

    @Then("clicks to Edit button")
    public void clicks_to_Edit_button() {
        Driver.get().switchTo().frame(taskPage.iframe2);
        taskPage.getDeadlineDate();
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
        if(remindtype.equalsIgnoreCase("deadline")) {
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
    public void selects_a_from_calendar(String string) {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(taskPage.calendarInputBox);
        BrowserUtils.waitFor(4);
        taskPage.setDeadLineDateDuringTask();
        BrowserUtils.clickWithJS(taskPage.submitDateDeadline);


    }

    @Then("selects {string} the recipient")
    public void selects_the_recipient(String option) {
       BrowserUtils.clickWithJS(taskPage.recipientSelect);
       taskPage.setRecipientSelect(option);

    }

    @Then("clicks add")
    public void clicks_add() {
       BrowserUtils.clickWithJS(taskPage.addReminderSelections);

    }



    @Then("clicks to plus sign button of the {string} task")
    public void clicks_to_plus_sign_button_of_the_task(String string) {
        BrowserUtils.clickWithJS(taskPage.plusSign);
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

    @Then("clicks to Checklist")
    public void clicks_to_Checklist() {
        BrowserUtils.clickWithJS(taskPage.checkListButton);
    }

    @Then("add {string} checklistItem {string} using separator")
    public void add_checklistItem_using_separator(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }










}
