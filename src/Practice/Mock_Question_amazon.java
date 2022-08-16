package Practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock_Question_amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
	       ChromeDriver driver = new ChromeDriver();
	
	       driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.findElement(By.id("nav-link-accountList"));
			Thread.sleep(2000);
			//Alter alt=Driver.switchTo.alert();
			
			
			

	}

}
