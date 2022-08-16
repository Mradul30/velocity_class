package Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class amazon_site {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
        WebElement section = driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File trg = new File("D:\\Velocity\\Selenium screenshots\\amazon.jpg");
        FileHandler.copy(src, trg);
        
        
	}

}
