import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 {
    @BeforeMethod
    public void beforeMethod() {
        System.err.println(getPrefix() + getClass().getName() + " triggered beforeMethod() on #" + Thread.currentThread().getId());
    }

    @Test(priority = 1, description = "SS1 Verify the login section")
    public void login() {
        System.err.println(getPrefix() + getClass().getName() + " triggered login() on #" + Thread.currentThread().getId());
    }

    @AfterMethod
    @Parameters("title")
    public void validate(String title) {
        System.err.println(getPrefix() + getClass().getName() + " triggered validate() with parameter [" + title + "] on #" + Thread.currentThread().getId());
    }
    @Test
    public void testthread5(){
        System.err.println(getPrefix() + getClass().getName() + " triggered method5 on #" + Thread.currentThread().getId());
    }
    @Test
    public void testthread6(){
        System.err.println(getPrefix() + getClass().getName() + " triggered method6 on #" + Thread.currentThread().getId());
    }

    private static String getPrefix() {
        ITestResult result = Reporter.getCurrentTestResult();
        String suiteName = result.getTestContext().getSuite().getName();
        String testTagName = result.getTestContext().getName();
        return "[Suite :<" + suiteName + ">, Test: <" + testTagName + "> ";
    }
}
