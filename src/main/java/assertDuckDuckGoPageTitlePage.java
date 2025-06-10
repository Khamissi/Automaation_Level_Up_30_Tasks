import org.openqa.selenium.WebDriver;

public class assertDuckDuckGoPageTitlePage extends pageBase
{
    public assertDuckDuckGoPageTitlePage(WebDriver driver)
    {
        super(driver);
    }

    String title;
    public void asserGooglePagetTitle()
    {
        driver.navigate().to("http://duckduckgo.com/");
        title = driver.getTitle();
    }
}
