package com.nextbase.pages.workflows;

import com.nextbase.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LeaveRequestPage extends WorkflowsInActivityStreamPage {

    //Selecting the Absense type from the dropdown:
    //options: (not set), Absent without reason or official leave, Annual leave, Business trip, Maternity leave, Sick leave,
    //Unpaid leave, Personal Calendars, Other

    public void selectAbsenseType(String option){
        Select dropdown = new Select(BrowserUtils.getElement(By.name("PROPERTY_88")));
        dropdown.selectByVisibleText(option);
    }

}
