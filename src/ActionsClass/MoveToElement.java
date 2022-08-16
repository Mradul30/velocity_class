package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement
{

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//first we create object of action class
		
		Actions act=new Actions(driver);
		
		//then we find element
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
        
		//now we take action,click & perform
		
		//act.moveToElement(aboutus).click().build().perform();
		
		//now using webElement method
		
		act.click(aboutus).perform();
		
		WebElement retun_refund = driver.findElement(By.xpath("//a[text()='Return & Refund Policy']"));
	    
		act.moveToElement(retun_refund).click().build().perform();
		
		WebElement run = driver.findElement(By.xpath("(//a[contains(text(),'Velocity Foundation')])[1]"));
		Thread.sleep(1000);
		act.contextClick(run).perform();
		
	}

}
