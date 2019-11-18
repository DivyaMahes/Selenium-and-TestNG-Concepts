package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
        driver.findElement(By.name("email")).sendKeys("divya.m02468@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
	}

}
