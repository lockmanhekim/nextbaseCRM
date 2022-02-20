package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrivePage extends BasePage {

    @FindBy(partialLinkText = "Drive")
    public WebElement drive;


    @FindBy(partialLinkText = "Company Drive")
    public WebElement companyDrive;
}