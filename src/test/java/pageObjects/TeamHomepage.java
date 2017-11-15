package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Preetika.Suvarna on 17/05/2017.
 */
public class TeamHomepage {
    WebDriver driver;

    By subMenuLink = By.cssSelector(".nav-list li a[title='%s']");

    public TeamHomepage(WebDriver driver){
        this.driver = driver;
    }

    public void test(){
        driver.getCurrentUrl();
    }

    public void clickOnSubMenu(String subMenuOption) {
        driver.findElement(By.cssSelector(".nav-list li a[title='"+subMenuOption+"']")).click();
        driver.findElement(By.cssSelector(".rsContentTable td div[title='Test Event 4'] ")).click();
    }
}
