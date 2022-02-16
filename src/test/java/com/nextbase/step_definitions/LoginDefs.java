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

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("https://qa.nextbasecrm.com/stream/?login=yes",actualUrl);
    }


    @When("the user enters the {string} information")
    public void the_user_enters_the_information(String userType) {
        String username =null;
        String password =null;

        if(userType.equals("HR")){
            username = ConfigurationReader.get("HR_username");
            password = ConfigurationReader.get("HR_password");
        }else if(userType.equals("Helpdesk")){
            username = ConfigurationReader.get("Helpdesk_username");
            password = ConfigurationReader.get("Helpdesk_password");
        }else if(userType.equals("Marketing")){
            username = ConfigurationReader.get("Marketing_username");
            password = ConfigurationReader.get("Marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }


}