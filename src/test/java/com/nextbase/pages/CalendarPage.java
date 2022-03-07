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
    public WebElement dateBox;

    @FindBy( xpath = "(//*[@class='bx-calendar-top-month'])[2]")
    public WebElement monthIcon;

    @FindAll({
            @FindBy ( xpath = "//*[@class='bx-calendar-month']"),
            @FindBy ( xpath = "//*[@class='bx-calendar-month bx-calendar-month-active']")
    })
    public List<WebElement> months;

    @FindBy( xpath = "((//*[@class='bx-calendar-range'])[9]//a)[5]")
    public WebElement day25;

    @FindBy( xpath = "((//*[@class='bx-calendar-range'])[10]//a)[3]")
    public WebElement day30;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-datetime'])[2]")
    public WebElement dateBox2;

    @FindBy( xpath = "(//*[@class='bx-calendar-top-month'])[2]")
    public WebElement monthIcon2;

    @FindAll({
            @FindBy( xpath = "//*[@class='bx-calendar-month']"),
            @FindBy( xpath = "//*[@class='bx-calendar-month bx-calendar-month-active']")
    })
    public List<WebElement> months2;

    @FindBy( xpath = "//*[@class='calendar-options-timezone-collapse-btn']")
    public WebElement timeZoneIcon;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-select'])[1]")
    public  WebElement timeZoneSelect1;

    @FindBy( xpath = "(//*[@class='calendar-field calendar-field-select'])[2]")
    public  WebElement timeZoneSelect2;

    @FindBy( xpath = "//*[@placeholder='Location']")
    public WebElement locationIcon;

}
