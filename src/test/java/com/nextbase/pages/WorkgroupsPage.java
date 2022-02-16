package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkgroupsPage extends BasePage{


    @FindBy(css = "[title='Workgroups']")
    public WebElement workGroupsButton;

    @FindBy(id="bx-sonet-groups-request-7")
    public WebElement christmasJoin;

    @FindBy(id="bx-sonet-groups-request-4")
    public WebElement soccerJoin;

    @FindBy(id="sonet-groups-group-title")
    public List<WebElement> workgroupInMyList;





}
