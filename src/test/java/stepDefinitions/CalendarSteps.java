package stepDefinitions;

import controller.RestExecutor;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BaseStep;
import org.openqa.selenium.WebDriver;
import pageObjects.EventPage;
import pageObjects.TeamHomepage;

/**
 * Created by Preetika.Suvarna on 18/05/2017.
 */
public class CalendarSteps {

    BaseStep baseStep;
    TeamHomepage teamHomepage;
    RestExecutor restExecutor;
    WebDriver driver;
    EventPage eventPage;

    public CalendarSteps(BaseStep baseStep) {
        this.baseStep = baseStep;
        this.teamHomepage = new TeamHomepage(baseStep.getDriver());
        driver = baseStep.getDriver();
        this.eventPage = new EventPage(baseStep.getDriver());

    }

    @When("^opens calendar event$")
    public void opens_calendar_event() {
        teamHomepage.clickOnSubMenu("Calendar");

    }

    @Then("^the right calendar event must be opened$")
    public void the_right_calendar_event_must_be_opened() {
        restExecutor = new RestExecutor(driver.getCurrentUrl());
        restExecutor.get("").expectCode(200).expectMessage("OK");
    }

    @When("^add a comment to the event as '(.*)'$")
    public void add_a_comment_to_the_event(String comment) {
        eventPage.enterCommentForEvent(comment);
        eventPage.clickPost();
    }

    @Then("^the comment must be successfully added$")
    public void the_comment_must_be_successfully_added() {
        String expected = eventPage.getComment(0);
        System.out.println("Expected Result: " + expected);
    }

}
