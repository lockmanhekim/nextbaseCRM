package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.By;
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


    // A left more button to show Applications and Workflows

    By leftMenuMoreBtn = By.id("left-menu-more-btn");

    // A method to get tabs from the menu on the left. Provide link text as a parameter

    public void getTab(String linkname){
        By tab = By.linkText(linkname);
        BrowserUtils.click(tab);
    }
}
