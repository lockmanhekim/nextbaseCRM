package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends BasePage{

    @FindBy(xpath = "//*[@title='Add News']")
    public WebElement addNewsButton;

    @FindBy(id = "tab_cont_cedit1")
    public WebElement previewTextTab;

    @FindBy(id = "tab_cont_cedit2")
    public WebElement detailsTab;

    @FindBy(xpath = "//select[@name=\"PROP[3][]\"]")
    public WebElement selectTypeOfInfo;

    @FindBy(xpath = "//*[@class=\"adm-calendar-icon\"]")
    public WebElement calendarIcon;

    @FindBy(xpath = "//*[@class=\"adm-input adm-input-calendar\"]")
    public WebElement dateBox;

    @FindBy(id = "bx_file_detail_picture_input")
    public WebElement fileInput;

    @FindBy(id = "bx_file_detail_picture_add")
    public WebElement fileUploadBtn;

    @FindBy(id = "bx_file_detail_picture_menu1")
    public WebElement uploadFromComputer;


    @FindBy(className = "adm-btn-del")
    public WebElement fileRemove;

    @FindBy(className = "adm-btn-setting")
    public WebElement fileEdit;

    @FindBy(className = "adm-photoeditor-btn-turn-l")
    public WebElement leftRotate;

    @FindBy(className = "adm-photoeditor-btn-turn-r")
    public WebElement rightRotate;





    @FindBy(xpath = "//*[@name='TAGS']")
    public WebElement tags;

    @FindBy(xpath = "//*[@for=\"bxed_DETAIL_TEXT_text\"]")
    public WebElement textRadioBtn;

    @FindBy(xpath = "//*[@for=\"bxed_DETAIL_TEXT_html\"]")
    public WebElement htmlRadioBtn;

    @FindBy(xpath = "//*[@for=\"bxed_DETAIL_TEXT_editor\"]")
    public WebElement visualEditorRadioBtn;

    @FindBy(xpath = "//*[@name=\"NAME\"]")
    public WebElement titleBox;

    @FindBy(xpath = "//*[@class=\"typearea\"]")
    public WebElement typeArea;

    @FindBy(xpath = "//*[@name=\"savebtn\"]")
    public WebElement saveButton;









}
