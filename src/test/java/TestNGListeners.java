import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

    @Override
    public void  onTestStart(ITestResult result){
        System.out.println("Test started: " + result.getName());
    }
}
