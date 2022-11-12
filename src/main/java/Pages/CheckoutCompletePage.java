package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutCompletePage extends TestBase {

	//TC1 - Verify message1
	//TC2 - Verify message2
	//TC3 - Verify pony logo
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement verifyMassage1;
	@FindBy(xpath="//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")private WebElement verifyMassage2;
	@FindBy(xpath="//img[@alt='Pony Express']")private WebElement verifyPonyLogo;
	
	public CheckoutCompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String lastPageText1()
	{
		String msg = verifyMassage1.getText();
		return msg;
	}
	public String lastPageMassage2()
	{
		String msg1 = verifyMassage2.getText();
		return msg1;
	}
	public boolean logoPony()
	{
		return verifyPonyLogo.isDisplayed();
	}
	
	
	
}
