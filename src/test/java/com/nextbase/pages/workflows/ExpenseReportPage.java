package com.nextbase.pages.workflows;

import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ExpenseReportPage extends WorkflowsInActivityStreamPage{
    //Description field
   public By description = By.name("PROPERTY_79[n0][VALUE]");

    // Amount field
    public By amount = By.name("PROPERTY_80[n0][VALUE]");

    //upload Button
   public By uploadButton = By.name("PROPERTY_82[n0][VALUE]");

    //Select currencies: (not set), USD, EUR, GBP, CNY, JPY, BRL, CAD, PLN, INR, AUD

    public void selectCurrency(String option){
        Select dropdown = new Select(BrowserUtils.getElement(By.name("PROPERTY_81")));
        dropdown.selectByVisibleText(option);
    }
    public void uploadFile(String file){
        BrowserUtils.fileUpload("src/test/resources/"+ file, uploadButton);
    }
}
