package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.freecrm.com/register/");
		
		boolean displayed=driver.findElement(By.xpath("//button[@name='action']")).isDisplayed();
        System.out.println(displayed);
        
        boolean enable=driver.findElement(By.xpath("//button[@name='action']")).isEnabled();
        System.out.println(enable);
        
        boolean s=driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
        System.out.println(s);
        
        driver.findElement(By.xpath("//input[@id='terms']")).click();
        
        boolean se=driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
        System.out.println(se);
        
        
        
        
	}

}
