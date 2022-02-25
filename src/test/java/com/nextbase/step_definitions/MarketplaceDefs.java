package com.nextbase.step_definitions;

import com.nextbase.pages.MarketplacePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MarketplaceDefs {
    @When("the user clicks on more button from menu")
    public void theUserClicksOnMoreLinkFromMenu() {
        new MarketplacePage().moreButton.click();
    }

    @And("the user clicks on application link from menu")
    public void theUserClicksOnApplicationLinkFromMenu() throws InterruptedException {
        WebElement button = Driver.get().findElement(By.xpath("//a[contains(text(),'Applications')]"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", button);
        Thread.sleep(2000);
    }

    @Then("the user should see applications in marketplace")
    public void theUserShouldSeeApplicationsInMarketplace() {
        List<WebElement> applications = new MarketplacePage().freeMarketplaceApplications;
        Assert.assertTrue(applications.stream().count() > 0);
    }

    @When("the user clicks on the item on the Marketplace page")
    public void theUserClickOnItemOnTheMarketplacePage() throws InterruptedException {
        new MarketplacePage().firstApplicationViewButton.click();
        Thread.sleep(2000);
    }

    @And("the user clicks on an installation button")
    public void theUserClickOnInstallationButton() throws InterruptedException {
        Driver.get().switchTo().frame(new MarketplacePage().iframeForApplication);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", new MarketplacePage().applicationInstallationLink);
        Thread.sleep(2000);
    }

    @Then("the request to install application to the administrators should be sent")
    public void theRequestToInstallApplicationToTheAdministratorsShouldBeSent() throws InterruptedException {
        new MarketplacePage().popupInstallationSendButton.click();
        Thread.sleep(1000);
        String expectedText = "Your request to install the app has been sent to\n" +
                "your Bitrix24's administrators. Thank you!";
        String sentMessageText = new MarketplacePage().popupApproveOfSentInstallationMessage.getText();
        Assert.assertEquals(expectedText, sentMessageText);
    }

    @And("the user clicks on Description tab in the application")
    public void theUserClicksOnDescriptionTabInTheApplication() throws InterruptedException {
        new MarketplacePage().clickOnApplicationTab(new MarketplacePage().descriptionApplicationTab);
    }

    @Then("the user should be able to see description information")
    public void theUserShouldBeAbleToSeeDescriptionInformation() {
        String infoText = new MarketplacePage().descriptionInfoField.getText();
        Assert.assertFalse(infoText.trim().isEmpty());
    }

    @When("the user clicks on Versions tab in the application")
    public void theUserClicksOnVersionsTabInTheApplication() throws InterruptedException {
        new MarketplacePage().clickOnApplicationTab(new MarketplacePage().versionsApplicationTab);
    }

    @When("the user clicks on Support tab in the application")
    public void theUserClicksOnSupportTabInTheApplication() throws InterruptedException {
        new MarketplacePage().clickOnApplicationTab(new MarketplacePage().supportApplicationTab);
    }

    @When("the user clicks on Install tab in the application")
    public void theUserClicksOnInstallTabInTheApplication() throws InterruptedException {
        new MarketplacePage().clickOnApplicationTab(new MarketplacePage().installApplicationTab);
    }

    @Then("the user should be able to see versions information")
    public void theUserShouldBeAbleToSeeVersionsInformation() {
        String infoText = new MarketplacePage().versionsInfoField.getText();
        Assert.assertFalse(infoText.trim().isEmpty());
    }

    @Then("the user should be able to see support information")
    public void theUserShouldBeAbleToSeeSupportInformation() {
        String infoText = new MarketplacePage().supportInfoField.getText();
        Assert.assertFalse(infoText.trim().isEmpty());
    }

    @Then("the user should be able to see install information")
    public void theUserShouldBeAbleToSeeInstallInformation() {
        String infoText = new MarketplacePage().installInfoField.getText();
        Assert.assertFalse(infoText.trim().isEmpty());
    }

    @And("the browser switch to Application")
    public void theBrowserSwitchToApplication() {
        new MarketplacePage().switchToApplicationFrame();
    }
}
