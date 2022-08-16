package DynamicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartReviews {

	public static void main(String[] args) throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			//for pop up
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(1000);
			
			//to put value in search bar
			driver.findElement(By.name("q")).sendKeys("Washing Machine");
			Thread.sleep(1000);
			
			//to click on search button
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			
			//to get reviews
			WebElement review = driver.findElement(By.xpath("(((//div[@class='col col-7-12'])[1])//span)[6]"));
			
			System.out.println("Reviews for this washing machine is "+review.getText());
			

	}

}
