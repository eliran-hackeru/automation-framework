package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Starting Test Suite...");
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Starting Test...");
    }

    @AfterTest
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Test Completed...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Test Suite Completed...");
    }
}
