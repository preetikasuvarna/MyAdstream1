package pageObjects;

import helpers.MenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Preetika.Suvarna on 15/05/2017.
 */
public class PeopleDirectoryPage extends MenuPage {
    WebDriver driver;
    By pageTitle = By.className("container-title");

    public PeopleDirectoryPage(WebDriver driver) {
        this.driver = driver;
    }

//    public String getPageTitle() {
//        return driver.findElement(pageTitle).getText();
//    }
}
