import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDuckDuckGoPageLogoTest extends TestBase
{
    AssertDuckDuckGoPageLogoPage assertDuckDuckGoPageLogoPage;

    @Test
    public void assertDuckDuckGoPageLogo()
    {
        assertDuckDuckGoPageLogoPage = new AssertDuckDuckGoPageLogoPage(driver);
        assertDuckDuckGoPageLogoPage.asserGooglePagetTitle();
        Assert.assertTrue(assertDuckDuckGoPageLogoPage.isLogoDisplayed);
    }
}
