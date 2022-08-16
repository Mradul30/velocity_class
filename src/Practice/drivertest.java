package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivertest {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
//		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
//		
		Thread.sleep(1000);
//		
//		//driver.manage().window().minimize();
//		
//        driver.quit();
         System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
		
		
	}

}
