package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.Collections;
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
    public WebElement monthSelect;

    @FindAll({
        @FindBy (xpath = "//*[@class='bx-calendar-month']"),
        @FindBy (xpath = "//*[@class='bx-calendar-month bx-calendar-month-active']")
    })
    public List<WebElement> monthsDropDown;

    @FindBy(xpath = "//*[@class='bx-calendar-top-year']")
    public WebElement yearSelect;

    @FindAll({
            @FindBy(xpath = "//*[@class='bx-calendar-year-number']"),
            @FindBy(xpath = "//*[@class='bx-calendar-year-number bx-calendar-year-active']")
    })
    public List <WebElement> yearDropDown;




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


    public void mentionPopUp () {


    }





}




