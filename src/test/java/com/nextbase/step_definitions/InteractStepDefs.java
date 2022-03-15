package com.nextbase.step_definitions;

import com.nextbase.pages.InteractPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InteractStepDefs {
    InteractPage interactPage = new InteractPage();


    @Then("the user see employee Mike")
    public void the_user_see_employee_Mike() {

    }

    @When("the user click on the like")
    public void the_user_click_on_the_like() {
        interactPage.likeInput.click();
        BrowserUtils.waitFor(5);
    }


    @When("the user click on the unfollow")
    public void the_user_click_on_the_unfollow() {
        interactPage.unfollowInput.click();
        BrowserUtils.waitFor(3);
        Driver.get().navigate().refresh();
        BrowserUtils.waitFor(3);
    }


    @And("the user click on comment and add comment")
    public void theUserClickOnCommentAndAddComment() {

        interactPage.commentInput.click();
        BrowserUtils.waitFor(5);
        Driver.get().switchTo().frame(interactPage.iframe);
        interactPage.commentting.sendKeys("Hello");
        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(5);


    }

    @And("the user send the comment")
    public void theUserSendTheComment() {
      interactPage.sendInput.click();


    }

    @Then("like should be activated")
    public void likeShouldBeActivated() {
        Assert.assertTrue(interactPage.likeActive.isDisplayed());
        BrowserUtils.waitFor(3);


    }

    @Then("comment should be sended")
    public void commentShouldBeSended() {
        Assert.assertTrue(interactPage.commentActive.isDisplayed());
        BrowserUtils.waitFor(3);

    }

    @Then("follow button should be activated")
    public void followButtonShouldBeActivated() {
       Assert.assertFalse(interactPage.followUnfollow.isDisplayed());
       BrowserUtils.waitFor(3);

    }

    @And("the user can see the all other reviewers' comments on the home page")
        public void theUserCanSeeTheAllOtherReviewersCommentsOnTheHomePage() {
        Assert.assertTrue(interactPage.revieverComment.isDisplayed());
        BrowserUtils.waitFor(3);
        }

    @And("the user click on the like button")
    public void theUserClickOnTheLikeButton() {
        interactPage.revieverLikeButton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the like button should be activated")
    public void theLikeButtonShouldBeActivated() {
        Assert.assertTrue(interactPage.likeClicked.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @When("the user click on the comment")
    public void theUserClickOnTheComment() {
        interactPage.revieverReplyComment.click();
        BrowserUtils.waitFor(3);


        Driver.get().switchTo().frame(interactPage.secondIframe);
        interactPage.commenttingTwo.sendKeys("HelloHelloUsers--Whats-Up");
        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(3);
        interactPage.letsClickSendBtn.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the comment should be sended")
    public void theCommentShouldBeSended() {
        Assert.assertTrue(interactPage.commentSendingVrf.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @Then("the user click on reviewer's button")
    public void the_user_click_on_reviewer_s_button() {
        interactPage.reviewerbutton.click();
        BrowserUtils.waitFor(5);
    }

    @When("the user click on mike reviewer")
    public void theUserClickOnMikeReviewer() {
        interactPage.revieverClick.click();
        BrowserUtils.waitFor(5);

    }

    @And("the user should be able to see mike user's profile")
    public void theUserShouldBeAbleToSeeMikeUserSProfile() {
        Assert.assertTrue(interactPage.verifyingBtn.isDisplayed());
        BrowserUtils.waitFor(5);

    }

    @And("the user click on the star icon")
    public void theUserClickOnTheStarIcon() {
        interactPage.starIcon.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user click on the search button")
    public void theUserClickOnTheSearchButton() {
        interactPage.srchButn.click();
        BrowserUtils.waitFor(3);

    }

    @And("the user click on the favorites button")
    public void theUserClickOnTheFavoritesButton() {

        interactPage.favoritesbtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user should be able to see the post in the favorites")
    public void theUserShouldBeAbleToSeeThePostInTheFavorites() {
        Assert.assertTrue(interactPage.verification.isDisplayed());


    }

}