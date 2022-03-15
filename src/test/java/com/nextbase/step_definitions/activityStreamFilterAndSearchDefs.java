package com.nextbase.step_definitions;

import com.nextbase.pages.ActivityStreamPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class activityStreamFilterAndSearchDefs {


    @When("the user search {string} by {string}")
    public void the_user_search_by(String usersName, String By) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

        BrowserUtils.waitForClickablility(activityStreamPage.ASFilterAndSearchButton, 10);

        activityStreamPage.ASFilterAndSearchButton.click();

        activityStreamPage.filterAndSearchTO.click();
        activityStreamPage.filterAndSearchTO.sendKeys(usersName);


        BrowserUtils.waitFor(3);

        List<WebElement> suggestionList = Driver.get().findElements(org.openqa.selenium.By.xpath("//div[@class='bx-finder-box-item-t7-name']"));

        for (WebElement element : suggestionList) {
            if (element.getText().contains(usersName)) {
                BrowserUtils.waitForClickablility(element, 5);
                element.click();
            }
        }

        List<WebElement> list = Driver.get().findElements(org.openqa.selenium.By.xpath("//div [@class='main-ui-item-icon main-ui-square-delete']"));
        if (list.size() > 1) {
            list.get(0).click();
        }

        WebElement searchButton = Driver.get().findElement(org.openqa.selenium.By.xpath("//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']"));
        searchButton.click();

        BrowserUtils.waitFor(3);

    }


    @Then("user should see {string} activities on Activity Stream")
    public void user_should_see_activities_on_Activity_Stream(String usersName) {
        BrowserUtils.waitFor(3);
        WebElement bar = Driver.get().findElement(By.xpath("(//div[@class='main-ui-square-item'])[1]"));
        //Assert.assertTrue(bar.getText().equalsIgnoreCase(usersName));
        String expectedName = "To: " + usersName;
        Assert.assertEquals(expectedName, bar.getText());


        List<WebElement> results = Driver.get().findElements(By.cssSelector(".feed-add-post-destination-new"));

        for (WebElement result : results) {
            System.out.println(result.getText());
        }
        Driver.get().findElement(By.id("user-block")).click();
        Driver.get().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[5]")).click();
        BrowserUtils.waitFor(2);
    }


    @When("the user searches {string} by Author")
    public void the_user_searches_by_Author(String usersName) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

        BrowserUtils.waitForClickablility(activityStreamPage.ASFilterAndSearchButton, 10);

        activityStreamPage.ASFilterAndSearchButton.click();

        activityStreamPage.filterAndSearchAuthor.click();
        activityStreamPage.filterAndSearchAuthor.sendKeys(usersName);


        BrowserUtils.waitFor(3);

        List<WebElement> suggestionList = Driver.get().findElements(org.openqa.selenium.By.xpath("//div[@class='bx-finder-box-item-t7-name']"));

        for (WebElement element : suggestionList) {
            if (element.getText().contains(usersName)) {
                BrowserUtils.waitForClickablility(element, 5);
                element.click();
            }
        }

        List<WebElement> list = Driver.get().findElements(By.xpath("//div [@class='main-ui-item-icon main-ui-square-delete']"));
        if (list.size() > 1) {
            list.get(1).click();
        }


        WebElement searchButton = Driver.get().findElement(org.openqa.selenium.By.xpath("//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']"));
        searchButton.click();

        BrowserUtils.waitFor(3);
    }

    @Then("user should see {string} activities on Activity Stream {string}")
    public void user_should_see_activities_on_Activity_Stream(String usersName, String Author) {
        BrowserUtils.waitFor(1);
        WebElement bar = Driver.get().findElement(By.xpath("(//div[@class='main-ui-square-item'])[1]"));
        //Assert.assertTrue(bar.getText().equalsIgnoreCase(usersName));
        String expectedName = Author + ": " + usersName;
        Assert.assertEquals(expectedName, bar.getText());


        List<WebElement> results = Driver.get().findElements(By.cssSelector(".feed-add-post-destination-new"));

        for (WebElement result : results) {
            System.out.println(result.getText());
        }
    }

    @When("the user clicks on {string} on Activity Stream")
    public void the_user_clicks_on_on_Activity_Stream(String string) {

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        BrowserUtils.waitForClickablility(activityStreamPage.ASFilterAndSearchButton, 10);
        activityStreamPage.ASFilterAndSearchButton.click();
    }

    @Then("the user should be able to see default filters as {string}")
    public void the_user_should_be_able_to_see_default_filters_as(String string) {

        List<WebElement> defaultFilters = Driver.get().findElements(By.xpath("//div [@class = 'main-ui-filter-sidebar-item']"));

        Set<String> actualText = new HashSet<>();


        for (int i = 0; i < defaultFilters.size(); i++) {
            actualText.add(defaultFilters.get(i).getAttribute("innerText").trim());

        }
        System.out.println("actualText = " + actualText);

        Set<String> expectedText = Set.of("Work", "Favorites", "My Activity", "Announcements", "Workflows");
        System.out.println("expectedText = " + expectedText);

        Assert.assertTrue("verify list contains same values", expectedText.containsAll(actualText));


    }


    @When("the user clicks {string} on filter pop-up")
    public void the_user_clicks_on_filter_pop_up(String string) throws InterruptedException {
        if (string.equalsIgnoreCase("Add Field")) {
            new ActivityStreamPage().addFieldButton.click();
        }else if (string.equalsIgnoreCase("Restore to default")) {
            new ActivityStreamPage().restoreFieldLink.click();
        }else if (string.equalsIgnoreCase("Search")){
            Thread.sleep(3000);
            new ActivityStreamPage().searchButton.click();
        }else if (string.equalsIgnoreCase("Save Filter")){
            new ActivityStreamPage().saveFilterButton.click();
        }else if (string.equalsIgnoreCase("Save")) {
            Thread.sleep(3000);
            new ActivityStreamPage().saveButton.click();
        }else if (string.equalsIgnoreCase("Configure filter")){
            new ActivityStreamPage().configureFilterIcon.click();
        }else if (string.equalsIgnoreCase("Reset to default")){
            new ActivityStreamPage().resetFilterLink.click();
        }
    }

    @When("the user selects all option")
    public void the_user_selects_all_option() {
        new ActivityStreamPage().tagField.click();
        new ActivityStreamPage().favoritesField.click();
        new ActivityStreamPage().extranetField.click();

    }

    @Then("the user should see options in search fields")
    public void the_user_should_see_options_in_search_fields() {
        List<WebElement> actualFieldNames = Driver.get().findElements(By.xpath("//span[@class= 'main-ui-control-field-label']"));

        Set<String> actualText = new HashSet<>();


        for (int i = 0; i < actualFieldNames.size(); i++) {
            actualText.add(actualFieldNames.get(i).getAttribute("innerText").trim());

        }
        System.out.println("actualText = " + actualText);

        Set<String> expectedText = Set.of("Date", "Type", "Author", "To", "Favorites", "Tag", "Extranet");
        System.out.println("expectedText = " + expectedText);

        Assert.assertTrue("verify list contains same values", expectedText.containsAll(actualText));


    }


    @Then("the selected options should be deleted")
    public void the_selected_options_should_be_deleted() {

        List<WebElement> actualFieldNames = Driver.get().findElements(By.xpath("//span[@class= 'main-ui-control-field-label']"));

        Set<String> actualText = new HashSet<>();


        for (int i = 0; i < actualFieldNames.size(); i++) {
            actualText.add(actualFieldNames.get(i).getAttribute("innerText").trim());

        }
        System.out.println("actualText = " + actualText);

        Set<String> expectedText = Set.of("Date", "Type", "Author", "To");
        System.out.println("expectedText = " + expectedText);

        Assert.assertTrue("verify list contains same values", expectedText.containsAll(actualText));


    }


    @When("the user selects {string} from {string} field")
    public void the_user_selects_from_field(String string, String string2) throws InterruptedException {
        new ActivityStreamPage().dateField.click();


        List<WebElement> allOptions = Driver.get().findElements(By.xpath("//div[@class='main-ui-select-inner-item-element']/../../*"));
        System.out.println(allOptions.size());



        for (int i = 0; i < allOptions.size(); i++) {
          System.out.println(allOptions.get(i).getText());

            if (allOptions.get(i).getText().equalsIgnoreCase(string)) {

              allOptions.get(i).click();

              if(allOptions.get(i).getText().equalsIgnoreCase("last n days")){
                  new ActivityStreamPage().customNDays.clear();
                  new ActivityStreamPage().customNDays.sendKeys("2");
                  Thread.sleep(5000);
              }else if (allOptions.get(i).getText().equalsIgnoreCase("custom range")){
                  new ActivityStreamPage().customDateFrom.clear();
                  new ActivityStreamPage().customDateFrom.sendKeys("30/10/2020");
                  new ActivityStreamPage().customDateTo.clear();
                  new ActivityStreamPage().customDateTo.sendKeys("30/11/2020");
                  Thread.sleep(5000);
              }
              break;

            }

        }

            Assert.assertEquals("verify selected option", string, new ActivityStreamPage().selectedDateOption.getText());

            Thread.sleep(3000);



    }

        @Then("the user should be able to display {string} based results on Activity Stream page")
        public void the_user_should_be_able_to_display_based_results_on_Activity_Stream_page (String string) throws InterruptedException {

            new ActivityStreamPage().searchButton.click();
            Thread.sleep(2000);

            if(!string.equalsIgnoreCase("Last N days") & !string.equalsIgnoreCase("Custom range")){
                Assert.assertTrue("verify that date results seen",new ActivityStreamPage().activityStreamFilterBox.getAttribute("innerText").contains(string));
            }else if (string.equalsIgnoreCase("Last N days")  ){
                String[] arr1 = string.split(" ");
                Assert.assertTrue("verify that the result seen", new ActivityStreamPage().activityStreamFilterBox.getAttribute("innerText").contains(arr1[0]));
            }else if (string.equalsIgnoreCase("Custom range")){
                Assert.assertTrue("verify the date result", new ActivityStreamPage().activityStreamFilterBox.getAttribute("innerText").contains(new ActivityStreamPage().customDateFrom.getText()));
            }

        }

    @When("the user searches all types from {string} field")
    public void the_user_searches_all_types_from_field(String string) {
        // Write code here that turns the phrase above into concrete actions
       new ActivityStreamPage().typeField.click();

        for (WebElement element : Driver.get().findElements(By.xpath("//div[@class ='popup-multiselect-content']/div"))) {
            element.click();
        }


    }


    @And("the user unselects all option")
    public void theUserUnselectsAllOption() {
        new ActivityStreamPage().tagField.click();
        new ActivityStreamPage().favoritesField.click();
        new ActivityStreamPage().extranetField.click();
    }

    @When("the user enters {string} as filter name")
    public void theUserEntersAsFilterName(String string) {
        new ActivityStreamPage().newFilterName.sendKeys("POSTS");
    }


    @Then("the user should be able to see  {string} in filter names")
    public void the_user_should_be_able_to_see_in_filter_names(String string) {

        List<WebElement> defaultFilters = Driver.get().findElements(By.xpath("//div [@class = 'main-ui-filter-sidebar-item']"));

        Set<String> actualText = new HashSet<>();


        for (int i = 0; i < defaultFilters.size(); i++) {
            actualText.add(defaultFilters.get(i).getAttribute("innerText").trim());
            System.out.println("actualText = " + actualText);
        }
        System.out.println("actualText = " + actualText);

        Set<String> expectedText = Set.of(string);
        System.out.println("expectedText = " + expectedText);

        Assert.assertTrue("verify list contains same values", actualText.containsAll(expectedText));
    }

    @Then("there should be no text on filter and search field")
    public void there_should_be_no_text_on_filter_and_search_field() {
        Assert.assertTrue(new ActivityStreamPage().ASFilterAndSearchButton.getAttribute("innerText").isEmpty());
    }

    @When("the user accepts pop-up on the page")
    public void the_user_accepts_pop_up_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
       new ActivityStreamPage().popupContinueButton.click();
    }


    @And("the user selects the types from {string} field")
    public void theUserSelectsTheTypesFromField(String string) {

        new ActivityStreamPage().typeField.click();

        for (WebElement element : Driver.get().findElements(By.xpath("//div[@class ='popup-multiselect-content']/div"))) {

            if (element.getText().equalsIgnoreCase(string)) {
                element.click();
            }
        }
    }
}







