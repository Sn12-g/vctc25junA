package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase{
	// TC1 - Verify application title
	// TC2 - Verify web application URL
	// TC3 - Verify logo1
	// TC4 - Verify logo2
	// TC5 - Verify user login successfully
	//object Repository
	@FindBy(xpath="//div[@class='login_logo']")private WebElement loginLogo;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement botLogo;
	@FindBy(xpath="//input[@id='user-name']")private WebElement userNameTextBox;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTextBox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	@FindBy(xpath="//span[@class='title']")private WebElement productLable;
	@FindBy(xpath="//title[text()='Swag Labs']")private WebElement title;
	
	//Constructor to initialize	the	elements of	page
	//factory class using pages easier and simpler
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Methods
	//Method to	login	to	application	and	verify	the	label
	//Method to	verify	the	current	url
	
	public String loginApp2() throws Exception
	{
		loginToApp1();
		return driver.getCurrentUrl();
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	//Method to	verify	visibility	of	login logo
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();
	}
	//Method	to	verify	visibility	of	botlogo
	public boolean verifyBotLogo()
	{
	 return	botLogo.isDisplayed();
	}
	//Method	to	verify	the	logo1	after	login
	//Method	to	verify	the	logo2	after	login
	public String  loginToApp1() throws Exception
	{
		userNameTextBox.sendKeys(ReadData.readPropertyFile("username"));
		passwordTextBox.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		return productLable.getText();
	}
	//Method	to	verify	the	URL
	public String verifyPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
