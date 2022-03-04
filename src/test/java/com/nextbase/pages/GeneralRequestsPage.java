package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class GeneralRequestsPage extends WorkflowsInActivityStreamPage {

    public By description = By.name("PREVIEW_TEXT");
    public By errorMessage = By.xpath("//font[@class = 'errortext']");

    // selects priority level from dropdown. The priority level text needs to be provided as a parameter
    // Low, Medium, High, (not set)

    public void selectPriorityLevel(String option){
        Select dropdown = new Select(BrowserUtils.getElement(By.name("PROPERTY_84")));
        dropdown.selectByVisibleText(option);
    }
    //Send request to box. Put id of recipient as parameter
    public void sendRequestTo(String id){
        BrowserUtils.getElement(By.name("PROPERTY_85[n0][VALUE]")).sendKeys(id);
    }

}
