package com.crm.POM;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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
	
	@FindBy(xpath="//div[contains(@class,'oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget')]")
	private List<WebElement> cards;
	
	@FindBy(xpath = "//button[contains(@class, 'orangehrm-upgrade-button')]")
	private WebElement upgrade_btn;
	
	@FindBy(xpath = "//li[contains(@class,'oxd-userdropdown')]")
	private WebElement userDropdown;
	
	@FindBy(xpath = "//span[contains(@class, 'oxd-main-menu-item--name') and text()='Admin'] ")
	private WebElement Admin;
	
	@FindBy(xpath = "//span[contains(@class, 'oxd-main-menu-item--name') and text()='PIM'] ")
	private WebElement PIM;
	
	@FindBy(xpath = "//span[contains(@class, 'oxd-main-menu-item--name') and text()='Leave'] ")
	private WebElement Leave;
	
	@FindBy(xpath = "//span[contains(@class, 'oxd-main-menu-item--name') and text()='Time'] ")
	private WebElement Time;
	
	@FindBy(xpath = "//span[contains(@class, 'oxd-main-menu-item--name') and text()='Recruitment'] ")
	private WebElement Recruitment;
	
	public WebElement getAdmin() {
		return Admin;
	}

	public WebElement getPIM() {
		return PIM;
	}

	public WebElement getLeave() {
		return Leave;
	}

	public WebElement getTime() {
		return Time;
	}

	public WebElement getRecruitment() {
		return Recruitment;
	}

	public WebElement getUserDropdown() {
		return userDropdown;
	}

	public WebElement getUpgrade_btn() {
		return upgrade_btn;
	}

	public List<WebElement> getCards() {
		return cards;
	}

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
