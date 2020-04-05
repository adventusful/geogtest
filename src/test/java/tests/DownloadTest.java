package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DownloadTest extends BaseTest {

    @Test
    public void testDownload() {
        assertTrue(mainPage.openDownloads()
        .isOpen(), "Downloads page is absent");
        downloadsPage.getJavaLinkFromTable();
    }
}
