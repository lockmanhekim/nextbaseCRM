package com.nextbase.pages.workflows;

import com.nextbase.pages.BasePage;
import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class WorkflowsInActivityStreamPage extends BasePage {

    // Click on module
    public void getModule(String linkname){
        By link = By.linkText(linkname);
        BrowserUtils.click(link);
    }


    // Add button
   public By addButton = By.id("lists-title-action-add");

    //These fields are common for all other pages that extend the WorkflowsInActivityStreamPage

   public By title = By.name("NAME");

    public By saveBtn = By.name("save");

    //Reason for leave in Leave Request, description in General request, Purpose in Business trip
    public By descriptionField = By.name("PREVIEW_TEXT");

//CALENDAR BUTTONS

    //input for year in the calendar
    public By yearInputBox = By.xpath("//input[@data-bx-year-input = 'Y' ]");

    // top displayed year on calendar
    public By yearTop = By.xpath("//a[@class = 'bx-calendar-top-year']");

    //top displayed month on calendar
    public By monthTop = By.xpath("//a[@class = 'bx-calendar-top-month']");

    //enables to select and click any month in the calendar. Monthnumber is accepted as a parameter
    public void selectMonth(String monthNumber){
        By month = By.xpath("(//div[@class= 'bx-calendar-month-content']//span)["+monthNumber+"]");
        BrowserUtils.click(month);
    }
    //selecting specific day from calendar
    public void selectDay(String day){
        By dayCalendar = By.linkText(day);
        if(day.substring(0, 1).equals("0")){
            dayCalendar = By.linkText(day.substring(1));
        }
        BrowserUtils.click(dayCalendar);
    }

    //This method allows to pick any date from the CALENDAR

    public void datePicker(String startOrEnd, String day, String monthNumber, String year){
        int number = 1;
        switch (startOrEnd) {
            case "start date":
                number = 1;
                break;
            case "end date":
                number = 2;
                break;
        }
        By startCalendarIcon = By.xpath("(//img[@alt = 'Select date in calendar'])["+number+"]");
        BrowserUtils.click(startCalendarIcon);
        BrowserUtils.click(yearTop);
        BrowserUtils.waitFor(1);
        BrowserUtils.getElement(yearInputBox).sendKeys(year);
        BrowserUtils.waitFor(1);
        BrowserUtils.click(monthTop);
        BrowserUtils.waitFor(1);
        selectMonth(monthNumber);
        BrowserUtils.waitFor(1);
        selectDay(day);
    }

}
