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

    @FindBy(xpath = "//*[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCheckbox;

    @FindBy(css = "[class=side-panel-iframe]")
    public WebElement iframe;

    @FindBy(xpath = "//*[@class='feed-add-post-form-but feed-add-mention']")
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

    @FindBy (xpath = "(//*[@class='task-popup-inp-container task-options-inp-container-period'])")
    public WebElement recipientBox;

    @FindBy (xpath = "(//select[@class='task-popup-inp']) [2]")
    public WebElement recipientSelect;


    @FindBy (xpath = "(//*[@title='Message will be sent on a specific date']) ")
    public WebElement dateOption1;

    @FindBy (xpath = "(//*[@class='task-popup-inp'])[1]")
    public WebElement calendarInputBox;

    @FindBy (xpath = "(//*[@class='task-popup-label-add']) ")
    public WebElement addReminderSelections;

    @FindBy (xpath = "(//*[@class='main-grid-cell-content'] )[9]/span")
    public WebElement  plusSignTestTask2;

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
    public WebElement checkListAddButton;

    @FindBy (xpath = "(//*[@class='js-id-checklist-is-form-title task-checklist-field-add'])")
    public WebElement checklistInput1;

    @FindBy (xpath = "(//*[@class='js-id-checklist-is-add-separator task-dashed-link-inner'])")
    public WebElement separator1;

    @FindBy (css = "[id*='iframe_']")
    public WebElement iframe3;

    @FindBy (xpath = "(//*[@class='js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok'])")
    public WebElement okChecklist;

    @FindBy (css = "[id*='checkbox_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_1196']")
            public WebElement checkBox871;

    @FindBy (css = "[class*='main-grid-row main-grid-row-body main-grid-row-checked']")
    public WebElement checked871;

    @FindBy (css = "[data-id*='1196']")
    public WebElement nonChecked871;

    @FindBy (xpath = "(//*[@class='main-dropdown main-grid-panel-control'])")
    public  WebElement selectActionButton;

    @FindBy (xpath = "(//*[@id='menu-popup-action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_control_menu'])")
    public WebElement selectActionDrpDown;
    @FindBy (xpath = "(//*[@id='apply_button_control'])")
    public WebElement applyButtonControl;

    @FindBy (linkText = "TestTask871")
    public WebElement TestTask871;

    @FindBy (xpath = "(//*[@class='main-dropdown-item']) [13]")
    public WebElement deleteSelectButon;

    @FindBy(xpath= "(//*[@class='popup-window-button popup-window-button-accept'])")
    public WebElement popUpContinue;

    @FindBy (xpath = "(//*[@id='tasks-popupMenuAdd'])")
    public WebElement newTaskModule;

    @FindBy (xpath = "(//*[@class='menu-popup-item menu-popup-no-icon ']) [2]")
    public WebElement allTemplates;

    @FindBy (xpath = "(//*[@class='ui-btn ui-btn-primary ui-btn-icon-add tasks-filter-btn-add']) ")
    public WebElement addButtonTaskModule;

    @FindBy (xpath = "(//*[@class='js-id-dateplanmanager-unit-setter task-dashed-link-inner'])[1]")
    public WebElement daysOption;

    @FindBy (xpath = "(//*[@class='js-id-dateplanmanager-unit-setter task-dashed-link-inner'])[2]")
    public WebElement hoursOption;

    @FindBy (xpath = "(//*[@class='js-id-dateplanmanager-unit-setter task-dashed-link-inner'])[4]")
    public WebElement minutesOption;

    @FindBy (xpath = "(//*[@class='js-id-dateplanmanager-display task-options-inp'])[1]")
    public WebElement timeInputBoxDeadlineIn;

    @FindBy (xpath = "(//*[@class='js-id-wfr-edit-form-toggler task-dashed-link-inner'])[5]")
    public  WebElement deadlineOptions;

    @FindBy (xpath = "(//*[@class='task-form-field-item-text task-options-destination-text'])[1]")
    public WebElement responsiblePerson;

    @FindBy (xpath = "(//*[@data-flag-name='ALLOW_CHANGE_DEADLINE'])")
    public WebElement deadlineOption1;

    @FindBy (xpath = "(//*[@data-flag-name='MATCH_WORK_TIME'])")
    public WebElement deadlineOption2;

    @FindBy (xpath = "(//*[@data-flag-name='TASK_CONTROL'])")
    public WebElement deadlineOption3;

    @FindBy (xpath = "//*[@class='webform-small-button-text']")
    public WebElement createTaskButton;

    @FindBy (xpath = "(//*[@class='pagetitle-item'])")
    public WebElement pageTitleNewTemplate;

    @FindBy (xpath = "//*[@class='task-message-label error']")
    public WebElement errorMessage;

    @FindBy (xpath = "(//*[@class='task-item-set-empty-block-off'])[2]")
    public WebElement addDependentTask;

    @FindBy (xpath = "(//*[@class='finder-box-search-textbox'])[3]")
    public  WebElement dependentTaskInputBox;

    @FindBy (xpath = "(//*[@class='popup-window-button popup-window-button-accept'])")
    public WebElement dependentTaskSelect;

    @FindBy (xpath = "(//*[@class='task-options-destination-text'])[1]")
    public WebElement task867Dependent;

    @FindBy (xpath = "(//*[@id='dependson_search'])")
    public WebElement searchedTaskDependent;

    @FindBy (xpath = "(//*[@id='dependson_last_task_1198'])")
    public WebElement task866_1;

    @FindBy (xpath = "(//*[@id='dependson_last_task_1197'])")
    public WebElement task867_1;

    @FindBy (xpath = "(//*[@class='block-read task-checklist-field-label']) [1]")
    public WebElement chclist1;

    @FindBy (xpath = "(//*[@class='block-read task-checklist-field-label']) [3]")
    public WebElement chclist2;

    @FindBy (xpath = "(//*[@class='block-read task-checklist-field-label']) [5]")
    public WebElement chclist3;

    @FindBy (xpath = "(//*[@class='js-id-checklist-is-i-drag-handle task-field-divider separator']) [2]")
    public WebElement sprtr1;

    @FindBy (xpath = "(//*[@class='js-id-checklist-is-i-drag-handle task-field-divider separator']) [4]")
    public WebElement sprtr2;

    @FindBy (xpath = "(//*[@class='task-popup-inp']) [3]")
    public WebElement reminderDayHour;

    @FindBy (xpath = "(//*[@class='task-popup-inp']) [4]")
    public WebElement reminderRecipient;










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
        month1=(text.substring(0,2));
        day1=(text.substring(3,5));
        year1= (text.substring(6,10));
        hour1=(text.substring(11,13));
        minute1=(text.substring(14,16));
        ampm1=text.substring(17,18);

    }
    String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};


    public void setReminderPast() {
        selectMonth("March");
        BrowserUtils.waitFor(4);
        selectDay("19");
        BrowserUtils.waitFor(4);
        selectYear("2022");
        BrowserUtils.waitFor(4);
        //must be fail bec we set reminder to a past date.

    }
    public void setReminderDuring(){
        int max= Integer.parseInt(month1);
        int min= 2;
        int maxDay=28;
        int minDay=1;
        int randomMonth = (int)Math.floor(Math.random()*(max-min+1)+min);
        int randomDay = (int)Math.floor(Math.random()*(maxDay-minDay+1)+minDay);

        //dynamically select a random month between deadline month and current month * chef's kiss *
        selectMonth(months[randomMonth]);
        BrowserUtils.waitFor(4);

        //random day selection
        int index=randomDay+counter;
        BrowserUtils.clickWithJS(daysList.get(index));
        BrowserUtils.waitFor(4);

        selectYear(year1);
        BrowserUtils.waitFor(4);



    }

    public void setReminderFuture () {
        int max= Integer.parseInt(month1);
        int min= 2;
        int maxDay=28;
        int minDay=1;
        int randomMonth = (int)Math.floor(Math.random()*(max-min+1)+min);
        int randomDay = (int)Math.floor(Math.random()*(maxDay-minDay+1)+minDay);

        //dynamically select a random month between deadline month and current month * chef's kiss *
        selectMonth(months[randomMonth]);
        BrowserUtils.waitFor(4);

        //random day selection
        int index=randomDay+counter;
        BrowserUtils.clickWithJS(daysList.get(index));
        BrowserUtils.waitFor(4);

        BrowserUtils.clickWithJS(yearSelectButton);
        yearInput.sendKeys("2023");
        BrowserUtils.waitFor(4);



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

    public void selectActionDelete (){
        Select selectDelete = new Select (selectActionDrpDown);
        selectDelete.selectByIndex(13);


    }

    public void setDeadlineOption (String optionData) {
        if (optionData.contains("1")) {
            BrowserUtils.clickWithJS(deadlineOption1);
        }

        if (optionData.contains("2")){
            BrowserUtils.clickWithJS(deadlineOption2);
        }

        if (optionData.contains("3")){
            BrowserUtils.clickWithJS(deadlineOption3);
        }
    }

    public void assertTemplateExists (String taskname) {
       clickTaskButton();
        BrowserUtils.clickWithJS(newTaskModule);
        BrowserUtils.clickWithJS(allTemplates);

        Assert.assertTrue(Driver.get().findElement(By.linkText(taskname)).isDisplayed());

    }

    public void selectDependentTask (String taskName){
       dependentTaskInputBox.sendKeys(taskName);
       BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(searchedTaskDependent);
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(dependentTaskSelect);

    }
    public void checklistSeparatorTest() {
        checklistInput1.sendKeys("test1");
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(okChecklist);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(separator1);
        BrowserUtils.waitFor(2);
        checklistInput1.sendKeys("test2");
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(okChecklist);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(separator1);
        BrowserUtils.waitFor(2);
        checklistInput1.sendKeys("test3");
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(okChecklist);
        BrowserUtils.clickWithJS(separator1);

    }

    public void assertChechlistSeparatorTest() {
        Assert.assertTrue(chclist1.isDisplayed());
        Assert.assertTrue(chclist2.isDisplayed());
        Assert.assertTrue(chclist3.isDisplayed());
        Assert.assertTrue(sprtr1.isDisplayed());
        Assert.assertTrue(sprtr2.isDisplayed());


    }













}












