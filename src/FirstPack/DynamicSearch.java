package FirstPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("testing");
		
		Thread.sleep(5000);
		
		List<WebElement> lis=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println(lis.size());
		
		for(int i=0;i<lis.size();i++)
		{
			System.out.println(lis.get(i).getText());
			
			if(lis.get(i).getText().contains("testing tools"))
			{
				lis.get(i).click();
				break;
			}
		}
		
	}

}
