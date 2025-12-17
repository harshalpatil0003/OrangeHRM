package com.crm.POM;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	public  Dashboard(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath = "//button[@title='Assign Leave']")
	private WebElement assignLeave;
	
	@FindBy(xpath = "//button[@title='Leave List']")
	private WebElement leaveList;
	
	@FindBy(xpath = "//button[@title='Timesheets']")
	private WebElement timesheets;
	
	@FindBy(xpath = "//button[@title='Apply Leave']")
	private WebElement applyLeave;
	
	@FindBy(xpath = "//button[@title='My Leave']")
	private WebElement myLeave;
	
	@FindBy(xpath = "//button[@title='My Timesheet']")
	private WebElement myTimesheet;
	
	@FindBy(xpath = "//i[contains(@class,'oxd-userdropdown-icon')]")
	private WebElement userdropdown_icon;

	@FindBy(xpath = "(//a[@class='oxd-userdropdown-link'])[4]")
	private WebElement logout;
	
	
	@FindBy(xpath = "//h6[contains(@class,'oxd-topbar-header-breadcrumb-module')]")
	private WebElement header;
	
	public WebElement getHeader() {
		return header;
	}

	public WebElement getUserdropdown_icon() {
		return userdropdown_icon;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getAssignLeave() {
		return assignLeave;
	}

	public WebElement getLeaveList() {
		return leaveList;
	}

	public WebElement getTimesheets() {
		return timesheets;
	}

	public WebElement getApplyLeave() {
		return applyLeave;
	}

	public WebElement getMyLeave() {
		return myLeave;
	}

	public WebElement getMyTimesheet() {
		return myTimesheet;
	}
}
