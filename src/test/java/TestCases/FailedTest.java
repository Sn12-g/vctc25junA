package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;


public class FailedTest extends TestBase {
	
		//globally mention
		LoginPage login;
		@BeforeMethod
		public void setUp() throws Exception
		{
			initialization();
			login=new LoginPage();
		}
	
		@Test
		public void verifyTitleTest() throws Exception
		{
			String title = login.verifyTitle();
			Assert.assertEquals(title, "Swag Labs");
			
		}
		
		@Test
		public void verifyBotLogoTest()
		{
			boolean result = login.verifyBotLogo();
			Assert.assertEquals(result, true);
			
		}
		@Test
		public void verifyLoginLogoTest()
		{
			boolean result = login.verifyLoginLogo();
			Assert.assertEquals(result, true);
			
		}	
		@Test
		public void loginToApp1Test() throws Exception
		{
			String lable = login.loginToApp1();
			Assert.assertEquals(lable, "PRODUCTS");
	
			
		}
		@Test
		public  void loginApp2Test() throws Exception
		{
		    String result = login.loginApp2();
		    Assert.assertEquals(result, "https://www.saucedemo.com/inventory.html");
			
		}
		
		
		@Test
		public void verifyUrlTest() throws Exception
		{
			String url = login.verifyPageUrl();
			Assert.assertEquals(url, "https://www.saucedemo.com/");
			
		}
		
		@AfterMethod
		public void closeBrowser(ITestResult it) throws Exception
		{
			if (ITestResult.FAILURE==it.getStatus())
			{
				CaptureScreenshot.screenshot(it.getName());
			}
			driver.close();
		}
		
		}
		
//total 6 tc
//2 tc pass and 4 tc failed
//2 tc modify
