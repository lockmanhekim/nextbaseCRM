package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage {
    public By uploadFilesAndImagesBox = By.xpath("//input[@name = 'bxu_files[]']");
    public By sendUploadedFile = By.id("blog-submit-button-save");
    public By firstPostWithFileOnActivityStream = By.xpath("(//div[@class = 'feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short'])[1]//a[@target = '_blank']");
    public By CurrentPostsOnActivityStream = By.xpath("//div[@class = 'feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short']");
    public By nameOnFirstPost = By.xpath("(//div[starts-with(@id, 'blg-post-img-')])[1]//a[@class = 'feed-post-user-name']");
    public By firstPostOnActivityStream = By.xpath("(//div[starts-with(@id, 'blg-post-img-')])[1]");
    public By thumbsUpInMessageOnActivityStream = By.xpath("(//div[starts-with(@id, 'blg-post-img-')])[1]//div[@class = 'feed-grat-img feed-grat-img-thumbsup']");
    public By addRecipientsInputBoxAppreciation = By.id("feed-add-post-grat-input");

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;
    @FindBy(xpath = "(//iframe[@class = 'bx-editor-iframe'])[1]")
    public WebElement iframe_1_onActivityStreamPage;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendMessageButtonOnActivityStream;
    @FindBy(xpath = "(//div[@class = 'feed-post-text-block-inner-inner'])[1]")
    public WebElement firstPostOnActivityStreamText;


    @FindBy (id = "LIVEFEED_search")
    public WebElement ASFilterAndSearchButton ;

    @FindBy (xpath = "//input[@name='TO_label']")
    public WebElement filterAndSearchTO;

    @FindBy (xpath = "//input[@name='CREATED_BY_ID_label']")
    public WebElement filterAndSearchAuthor;









    public void sendMessage(String message){
        WebElement messageInput = Driver.get().switchTo().frame(iframe_1_onActivityStreamPage).findElement(By.xpath("//html//body"));
        messageInput.sendKeys(message);
        Driver.get().switchTo().defaultContent();
        BrowserUtils.clickWithTimeOut(sendMessageButtonOnActivityStream, 5);
    }
    public By linkLocator(String text){
        By locator = By.linkText(text);
        return locator;
    }
    public void addEmployee(String name){
        By locator = By.xpath("//div[@class = 'bx-finder-company-department-employee-name'][contains(text(),'" + name + "')]");
        BrowserUtils.getElement(locator).click();
    }
    public void getMoreMenu(String name){
        By locator = By.xpath("//span[@class = 'menu-popup-item-text'][contains(text(),'" + name+ "')]");
        BrowserUtils.click(locator);
    }
    public void getTab(String tab){
        By locator = By.xpath("//div[@id = 'feed-add-post-form-tab']//span[text()= '"+ tab+ "']");
        BrowserUtils.click(locator);
    }
    public void sendMessage(String message, String recipient){
        Driver.get().switchTo().frame(iframe_1_onActivityStreamPage);
        BrowserUtils.getElement(By.xpath("//html//body")).sendKeys(message);
        Driver.get().switchTo().defaultContent();
        BrowserUtils.click(linkLocator("Add employees"));
        addEmployee(recipient);
        BrowserUtils.click(sendMessageButtonOnActivityStream);
    }
}
