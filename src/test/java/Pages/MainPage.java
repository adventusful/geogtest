package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText="Downloads")
    protected WebElement downloadLink;

    public DownloadsPage openDownloads() {
        downloadLink.click();
        return new DownloadsPage(driver);
    }
}
