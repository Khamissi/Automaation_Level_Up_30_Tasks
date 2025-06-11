import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFourthSearchResultMozillaTest extends TestBase
{
    AssertFourthSearchResultMozillaPage assertFourthSearchResultPageObject;

    @Test
    public void assertFirstSearchResult()
    {
        assertFourthSearchResultPageObject = new AssertFourthSearchResultMozillaPage(driver);
        assertFourthSearchResultPageObject.assertFourthSearchResult("TestNG");
        Assert.assertEquals(assertFourthSearchResultPageObject.fourthSearchResultText,"TestNG Tutorial");
    }
}
