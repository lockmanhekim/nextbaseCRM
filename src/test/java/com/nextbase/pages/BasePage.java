package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@title=\"Employees\"]")
    public WebElement employeeLink;
  
    @FindBy(css= "#user-name")
    public WebElement userNameDropdown;

    @FindBy(linkText = "Edit Profile Settings")
    public WebElement editProfileSettingsMenu;

    @FindBy(linkText = "My Profile")
    public WebElement myProfileMenu;


    @FindBy(xpath = "//*[@title=\"Calendar\"]")
    public WebElement calendarLink;

    @FindBy(xpath = "//a[@title=\"Company\"]")
    public WebElement companyLink;



}
