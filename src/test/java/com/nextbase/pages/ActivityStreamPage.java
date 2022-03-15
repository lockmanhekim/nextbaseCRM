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


    @FindBy(xpath = "//div [@class = 'main-ui-filter-sidebar-item']")
    public WebElement filterAndSearchDefaultFilters;

    @FindBy (xpath = "//span[@class = 'main-ui-filter-field-add-item']")
    public WebElement addFieldButton;

    @FindBy (xpath = "//span[@class = 'main-ui-filter-field-restore-items']")
    public WebElement restoreFieldLink;

    @FindBy (xpath = "//div[@data-id= 'field_FAVORITES_USER_ID']")
    public WebElement favoritesField;

    @FindBy (xpath = "//div[@data-id= 'field_TAG']")
    public WebElement tagField;

    @FindBy (xpath = "//div[@data-id= 'field_EXTRANET']")
    public WebElement extranetField;

    @FindBy(xpath = "//span[@class= 'main-ui-control-field-label']")
    public WebElement fieldNames;

    @FindBy(xpath = "//div[@data-name = 'DATE_CREATE_datesel']")
    public WebElement dateField;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-item-element']/../../*[2]")
    public WebElement yesterday;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement customNDays;


    @FindBy (xpath = "//input[@name='DATE_CREATE_to']")
    public WebElement customDateTo;

    @FindBy (xpath = "//input[@name='DATE_CREATE_from']")
    public WebElement customDateFrom;


    @FindBy (xpath = "//span[@class = 'main-ui-select-name']")
    public WebElement selectedDateOption;

    @FindBy(xpath = "//div[@class = 'feed-time']")
    public WebElement feedTime;

    @FindBy(xpath ="//div[@class ='main-ui-filter-field-button-inner']/button")
    public WebElement searchButton;

    @FindBy (xpath = "//div[@data-name = 'EVENT_ID']/div")
    public WebElement typeField;

    @FindBy (xpath = "//span[@class = 'main-ui-filter-add-item']")
    public WebElement saveFilterButton;

    @FindBy(xpath = "//span[@class = 'main-ui-filter-field-button-item']")
    public WebElement resetFilterLink;

    @FindBy (xpath = "//span[@class='main-ui-filter-add-edit']")
    public WebElement configureFilterIcon;

    @FindBy(xpath = "//span[contains(@class, 'filter-save')]")
    public WebElement saveButton;

    @FindBy (xpath = "//input [@class= 'main-ui-filter-sidebar-edit-control']")
    public WebElement newFilterName;

    @FindBy (xpath = "//div[@class='main-ui-filter-search-square main-ui-square']")
    public WebElement activityStreamFilterBox;

    @FindBy (xpath = "//span[@class='popup-window-button']")
    public WebElement popupContinueButton;






    public void selectDateOptions(String dateOption){
        WebElement selectedOption = Driver.get().findElement(By.xpath("//span[@class = 'main-ui-select-name']"));
    }



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
