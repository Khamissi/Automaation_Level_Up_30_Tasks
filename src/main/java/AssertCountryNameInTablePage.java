import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class AssertCountryNameInTablePage extends PageBase
{
    Wait<WebDriver> wait;
    public AssertCountryNameInTablePage(WebDriver driver)
    {
        super(driver);
        wait = new org.openqa.selenium.support.ui.FluentWait<>(driver)
                .withTimeout(java.time.Duration.ofSeconds(30))
                .pollingEvery(java.time.Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NotFoundException.class)
                .ignoring(org.openqa.selenium.StaleElementReferenceException.class)
                .ignoring(org.openqa.selenium.ElementNotInteractableException.class);
    }

    String actualCountry;
    public void assertCountryName(String companyName)
    {
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        By countryNameLocator = By.xpath("//table[@id='customers']//td[contains(text(), '"+companyName+"')]/following-sibling::td[2]");
        wait.until(d -> d.findElement(countryNameLocator).isDisplayed());
        actualCountry = driver.findElement(countryNameLocator).getText();

    }


}
