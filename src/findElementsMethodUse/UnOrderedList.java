package findElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("https://google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		List<WebElement> results = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(results.size());
		Thread.sleep(2000);
		for(WebElement r:results) 
 	 	{ 
 	 	 	System.out.println(r.getText()); 
 	 	} 
		Thread.sleep(2000);
 	 	for(WebElement r:results)
 	 	{ 
 	 	 	String expectedResult = "honda amaze"; 
 	 	 	String actualText=r.getText(); 
 	 	 	 
 	 	 	 
 	 	 	if(actualText.equals(expectedResult)) 
 	 	 	{ 
 	 	 	 	r.click();  	 	
 	 	 	 	break; 
 	 	 	 	 
 	 	 	} 
 	 	 	 	 
 	 	} 
 	 	 
 	 	driver.findElement(By.linkText("Images")).click();


	}

}
