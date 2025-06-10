import org.openqa.selenium.WebDriver;

public class AssertDuckDuckGoPageTitlePage extends PageBase
{
    public AssertDuckDuckGoPageTitlePage(WebDriver driver)
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
