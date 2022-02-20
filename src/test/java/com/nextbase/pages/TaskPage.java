package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TaskPage extends BasePage{


    @FindBy (xpath = "(//*[@class='menu-item-link-text'])[2]")
    public WebElement tasksButton;

    @FindBy(xpath = "(//*[@class='main-buttons-item-text-title'])[1]")
    public WebElement TabAllButton;

    @FindBy(xpath = "(//*[@class='main-buttons-item-text-title']) [2]")
    public WebElement TabOnGoingButton;

    @FindBy (xpath = "(//*[@class='main-ui-square-item']) [1]")
    public WebElement StatusInprogressButton;

    @FindBy (xpath = "(//*[@title='Role: Ongoing'])")
    public WebElement StatusOngoingButton;

    @FindBy (xpath = "(//*[@class='main-ui-item-icon main-ui-square-delete'])[1]")
    public WebElement DeleteStatusInprogressButton;

    public void clickTaskButton (){
        tasksButton.click();
    }

    public void clickTabAll () {
        TabAllButton.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(StatusInprogressButton.isDisplayed());
    }
    public void clickOngoing() {
        TabOnGoingButton.click();
        DeleteStatusInprogressButton.click();
        Assert.assertTrue(StatusOngoingButton.isDisplayed());
    }


        public void getText () {
            System.out.println(StatusInprogressButton.getText());

        }

}
