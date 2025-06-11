import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssertCheckBoxesPage extends PageBase
{
    public AssertCheckBoxesPage(WebDriver driver)
    {
        super(driver);
    }

    boolean isCheckbox1Selected;
    boolean isCheckbox2Selected;
    public void assertCheckBoxes() {
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        By firstCheckboxLocator = By.xpath("(//input[@type='checkbox'])[1]");
        By secondCheckboxLocator = By.xpath("(//input[@type='checkbox'])[2]");

        if (!driver.findElement(firstCheckboxLocator).isSelected())
        {
            driver.findElement(firstCheckboxLocator).click();
        }
        if (!driver.findElement(secondCheckboxLocator).isSelected())
        {
            driver.findElement(secondCheckboxLocator).click();
        }
        isCheckbox1Selected = driver.findElement(firstCheckboxLocator).isSelected();
        isCheckbox2Selected = driver.findElement(secondCheckboxLocator).isSelected();
    }
}
