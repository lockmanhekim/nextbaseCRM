package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.pages.MyProfilePage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyProfileStepDefs {

    MyProfilePage myProfilePage = new MyProfilePage();


        @When("click username icon")
        public void click_username_icon() {
            myProfilePage.userNameDropdown.click();
        }

        @When("click Edit Profile Settings")
        public void click_Edit_Profile_Settings() {
            myProfilePage.editProfileSettingsMenu.click();
        }

        @Then("user should be able to see Edit Profile Page")
        public void user_should_be_able_to_see_Edit_Profile_Page() {
            Assert.assertTrue(Driver.get().getTitle().contains("Edit User Profile"));
        }

        @When("click My Profile")
        public void click_My_Profile() {
            myProfilePage.userNameDropdown.click();
            myProfilePage.myProfileMenu.click();
        }

        @Then("user should be able to see Contact information")
        public void user_should_be_able_to_see_Contact_information() {

             String actualContact = "Contact information";
             Assert.assertEquals(myProfilePage.contactInformation.getText(),actualContact);

        }

        @When("user click Edit Profile Actions")
        public void user_Click_Edit_Profile_Actions() {
        myProfilePage.editProfileActions.click();
        }

        @And("user can change settings of own profile")
        public void user_Can_Change_Settings_Of_Own_Profile() {
        myProfilePage.firstNameBox.sendKeys("mike");
        myProfilePage.saveButton.click();
        }

        @Then("user should be able to see the Contact information in own profile")
        public void user_Should_Be_Able_To_See_The_Contact_Information_In_Own_Profile() {
        Assert.assertTrue(Driver.get().getTitle().contains("mike"));
        }
}
