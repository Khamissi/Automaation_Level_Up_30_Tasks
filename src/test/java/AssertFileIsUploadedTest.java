import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class AssertFileIsUploadedTest extends TestBase
{
    AssertFileIsUploadedPage assertFileIsUploadedPageObject;

    @Test
    public void uploadFileTestMethod()
    {
        assertFileIsUploadedPageObject = new AssertFileIsUploadedPage(driver);
        File fileActualPath = new File("C:\\Users\\ahmed\\Desktop\\target.png");
        assertFileIsUploadedPageObject.assertFileIsUploadedMethod(fileActualPath.getAbsolutePath());
        System.out.println(fileActualPath.getAbsolutePath());
        Assert.assertEquals(assertFileIsUploadedPageObject.uploadedFileSuccessMessage,"File Uploaded!");
        Assert.assertEquals(assertFileIsUploadedPageObject.uploadedFilesName,"target.png");

    }



}
