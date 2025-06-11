import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSecondSearchResultTest extends TestBase
{
    AssertSecondSearchResultPage assertSecondSearchResultPageObject;

    @Test
    public void assertSecondSearchResult()
    {
        assertSecondSearchResultPageObject =new AssertSecondSearchResultPage(driver);
        assertSecondSearchResultPageObject.assertSecondSearchResult("Cucumber IO");
        Assert.assertTrue(assertSecondSearchResultPageObject.secondSearchResultLink.contains("https://www.linkedin.com"));
    }

}
