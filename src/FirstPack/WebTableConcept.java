package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/webfolder/technetwork/jet/jetCookbook.html?component=table&demo=checkboxSelectableTable");
		
		
		driver.findElement(By.xpath("//*[@id='table:_hdrCol0_1507424_1 ']")).click();
		
		
	}

}
