package TestNGStudy;

import org.testng.annotations.Test;

import bsh.This;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGAnnotations 
{
  @Test
  public void annotationTest() 
  {
	  Reporter.log("This is @test & I'm no. 4" ,true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("this is @beforeMethod & I'm no. 3",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("this is @afterMethod & I'm no. 5",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("this is @beforeclass & I'm no. 2",true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("this is @afterclass & I'm no. 6",true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("this is @beforeTest & I'm no. 1",true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("this is @afterTest & I'm no. 7",true);
  }

}
