package com.crm.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login {

	
	// This are public that can directly used
	
//	@FindBy(name = "username")
//	public WebElement username;
//	
//	@FindBy(css = "input[type='password']")
//	public WebElement password;
//	
//	@FindBy(xpath = "//button[@type='submit']")
//	public WebElement login_button;
//	
//	@FindBy(xpath = "//p[text()='Forgot your password?']")
//	public WebElement forgot_password;

	// Here we achiving data hiding with making variables private
	
	public  Login(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(css = "input[type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_button;
	
	@FindBy(xpath = "//p[contains(@class,'orangehrm-login-forgot-header')]")
	private WebElement forgot_password;
	
	@FindBy(xpath="//div[@class=\"orangehrm-login-branding\"]")
	private WebElement logo;
	
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	private WebElement usernamePlaceHolder;
	
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement passwordPlaceHolder;
	
	@FindBy(xpath="//div[contains(@class,'orangehrm-demo-credentials')]")
	private WebElement demo_credentials;
	
	public WebElement getDemo_credentials() {
		return demo_credentials;
	}

	public WebElement getUsernamePlaceHolder() {
		return usernamePlaceHolder;
	}

	public WebElement getPasswordPlaceHolder() {
		return passwordPlaceHolder;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getForgot_password() {
		return forgot_password;
	}
	  
	
	
	
}
