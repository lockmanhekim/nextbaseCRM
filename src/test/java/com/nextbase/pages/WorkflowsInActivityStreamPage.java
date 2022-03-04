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
   public By addButton = By.id("lists-title-action-add");

    //These fields are common for all other pages that extend the WorkflowsInActivityStreamPage

   public By title = By.name("NAME");

    public By saveBtn = By.name("save");

}
