package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BasePage{

    @FindBy(xpath= "//td[text()='Contact information']")
    public WebElement contactInformation;

    @FindBy(css = ".user-profile-events-item.user-profile-edit")
    public WebElement editProfileActions;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/div[2]/div/form/table/tbody/tr[6]/td[2]/input")
    public WebElement firstNameBox;

    @FindBy(xpath= "//span[text()='Save']")
    public WebElement saveButton;


}
