package pageObjects;

import helpers.MenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Preetika.Suvarna on 15/05/2017.
 */
public class TeamsDirectoryPage extends MenuPage{
    WebDriver driver;
    By pageTitle = By.cssSelector(".container-title h1");

    //Side Menu elements


    public TeamsDirectoryPage(WebDriver driver) {
        this.driver = driver;
    }

//    public String getPageTitle() {
//        return driver.findElement(pageTitle).getText();
//    }

    public void clickOpenTeam(String teamName) {
        driver.findElement(By.linkText(teamName)).click();
    }


}
