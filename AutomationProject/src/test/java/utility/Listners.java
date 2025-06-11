package utility;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listners implements ITestListener {

    public ExtentSparkReporter reporter;
    public ExtentReports reports;
    public ExtentTest extentTest;
    public String path;

    public Listners(){
        path="C:\\Users\\riyad\\IdeaProjects\\AutomationProject\\src\\test\\java\\utility\\report.html";
        reporter=new ExtentSparkReporter(path);
        reporter.config().setReportName("Diya Desai");
        reporter.config().setTheme(Theme.DARK);
        reports=new ExtentReports();
        reports.attachReporter(reporter);

    }

    @Override
    public void onFinish(ITestContext context) {

        reports.flush();

    }

    @Override
    public void onStart(ITestContext context) {
        reports.setSystemInfo("QA","1.0");

    }


    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }


    @Override
    public void onTestSuccess(ITestResult result) {

        extentTest.log(Status.PASS,result.getMethod().getMethodName());

    }

    @Override
    public void onTestStart(ITestResult result) {

        extentTest=reports.createTest(result.getMethod().getMethodName());

    }
}
