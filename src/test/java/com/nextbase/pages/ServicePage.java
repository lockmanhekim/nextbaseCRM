package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServicePage extends BasePage{


    @FindBy(linkText = "Services")
    public WebElement services;

    @FindBy(linkText = "Meeting Room Booking Calendar View")
    public WebElement calendarView;

    @FindBy (linkText = "Book meeting room")
    public WebElement bookMeetingRoom;

    @FindBy(id = "#calendar_slider_424620_title")
    public WebElement newEvent;

    @FindBy(xpath = "//nobr[.='East Meeting Room']")
    public WebElement eastMeetingRoom;

    @FindBy (id = "POST_TITLE")
    public WebElement title;

    @FindBy(css = "[contenteditable='true']")
    public WebElement ideaDescription;

    @FindBy(css = "[name='TAGS']")
    public WebElement tags;

    @FindBy(css = "[name='UF_CATEGORY_CODE']")
    public WebElement category;

    @FindBy(id = "pagetitle")
    public WebElement pageAfterSuggest;

    @FindBy(css = "[class='blog-post-text']")
    public WebElement postBlogText;

    @FindBy(className = "t")
    public WebElement suggestButton;

    @FindBy(className = "blog-error-text")
    public WebElement warningMessage;

    @FindBy(xpath = "//a[contains(@id, 'rating-vote-BLOG_POST-943')][1]")
    public WebElement problemsPlusIcon;

    @FindBy(xpath = "//a[contains(@id, 'rating-vote-BLOG_POST-943')][2]")
    public WebElement problemsMinusIcon;

    @FindBy(id = "bx-idea-lifesearch-field")
    public WebElement search;

    @FindBy(className = "idea-owner")
    public List<WebElement> ideaOwner;

    @FindBy(linkText = "date added")
    public WebElement dateAddedSort;

    @FindBy(css = "[id*='result']")
    public List<WebElement> ratings;

    @FindBy(linkText = "rating")
    public WebElement ratingSort;

    @FindBy(className = "navigation-page-numb")
    public List<WebElement> navigateButton;

    @FindBy(xpath = "(//span[@class='navigation-text-cont'])[2]")
    public WebElement next;

    @FindBy(xpath = "//span[.='Print']")
    public WebElement print;

    @FindBy(id = "workarea-content")
    public WebElement listContent;


    public WebElement getPage(String str){
        return Driver.get().findElement(By.linkText(str));
    }

    public void selectOption(String str){

        Select select =new Select(category);

        if(str.contains("Domestic business")){
            select.selectByIndex(1);
        }else if(str.contains("International business")){
            select.selectByIndex(2);
        }else{
            select.selectByVisibleText(str);
        }
    }

    public List<String> getDates(){

        List<String> dates = new ArrayList<>();

        for (WebElement element : ideaOwner) {
            String text = element.getText();
            String[] firstSplit = text.split("com ");
            dates.add(firstSplit[1]);
        }
        return dates;
    }

    public List<Double> getRating(){

        List<Double> numsRating = new ArrayList<>();
        List<WebElement> ratingsList = ratings;

        for (WebElement element : ratingsList) {
            Double num = Double.parseDouble(element.getText());
            numsRating.add(num);
        }
        return numsRating;
    }


    public List<Double> getAllRating(){

        List<Double> allExpectedRatings = getRating();

        for (int i =0; i<navigateButton.size(); i++){
            next.click();
            List<Double> rating = getRating();
            allExpectedRatings.addAll(rating);
        }
        return allExpectedRatings;
    }

    public List<Double> getAllSortedRating(){

        Driver.get().findElement(By.xpath("//a[@class='navigation-page-numb'][1]")).click();
        ratingSort.click();
        List<Double> allActualRatings = getRating();

        for (int i=0; i<navigateButton.size(); i++){
            next.click();
            ratingSort.click();
            List<Double> rating = getRating();
            allActualRatings.addAll(rating);
        }
        return allActualRatings;
    }

}
