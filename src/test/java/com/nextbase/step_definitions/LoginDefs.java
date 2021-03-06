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

    @When("the user enters the {string} {string} information")
    public void the_user_enters_the_information(String userType, String verify) {

        String username =null;
        String password =null;

        if(userType.equals("HR")){
            if(verify.equals("username")){
                username = "ashbf";
                password = ConfigurationReader.get("HR_password");
            }else if(verify.equals("password")){
                username = ConfigurationReader.get("HR_username");
                password = "askdga";
            }else if(verify.equals("empty")){
                username = " ";
                password =  " ";
            }
        }else if(userType.equals("Helpdesk")){
            if(verify.equals("username")){
                username = "ashbf";
                password = ConfigurationReader.get("Helpdesk_password");
            }else if(verify.equals("password")){
                username = ConfigurationReader.get("Helpdesk_username");
                password = "askdga";
            }else if(verify.equals("empty")){
                username = " ";
                password =  " ";
            }
        }else if(userType.equals("Marketing")){
            if(verify.equals("username")){
                username = "ashbf";
                password = ConfigurationReader.get("Marketing_password");
            }else if(verify.equals("password")){
                username = ConfigurationReader.get("Marketing_username");
                password = "askdga";
            }else if(verify.equals("empty")){
                username = " ";
                password =  " ";
            }
        }

        new LoginPage().login(username,password);
    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        LoginPage loginn = new LoginPage();

        BrowserUtils.waitFor(1);
        String actualMessage = loginn.errorMessage();
        Assert.assertEquals("Incorrect login or password",actualMessage);

    }

    @When("the user enters invalid credentials {int} times")
    public void the_user_enters_invalid_credentials_times(Integer trys) {

        String username = "asdadfg";
        String password ="133454";

        for (int i = 0; i < trys; i++) {
            BrowserUtils.waitFor(1);
            new LoginPage().login(username,password);
        }
    }

    @Then("the Error message should be {string}")
    public void the_Error_message_should_be(String string) {
        LoginPage loginn = new LoginPage();

        BrowserUtils.waitFor(1);
        String actualMessage = loginn.errorMessage();
        Assert.assertEquals("Please try again after one minute",actualMessage);
    }

    @When("the user enters the HR information")
    public void the_user_enters_the_HR_information() {

        String username = ConfigurationReader.get("HR_username");
        String password = ConfigurationReader.get("HR_password");

        new LoginPage().login(username,password);
    }

    @When("the user enters the helpdesk information")
    public void the_user_enters_the_helpdesk_information() {

        String username = ConfigurationReader.get("Helpdesk_username");
        String password = ConfigurationReader.get("Helpdesk_password");

        new LoginPage().login(username,password);
    }

    @When("the user enters the marketing information")
    public void the_user_enters_the_marketing_information() {

        String username = ConfigurationReader.get("Marketing_username");
        String password = ConfigurationReader.get("Marketing_password");

        new LoginPage().login(username,password);
    }



}