import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDuckDuckGoPageTilteTest extends TestBase
{
    AssertDuckDuckGoPageTitlePage assertDuckDuckGoPageTitlePageObject;

    @Test
    public void assertGooglePageTitle()
    {

        assertDuckDuckGoPageTitlePageObject = new AssertDuckDuckGoPageTitlePage(driver);
        assertDuckDuckGoPageTitlePageObject.asserGooglePagetTitle();
        Assert.assertEquals(assertDuckDuckGoPageTitlePageObject.title,"Google");
    }


}
