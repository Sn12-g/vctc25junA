package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethod;



 public class InventoryPage extends TestBase {
	 //TC1	- verify the	visibility	of	small logo
	 //TC2	- verify the	visibility	of	big	logo
	 //TC3	- Add 6 product	in	cart
	 //TC4	- Remove2 product	from	cart
	 //TC5	- verify the visibility	of	twitter	logo	(Assignment)
	 //TC6	- verify the visibility	of	fb	logo	(Assignment)
	 //TC7	- verify the visibility	of	linkedin	logo	(Assignment)
//object repository
	
	 @FindBy(xpath="//div[@class='peek']")private WebElement smallLogo;
	 @FindBy(xpath="//img[@alt='Swag Bot Footer']")private WebElement bigLogo;
	 @FindBy(xpath="//select[@class='product_sort_container']")private WebElement sorterDropDown;
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement backPackProduct;
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLightProduct;
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement tshirtBlackProduct16;
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement jacketProduct50;
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement tshirtProduct8;
	 @FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement tshirtRedProduct16;
	 @FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement productCountIcon;
	 @FindBy(xpath="//button[@id='remove-sauce-labs-onesie']")private WebElement removeTshirtProduct8;
	 @FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']")private WebElement removeTshirtRedProduct16;
	 @FindBy(xpath="//span[text()='4']")private WebElement inventoryCartBtn;
	 @FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement cartPageEnter;
	 @FindBy(xpath="//a[text()='Twitter']")private WebElement twitterLogo;
	 @FindBy(xpath="//a[text()='Facebook']")private WebElement fbLogo;
	 @FindBy(xpath="//a[text()='LinkedIn']")private WebElement linkedinLogo;
	 
	 
	
	 //Constructor
	 public InventoryPage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	// Methods
	 public boolean verifySmallLogo()
	 {
		 return smallLogo.isDisplayed();
	 }
	 public boolean verifyBigLogo()
	 {
		 return bigLogo.isDisplayed();
	 }
	 public String add6Product() throws Exception
	 {
	//	 Select s = new Select(sorterDropDown);
	//	 s.selectByVisibleText("Price (low to high)");
//		 s.selectByVisibleText(ReadData.readExcelFile(0, 0));
		 UtilityMethod.selectClass(sorterDropDown, ReadData.readExcelFile(0, 0));
		 
		 backPackProduct.click();
		 bikeLightProduct.click();
		 tshirtBlackProduct16.click();
		 jacketProduct50.click();
		 tshirtProduct8.click();
		 tshirtRedProduct16.click();
		 String count = productCountIcon.getText();
		 return count;
	 }
		
		 
	 public String remove2Product()
	 {
		removeTshirtProduct8.click();
		removeTshirtRedProduct16.click();
		cartPageEnter.click();
		String count = inventoryCartBtn.getText();
		return count;
		
	 }
	 public boolean verifyTwitterLogo()
	 {
		 return twitterLogo.isDisplayed();
	 }
	 public boolean verifyFbLogo()
	 {
		 return fbLogo.isDisplayed();
	 }
	 public boolean verifyLinkedinLogo()
	 {
		 return linkedinLogo.isDisplayed();
	 }
	  
 }
		 
	 
	 
	 
