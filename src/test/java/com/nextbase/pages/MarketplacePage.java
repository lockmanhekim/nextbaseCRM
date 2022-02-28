package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class MarketplacePage extends BasePage{

    @FindBy(xpath= "//a[contains(text(),'Applications')]")
    public WebElement applicationsLink;

    @FindBy(id = "left-menu-more-btn")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id='mp_category_new_free']")
    public WebElement newApplicationsList;

    @FindBy(xpath= "//*[@id='mp_category_new_free']/*[1]//div[contains(text(),'View')]")
    public WebElement firstApplicationViewButton;

    @FindBy(xpath= "//a[.='Install']")
    public WebElement applicationInstallationLink;

    @FindBy(css = ".side-panel-iframe")
    public WebElement iframeForApplication;

    @FindBy(css = ".popup-window-button-accept")
    public WebElement popupInstallationSendButton;

    @FindBy(id = "popup-window-content-mp-detail-block")
    public WebElement popupApproveOfSentInstallationMessage;

    @FindBy(xpath = "//div[contains(text(),'Description')]")
    public WebElement descriptionApplicationTab;

    @FindBy(xpath = "//div[contains(text(),'Versions')]")
    public WebElement versionsApplicationTab;

    @FindBy(xpath = "//div[contains(text(),'Support')]")
    public WebElement supportApplicationTab;

    @FindBy(xpath = "//div[.='Install']")
    public WebElement installApplicationTab;

    @FindBy(xpath = "//*[@id='mp-detail-content-wrapper-desc']")
    public WebElement descriptionInfoField;

    @FindBy(xpath = "//*[@id='mp-detail-content-wrapper-versions']") ///following-sibling::*[1]
    public WebElement versionsInfoField;

    @FindBy(xpath = "//*[@id='mp-detail-content-wrapper-support']")
    public WebElement supportInfoField;

    @FindBy(xpath = "//*[@id='mp-detail-content-wrapper-install']")
    public WebElement installInfoField;

    @FindBys(@FindBy(xpath = "//*[@id='mp_category_new_free']/div"))
    public List<WebElement> freeMarketplaceApplications;

    public void clickOnApplicationTab(WebElement tab) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", tab);
        Thread.sleep(1000);
    }

    public void switchToApplicationFrame(){
        Driver.get().switchTo().frame(new MarketplacePage().iframeForApplication);
    }


}
