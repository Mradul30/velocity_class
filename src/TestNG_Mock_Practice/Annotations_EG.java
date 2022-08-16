package TestNG_Mock_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotations_EG {
  @Test(invocationCount = 1)
  public void test_method() 
  {
	  Reporter.log("This is test-4", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("This is before Method-3", true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("This is after method-5", true);
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("This is before class-2", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("This is after class-6", true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("This is before test-1", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("This is after test-7", true);
  }
  
  @Test
  public void failtest()
  {
	  Reporter.log("this method is fail by me",true);
//	  Assert.fail();
  }

}
