package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	 //TC1 - Verify URL
	// TC2 - Remove two more item
	//object repository
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement cartIcon;
	@FindBy(xpath="//span[text()='Your Cart']")private WebElement cartPageLable;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement removeBoltTshirt;
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")private WebElement removeJacket50;
	@FindBy(xpath="//span[text()='2']")private WebElement cartItemCount;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkOutBtn;
//	@FindBy(xpath="//span[text()='Checkout: Your Information']")private WebElement checkoutPageLable;
	//Constructor
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	// Methods
	public  String cartBtn()
	{
		cartIcon.click();
		return cartPageLable.getText();
		
	}
	
	public String verifyCartUrl()
	{
		
		return driver.getCurrentUrl();
	}
   
    public  String remove2item()
    {
    	removeBoltTshirt.click();
    	removeJacket50.click();
    	checkOutBtn.click();
    	
    	String count = cartItemCount.getText();
    	return count;
    }
	
}
	
	
	
	
	
	
	
	

