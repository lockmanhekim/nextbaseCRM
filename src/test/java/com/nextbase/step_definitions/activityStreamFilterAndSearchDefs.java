package com.nextbase.step_definitions;

import com.nextbase.pages.ActivityStreamPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class activityStreamFilterAndSearchDefs {


    @When("the user search {string} by {string}")
    public void the_user_search_by(String usersName, String By) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

        BrowserUtils.waitForClickablility(activityStreamPage.ASFilterAndSearchButton,10);

        activityStreamPage.ASFilterAndSearchButton.click();

        activityStreamPage.filterAndSearchTO.click();
        activityStreamPage.filterAndSearchTO.sendKeys(usersName);



        BrowserUtils.waitFor(3);

        List<WebElement> suggestionList = Driver.get().findElements(org.openqa.selenium.By.xpath("//div[@class='bx-finder-box-item-t7-name']"));

        for (WebElement element : suggestionList) {
            if (element.getText().contains(usersName)) {
                BrowserUtils.waitForClickablility(element,5);
                element.click();
            }
        }

        List<WebElement> list = Driver.get().findElements(org.openqa.selenium.By.xpath("//div [@class='main-ui-item-icon main-ui-square-delete']"));
        if(list.size()>1) {
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
        String expectedName = "To: "+ usersName;
        Assert.assertEquals(expectedName,bar.getText());


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

        BrowserUtils.waitForClickablility(activityStreamPage.ASFilterAndSearchButton,10);

        activityStreamPage.ASFilterAndSearchButton.click();

        activityStreamPage.filterAndSearchAuthor.click();
        activityStreamPage.filterAndSearchAuthor.sendKeys(usersName);


        BrowserUtils.waitFor(3);

        List<WebElement> suggestionList = Driver.get().findElements(org.openqa.selenium.By.xpath("//div[@class='bx-finder-box-item-t7-name']"));

        for (WebElement element : suggestionList) {
            if (element.getText().contains(usersName)) {
                BrowserUtils.waitForClickablility(element,5);
                element.click();
            }
        }

        List<WebElement> list = Driver.get().findElements(By.xpath("//div [@class='main-ui-item-icon main-ui-square-delete']"));
        if(list.size()>1) {
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
        Assert.assertEquals(expectedName,bar.getText());


        List<WebElement> results = Driver.get().findElements(By.cssSelector(".feed-add-post-destination-new"));

        for (WebElement result : results) {
            System.out.println(result.getText());
        }
    }





}
