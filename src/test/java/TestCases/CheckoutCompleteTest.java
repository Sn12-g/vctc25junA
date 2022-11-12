package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutCompletePage;
import Pages.CheckoutPage1;
import Pages.CheckoutPage2;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class CheckoutCompleteTest extends TestBase {
    
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage1 checkout1;
	CheckoutPage2 checkout2;
	CheckoutCompletePage exit;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent= new InventoryPage();
		cart = new CartPage();
		checkout1 = new CheckoutPage1();
		checkout2 = new CheckoutPage2();
		exit = new CheckoutCompletePage();
	}
	@Test(enabled=true)
	public void lastPageText1Test() throws Exception
	{
		login.loginToApp1();
	    invent.add6Product();
	    invent.remove2Product();
	    cart.remove2item();
	    checkout1.infoPage();
	    checkout2.logoutButton();
	    String result = exit.lastPageText1();
	  //  Assert.assertEquals(result, "THANK YOU FOR YOUR ORDER");
	    Assert.assertEquals(result, ReadData.readExcelFile(4, 1));
	}
	@Test(enabled=true)
	public void lastPageMassage2Test() throws Exception
	{
		login.loginToApp1();
	    invent.add6Product();
	    invent.remove2Product();
	    cart.remove2item();
	    checkout1.infoPage();
	    checkout2.logoutButton();
	    String result = exit.lastPageMassage2();
	 //   Assert.assertEquals(result, "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	    Assert.assertEquals(result, ReadData.readExcelFile(4, 2));
	}
	@Test(enabled=true,invocationCount=5)
	public void logoPonyTest() throws Exception
	{
		login.loginToApp1();
	    invent.add6Product();
	    invent.remove2Product();
	    cart.remove2item();
	    checkout1.infoPage();
	    checkout2.logoutButton();
	    boolean result = exit.logoPony();
	    Assert.assertEquals(result, true);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
