package FirstPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setUp(){
		System.out.println("Set up Properties for chrome");
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("Browser launch");
	}
	
	@BeforeClass
	public void login(){
		System.out.println("login to app");
	}
	
	
	
	@BeforeMethod
	public void loginURL(){
		System.out.println("Open the URL");
	}
	
	@Test
	public void getTitle(){
		System.out.println("Get title");
	}
	
	@Test
	public void googleSearch(){
		System.out.println("Google Search");
	}
	
	@AfterMethod
	public void loginOut(){
		System.out.println("Log out from the app");
	}
	
	@AfterClass
	public void deleteCookies(){
		System.out.println("Clear all cookies");
	}
	
	@AfterTest
	public void logOut(){
		System.out.println("Close browser");
	}
	
	
	
	@AfterSuite
	public void report(){
		System.out.println("Report Passed");
	}
	
	
}
