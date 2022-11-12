package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckoutPage1 extends TestBase {

	 //TC1-Verify title
	 // TC2- Verify URL
	 //TC3-Checkout page input credential
	
//	@FindBy(xpath="//span[text()='Checkout: Your Information']")private WebElement checkOutPage1Title;
	
	@FindBy(xpath="//input[@id='first-name']")private WebElement firstName;
	@FindBy(xpath="//input[@id='last-name']")private WebElement lastName;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement postalCode;
	@FindBy(xpath="//input[@id='continue']")private WebElement continueBtn;
	@FindBy(xpath="//span[text()='Checkout: Overview']")private WebElement titleCheckoutPage2;
	
	//Constructor
	public CheckoutPage1()
	{
		PageFactory.initElements(driver, this);
	}
	//METHOD
	
	public  String infoPage() throws Exception {
		
	firstName.sendKeys(ReadData.readExcelFile(2, 0));
	lastName.sendKeys(ReadData.readExcelFile(2, 1));
	postalCode.sendKeys(ReadData.readExcelFile(2, 2));
	continueBtn.click();
	String info = titleCheckoutPage2.getText();
	return info;
	}
	
}
		
		
		
	   


	
	
	
	
	
	
	
