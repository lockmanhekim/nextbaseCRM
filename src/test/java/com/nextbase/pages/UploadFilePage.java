package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UploadFilePage extends BasePage{

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreInput;

    @FindBy(xpath = "//*[@class='menu-popup-item-text']")
    public WebElement fileInput;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendFile;

    @FindBy(xpath = "//*[@class='feed-com-file-size']")
    public WebElement vrfyTht;

    @FindBy(xpath = "//*[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud']")
    public WebElement DownloadExternal;

    @FindBy(xpath = "//*[@class='wd-fa-add-file-light-title-text diskuf-selector-link']")
    public WebElement bitrix24;

    @FindBy(xpath = "//*[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file']")
    public WebElement fileupload;

    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-accept']")
    public WebElement selectDoc;

    @FindBy(xpath = "//*[@title='My Drive']")
    public WebElement myDrive;

    @FindBy(xpath = "//*[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-folder']")
    public WebElement uploadedFiles;

    @FindBy(xpath = "//*[@title='Name: test (10).txt']")
    public WebElement fileclick;

    @FindBy(xpath = "//*[@title='Name: test (11).txt']")
    public WebElement fileclick2;

    @FindBy(xpath = "//*[@title='Name: test (12).txt']")
    public WebElement fileclick3;

    @FindBy(xpath = "//*[@class='feed-com-file-size']")
    public WebElement verifyThat;



}
