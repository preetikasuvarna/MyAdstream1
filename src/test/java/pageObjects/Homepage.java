package pageObjects;

import helpers.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by preetika.suvarna on 20/04/2017.
 */
public class Homepage {
    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    By homeLink = By.id("lnkHome");
    By userNotificationsLink = By.id("Notifications");
    By seeAllNotificationsLink = By.cssSelector("#NotificationsContainer a.pull-right");


    public boolean isHomePageDisplayed() {
        return driver.findElement(homeLink).isDisplayed();
    }

    public void openUserNotifications() {
        driver.findElement(userNotificationsLink).click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);
        driver.findElement(seeAllNotificationsLink).click();
    }

}
