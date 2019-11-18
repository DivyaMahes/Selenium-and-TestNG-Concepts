package FirstPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1)
	public void titleCheck()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void imgCheck()
	{
		boolean imgcheck=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("imgcheck:"+imgcheck);
		
	}
	
	@Test(priority=1)
	public void buttonCheck()
	{
		boolean check=driver.findElement(By.xpath("//input[@name='btnk']")).isEnabled();
		System.out.println("Buttoncheck"+check);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
