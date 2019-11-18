package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomizeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
	    //driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
		driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-autocomplete-')]")).sendKeys("Java");
	
		 Select s=new Select(driver.findElement(By.id("gh-cat")));
		 s.selectByVisibleText("Art");
		    
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
	   
	}

}
