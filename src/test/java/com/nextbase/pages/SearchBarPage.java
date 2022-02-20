package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBarPage extends BasePage {



    @FindBy(id="search-textbox-input")
    public WebElement searchInput;

    @FindBy (xpath = "//*[@class='search-title-top-item search-title-top-item-js']")
    public WebElement searchResult;

    @FindBy (xpath = "(//*[@class='header-search-input'])")
    public WebElement searchResult2;



}
