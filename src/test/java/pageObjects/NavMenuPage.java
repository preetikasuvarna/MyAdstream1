package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Preetika.Suvarna on 05/05/2017.
 */
public class NavMenuPage {
    public enum MENU_ITEMS {
        ADSTREAMERS, NEWS_AND_EVENTS, RESOURCE_CENTRE, MY_TEAMS,
        ADCHAT, I_WANT_TO, ADLINKS, HELP_ME
    }

    WebDriver driver;
    By navigationBar = By.id("navbarinner");

    public NavMenuPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnMenuItem(MENU_ITEMS item) {
        switch(item) {
            case ADSTREAMERS: driver.findElement(navigationBar).findElement(By.linkText("Adstreamers")).click();
            break;
            case NEWS_AND_EVENTS: driver.findElement(navigationBar).findElement(By.linkText("News & Events")).click();
                break;
            case RESOURCE_CENTRE: driver.findElement(navigationBar).findElement(By.linkText("Resource Centre")).click();
                break;
            case MY_TEAMS: driver.findElement(navigationBar).findElement(By.linkText("My Teams")).click();
                break;
            case ADCHAT: driver.findElement(navigationBar).findElement(By.linkText("AdChat")).click();
                break;
            case I_WANT_TO: driver.findElement(navigationBar).findElement(By.linkText("I Want To...")).click();
                break;
            case ADLINKS: driver.findElement(navigationBar).findElement(By.linkText("AdLinks")).click();
                break;
            case HELP_ME: driver.findElement(navigationBar).findElement(By.linkText("Help Me!")).click();
                break;
            default:
                throw new IllegalArgumentException("Menu item not found");
        }
    }

    public void sideMenuItem(String menuItem) {
        driver.findElement(By.cssSelector(".nav-list li a[title='"+menuItem+"']")).click();
    }
}
