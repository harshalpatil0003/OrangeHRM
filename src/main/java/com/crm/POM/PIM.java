package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM {
	
	public  PIM(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "(//label[@class='oxd-label'])[1]")
	private WebElement emp_name;
	
	@FindBy(xpath = "(//label[@class='oxd-label'])[2]")
	private WebElement emp_id;
	
	@FindBy(xpath = "(//label[@class='oxd-label'])[3]")
	private WebElement emp_status;
	
	@FindBy(xpath = "(//label[@class='oxd-label'])[4]")
	private WebElement include;
	
	@FindBy(xpath = "(//label[@class='oxd-label'])[5]")
	private WebElement sup_name;
	
	@FindBy(xpath = "(//label[@class='oxd-label'])[6]")
	private WebElement job_title;
	
	@FindBy(xpath = "(//label[@class='oxd-label'])[7]")
	private WebElement sub_unit;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;
	
	@FindBy(xpath = "//i[contains[@class='oxd-icon bi-plus oxd-button-icon'])")
	private WebElement add;

	@FindBy(xpath = "(//a[contains(@class,'oxd-topbar-body-nav-tab-item')])[2]")
	private WebElement add_emp;
	
	@FindBy(xpath = "(//a[contains(@class,'oxd-topbar-body-nav-tab-item')])[3]")
	private WebElement roports;

	public WebElement getEmp_name() {
		return emp_name;
	}

	public WebElement getEmp_id() {
		return emp_id;
	}

	public WebElement getEmp_status() {
		return emp_status;
	}

	public WebElement getInclude() {
		return include;
	}

	public WebElement getSup_name() {
		return sup_name;
	}

	public WebElement getJob_title() {
		return job_title;
	}

	public WebElement getSub_unit() {
		return sub_unit;
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





