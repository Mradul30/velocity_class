package TestNG_Mock_Practice;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class keywords_priority {

	    @Test
		public void test_method_5() 
		{
			  Reporter.log("This is atest-29999", true);
		}
		@Test
		public void test_method_3() 
		{
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
