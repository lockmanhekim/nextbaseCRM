package com.nextbase.pages.workflows;

import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PurchaseRequest extends WorkflowsInActivityStreamPage {
    //Amount field
    public By amount = By.name("PROPERTY_90[n0][VALUE]");

    //Upload button
    public By uploadButton = By.name("PROPERTY_92[n0][VALUE]");

    //Select currencies: (not set), USD, EUR, GBP, CNY, JPY, BRL, CAD, PLN, INR, AUD

    public void selectCurrency(String option){
        Select dropdown = new Select(BrowserUtils.getElement(By.name("PROPERTY_91")));
        dropdown.selectByVisibleText(option);
    }

    // Upload file

    public void uploadFile(String file){
        BrowserUtils.fileUpload("src/test/resources/" + file, uploadButton);
    }

}
