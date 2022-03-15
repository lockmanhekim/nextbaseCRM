package com.nextbase.pages.workflows;

import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BusinessTripPage extends WorkflowsInActivityStreamPage{
    //Destination field
    public By destination = By.name("PROPERTY_70[n0][VALUE]");

    //Planned expenses field
    public By plannedExpanses = By.name("PROPERTY_73[n0][VALUE]");

    //Upload a file button
    public By uploadButton = By.name("PROPERTY_78[n0][VALUE]");

//Select currencies: (not set), USD, EUR, GBP, CNY, JPY, BRL, CAD, PLN, INR, AUD
    public void selectCurrency(String option){
        Select dropdown = new Select(BrowserUtils.getElement(By.name("PROPERTY_74")));
        dropdown.selectByVisibleText(option);
    }
    public void uploadFile(String fileName){
        BrowserUtils.fileUpload("src/test/resources/" +fileName, uploadButton);
    }
}
