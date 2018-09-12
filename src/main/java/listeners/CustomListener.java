package listeners;

import com.gurock.testrail.TestrailConnector;
import deflogger.TestsLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {


    public void onTestStart(ITestResult iTestResult) {
        TestsLogger.startTestCase(iTestResult.getMethod().getDescription());

    }

    public void onTestSuccess(ITestResult iTestResult) {
        int resultId = 1;
        String comment = "test passed" + iTestResult.getName() + "\n";
        String testCaseId = iTestResult.getMethod().getDescription();
        long duration = (iTestResult.getEndMillis() - iTestResult.getStartMillis())/1000;
        TestrailConnector testrailConnector = new TestrailConnector("https://itstep092018.testrail.io", "markhelolya@gmail.com", "Zero20181987");
        testrailConnector.sendTestResult (testCaseId, resultId,comment, duration, "2");

    }

    public void onTestFailure(ITestResult iTestResult) {
        int resultId = 5;
        String comment = "test failed" + iTestResult.getName() + "\n";
        String testCaseId = iTestResult.getMethod().getDescription();
        long duration = (iTestResult.getEndMillis() - iTestResult.getStartMillis())/1000;
        TestrailConnector testrailConnector = new TestrailConnector("https://itstep092018.testrail.io", "markhelolya@gmail.com", "Zero20181987");
        testrailConnector.sendTestResult (testCaseId, resultId,comment, duration, "2");
    }

    public void onTestSkipped(ITestResult iTestResult) {

        int resultId = 2;
        String comment = "test blocked" + iTestResult.getName() + "\n";
        String testCaseId = iTestResult.getMethod().getDescription();
        long duration = (iTestResult.getEndMillis() - iTestResult.getStartMillis())/1000;
        TestrailConnector testrailConnector = new TestrailConnector("https://itstep092018.testrail.io", "markhelolya@gmail.com", "Zero20181987");
        testrailConnector.sendTestResult (testCaseId, resultId,comment, duration, "2");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
