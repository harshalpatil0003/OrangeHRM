package com.crm.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Time {

	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	private WebElement emp_name;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement view;
	
	@FindBy(xpath = "(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")
	private WebElement attendance;
	
	@FindBy(xpath = "(//span[@class=\\\"oxd-topbar-body-nav-tab-item\\\"])[3]")
	private WebElement report;

    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")
    private WebElement proj_info;

	public WebElement getEmp_name() {
		return emp_name;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getAttendance() {
		return attendance;
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getProj_info() {
		return proj_info;
	}
	
}
