package FirstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
	
	public static void main(String []args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.navigate().refresh();
	}
	

}
