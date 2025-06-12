import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDragAndDropTest extends TestBase
{
    AssertDragAndDropPage assertDragAndDropPageObject;

    @Test
    public void dragAndDropTestMethod()
    {
        assertDragAndDropPageObject = new AssertDragAndDropPage(driver);
        assertDragAndDropPageObject.assertDragAndDropMethod();
        Assert.assertEquals(assertDragAndDropPageObject.actualDropedFieldText, "Dropped!");
    }
}
