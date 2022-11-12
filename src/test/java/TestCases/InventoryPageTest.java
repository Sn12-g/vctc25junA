package TestCases;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;


public class InventoryPageTest extends TestBase {
     LoginPage login;
     InventoryPage invent;
	//It is	prerequisite	to	run	the	test	case	open	the	browser	+	enter	URL
	//This	will execute multiple times	depend	on	number	of	test	cases
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		invent=new InventoryPage();
		login= new LoginPage();
	}
	//Test	case to	login	to	application	and	verify	label
	
	@Test(enabled=true)
	public void verifySmallLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifySmallLogo();
		Assert.assertEquals(result, true);
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	//	System.out.println("this is verifySmallLogoTest");
	}
	@Test(enabled=true)
	public void verifyBigLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyBigLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void add6ProductTest() throws Exception
	{
		login.loginToApp1();
		String result = invent.add6Product();
	//	Assert.assertEquals(result, "6")
		Assert.assertEquals(result, ReadData.readExcelFile(1, 4));
	}
	@Test(enabled=true)
	public void remove2ProductTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		String result = invent.remove2Product();
	//	Assert.assertEquals(result, "4");
		Assert.assertEquals(result, ReadData.readExcelFile(1, 5));
	}
	@Test(enabled=true)
	public void twitterLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyTwitterLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void fbLogotest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyFbLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void linkednLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyLinkedinLogo();
		Assert.assertEquals(result, true);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
