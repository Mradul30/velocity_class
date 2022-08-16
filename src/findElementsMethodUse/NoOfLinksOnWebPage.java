package findElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
	    WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/"); 
 	 	//List<WebElement> links =
		List<WebElement> links =driver.findElements(By.tagName("a")); 
		//List<WebElement> links = driver.findElements("a");
 	 	System.out.println("Total number of links are "+links.size());

	}

}
