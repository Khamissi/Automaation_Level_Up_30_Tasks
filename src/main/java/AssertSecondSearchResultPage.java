import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class AssertSecondSearchResultPage extends PageBase
{
    Wait<WebDriver> wait;

    public AssertSecondSearchResultPage (WebDriver driver)
    {
        super(driver);
        wait = new org.openqa.selenium.support.ui.FluentWait<>(driver)
                .withTimeout(java.time.Duration.ofSeconds(30))
                .pollingEvery(java.time.Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NotFoundException.class)
                .ignoring(org.openqa.selenium.StaleElementReferenceException.class)
                .ignoring(org.openqa.selenium.ElementNotInteractableException.class);
    }

    String secondSearchResultLink;
    public void assertSecondSearchResult(String searchItem)
    {
        driver.navigate().to("https://duckduckgo.com/");
        By searchBoxLocator = By.id("searchbox_input");
        driver.findElement(searchBoxLocator).sendKeys(searchItem, Keys.ENTER);
        By secondSearchResultLocator = By.xpath("(//a[@data-testid='result-extras-url-link'])[2]");
        wait.until(d -> d.findElement(secondSearchResultLocator).isDisplayed());
        secondSearchResultLink = driver.findElement(secondSearchResultLocator).getAttribute("href");
    }


}
