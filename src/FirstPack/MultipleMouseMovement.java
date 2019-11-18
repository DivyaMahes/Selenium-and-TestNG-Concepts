package FirstPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleMouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		
		//driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-9']"))).build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-13']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='ui-id-16']")).click();

	}

}
