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

    @FindBy( xpath = "//input[@name='importance']")
    public WebElement importantIcon;

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

    @FindBy( xpath = "(//*[@class='menu-popup-item-text'])[1]")
    public WebElement locationWanted;

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

    @FindBy(xpath = "(//*[@class='calendar-timeline-stream-content-event-name-link'])[1]")
    public WebElement searchedEvent;

    @FindBy(css = "[placeholder*='Filter and search']")
    public WebElement filterAndSearchBox;

    @FindBy(xpath = "//div[@class='calendar-info-panel-title']//input")
    public WebElement eventName;

    @FindBy(xpath = "(//*[@class='main-ui-filter-sidebar-item-text'])[3]")
    public WebElement I_Am_Organizer;

    @FindBy(xpath = "(//*[@class='calendar-right-block-event-info-btn'])[2]")
    public WebElement editIcon;

    @FindBy( xpath = "//*[@class='calendar-field-colorpicker-color-item-more-link']")
    public WebElement otherColorIcon;

    @FindBy(xpath = "//*[@class='main-color-picker-custom-action']")
    public WebElement customColorIcon;

    @FindBy(xpath = "//*[@class='main-color-picker-custom-input']")
    public WebElement colorCode;

    @FindBy(xpath = "//*[@class='main-color-picker-custom-button']")
    public WebElement colorCheck;

    @FindBy(xpath = "//*[@data-color='#0000ff']")
    public WebElement navyColorIcon;

    @FindBy(xpath = "(//*[@class='calendar-timeline-stream-content-event-color'])[1]")
    public WebElement searchedColorIcon;

    @FindBy(xpath = "//*[@name='private_event']")
    public WebElement privateIcon;

    @FindBy(xpath = "(//*[@class='calendar-slider-detail-option-value'])[3]")
    public WebElement privateText;

    @FindBy(xpath = "(//*[@class='calendar-right-block-event-info-btn'])[1]")
    public WebElement openIcon;

    @FindBy(css = "[name*='accessibility']")
    public WebElement accesBox;

    @FindBy(xpath = "(//*[@class='calendar-slider-detail-option-value'])[1]")
    public WebElement availability;

}
