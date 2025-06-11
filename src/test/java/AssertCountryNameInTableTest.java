import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertCountryNameInTableTest extends TestBase {
    AssertCountryNameInTablePage assertCountryNameInTablePageObject;

    @Test
    public void assertCountryNameTest()
    {
        assertCountryNameInTablePageObject = new AssertCountryNameInTablePage(driver);
        assertCountryNameInTablePageObject.assertCountryName("Ernst Handel");
        Assert.assertEquals(assertCountryNameInTablePageObject.actualCountry,"Austria");
    }
}
