import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase
{
    protected WebDriver driver;

   @BeforeMethod
    public void setUpChrome()
    {
        ChromeOptions options;
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @BeforeMethod
    public void setUpMozilla()
    {
        FirefoxOptions options;
        options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
    }

    @AfterMethod
    public void closeBrowser()
    {
            driver.quit();
    }
}
