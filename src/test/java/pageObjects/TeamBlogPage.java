package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Preetika.Suvarna on 22/07/2017.
 */
public class TeamBlogPage {
    WebDriver driver;

    By addNewPostButton = By.id("body_hypAddNewPost");
    By blogTitleInput = By.id("body_txtTitle_ELEMENT_FIELD");
    By saveButton = By.cssSelector(".form-actions .btnSave");
    By blogTitle = By.cssSelector(".teamblog h3");
    String blogTitleText = "";



    public TeamBlogPage(WebDriver driver){
        this.driver = driver;
    }

    public void createTeamBlog() {
        driver.findElement(addNewPostButton).click();

    }

    public void enterBlogTitle(String title) {
        driver.findElement(blogTitleInput).sendKeys(title);
        blogTitleText = title;
    }

    public void clickSave(){
        driver.findElement(saveButton).click();
    }

    public String getLatestBlogTitle() {
        return driver.findElement(blogTitle).getText();
    }

    public String getBlogTitle() {
        return blogTitleText;
    }

}
