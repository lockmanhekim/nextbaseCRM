package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementModule extends BasePage {

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement more ;

    @FindBy(xpath = "//span[text()='Announcement']")
    public WebElement announcement;

}
