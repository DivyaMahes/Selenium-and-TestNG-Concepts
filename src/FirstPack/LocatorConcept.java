package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/ebayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		driver.findElement(By.name("firstname")).sendKeys("TestFirst");
		driver.findElement(By.id("lastname")).sendKeys("TestLast");
		driver.findElement(By.name("address1")).sendKeys("F58-Dharani Sugars");
		driver.findElement(By.name("address2")).sendKeys("Dharani Nagar");
		driver.findElement(By.name("city")).sendKeys("Mendota Heights");
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.partialLinkText("Sign")).click();
		//driver.findElement(By.cssSelector("#firstname")).sendKeys("dss");
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sdfs");
		//driver.findElement(By.className("ancAsb")).click();
		Select s=new Select(driver.findElement(By.id("state")));
		s.selectByVisibleText("Minnesota");
		driver.findElement(By.name("zip")).sendKeys("55111");
		driver.findElement(By.id("dayphone1")).sendKeys("678");
		driver.findElement(By.id("dayphone2")).sendKeys("232");
		driver.findElement(By.id("dayphone3")).sendKeys("7890");
		driver.findElement(By.name("email")).sendKeys("testrando@gmail.com");
		driver.findElement(By.name("retype_email")).sendKeys("testrando@gmail.com");
		driver.findElement(By.cssSelector("#userid")).sendKeys("TestAccount_123random");
		driver.findElement(By.name("pass")).sendKeys("Welcome@123");
		driver.findElement(By.name("rpass")).sendKeys("Welcome@123");
		Select secques=new Select(driver.findElement(By.id("SECRET_QUESTION")));
		secques.selectByVisibleText("What is your pet's name?");
		driver.findElement(By.name("myanswer")).sendKeys("Petname_Ruby");
		Select month=new Select(driver.findElement(By.name("birthdate2")));
		month.selectByVisibleText("October");
		Select date=new Select(driver.findElement(By.name("birthdate1")));
		date.selectByVisibleText("06");
		Select year=new Select(driver.findElement(By.name("birthdate3")));
		year.selectByVisibleText("1996");
		driver.findElement(By.cssSelector("#acceptq1")).click();
		//driver.findElement(By.className("btn")).click();
		
		
		
		
		
		
		
	
		
	 
	}

}
