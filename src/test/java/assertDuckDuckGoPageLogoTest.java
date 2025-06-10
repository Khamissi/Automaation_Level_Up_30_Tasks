import org.testng.Assert;
import org.testng.annotations.Test;

public class assertDuckDuckGoPageLogoTest extends testBase
{
    assertDuckDuckGoPageLogoPage assertDuckDuckGoPageLogoPage;

    @Test
    public void assertDuckDuckGoPageLogo()
    {
        assertDuckDuckGoPageLogoPage = new assertDuckDuckGoPageLogoPage(driver);
        assertDuckDuckGoPageLogoPage.asserGooglePagetTitle();
        Assert.assertTrue(assertDuckDuckGoPageLogoPage.isLogoDisplayed);
    }
}
