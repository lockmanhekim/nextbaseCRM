package com.nextbase.step_definitions;
import com.nextbase.pages.ActivityStreamPage;
import com.nextbase.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

public class DesktopDownloadStepDefs {


    @When("user clicks {string} under Desktop Client")
    public void user_clicks_under_Desktop_Client(String string) {

        if (string.equalsIgnoreCase("Mac OS")) {
            new ActivityStreamPage().downloadMacOs.click();
        }else if(string.equalsIgnoreCase("Windows")){
            new ActivityStreamPage().downloadWindows.click();
        }else if (string.equalsIgnoreCase("Linux")){
            new ActivityStreamPage().downloadLinux.click();
        }
    }

    @Then("user should be able to see downloaded file with name {string} in Downloads folder.")
    public void user_should_be_able_to_see_downloaded_file_with_name_in_Downloads_folder(String string) {

        String baseFolder = "C:\\Users\\ankar\\Downloads";

        Collection files = FileUtils.listFiles(new File(baseFolder), null, false);
        System.out.println("files.size() = " + files.size());


        String assertText = string;

        for (Iterator iterator = files.iterator(); iterator.hasNext(); ) {
            File file = (File) iterator.next();


            if (file.getName().contains(string.trim())) {

                assertText = string;
                break;//here is the code for updating the file
            }else {
                assertText = "The file "+ string+ " was not downloaded";
            }


        }

        Assert.assertEquals("verify downloaded file",string, assertText);



    }

}
