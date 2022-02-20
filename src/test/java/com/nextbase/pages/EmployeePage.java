package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"top_menu_id_company_3271504278\"]/a/span[2]/span[2]")
    public WebElement companyStructureLink;

    @FindBy(css = "#pagetitle")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_2000783151\"]/a/span[2]/span[2]")
    public WebElement telephoneDirectoryLink;



}
