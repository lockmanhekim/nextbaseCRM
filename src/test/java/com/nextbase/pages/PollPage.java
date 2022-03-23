package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage{

    @FindBy(css= "a#bx-destination-tag.feed-add-destination-link")
    public WebElement AddMoreButton;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_')]")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[2]/div[1]/div[1]")
    public WebElement hr22UserButton;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[4]/div[1]/div[1]")
    public WebElement hr23UserButton;

    @FindBy(css= "span.bxhtmled-top-bar-btn.bxhtmled-button-link")
    public WebElement linkIcon;

    @FindBy(css= "input#linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextBox;

    @FindBy(css= "input#linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURLBox;

    @FindBy(css= "input#undefined.adm-btn-save")
    public WebElement saveButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeBox;

    @FindBy(xpath= "//div[@id='log_internal_container']//div[3]/div/div/a")
    public WebElement linkEbay;

    @FindBy(css = "span#bx-b-mention-blogPostForm.feed-add-post-form-but.feed-add-mention")
    public WebElement addMentionIcon;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[1]/div[1]/div[1]")
    public WebElement UserButton;

    @FindBy(css = "input#question_0.vote-block-title.adda")
    public WebElement questionBox;

    @FindBy(css = "input#answer_0__0_.vote-block-inp.adda")
    public WebElement answer1Box;

    @FindBy(css = "input#answer_0__1_.vote-block-inp.adda")
    public WebElement answer2Box;

    @FindBy(css = "a.vote-new-question-link.addq")
    public WebElement addQuestionLink;

    @FindBy(xpath = "//*[@id=\"question_1\"]")
    public WebElement question2Box;

    @FindBy(xpath = "//*[@id=\"answer_1__0_\"]")
    public WebElement answer2_1Box;

    @FindBy(xpath = "//*[@id=\"answer_1__1_\"]")
    public WebElement answer2_2Box;

    @FindBy(css = "label[for='answer_0__0_']")
    public WebElement answer1Delete;

    @FindBy(css = "label[for='answer_0__1_']")
    public WebElement answer2Delete;

    @FindBy(css = "label[for='question_0']")
    public WebElement question1Delete;

    @FindBy(css = "input#multi_0.vote-checkbox")
    public WebElement allowMultipleChoice;

    @FindBy(xpath = "//div[@id=\"log_internal_container\"]//table//tbody//tr//label//input")
    public WebElement goodCheckBox;
    @FindBy(xpath = "//div[@id=\"log_internal_container\"]//table//tbody//tr[2]//label//input")
    public WebElement notBadCheckBox;

    @FindBy(css = "body[contenteditable='true']")
    public WebElement link;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement iframeBox1;

    @FindBy(tagName = "iframe")
    public WebElement iframe;

    @FindBy(xpath = " //div[@id=\"log_internal_container\"]//div[3]//div//div")
    public WebElement firstPoll;

    @FindBy(xpath = "//div[@id=\"log_internal_container\"]//div//div//div/div[3]")
    public WebElement addMentionUser;


}
