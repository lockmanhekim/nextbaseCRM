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
                element.click();
            }
        }

        WebElement searchButton = Driver.get().findElement(org.openqa.selenium.By.xpath("//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']"));
        searchButton.click();

        BrowserUtils.waitFor(3);

    }




    @Then("user should see {string} activities on Activity Stream")
    public void user_should_see_activities_on_Activity_Stream(String usersName) {
        BrowserUtils.waitFor(3);
        WebElement bar = Driver.get().findElement(By.xpath("//div[@class='main-ui-square-item']"));
        //Assert.assertTrue(bar.getText().equalsIgnoreCase(usersName));
        String expectedName = "To: "+ usersName;
        Assert.assertEquals(expectedName,bar.getText());


        List<WebElement> results = Driver.get().findElements(By.cssSelector(".feed-add-post-destination-new"));

        for (WebElement result : results) {
            System.out.println(result.getText());
        }

    }


}
