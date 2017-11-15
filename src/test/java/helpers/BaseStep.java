package helpers;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

/**
 * Created by Preetika.Suvarna on 04/05/2017.
 */
public class BaseStep extends TestDriver{
        protected WebDriver driver;

        @Before
        public void beforeScenario() throws FileNotFoundException {
            driver = getDriver();
            driver.get(new PropertyReader().readProperty("url"));
            driver.manage().window().maximize();
            System.out.println("this will run before the actual scenario");
        }
        @After
        public void afterScenario() {
            destroyDriver();
            System.out.println("this will run after scneario is finished, even if it failed");
        }
        /*
        @Before("@Signup-DataDriven")
        public void signupSetup() {
            System.out.println("This should run everytime before any of the @Signup-DataDr
                    iven tagged scenario is going to run");
        }
        @After("@Signup-DataDriven")
        public void signupTeardown() {
            System.out.println("This should run everytime after any of the @Signup-DataDri
                    ven tagged scenario has run");
        }
        */
    }
