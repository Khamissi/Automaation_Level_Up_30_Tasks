import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AssertFirstSearchResultPage extends PageBase
{
    Wait<WebDriver> wait;

    public AssertFirstSearchResultPage(WebDriver driver)
    {
        super(driver);
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NotFoundException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class);
    }



    String firstSearchResultLink;

    public void assertFirstSearchResult(String searchItem)
    {
        driver.navigate().to("http://duckduckgo.com/");
        By searchBoxLocator = By.id("searchbox_input");
        driver.findElement(searchBoxLocator).sendKeys(searchItem, Keys.ENTER);
        By firstSearchResultLocator = By.xpath("(//a[@data-testid='result-extras-url-link'])[1]");
        wait.until(d->d.findElement(By.xpath("(//a[@data-testid='result-extras-url-link'])[1]")).isDisplayed());
        firstSearchResultLink = driver.findElement(firstSearchResultLocator).getAttribute("href");
    }


}
