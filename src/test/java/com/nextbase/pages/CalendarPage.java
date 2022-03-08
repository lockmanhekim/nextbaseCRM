package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends BasePage{


    @FindBy(xpath = "//*[@class='main-buttons-item-text-title'][1]")
    public WebElement myCalendarTab;

    @FindBy(css = "#top_menu_id_calendar_menu_company_calendar > a")
    public WebElement companyCalendarTab;

    @FindBy(css = "#pagetitle")
    public WebElement pageTitle2;

    @FindBy(xpath = "(//*[@data-role='item-text'])[6]")
    public WebElement Calendar;

    @FindBy(xpath = "//*[@class='ui-btn-main']")
    public WebElement add;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-datetime'])[1]")
    public WebElement dateBox1;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-datetime-menu'])[1]")
    public WebElement clock1;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-datetime'])[2]")
    public WebElement dateBox2;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-datetime-menu'])[2]")
    public WebElement clock2;

    @FindBy( xpath = "//*[@class='calendar-options-timezone-collapse-btn']")
    public WebElement timeZoneIcon;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-select'])[1]")
    public  WebElement timeZoneSelect1;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-select'])[2]")
    public  WebElement timeZoneSelect2;

    @FindBy( xpath = "//*[@placeholder='Location']")
    public WebElement locationIcon;

    //location needed here

    @FindBy( xpath = "//*[@class='feed-add-destination-link']")
    public WebElement addIcon;

    @FindBy( xpath = "//*[@class='feed-add-destination-inp']")
    public WebElement addingZone;

    @FindBy( xpath = "//*[@class='calendar-additional-alt-more']")
    public WebElement moreIcon;

    @FindBy( xpath = "//*[@style='min-height: 104px;']")
    public WebElement description;

    @FindBy (xpath = "//*[@class='bx-editor-iframe']")
    public  WebElement iframe;

    @FindBy( css = "[id*='save_cmd']")
    public WebElement save;
}
