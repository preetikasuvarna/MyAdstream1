package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BaseStep;
import helpers.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Homepage;
import pageObjects.LoginPage;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

/**
 * Created by preetika.suvarna on 19/04/2017.
 */
public class LoginSteps {
    LoginPage loginPage;
    Homepage homepage;
    BaseStep baseStep;
    WebDriver driver;

    public LoginSteps(BaseStep baseStep) {
         this.baseStep = baseStep;
        this.loginPage = new LoginPage(baseStep.getDriver());
        this.homepage = new Homepage(baseStep.getDriver());
    }

    @Before
    public void beforeScenario() throws FileNotFoundException {
        driver = this.baseStep.getDriver();
        String url = new PropertyReader().readProperty("url").trim();
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("this will run before the actual scenario");
    }
    @After
    public void afterScenario() {
        baseStep.destroyDriver();
        System.out.println("this will run after scneario is finished, even if it failed");
    }

    @Given("^Myadstream is open$")
    public void Myadstream_is_open() {
        // Express the Regexp above with the code you wish you had
//        throw new PendingException();

    }

    @Given("^a user is logged in$")
    public void a_user_is_logged_in() throws FileNotFoundException {
        // Express the Regexp above with the code you wish you had
        loginPage.loginAsUser(new PropertyReader().readProperty("username").trim(), new PropertyReader().readProperty("password").trim());
    }

    @When("^I enter username as '(.*)'$")
    public void I_enter_username(String username) {
        // Express the Regexp above with the code you wish you had
        loginPage.enterUsername(username);
    }

    @When("^I enter password as '(.*)'$")
    public void I_enter_password(String password) {
        // Express the Regexp above with the code you wish you had
        loginPage.enterPassword(password);
    }

    @When("^click on login$")
    public void click_on_login() {
        // Express the Regexp above with the code you wish you had
        loginPage.clickLoginButton();
    }

    @Then("^the user login must be successful$")
    public void the_user_login_must_be_successful() {
        // Express the Regexp above with the code you wish you had
        Assert.assertTrue("Homepage is not displayed", homepage.isHomePageDisplayed());
    }

    @Then("^an error message must be displayed as '(.*)'$")
    public void an_error_message_must_be_displayed_as_The_user_name_or_password_provided_is_incorrect_(String errorMessage) throws Throwable {
        // Express the Regexp above with the code you wish you had
    Assert.assertEquals("Error message not as expected", errorMessage, loginPage.getErrorMessage() );
    }

}
