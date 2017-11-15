package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataObjects.ContextDataObject;
import helpers.BaseStep;
import org.junit.Assert;
import pageObjects.*;

/**
 * Created by Preetika.Suvarna on 05/05/2017.
 */
public class HomePageSteps {
    LoginPage loginPage;
    NavMenuPage navMenuPage;
    BaseStep baseStep;
    PeopleDirectoryPage peopleDirectoryPage;
    TeamsDirectoryPage teamsDirectoryPage;
    ContextDataObject contextDataObject;
    Homepage homepage;

    public HomePageSteps(BaseStep baseStep, ContextDataObject contextDataObject) {
        this.baseStep = baseStep;
        this.contextDataObject = contextDataObject;
        this.loginPage = new LoginPage(baseStep.getDriver());
        this.navMenuPage = new NavMenuPage(baseStep.getDriver());
        this.peopleDirectoryPage = new PeopleDirectoryPage(baseStep.getDriver());
        this.teamsDirectoryPage = new TeamsDirectoryPage(baseStep.getDriver());
        this.homepage = new Homepage(baseStep.getDriver());
    }


    @When("^the user clicks on '(.*)' on the navigation menu$")
    public void the_user_clicks_on_Adstreamers_on_the_navigation_menu(String menuOption) throws Throwable {
        System.out.println("MENU OPTION: " + menuOption);
        contextDataObject.setLevel1State(true);
        if (menuOption.equalsIgnoreCase(String.valueOf(NavMenuPage.MENU_ITEMS.ADSTREAMERS))) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.ADSTREAMERS);
        } else if (menuOption.equalsIgnoreCase("News & events")) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.NEWS_AND_EVENTS);
        } else if (menuOption.equalsIgnoreCase("Resource centre")) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.RESOURCE_CENTRE);
        } else if (menuOption.equalsIgnoreCase("My Teams")) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.MY_TEAMS);
        } else if (menuOption.equalsIgnoreCase(String.valueOf(NavMenuPage.MENU_ITEMS.ADCHAT))) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.ADCHAT);
        } else if (menuOption.equalsIgnoreCase("I Want to...")) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.I_WANT_TO);
        } else if (menuOption.equalsIgnoreCase(String.valueOf(NavMenuPage.MENU_ITEMS.ADLINKS))) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.ADLINKS);
        } else if (menuOption.equalsIgnoreCase("Help Me!")) {
            navMenuPage.clickOnMenuItem(NavMenuPage.MENU_ITEMS.HELP_ME);
        } else throw new IllegalArgumentException("Menu option doesn't exist");
    }

    @Then("^the user is redirected to '(.*) *'$")
    public void the_user_is_redirected_to_People_Directory(String pageTitle) {
        if (pageTitle.equalsIgnoreCase("Home")) {
            Assert.assertEquals("Page title not as expected", pageTitle, peopleDirectoryPage.getHomePageTitle());
        } else if (contextDataObject.getLevel2State() == false) {
            contextDataObject.setLevel2(true);
            Assert.assertEquals("Page title not as expected", pageTitle, peopleDirectoryPage.getPageTitle());
        } else if (contextDataObject.getLevel3State() == false) {
            contextDataObject.setLevel3State(true);
            Assert.assertEquals("Page title not as expected", pageTitle, peopleDirectoryPage.getCrumbTrail());
        }
    }

    @When("^the user clicks on notifications$")
    public void the_user_clicks_on_notifications() {
        contextDataObject.setLevel1State(true);
        homepage.openUserNotifications();
    }

}