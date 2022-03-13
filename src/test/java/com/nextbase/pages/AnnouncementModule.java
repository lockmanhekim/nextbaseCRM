package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementModule extends BasePage {

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement more ;

    @FindBy(xpath = "//span[text()='Announcement']")
    public WebElement announcement;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFiles;

    @FindBy(id = "blog-submit-button-save")
    public  WebElement sendButton;

    @FindBy(xpath = "//body[@contenteditable='true']") //iframe!!!
    public  WebElement body;

    public String vimeoURL = "https://vimeo.com/76979871";

}
