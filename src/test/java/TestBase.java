import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase
{
    protected WebDriver driver;

   @BeforeMethod
    public void setUp()
    {
        ChromeOptions options;
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        options.setImplicitWaitTimeout(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void closeBrowser()
    {
            driver.quit();
    }
}
