import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AssertFourthSearchResultMozillaPage extends PageBase
{
    Wait<WebDriver> wait;
    public AssertFourthSearchResultMozillaPage(WebDriver driver)
    {
        super(driver);
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NotFoundException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class);
    }

    String fourthSearchResultText;
    public void assertFourthSearchResult(String searchItem)
    {
        driver.navigate().to("https://duckduckgo.com/");
        By searchBoxLocator = By.id("searchbox_input");
        driver.findElement(searchBoxLocator).sendKeys(searchItem, Keys.ENTER);
        By fourthSearchResult = By.xpath("(//a[@data-testid='result-extras-url-link'])[4]");
        wait.until(d -> d.findElement(fourthSearchResult).isDisplayed());
        fourthSearchResultText = driver.findElement(fourthSearchResult).getText();
    }
}
