import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssertDuckDuckGoPageLogoPage extends PageBase
{
    public AssertDuckDuckGoPageLogoPage(WebDriver driver)
    {
        super(driver);
    }

    boolean isLogoDisplayed;
    public void asserGooglePagetTitle()
    {
        driver.navigate().to("http://duckduckgo.com/");
        By logoLocator = By.xpath("//div[contains(@class,'headerWrapDesktop')]//img");
        isLogoDisplayed = driver.findElement(logoLocator).isDisplayed();
    }
}
