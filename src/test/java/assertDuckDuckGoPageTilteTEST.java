import org.testng.Assert;
import org.testng.annotations.Test;

public class assertDuckDuckGoPageTilteTEST extends testBase
{
    assertDuckDuckGoPageTitlePage assertDuckDuckGoPageTitlePageObject;

    @Test
    public void assertGooglePageTitle()
    {

        assertDuckDuckGoPageTitlePageObject = new assertDuckDuckGoPageTitlePage(driver);
        assertDuckDuckGoPageTitlePageObject.asserGooglePagetTitle();
        Assert.assertEquals(assertDuckDuckGoPageTitlePageObject.title,"Google");
    }


}
