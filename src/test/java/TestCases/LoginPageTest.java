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

public class LoginPageTest extends TestBase{
	//globally mention
	LoginPage login;
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login=new LoginPage();
	}
	//Test	case	to	verify	the	login	and	label
	@Test(enabled=false)//disable particular test case
	public void verifyTitleTest() throws Exception
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
		System.out.println("verifyTitleTest");
	//	Assert.assertEquals(title, ReadData.readExcelFile(1, 2));
	}
	@Test(enabled=true,/*dependsOnMethods="verifyTitleTest"*/ priority=1)
	public void verifyBotLogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
		System.out.println("verifyBotLogoTest");
	}
	@Test(enabled=true/*dependsOnMethods="verifyTitleTest"*/)
	public void verifyLoginLogoTest()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
		System.out.println("verifyLoginLogoTest");
	}	
	@Test(enabled=false)
	public void loginToApp1Test() throws Exception
	{
		String lable = login.loginToApp1();
		Assert.assertEquals(lable, "PRODUCTS");
		System.out.println("loginToApp1Test");
		//	Assert.assertEquals(lable, ReadData.readExcelFile(1, 0));
	}
	@Test(enabled=false)
	public  void loginApp2Test() throws Exception
	{
		Assert.assertEquals(login.loginApp2(), ReadData.readExcelFile(1, 1));
		System.out.println("loginApp2Test");
	}
	
	
	//Method	to	verify	the	logo1	after	login
	//Method	to	verify	the	logo2	after	login
	//Method	to	verify	the	title
	@Test(enabled=false)
	public void verifyUrlTest() throws Exception
	{
		String url = login.verifyPageUrl();
		Assert.assertEquals(url, ReadData.readExcelFile(1, 3));
		System.out.println("verifyUrlTest");
	}
	//This	will	close	the	browser
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception
	{
		if (ITestResult.FAILURE==it.getStatus())
		{
			CaptureScreenshot.screenshot(it.getName());
		}
		driver.close();
	}


	//"https://www.saucedemo.com/inventory.html
	//"https://www.saucedemo.com/
	
	
	
	
	
	
	
	
	
	
	
	
}
