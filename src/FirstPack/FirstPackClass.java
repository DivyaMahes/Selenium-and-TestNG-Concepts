package FirstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPackClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/master/Downloads/Jar Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("google"))
			System.out.println("Correct title");
		else
			System.out.println("Incorrect");
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();
	}

}
