package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import static jdk.internal.org.jline.utils.InfoCmp.Capability.tab;

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

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
    public WebElement pollButton;

    @FindBy (xpath = "//a[@class ='b24-app-block-content-apps']")
    public WebElement downloadMacOs;

    @FindBy(xpath = "//a[@class = 'b24-app-block-content-apps b24-app-block-separate'][1]")
    public WebElement downloadWindows;

    @FindBy (xpath = "//a[@class = 'b24-app-block-content-apps b24-app-block-separate'][2]")
    public WebElement downloadLinux;

    @FindBy(xpath = "//a[@title=\"Company\"]")
    public WebElement companyLink;



    // A left more button to show Applications and Workflows

   public By leftMenuMoreBtn = By.id("left-menu-more-btn");

    // A method to get tabs from the menu on the left. Provide link text as a parameter

    public void getTab(String linkname){
        By tab = By.xpath("//a[@title='"+linkname+"']");
        BrowserUtils.click(tab);
    }
}
