package FirstPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
	
	public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	Alert a=driver.switchTo().alert();
	a.accept();
	a.dismiss();*/
	
	driver.get("http://html.com/input-type-file/");
	driver.findElement(By.name("fileupload")).sendKeys("C:/Users/master/Downloads/certificate.pdf");
	//driver.findElement(By.xpath("//[@id="post-206"]/div/div[3]/form/input[2]"));

}
}