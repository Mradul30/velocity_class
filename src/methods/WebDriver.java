package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver
{

	public static void main(String[] args) throws InterruptedException 
	{
               System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		       ChromeDriver driver = new ChromeDriver();
		
		       driver.get("https://www.google.in/");
				Thread.sleep(5000);
				
				//driver.close();
				
				//driver.manage().window().maximize();
				//navigate: this method is use to open an application, move forward, backward & refresh the webpage.
				 driver.navigate().to("https://www.facebook.com/");
				
				 Thread.sleep(2000);
//				
				 driver.navigate().back();
//				
				 Thread.sleep(2000);
//				
				 driver.navigate().forward();
//				 Thread.sleep(2000);
//				 driver.findElement(By.xpath("//input[@ID='email']")).sendKeys("abc@gmail.com");
//				 Thread.sleep(3000);
//				 driver.navigate().refresh();
//				 driver.quit();
//				//getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
//				String title = driver.getTitle();
//				System.out.println(driver.getTitle());
//				System.out.println(title);
//				//getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
//				String url = driver.getCurrentUrl();
//				System.out.println(url);
//				


	}

}
