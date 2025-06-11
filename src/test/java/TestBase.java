import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase
{
    protected WebDriver driver;

   @BeforeMethod
   @Parameters({"browser"})
   public void setUp(@Optional("chrome") String browserName)
    {
        if (browserName.equals("chrome"))
        {
            ChromeOptions options;
            options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
        }
        else if (browserName.equals("firefox"))
        {
            FirefoxOptions options;
            options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }
    }

    @AfterMethod
    public void closeBrowser()
    {
            driver.quit();
    }
}
