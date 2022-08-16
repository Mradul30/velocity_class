package KiteSite;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUserIDexce
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		File myFile=new File("D:\\Velocity\\POI_EXCEL\\Book1.xlsx");
		
		
		
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		Login.click();
		
		Thread.sleep(2000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		Continue.click();
		
		Thread.sleep(1000);
		
		WebElement uID = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String absolute = uID.getText();
		String relative = "ELR321";
		
		if(absolute.equals(relative))
		{
			System.out.println("as absolute and relative id is same so TC is pass");
		}
		else
		{
			System.out.println("TC is fail");
		}
		uID.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();

	}

}
