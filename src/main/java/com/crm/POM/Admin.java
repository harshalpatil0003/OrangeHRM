package com.crm.POM;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {

public Admin(WebDriver dr) {
	PageFactory.initElements(dr, this);
}

	@FindBy(xpath = "(//ul)[3]//li[1]")
	private WebElement userManagement;
	
	@FindBy(xpath = "(//input[contains(@class,'oxd-input')])[2]")
	private WebElement username;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
	private WebElement userrole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeeName;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
	private WebElement status;
	
	@FindBy(xpath = "//nav[@class=\"oxd-topbar-body-nav\"]/ul/li")
	private List<WebElement> dropDowns;
	
	@FindBy(xpath = "//ul[contains(@class,'oxd-dropdown-menu')]/li")
	private List<WebElement> option;
	
	@FindBy(xpath = "(//button[@class='oxd-icon-button'])[2]")
	private WebElement toggle ;
	
	@FindBy(xpath = "//div[@class='oxd-form-row']")
	private WebElement form;

	@FindBy(xpath = "//div[@class='oxd-table-body']/div")
	private List<WebElement> admins;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button--label-danger')]")
	private WebElement delete;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private List<WebElement> trash;
	

	public WebElement getDelete() {
		return delete;
	}

	public List<WebElement> getTrash() {
		return trash;
	}

	public List<WebElement> getAdmins() {
		return admins;
	}

	public WebElement getForm() {
		return form;
	}

	public WebElement getToggle() {
		return toggle;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserrole() {
		return userrole;
	}

	public WebElement getEmployeeName() {
		return employeeName;
	}

	public WebElement getStatus() {
		return status;
	}

	public List<WebElement> getDropDowns() {
		return dropDowns;
	}

	public WebElement getUserManagement() {
		return userManagement;
	}

	public List<WebElement> getOption() {
		return option;
	}

	
	
}
