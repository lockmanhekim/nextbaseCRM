package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;

public class WorkflowsInActivityStreamPage extends BasePage{

    // Click on module
    public void getModule(String linkname){
        By link = By.linkText(linkname);
        BrowserUtils.click(link);
    }

    // Add button
    By addButton = By.linkText("Add");

}
