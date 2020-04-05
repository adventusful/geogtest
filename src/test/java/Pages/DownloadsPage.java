package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadsPage extends BasePage {
    public DownloadsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Download")
    protected WebElement lnkJavaDownloads;

    @FindBy(xpath = "//h1[contains(text(), 'Downloads')]")
    protected WebElement hdrPageDownloads;

    public boolean isOpen() {
        wait.until(ExpectedConditions.visibilityOf(hdrPageDownloads));
        return hdrPageDownloads.isDisplayed();
    }

    public void getJavaLinkFromTable() {
        moveToElement(lnkJavaDownloads).click();
    }

}
