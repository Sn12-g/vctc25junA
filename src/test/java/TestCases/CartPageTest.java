package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class CartPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	CartPage cart;

	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login= new LoginPage();
		invent=new InventoryPage();
		cart = new CartPage();
				
	}
	@Test(enabled=true)
	public void verifyCartIconTest() throws Exception
	{
		login.loginToApp1();
		String result = cart.cartBtn();
		Assert.assertEquals(result, "YOUR CART");
		Assert.assertEquals(result, ReadData.readExcelFile(5, 0));
	}
	@Test(enabled=true)
	public void verifyCartUrlTest() throws Exception
	{
		login.loginToApp1();
		cart.cartBtn();
		String result = cart.verifyCartUrl();
	//	Assert.assertEquals(result, "https://www.saucedemo.com/cart.html");
		Assert.assertEquals(result, ReadData.readExcelFile(5, 1));
	}
	@Test(enabled=true)
	public  void remove2ItemTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.remove2Product();
		String result = cart.remove2item();
		Assert.assertEquals(result, ReadData.readExcelFile(5, 2));
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
