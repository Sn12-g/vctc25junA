package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;
import Utility.ReadData;

public class GroupTest extends TestBase {

		
		LoginPage login;
		@BeforeMethod(alwaysRun= true)//prerequisite to run 
		public void setUp() throws Exception
		{
			initialization();
			login=new LoginPage();
		}
		
		@Test (groups="smoke")
		public void verifyTitleTest() throws Exception
		{
			String title = login.verifyTitle();
			Assert.assertEquals(title, "Swag Labs");
			System.out.println("verifyTitleTest");
		
		}
		@Test(groups= {"sanity","smoke","regression"})
		public void verifyBotLogoTest()
		{
			boolean result = login.verifyBotLogo();
			Assert.assertEquals(result, true);
			System.out.println("verifyBotLogoTest");
		}
		@Test (groups="smoke")
		public void verifyLoginLogoTest()
		{
			boolean result = login.verifyLoginLogo();
			Assert.assertEquals(result, true);
			System.out.println("verifyLoginLogoTest");
		}	
		@Test (groups="sanity")
		public void loginToApp1Test() throws Exception
		{
			String lable = login.loginToApp1();
			Assert.assertEquals(lable, "PRODUCTS");
			System.out.println("loginToApp1Test");
			
		}
		@Test (groups="smoke")
		public  void loginApp2Test() throws Exception
		{
			Assert.assertEquals(login.loginApp2(), ReadData.readExcelFile(1, 1));
			System.out.println("loginApp2Test");
		}
		
		@Test (groups="sanity")
		public void verifyUrlTest() throws Exception
		{
			String url = login.verifyPageUrl();
			Assert.assertEquals(url, ReadData.readExcelFile(1, 3));
			System.out.println("verifyUrlTest");
		}
		//This	will	close	the	browser
		@AfterMethod(alwaysRun= true)
		public void closeBrowser(ITestResult it) throws Exception
		{
			if (ITestResult.FAILURE==it.getStatus())
			{
				CaptureScreenshot.screenshot(it.getName());
			}
			driver.close();
		}
		
	

}
