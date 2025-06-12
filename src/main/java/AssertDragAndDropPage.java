import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AssertDragAndDropPage extends PageBase
{
    public AssertDragAndDropPage(WebDriver driver)
    {
        super(driver);
    }

    String actualDropedFieldText;
    public void assertDragAndDropMethod()
    {
        driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
        By drageFromLocator = By.xpath("//div[@id = 'draggable']");
        By dropToLocator = By.xpath("//div[@id = 'droppable']");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(drageFromLocator), driver.findElement(dropToLocator)).build().perform();
        actualDropedFieldText = driver.findElement(dropToLocator).getText();

    }


}
