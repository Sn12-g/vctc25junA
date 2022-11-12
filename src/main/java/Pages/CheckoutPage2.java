package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutPage2 extends TestBase{

	  //TC1- Verify payment info
	 //TC2 - Verify Shipping info
	 //TC3 - Verify total transaction
	 //TC4 – Logout
	@FindBy(xpath="//div[text()='SauceCard #31337']")private WebElement verifypaymentInfo;
	@FindBy(xpath="//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement verifyShippingInfo;
	@FindBy(xpath="//div[@class='summary_total_label']")private WebElement verifyTotalTransaction;
	@FindBy(xpath="//button[@id='finish']")private WebElement logoutBtn;
	@FindBy(xpath="//span[text()='Checkout: Complete!']")private WebElement titleExitPage ;
	
	public CheckoutPage2()
	{
		PageFactory.initElements(driver, this);
	}
	public  String paymentInfo()
	{
		String payment = verifypaymentInfo.getText();
		return payment;
	}
	public  String shippingInfo()
	{
		String name = verifyShippingInfo.getText();
		return name;
	}
	public String totalTransaction()
	{
		
		String payment = verifyTotalTransaction.getText();
		return payment;
	}
	public String logoutButton()
	{
		logoutBtn.click();
		String lable = titleExitPage.getText();
		return lable;
	}
	
	
	
	
	
	
}
