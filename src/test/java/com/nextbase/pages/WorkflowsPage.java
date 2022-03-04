package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;

public class WorkflowsPage extends BasePage{

    //Refuse the request link

    By refuseLink = By.linkText("Refuse");

    // Switch between tabs in WorkflowsPage
    public void getTab(String linkname){
        By link = By.linkText(linkname);
        BrowserUtils.click(link);
    }
    //Returns true if Please review the request link is displayed
    public boolean requestLink(String requestName){
        By link = By.linkText("Please review the request " + "\"" + requestName + "\"");
        return BrowserUtils.getElement(link).isDisplayed();
    }

}
