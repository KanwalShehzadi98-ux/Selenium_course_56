package video46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	  public void onStart(ITestContext context) {
	        System.out.println("On start method");
	  }

	  public void onTestStart(ITestResult result) {
		    System.out.println("On test start method");
	  }
	
	  public void onTestSuccess(ITestResult result) {
		    System.out.println("On test success method");
	  }

	  public void onTestFailure(ITestResult result) {
		    System.out.println("On test failure method");
	  }
	 
	  public void onTestSkipped(ITestResult result) {
		    System.out.println("On test skipped method");
	  }

	  public void onFinish(ITestContext context) {
		    System.out.println("On test finish method");
	  }
}
