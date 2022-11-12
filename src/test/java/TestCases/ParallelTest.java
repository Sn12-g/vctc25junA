package TestCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	
	@Test
	public void openGoogle() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(3000);
	    driver.close();
	}
	@Test
	public void openSauceLab() throws Exception
	{
	
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.saucedemo.com/");
	    Thread.sleep(5000);
	    driver.quit();
	}
	@Test
	public void openRediff() throws Exception
	{
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(5000);
	    driver.close();
	}
//	@Test
//	public void openFb() throws Exception
//	{
//		WebDriverManager.chromedriver().setup();
//	    WebDriver driver = new ChromeDriver();
//	    driver.get("https://www.rediff.com/");
//	    Thread.sleep(3000);
//	    driver.close();
//	}
	
	
	
}
