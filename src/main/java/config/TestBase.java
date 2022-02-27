package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void prepareSuite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\krykow\\IdeaProjects\\TrainingAppOne\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://news.ladbrokes.com";
        driver.get(baseUrl);
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}