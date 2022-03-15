package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskPage extends BasePage {


    @FindBy(xpath = "(//*[@class='menu-item-link-text'])[2]")
    public WebElement tasksButton;

    @FindBy(xpath = "(//*[@class='main-buttons-item-text-title'])[1]")
    public WebElement TabAllButton;

    @FindBy(xpath = "(//*[@class='main-buttons-item-text-title']) [2]")
    public WebElement TabOnGoingButton;

    @FindBy(xpath = "(//*[@class='main-ui-square-item']) [1]")
    public WebElement StatusInprogressButton;

    @FindBy(xpath = "(//*[@title='Role: Ongoing'])")
    public WebElement StatusOngoingButton;

    @FindBy(xpath = "(//*[@class='main-ui-item-icon main-ui-square-delete'])[1]")
    public WebElement DeleteStatusInprogressButton;

    @FindBy(id = "tasks-buttonAdd")
    public WebElement newTaskButton;

    @FindBy(xpath = "//*[@name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement setTaskName;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckbox;

    @FindBy(css = "[class=side-panel-iframe]")
    public WebElement iframe;

    @FindBy(id = "bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement addMention;

    @FindBy(css = "[id^='destDepartmentTab']")
    public WebElement emailAndDepMention;

    @FindBy (xpath = "(//*[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add']) [1]")
    public WebElement addMoreButtonR;

    @FindBy (css= "[id*='_last_U592']")
    public WebElement marketing1UserMail;

    @FindBy (css= "[id*='_last_U594']")
    public WebElement marketing3UserMail;

    @FindBy (css = "[id*=name-selector]")
    public WebElement nameSelector;

    @FindBy (xpath = "(//*[@class='task-options-inp'])[1]")
    public WebElement deadlineBox;

    @FindBy (css = "[class*=bx-calendar-top-month]")
    public WebElement monthSelectButton;

    @FindAll({
        @FindBy (xpath = "//*[@class='bx-calendar-month']"),
        @FindBy (xpath = "//*[@class='bx-calendar-month bx-calendar-month-active']")
    })
    public List<WebElement> monthsDropDown;





    @FindBy(xpath = "//*[@class='bx-calendar-top-year']")
    public WebElement yearSelectButton;

    @FindAll({
            @FindBy(xpath = "//*[@class='bx-calendar-year-number']"),
            @FindBy(xpath = "//*[@class='bx-calendar-year-number bx-calendar-year-active']")
    })
    public List <WebElement> yearDropDown;

    @FindBy (xpath = "//*[@class='bx-calendar-year-input']")
    public WebElement yearInput;

    @FindBy (xpath = "(//*[@class='bx-calendar-form-input']) [1]")
    public WebElement timeHoursInput;

    @FindBy (xpath = "(//*[@class='bx-calendar-form-input']) [2]")
    public WebElement timeMinutesInput;

    @FindBy (xpath = "//*[@class='bx-calendar-AM-PM-text']")
    public WebElement amOrPm;

    @FindBy (xpath = "(//*[@class='bx-calendar-button-text']) [1]")
    public WebElement submitDateDeadline;

    @FindBy (xpath = "(//*[@class='bx-calendar-button-text']) [2]")
    public WebElement closeDeadlineButton;

    @FindBy (xpath = "//*[@class='ui-btn ui-btn-success']")
    public WebElement addTaskButton;
    //For selecting specific date


    @FindBy (xpath = "//*[@class='bx-calendar-cell']")
    public WebElement allDay;
          //  @FindBy (xpath = "//*[@class='bx-calendar-cell bx-calendar-weekend']"),

    @FindBy (css = "[class*='bx-calendar-cell']")
    public List <WebElement> daysList;


    @FindAll({
            @FindBy( xpath = "((//*[@class='bx-calendar-range'])//a)[1]"),
            @FindBy( xpath = "((//*[@class='bx-calendar-range'])//a)[2]"),
            @FindBy( xpath = "((//*[@class='bx-calendar-range'])//a)[3]"),
            @FindBy( xpath = "((//*[@class='bx-calendar-range'])//a)[4]"),
            @FindBy( xpath = "((//*[@class='bx-calendar-range'])//a)[5]"),
            @FindBy( xpath = "((//*[@class='bx-calendar-range'])//a)[6]"),
            @FindBy( xpath = "((//*[@class='bx-calendar-range'])//a)[7]")
    })
    public List<WebElement> hiddenDaysList;

    @FindBy (linkText = "task23")
     public WebElement task23;

    @FindBy (xpath = "//*[@class='task-view-button edit ui-btn ui-btn-link']")
     public WebElement editButton;

    @FindBy (className = "side-panel-iframe")
     public WebElement iframe2;

    @FindBy (xpath = "(//*[@class='js-id-tdp-mem-sel-is-open-form task-form-field-link']) [1]")
     public WebElement changeResponsibleButton;

    @FindBy (xpath = "(//*[@class='ui-btn ui-btn-success']) [1]")
     public WebElement saveChangesButton;

    @FindBy(xpath = "//*[@class='task-additional-alt-more']")
    public WebElement moreButton;

    @FindBy (xpath = "//*[@class='task-field-label task-field-label-tm']")
    public WebElement taskPlannedCheckBox;

    @FindBy (xpath = "//*[@class='js-id-timeestimate-time js-id-timeestimate-hour task-options-inp']")
    public WebElement timePlannedHour;

    @FindBy(xpath = "//*[@class='js-id-timeestimate-time js-id-timeestimate-minute task-options-inp']")
    public WebElement timePlannedMinute;

    @FindBy (xpath = "(//*[@class='task-dashed-link-inner']) [9]")
    public WebElement AddReminderButton;

    @FindBy (xpath = "(//*[@class='type-a-control'])[1]")
    public WebElement remindUsing;

    @FindBy (xpath = "(//*[@class='type-a-control'])[1]")
     public WebElement dateOption;

    @FindBy(xpath = "(//*[@title='Message will be sent in the specified time before deadline']) [2]")
    public WebElement deadlineOption;

    @FindBy (xpath = "(//*[@class='task-options-reminder-link-mail']) ")
    public WebElement emailOption;

    @FindBy (xpath = "//*[@id='task-detail-deadline']")
    public WebElement deadlineDate;

    @FindBy (css = "[class*='task-popup-inp-container']")
    public WebElement reminderCalendar;

    @FindBy (xpath = "(//select[@class='task-popup-inp']) [2]")
    public WebElement recipientSelect;

    @FindBy (xpath = "(//*[@title='Message will be sent on a specific date']) ")
    public WebElement dateOption1;

    @FindBy (xpath = "(//*[@class='task-popup-inp'])[1]")
    public WebElement calendarInputBox;

    @FindBy (xpath = "(//*[@class='task-popup-label-add']) ")
    public WebElement addReminderSelections;

    @FindBy (xpath = "(//*[@class='main-grid-plus-button'] )[1]")
    public WebElement  plusSign;

    @FindBy (xpath = "(//*[@data-target='accomplice'])[1]")
    public WebElement participants;

    @FindBy(xpath = "(//*[@data-target='auditor'])[1]")
    public WebElement observers;

    @FindBy(xpath = "(//*[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[1]")
    public WebElement addParticipant;

    @FindBy (css = "[id*='destDepartmentTab_']")
    public WebElement employeeDepartment;

    @FindBy (xpath = "(//*[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[2]")
    public WebElement addObserver;

    @FindBy (xpath = "(//*[@class='task-detail-sidebar-info-user-name task-detail-sidebar-info-user-name-link'])[3]")
    public WebElement participantAdded;

    @FindBy (xpath = "(//*[@class='task-detail-sidebar-info-user-name task-detail-sidebar-info-user-name-link'])[4]")
    public  WebElement observerAdded;
    @FindBy (xpath = "//*[@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement checkListButton;

    @FindBy (xpath = "(//*[@class='js-id-checklist-is-form-title task-checklist-field-add'])")
    public WebElement checklistInput1;


    int counter=0;
    public void clickTaskButton() {

        tasksButton.click();
    }

    public void clickTabAll() {
        TabAllButton.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(StatusInprogressButton.isDisplayed());
    }

    public void clickOngoing() {
        TabOnGoingButton.click();
        DeleteStatusInprogressButton.click();
        Assert.assertTrue(StatusOngoingButton.isDisplayed());
    }



    public void selectMonth (String month) {
        BrowserUtils.clickWithJS(monthSelectButton);

      BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//span[contains(text(), '" +month+ "')]")));
    }

    public void selectYear (String year) {

        BrowserUtils.clickWithJS(yearSelectButton);
        yearInput.sendKeys(year);
    }
    public void findhiddenDays (){
        for (int i=0; i<7;i++){
            if (hiddenDaysList.get(i).getAttribute("class").contains("hidden") ){
                counter++;
            }
        }
    }


    public void selectDay(String day) {
        int day1=Integer.parseInt(day);
        int index=day1+counter;

        BrowserUtils.clickWithJS(daysList.get(index));

    }

    public void selectHour(String hour) {

        BrowserUtils.clickWithJS(timeHoursInput);
        timeHoursInput.sendKeys(hour);
    }
    public void selectMinutes(String minute){
        BrowserUtils.clickWithJS(timeMinutesInput);
        timeMinutesInput.sendKeys(minute);
    }

    public void selectPersonResponsible(String person) {

        if (person.equalsIgnoreCase("marketing3")){
            BrowserUtils.clickWithJS(marketing3UserMail);
            BrowserUtils.clickWithJS(nameSelector);
        }

    }
    public void selectAmPm (String ampm){
        if (ampm.equalsIgnoreCase("am")){
            BrowserUtils.clickWithJS(amOrPm);
        }


    }
    public void clicksTask(String taskname) {
        BrowserUtils.clickWithJS(Driver.get().findElement(By.linkText(taskname)));

    }

    String month1=null;
    String day1=null;
    String year1=null;
    String hour1=null;
    String minute1=null;
    String ampm1=null;
    String text=null;
    public void getDeadlineDate() {
        text = deadlineDate.getText();

    }

    public void setDeadLineDateDuringTask(){
        month1=(text.substring(0,2));
        day1=(text.substring(3,5));
        year1= (text.substring(6,10));
        hour1=(text.substring(11,13));
        minute1=(text.substring(14,16));
        ampm1=text.substring(17,18);
        BrowserUtils.waitFor(3);

            selectHour(hour1);
            selectMinutes(minute1);

            if(month1.equalsIgnoreCase("12")){
                selectMonth("January");
            }else if (month1.equalsIgnoreCase("1")){
            selectMonth("February");
            }else if(month1.equalsIgnoreCase("2")){
            selectMonth("March");
            }else if(month1.equalsIgnoreCase("3")){
            selectMonth("April");
            } else if(month1.equalsIgnoreCase("4")){
            selectMonth("May");
            }else if(month1.equalsIgnoreCase("5")){
            selectMonth("June");
            }else  if(month1.equalsIgnoreCase("6")){
            selectMonth("July");
            }else if(month1.equalsIgnoreCase("7")){
            selectMonth("August");
           }else if(month1.equalsIgnoreCase("8")){
            selectMonth("September");
           }else if(month1.equalsIgnoreCase("9")){
            selectMonth("October");
           }else if(month1.equalsIgnoreCase("10")){
            selectMonth("November");
           }else if(month1.equalsIgnoreCase("11")){
            selectMonth("December");
           }

            selectYear(year1);
            findhiddenDays();
            selectDay(day1);


    }


    public void setRecipientSelect (String option) {
        Select dropdownRecipient= new Select(recipientSelect);
        dropdownRecipient.selectByVisibleText(option);


    }

    public void selectParticipant (String participantUser) {
        BrowserUtils.clickWithJS(Driver.get().findElement(By.linkText(participantUser)));

    }
}












