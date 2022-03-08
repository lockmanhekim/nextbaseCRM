package com.nextbase.step_definitions;

import com.nextbase.pages.ServicePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class ServiceStepDefs {

    ServicePage servicePage = new ServicePage();

    @When("the user click on {string}")
    public void the_user_click_on(String str) {
        servicePage.getPage(str).click();
    }

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String str) {
        Assert.assertTrue(Driver.get().getTitle().contains(str));
    }


    @When("the Helpdesk click on Meeting Room Booking Calendar View")
    public void the_Helpdesk_click_on_Meeting_Room_Booking_Calendar_View() {
        servicePage.calendarView.click();
    }

    @When("the Helpdesk user click on Book meeting room")
    public void the_Helpdesk_user_click_on_Book_meeting_room() {
        servicePage.bookMeetingRoom.click();
    }

    @Then("Helpdesk User can be redirected to New Event page")
    public void helpdesk_User_can_be_redirected_to_New_Event_page() {
        Assert.assertTrue(Driver.get().getTitle().contains("Calendar"));
    }

    @When("the user uncheck the East Meeting Room")
    public void the_user_uncheck_the_East_Meeting_Room() {

       if(servicePage.eastMeetingRoom.isSelected()){
           servicePage.eastMeetingRoom.click();
       }
    }

    @Then("East Meeting Room should be unchecked")
    public void should_be_unchecked() {
        Assert.assertFalse(servicePage.eastMeetingRoom.isSelected());
    }

    @When("creates new idea using following information")
    public void creates_new_idea_using_following_information(Map<String,String> dataTable) {

        servicePage.title.sendKeys(dataTable.get("Title"));

        WebElement iframe = Driver.get().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.get().switchTo().frame(iframe);
        servicePage.ideaDescription.sendKeys(dataTable.get("Idea description"));
        Driver.get().switchTo().defaultContent();

        servicePage.tags.sendKeys(dataTable.get("Tags"));

        Select select =new Select(servicePage.category);
        select.selectByVisibleText(dataTable.get("Category"));

        servicePage.suggestButton.click();
    }

    @Then("the idea should be displayed on page having same content with provided info")
    public void the_idea_should_be_displayed_on_page_having_same_content_with_provided_info(Map<String,String> dataTable) {

        Assert.assertEquals(servicePage.postBlogText.getText(), dataTable.get("Idea description"));
    }

    @When("the user enters {string}, {string}, {string}, {string}")
    public void the_user_enters(String title, String description, String tags, String category) {

        servicePage.title.sendKeys(title);

        WebElement iframe = Driver.get().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.get().switchTo().frame(iframe);

        servicePage.ideaDescription.sendKeys(description);
        Driver.get().switchTo().defaultContent();

        servicePage.tags.sendKeys(tags);
        servicePage.selectOption(category);
        servicePage.suggestButton.click();
    }

    @Then("the {string} should be displayed")
    public void the_should_be_displayed(String message) {

        if(message.equals("The message title is not specified")){
            Assert.assertEquals(message, servicePage.warningMessage.getText());
        }else if(message.equals("The message text is empty.")){
            Assert.assertEquals(message, servicePage.warningMessage.getText());
        }
    }

    @When("the user Like {string} idea by clicking on plus icon")
    public void the_user_Like_idea_by_clicking_on_plus_icon(String str) {

        servicePage.search.sendKeys(str);

        if(servicePage.problemsPlusIcon.getAttribute("title").equals("Like")){
            Driver.get().navigate().refresh();
            BrowserUtils.clickWithJS(servicePage.problemsPlusIcon);
        }else{
            BrowserUtils.clickWithJS(servicePage.problemsMinusIcon);
            Driver.get().navigate().refresh();
            BrowserUtils.waitForClickablility(servicePage.problemsPlusIcon,20);
            BrowserUtils.clickWithJS(servicePage.problemsPlusIcon);
            BrowserUtils.waitFor(2);
        }
    }

    @When("the user Unlike {string} idea by clicking on minus icon")
    public void theUserUnlikeIdeaByClickingOnMinusIcon(String str) {

        if(servicePage.problemsMinusIcon.getAttribute("title").equals("Unlike")){
            Driver.get().navigate().refresh();
            BrowserUtils.clickWithJS(servicePage.problemsMinusIcon);
        }else{
            BrowserUtils.clickWithJS(servicePage.problemsPlusIcon);
            Driver.get().navigate().refresh();
            BrowserUtils.waitForClickablility(servicePage.problemsMinusIcon,20);
            BrowserUtils.clickWithJS(servicePage.problemsMinusIcon);
            BrowserUtils.waitFor(2);
        }

    }

    @Then("title should be Stop liking this item")
    public void titleShouldBeStopLikingThisItem() {
        Assert.assertEquals("Stop liking this item", servicePage.problemsPlusIcon.getAttribute("title"));
    }


    @And("sorted ideas by {string} listed by the most recent date")
    public void sortedIdeasByListedByTheMostRecentDate(String sortType) {

        if(sortType.equals("date added")) {

            List<String> expectedDates = servicePage.getDates();
            //System.out.println("expectedDates = " + expectedDates.toString());
            Collections.sort(expectedDates);
            Collections.reverse(expectedDates);

            servicePage.dateAddedSort.click();

            List<String> actualDates = servicePage.getDates();
            // System.out.println("actualDates = " + actualDates.toString());

            Assert.assertEquals(expectedDates, actualDates);

        }else if(sortType.equals("rating")){

            List<Double> allExpectedRatings = servicePage.getAllRating();
            Collections.sort(allExpectedRatings);
            Collections.reverse(allExpectedRatings);

            List<Double> allActualRatings = servicePage.getAllSortedRating();

            Assert.assertEquals(allExpectedRatings,allActualRatings);

        }
    }

    @When("the user click on Print")
    public void the_user_click_on_Print() {
        servicePage.print.click();
    }

    @Then("the print page should be displayed")
    public void the_print_page_should_be_displayed() throws AWTException {

        String currentWindowHandle = Driver.get().getWindowHandle();

        Set<String> windowHandles = Driver.get().getWindowHandles();
        for (String handle : windowHandles) {
            if(!handle.equals(currentWindowHandle)){
                Driver.get().switchTo().window(handle);
            }
        }

        Actions actions = new Actions(Driver.get());
        actions.sendKeys(Keys.ENTER).click();

        /*

        Set<String> windowHandles = Driver.get().getWindowHandles();
        if (!windowHandles.isEmpty()) {
            Driver.get().switchTo().window((String) windowHandles.toArray()[windowHandles.size() - 1]);
        }

        Actions actions = new Actions(Driver.get());
        actions.sendKeys(Keys.ENTER).click();

         */

      /*  Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);

       */

    }

    @Then("title should be Stop unliking this item")
    public void titleShouldBeStopUnlikingThisItem() {
        Assert.assertEquals("Stop Unliking this item", servicePage.problemsPlusIcon.getAttribute("title"));
    }

    @When("the user add following info to Lists")
    public void the_user_add_following_info_to_Lists(List<String> dataTable) {

        for (String eachData : dataTable) {
            servicePage.listContent.sendKeys(eachData);
        }
    }


}

