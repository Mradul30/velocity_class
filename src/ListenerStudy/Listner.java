package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("this is failure method",true);
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("this is starting method",true);
		result.getName();
	}
	
	

}
