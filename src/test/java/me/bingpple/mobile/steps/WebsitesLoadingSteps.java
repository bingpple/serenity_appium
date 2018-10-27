package me.bingpple.mobile.steps;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import me.bingpple.mobile.pages.BasePage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class WebsitesLoadingSteps extends ScenarioSteps {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Steps
    BasePage basePage;

    @Given("^user has launched Chrome browser$")
    public void userHasLaunchedChromeBrowser() {
        basePage.open();
    }

    @When("^user wants to load \"([^\"]*)\" $")
    public void userWantsToLoad(String url) {
        basePage.getDriver().navigate().to(url);
    }

    @Then("^\"([^\"]*)\" home page should be loaded$")
    public void homePageShouldBeLoaded(String url) {
        assertThat(basePage.getDriver().getCurrentUrl().contains(url));
    }

    @When("^user adds comment as \"([^\"]*)\"$")
    public void userAddsCommentAs(String keyword) {
        basePage.commentBox.sendKeys(keyword);
    }

    @When("^user clicks the send button$")
    public void userClicksTheSendButton() {
        basePage.getDriver().findElement(By.id("submit")).click();
    }
}
