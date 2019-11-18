package FirstPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByConcept {
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		// Get the total link/button <button> tag/input field <input> tag in the page and get the text of the links
		List <WebElement> link=driver.findElements(By.tagName("a"));
		
		//Get the total link count
		System.out.println(link.size());
		
		//Print the links
		for(int i=0;i<link.size();i++)
		{
			System.out.println(link.get(i).getText());
		}
		
		
		
	}

}
