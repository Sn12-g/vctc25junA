package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutPage1;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class CheckoutPage1Test extends TestBase {

	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage1 checkout1;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent =new InventoryPage();
		cart= new CartPage();
		checkout1= new CheckoutPage1();
	}
	@Test
	public void checkoutInfoTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.remove2Product();
		cart.remove2item();
		String result = checkout1.infoPage();
	  //  Assert.assertEquals(result, "CHECKOUT: OVERVIEW");
	    Assert.assertEquals(result, ReadData.readExcelFile(4, 0));
	}
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
