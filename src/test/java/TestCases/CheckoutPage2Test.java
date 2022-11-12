package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutPage1;
import Pages.CheckoutPage2;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class CheckoutPage2Test extends TestBase{

	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage1 checkout1;
	CheckoutPage2 checkout2;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent= new InventoryPage();
		cart = new CartPage();
		checkout1 = new CheckoutPage1();
		checkout2 = new CheckoutPage2();
	}
	@Test(enabled=true)
	public void paymentInfoTest() throws Exception
	{   login.loginToApp1();
	    invent.add6Product();
	    invent.remove2Product();
	    cart.remove2item();
	    checkout1.infoPage();
		String result = checkout2.paymentInfo();
	//	Assert.assertEquals(result, "SauceCard #31337");
		Assert.assertEquals(result, ReadData.readExcelFile(3, 0));
	}
	@Test(enabled=true)
	public void shippingInfoTest() throws Exception
	{
		login.loginToApp1();
	    invent.add6Product();
	    invent.remove2Product();
	    cart.remove2item();
	    checkout1.infoPage();
		String result = checkout2.shippingInfo();
	//	Assert.assertEquals(result, "FREE PONY EXPRESS DELIVERY!");
		Assert.assertEquals(result, ReadData.readExcelFile(3, 1));
	}
	@Test(enabled=true)
	public void totalTransactionTest() throws Exception
	{
		login.loginToApp1();
	    invent.add6Product();
	    invent.remove2Product();
	    cart.remove2item();
	    checkout1.infoPage();
		String result = checkout2.totalTransaction();
		//Assert.assertEquals(result, "Total: $43.18");
		Assert.assertEquals(result, ReadData.readExcelFile(3, 2));
	}
	@Test(enabled=true)
	public void logoutButtonTest() throws Exception
	{
		login.loginToApp1();
	    invent.add6Product();
	    invent.remove2Product();
	    cart.remove2item();
	    checkout1.infoPage();
		String result = checkout2.logoutButton();
		Assert.assertEquals(result, "CHECKOUT: COMPLETE!");
		Assert.assertEquals(result, ReadData.readExcelFile(3, 3));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
