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
        taskPage.addMoreButtonR.click();
    }

    @Then("user selects a {string}")
    public void user_selects_a(String string) {
        taskPage.marketing3UserMail.click();
        taskPage.nameSelector.click();

    }

    @When("user clicks to Deadline box")
    public void user_clicks_to_Deadline_box() {
        BrowserUtils.clickWithJS(taskPage.deadlineBox);

    }

    @Then("selects {string}, {string}, {string}, {string},{string} and {string}")
    public void selects_and(String month, String year, String day, String hour, String minutes, String ampm) {




    }

    @Then("clicks select to set deadline")
    public void clicks_select_to_set_deadline() {
        BrowserUtils.waitFor(2);


    }





    @Then("clicks to  Add Task to create the task")
    public void clicks_to_Add_Task_to_create_the_task() {

        taskPage.deadlineBox.submit();


    }




}
