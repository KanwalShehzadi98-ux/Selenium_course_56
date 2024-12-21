package video462;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;    //UI of the report
	public ExtentReports extent;                 //Populate common info of the report
	public ExtentTest test;						 //Creating test case entries in the report
	
	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video462\\Report.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Kanwal");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser Name", "Chrome");
	}
	

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case PASSED is:"+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:"+result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is:"+result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:"+result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}
