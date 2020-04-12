import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
    @BeforeMethod
    public void beforeMethod() {
        System.err.println(getPrefix() + getClass().getName() + " triggered beforeMethod() on #" + Thread.currentThread().getId());
    }

    @Test(priority = 1, description = "SR1 Verify item in mobile list page can be sorted by name")
    public void SR1() {
        System.err.println(getPrefix() + getClass().getName() + " triggered SR1() on #" + Thread.currentThread().getId());
    }

    @AfterMethod
    public void validate(){
        System.err.println(getPrefix() + getClass().getName() + " triggered validate() on #" + Thread.currentThread().getId());
    }

    private static String getPrefix() {
        ITestResult result = Reporter.getCurrentTestResult();
        String suiteName = result.getTestContext().getSuite().getName();
        String testTagName = result.getTestContext().getName();
        return "[Suite :<" + suiteName + ">, Test: <" + testTagName + "> ";
    }
}
