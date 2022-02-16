package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
    }

    @When("the user enters the HR information")
    public void the_user_enters_the_HR_information() {
        String username = ConfigurationReader.get("HR_username");
        String password = ConfigurationReader.get("HR_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("https://qa.nextbasecrm.com/stream/?login=yes",actualUrl);
    }

    @When("the user enters the helpdesk information")
    public void the_user_enters_the_helpdesk_information() {
        String username = ConfigurationReader.get("Helpdesk_username");
        String password = ConfigurationReader.get("Helpdesk_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @When("the user enters the marketing information")
    public void the_user_enters_the_marketing_information() {
        String username = ConfigurationReader.get("Marketing_username");
        String password = ConfigurationReader.get("Marketing_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

}