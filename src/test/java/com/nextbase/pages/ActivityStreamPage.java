package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage {
    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;
    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;
    @FindBy(css = ".bx-editor-iframe")
    public WebElement iframe_1_onActivityStreamPage;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendMessageButtonOnActivityStream;
    @FindBy(xpath = "(//div[@class = 'feed-post-text-block-inner-inner'])[1]")
    public WebElement firstPostOnActivityStream;
    public void sendMessage(String message){
        WebElement messageInput = Driver.get().switchTo().frame(iframe_1_onActivityStreamPage).findElement(By.xpath("//body[@style = 'min-height: 184px;']"));
        messageInput.sendKeys(message);
        Driver.get().switchTo().defaultContent();
        BrowserUtils.clickWithTimeOut(sendMessageButtonOnActivityStream, 5);
    }

}
