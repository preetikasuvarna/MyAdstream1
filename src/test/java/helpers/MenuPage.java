package helpers;

import org.openqa.selenium.By;

import static helpers.TestDriver.driver;

/**
 * Created by Preetika.Suvarna on 16/05/2017.
 */
public class MenuPage {

    By pageTitle = By.cssSelector("#breadcrumb_bg span#crumbTrail_repCrumb_lblCrumb_1");
    By homePageTitle = By.cssSelector("#breadcrumb_bg span#crumbTrail_repCrumb_lblCrumb_0");
    By crumbTrail2 = By.cssSelector("#breadcrumb_bg span#crumbTrail_repCrumb_lblCrumb_2");

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public String getHomePageTitle() {
        return driver.findElement(homePageTitle).getText();
    }

    public String getCrumbTrail() {
        return driver.findElement(crumbTrail2).getText();
    }
}
