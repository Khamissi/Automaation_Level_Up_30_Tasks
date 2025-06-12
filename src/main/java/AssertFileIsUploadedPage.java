import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class AssertFileIsUploadedPage extends PageBase
{
    Wait<WebDriver> wait;

    public AssertFileIsUploadedPage (WebDriver driver)
    {
        super(driver);
        wait = new org.openqa.selenium.support.ui.FluentWait<>(driver)
                .withTimeout(java.time.Duration.ofSeconds(30))
                .pollingEvery(java.time.Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NotFoundException.class)
                .ignoring(org.openqa.selenium.StaleElementReferenceException.class)
                .ignoring(org.openqa.selenium.ElementNotInteractableException.class);
    }

    String uploadedFileSuccessMessage;
    String uploadedFilesName;
    public void assertFileIsUploadedMethod (String filePath)
    {
       driver.navigate().to("https://the-internet.herokuapp.com/upload");
       By fileInput = By.id("file-upload");
       driver.findElement(fileInput).sendKeys(filePath);
       By uploadButton = By.id("file-submit");
       driver.findElement(uploadButton).click();
       By uploadedFileTextLocator = By.xpath("(//h3)[1]");
       wait.until(d -> d.findElement(uploadedFileTextLocator).isDisplayed());
        uploadedFileSuccessMessage = driver.findElement(uploadedFileTextLocator).getText();
       By uploadedFilesNamesLocator = By.id("uploaded-files");
       uploadedFilesName = driver.findElement(uploadedFilesNamesLocator).getText();

    }
}
