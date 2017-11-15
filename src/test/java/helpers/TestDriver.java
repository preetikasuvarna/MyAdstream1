package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileNotFoundException;

/**
 * Created by Preetika.Suvarna on 04/05/2017.
 */
public class TestDriver {
    protected static WebDriver driver;

    public TestDriver() {
        try {
            initialize();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void initialize() throws FileNotFoundException {
        if (driver == null)
            createNewDriverInstance();
    }
    private void createNewDriverInstance() throws FileNotFoundException {
        String browser = new PropertyReader().readProperty("browser").trim();
        System.out.println("PRINT BROWSER: " + browser);
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Installables/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else {
            System.out.println("can't read browser type");
        }
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}

