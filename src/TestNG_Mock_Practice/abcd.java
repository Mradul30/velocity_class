package TestNG_Mock_Practice;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerStudy.Listner.class)
public class abcd {
  @Test
  public void fall() 
  {
	  Reporter.log("this is simple",true);
  }
  
  
}
