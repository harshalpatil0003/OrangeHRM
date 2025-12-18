package com.crm.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM {
	
	public  PIM(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath = "(//label[@class='oxd-label'])")
	private List<WebElement> form;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;
	
	@FindBy(xpath = "//i[contains[@class='oxd-icon bi-plus oxd-button-icon'])")
	private WebElement add;

	@FindBy(xpath = "(//a[contains(@class,'oxd-topbar-body-nav-tab-item')])[2]")
	private WebElement add_emp;
	
	@FindBy(xpath = "(//a[contains(@class,'oxd-topbar-body-nav-tab-item')])[3]")
	private WebElement roports;
	
	@FindBy(xpath = "//nav[@aria-label='Topbar Menu']/ul/li")
	private List<WebElement> dropdowns;
	
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li")
	private List<WebElement> options;

	

	public List<WebElement> getOptions() {
		return options;
	}

	public List<WebElement> getForm() {
		return form;
	}

	public List<WebElement> getDropdowns() {
		return dropdowns;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getAdd_emp() {
		return add_emp;
	}

	public WebElement getRoports() {
		return roports;
	}
	

	
	
}





