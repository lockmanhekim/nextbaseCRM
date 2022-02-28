package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(name ="USER_LOGIN")
    public WebElement userName;

    @FindBy(name ="USER_PASSWORD")
    public WebElement password;

    @FindBy(css = "input[class='login-btn']")
    public WebElement submit;

    @FindBy(className = "errortext")
    public WebElement ver;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }

    public String errorMessage(){

        return ver.getText();
    }

}