package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkgroupsPage extends BasePage{


    @FindBy(css = "[title='Workgroups']")
    public WebElement workGroupsButton;

    @FindBy(id = "SONET_GROUP_LIST_search")
    public WebElement search;

    @FindBy(xpath = "//span[.='My']")
    public WebElement myList;

    @FindBy(xpath = "//span[.='Favorites']")
    public WebElement favoriteList;

    @FindBy(id = "bx-sonet-groups-request-sent-2")
    public WebElement sendMessagePR;

    @FindBy(id="bx-sonet-groups-request-sent-3")
    public WebElement sendMessageSales;


    /**
     * Gets the locator of given Workgroup
     *
     * @param str
     * @return WebElement
     */
    public WebElement getWorkgroup(String str){
        return Driver.get().findElement(By.linkText(str));
    }


    /**
     * Gets the locator of join button of given Workgroup
     *
     * @param str
     * @return WebElement
     */
    public WebElement getJoinButtons(String str){
        String num = getNumOfWorkgroup(str);
        String buttonId = "bx-sonet-groups-request-"+num;
        return Driver.get().findElement(By.id(buttonId));
    }


    /**
     * Gets the locator of add favorite icon of given Workgroup
     *
     * @param str
     * @return WebElement
     */
    public WebElement getFavIcon(String str){
        String num = getNumOfWorkgroup(str);
        String favIconId= "bx-sonet-groups-favorites-"+num;
        return Driver.get().findElement(By.id(favIconId));

    }


    /**
     * Gets locator of request sent message of given Workgroup
     *
     * @param str
     * @return WebElement
     */
    public WebElement getRequestSendMessage(String str){

       String num = getNumOfWorkgroup(str);
       String requestSendId= "bx-sonet-groups-request-sent-"+num;
       return Driver.get().findElement(By.id(requestSendId));

    }


    /**
     * Gets num of given str
     *
     * @param str
     * @return WebElement
     */
    public String getNumOfWorkgroup(String str){

        String num = "";

        switch (str){

            case "Corporate Christmas Party":
                num= "7";
                break;
            case "\"New Corporate Identity\" project":
                num= "8";
                break;
            case "New company web site development":
                num= "1";
                break;
            case "New product development":
                num= "6";
                break;
            case "PR and advertising":
                num= "2";
                break;
            case "Sales":
                num= "3";
                break;
            case "Soccer team":
                num= "4";
                break;
            case "Technology":
                num= "5";
                break;
        }

        return num;
    }


}
