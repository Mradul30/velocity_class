package pop_ups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
        
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		//for single id (main page)
		String singleID = driver.getWindowHandle();
		System.out.println(singleID);
		
		//for multiple id
		Set<String> multipleID = driver.getWindowHandles();
		System.out.println(multipleID);
		
		//
		ArrayList<String> al= new ArrayList<String>(multipleID);
		String newID_mainPage=al.get(0);
		String ChildPage = al.get(1);
		System.out.println(ChildPage);
		System.out.println(newID_mainPage);
		
		//switching focus to child browser
		driver.switchTo().window(ChildPage);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.close();
		
		//focus to main page
		driver.switchTo().window(newID_mainPage);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		String newpageID = driver.getWindowHandle();
		System.out.println(newpageID);
		
		driver.switchTo().window(newpageID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='About me'])[4]")).click();
		
	}

}
