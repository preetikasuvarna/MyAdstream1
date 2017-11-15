package pageObjects;

import helpers.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by preetika.suvarna on 19/04/2017.
 */
public class LoginPage {
    WebDriver driver;

    //elements
    By loginInput = By.id("Username");
    By passwordInput = By.id("Password");
    By loginButton = By.id("loginbtn");
    By errorMessage = By.cssSelector("div.validation-summary-errors ul li");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(loginInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void loginAsUser(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
