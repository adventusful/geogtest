package tests;

import Pages.DownloadsPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.MyDriverFactory;

public class BaseTest {
    MainPage mainPage;
    DownloadsPage downloadsPage;

    protected WebDriver driver;
    String url = "https://selenium.dev/";

    @BeforeMethod
    void setUp() {
        driver = new MyDriverFactory().getDriver();
        driver.get(url);
        initPages(driver);
    }

    private void initPages(WebDriver driver) {
        mainPage = new MainPage(driver);
        downloadsPage = new DownloadsPage(driver);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
