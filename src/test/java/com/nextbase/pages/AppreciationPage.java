package com.nextbase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AppreciationPage extends BasePage {


    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreInput;

    @FindBy(xpath = "//*[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-grat feed-add-post-form-grat-more ']")
    public WebElement appreciationInput;

    @FindBy(xpath = "//*[@class='feed-add-post-form-but feed-add-file']")
    public WebElement uploadInput;


    @FindBy(xpath = "//td//div[@class='files-storage-block']")
    public WebElement verifyUploadFile;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendInput;

    @FindBy(xpath = "//*[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud']")
    public WebElement externalButton;

    @FindBy(xpath = "//*[@id=\"bx-file-dialog-tab-DiskFileDialog\"]/div/div[1]/a/span[1]")
    public WebElement allDocumentsButton;

    @FindBy(xpath = "//*[@class='bx-file-dialog-tab-item']")
    public WebElement sixsBoxButton;


    @FindBy(xpath = "//*[@class='wd-fa-add-file-light-title-text diskuf-selector-link']")
    public WebElement Bitrex24File;

    @FindBy(xpath = "//*[@class='bx-file-dialog-tab-item-link']")
    public WebElement salesAndMarketingButoon;

    @FindBy(xpath = "//*[@class='bx-file-dialog-row  bx-file-dialog-row-normal'][2]")
    public WebElement quotesButtoon;

    @FindBy(xpath = "//*[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file']")
    public WebElement docxFile;

    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-accept']")
    public WebElement Bitrex24SelectDocument;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement chooseButton;

    @FindBy(xpath = "//*[@class='bx-finder-box-item-t7-name']")
    public WebElement employeesButton;

    @FindBy(xpath = "//*[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement sendButton;


    @FindBy(xpath = "//*[@class='popup-window-close-icon']")
    public WebElement exitButton;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement chooseButton2;

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBar;

    @FindBy(id = "undefined")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class='bxhtmled-surrogate-dd']")
    public WebElement verifyVideoSave;



    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement videoInsertButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceBar;



    @FindBy(xpath = "//*[@class='bxhtmled-quote']")
    public WebElement commaButtoninside;


    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement commaButton;


    @FindBy(css= ".bx-editor-iframe")
    public WebElement iframe;


    @FindBy(xpath = "//*[@class='feed-add-post-form-but feed-add-mention']")
    public WebElement addmentionButton;

    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement addMention;

    @FindBy(xpath = "//*[@class='bx-finder-company-department-employee-name']")
    public WebElement selectContacts;

    @FindBy(id = "destDepartmentTab_mention91713215")
    public WebElement employeesAndDepartmentsButton;


    @FindBy(id = "lhe_button_editor_blogPostForm")
    public WebElement visualEditorButton;

    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement textBar;



    @FindBy(xpath = "//*[@title='Topic']")
    public WebElement topicButton;

    @FindBy(xpath = "//*[@class='feed-add-post-title']")
    public WebElement topic;

    @FindBy(xpath = "//*[@class='feed-add-post-form-but-cnt feed-add-videomessage']")
    public WebElement recordVideoButton;

    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-blue']")
    public WebElement allowButton;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    public WebElement verifyVideoRecordig;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement addTagButton;

    @FindBy(id = "TAGS_blogPostForm67abSn")
    public WebElement testSend;


    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement addButton;


    @FindBy(id = "feed-add-post-grat-type-selected")
    public WebElement illustrationButton;




}
