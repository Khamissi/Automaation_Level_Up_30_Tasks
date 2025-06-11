import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertCheckBoxesTest extends TestBase
{
    AssertCheckBoxesPage assertCheckBoxesPageObject;

    @Test
    public void testAssertCheckBoxes()
    {
        assertCheckBoxesPageObject = new AssertCheckBoxesPage(driver);
        assertCheckBoxesPageObject.assertCheckBoxes();
        Assert.assertTrue(assertCheckBoxesPageObject.isCheckbox1Selected, "Checkbox 1 not selected");
        Assert.assertTrue(assertCheckBoxesPageObject.isCheckbox2Selected, "Checkbox 2 not selected");
    }
}
