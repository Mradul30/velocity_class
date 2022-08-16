package KiteSite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingKiteUser {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
//		driver.get("https://kite.zerodha.com/");
		
		Properties P= new Properties();
		
		FileInputStream FP=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_new\\Myproperties.properties");
		P.load(FP);
		
		String value= P.getProperty("URL");
		
		System.out.println(value);
		
		
		
//		WebElement UserID = driver.findElement(By.id("userid"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
//		
//		UserID.sendKeys("TG9951");
//		password.sendKeys("12345678");
//		Login.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement pin = driver.findElement(By.id("pin"));
//		WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
//		
//		pin.sendKeys("123456");
//		Continue.click();
//		
//		Thread.sleep(1000);
//		
//		WebElement uID = driver.findElement(By.xpath("//span[@class='user-id']"));
//		
//		String absolute = uID.getText();
//		String relative = "ELR321";
//		
//		if(absolute.equals(relative))
//		{
//			System.out.println("as absolute and relative id is same so TC is pass");
//		}
//		else
//		{
//			System.out.println("TC is fail");
//		}
//		uID.click();
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//a[@target='_self']")).click();
//		
		

	}

}
