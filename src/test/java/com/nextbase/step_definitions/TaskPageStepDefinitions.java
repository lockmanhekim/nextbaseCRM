package com.nextbase.step_definitions;

import com.nextbase.pages.TaskPage;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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



}
