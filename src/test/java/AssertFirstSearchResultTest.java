import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFirstSearchResultTest extends TestBase
{
    AssertFirstSearchResultPage assertFirstSearchResultPageObject;

    @Test
    public void assertFirstSearchResult()
    {
        assertFirstSearchResultPageObject = new AssertFirstSearchResultPage(driver);
        assertFirstSearchResultPageObject.assertFirstSearchResult("Selenium WebDriver");
        Assert.assertEquals(assertFirstSearchResultPageObject.firstSearchResultLink,"https://www.selenium.dev/documentation/webdriver/");


    }
}
