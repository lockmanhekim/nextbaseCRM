package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractPage extends BasePage{
    @FindBy(xpath = "//*[@class='bx-ilike-text']")
    public WebElement likeInput;

    @FindBy(xpath ="//*[@class='feed-inform-comments']/a")
    public WebElement commentInput;

    @FindBy(css = "[contenteditable='true']")
    public WebElement commentting;

    @FindBy(xpath ="//*[@class='ui-btn ui-btn-sm ui-btn-primary']")
    public WebElement sendInput;

    @FindBy(xpath ="//*[@class='feed-inform-follow']/a")
    public WebElement unfollowInput;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;

    @FindBy(xpath = "(//*[@class='bx-ilike-left-wrap bx-you-like-button'])[1]")
    public WebElement likeActive;

    @FindBy(xpath = "(//*[@class='feed-com-text-inner-inner'])[1]")
    public WebElement commentActive;

    @FindBy(xpath = "(//*[@class='feed-user-avatar'])[1]")
    public WebElement followUnfollow;

    @FindBy(xpath = "(//*[@class='feed-content-view-cnt'])[1]")
    public WebElement reviewerbutton;

    @FindBy(xpath = "//*[@class='bx-contentview-popup-name-new']")
    public WebElement revieverClick;

    @FindBy(id = "pagetitle")
    public WebElement verifyingBtn;

    @FindBy(xpath ="(//*[@class='feed-post-important-switch'])[1]")
    public WebElement starIcon;

    @FindBy(id = "LIVEFEED_search")
    public WebElement srchButn;

    @FindBy(xpath = "//*[@data-id='favorites']")
    public WebElement favoritesbtn;

    @FindBy(xpath = "//*[@class='feed-add-post-destination-new']")
    public WebElement verification;

    @FindBy(xpath = "(//*[@class='feed-com-text'])[1]")
    public WebElement revieverComment;

    @FindBy(xpath = "(//*[@class='bx-ilike-text'])[4]")
    public WebElement revieverLikeButton;

    @FindBy(xpath = "(//*[@class='bx-ilike-left-wrap bx-you-like-button'])[1]")
    public WebElement likeClicked;

    @FindBy(xpath = "(//*[@class='feed-com-reply feed-com-reply-Y'])[3]")
    public WebElement revieverReplyComment;

    @FindBy(xpath = "(//*[@class='bx-editor-iframe'])[1]")
    public WebElement secondIframe;

    @FindBy(css = "[contenteditable='true']")
    public WebElement commenttingTwo;

    @FindBy(xpath = "(//*[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement letsClickSendBtn;

    @FindBy(xpath = "(//*[@class='feed-com-avatar feed-com-avatar-N'])[3]")
    public WebElement commentSendingVrf;
}
