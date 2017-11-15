package pageObjects;

import helpers.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Preetika.Suvarna on 19/05/2017.
 */
public class EventPage extends BasePageObject {
    WebDriver driver;
    By commentInput = By.cssSelector("#timelineEvent .mention");
    By postButton = By.cssSelector("#timelineEvent a.btn-primary");
    BasePageObject basePageObject;

    String commentText = "#timelineEvent div.tl-eventcard:nth(%s) li.tl-action-sgl span";


    public EventPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterCommentForEvent(String comment) {

        driver.findElement(commentInput).sendKeys(comment);
    }

    public void clickPost() {
        driver.findElement(postButton).click();
        basePageObject.waitForJSandJQueryToLoad();
    }

    public String getComment(int rowNumber) {
        WebDriverWait wait = new WebDriverWait(driver,20);
        By commentTextId = By.cssSelector(String.format(commentText, rowNumber));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(commentTextId));
        System.out.println("Comment CSS: " + commentTextId.toString());
        return driver.findElement(commentTextId).getText();
    }

    public String getLastComment() {
        return "";
    }

    public void getFirstComment() {

    }

    public String getCommentByText() {
        return "";
    }

    public String checkCommentAdded() {
        return "";
    }
}


