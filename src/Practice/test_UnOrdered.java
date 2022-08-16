package Practice;

import java.util.List;

import org.checkerframework.checker.units.qual.Current;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_UnOrdered {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(2000);
		
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(result.size());
		
		for(WebElement r:result) // To see the console
		{
			System.out.println(r.getText());
			
		}
		 Thread.sleep(2000);
		for(WebElement r:result) // to click specific item--->honda shine
			 
			
		{
			String expectedResult = "honda amaze"; 
 	 	 	String actualText=r.getText(); 
 	 	 	 
 	 	 	 
 	 	 	if(actualText.equals(expectedResult)) 
 	 	 	{ 
 	 	 	 	r.click();  	 	
 	 	 	 	break; 
 	 	 	 	 
 	 	 	} 
		}
		
		

	}

}
