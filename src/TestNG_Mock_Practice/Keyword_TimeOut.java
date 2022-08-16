package TestNG_Mock_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_TimeOut {
	@Test(priority=5)
	public void atest_method_9() 
	{
		  Reporter.log("This is test-2", true);
	}
	@Test(timeOut=5000)
	public void test_method_3() throws InterruptedException 
	{
		Thread.sleep(10000);
		  Reporter.log("This is test-3", true);
	}
	@Test 
	public void test_method_4() 
	{
		  Reporter.log("This is test-4", true);
	}

	@Test
	  public void test_method_1() 
	  {
		  Reporter.log("This is test-1", true);
	  }

}
