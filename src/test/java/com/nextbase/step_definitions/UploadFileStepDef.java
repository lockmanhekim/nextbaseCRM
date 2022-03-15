package com.nextbase.step_definitions;

import com.nextbase.pages.UploadFilePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;

public class UploadFileStepDef {

    UploadFilePage uploadFilePage = new UploadFilePage();

    @Then("the user click on More button")
    public void the_user_click_on_More_button() {
        uploadFilePage.moreInput.click();
        BrowserUtils.waitFor(3);



    }

    @When("the user click on File button")
    public void the_user_click_on_File_button() {
        uploadFilePage.fileInput.click();
        BrowserUtils.waitFor(3);



    }

    @Then("the user click on Upload File and Images button")
    public void the_user_click_on_Upload_File_and_Images_button() {
        WebElement fileUpload = Driver.get().findElement(By.xpath("//input[@name='bxu_files[]']"));

        fileUpload.sendKeys("C:\\Users\\abdullah\\Desktop\\test.txt");
        BrowserUtils.waitFor(3);


    }

    @Then("the user upload a file")
    public void the_user_upload_a_file() {
       uploadFilePage.sendFile.click();
       BrowserUtils.waitFor(5);


    }

    @Then("the user should be able to see the uploaded file")
    public void theUserShouldBeAbleToSeeTheUploadedFile() {


        Assert.assertTrue(uploadFilePage.vrfyTht.isDisplayed());
       BrowserUtils.waitFor(5);

    }


    @And("click on the download from external drive button")
    public void clickOnTheDownloadFromExternalDriveButton() {
       uploadFilePage.DownloadExternal.click();
       BrowserUtils.waitFor(3);



    }

    @Then("click on the all drive buttons")
    public void clickOnTheAllDriveButtons() {

        List<WebElement> allButtons = Driver.get().findElements(By.xpath("//*[@class='bx-file-dialog-tab-item']"));

        for (WebElement allButton : allButtons) {

            Assert.assertTrue(allButton.isDisplayed());

            allButton.click();
            BrowserUtils.waitFor(2);
        }



    }

    @And("the user click on select document from Bitrix{int} button")
    public void theUserClickOnSelectDocumentFromBitrixButton(int arg0) {
        uploadFilePage.bitrix24.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the user click on files to upload")
    public void theUserClickOnFilesToUpload() {
        uploadFilePage.fileupload.click();
        BrowserUtils.waitFor(3);
        uploadFilePage.selectDoc.click();
        BrowserUtils.waitFor(3);
        uploadFilePage.bitrix24.click();
        BrowserUtils.waitFor(3);
        uploadFilePage.myDrive.click();
        BrowserUtils.waitFor(3);
        uploadFilePage.uploadedFiles.click();
        BrowserUtils.waitFor(3);
        uploadFilePage.fileclick.click();
        uploadFilePage.fileclick2.click();
        uploadFilePage.fileclick3.click();
        BrowserUtils.waitFor(3);
        uploadFilePage.selectDoc.click();
        BrowserUtils.waitFor(3);
        uploadFilePage.sendFile.click();
        BrowserUtils.waitFor(3);
    }



    @Then("the user should be able to verify the uploaded file")
    public void theUserShouldBeAbleToVerifyTheUploadedFile() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),30);
        wait.until(ExpectedConditions.visibilityOf(uploadFilePage.verifyThat));
        Assert.assertTrue(uploadFilePage.verifyThat.isDisplayed());
        BrowserUtils.waitFor(3);

    }
}
