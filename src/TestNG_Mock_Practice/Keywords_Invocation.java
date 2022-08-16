package TestNG_Mock_Practice;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keywords_Invocation {
//	@BeforeMethod
//	public void before_M()
//	{
//		Reporter.log("hello world",true);
//	}
  @Test(invocationCount = 5)
  public void keywords_eg()
  {
	  Reporter.log("This is innvocation",true);
  }
}
