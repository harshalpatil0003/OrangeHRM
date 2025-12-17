package com.crm.POM;

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
	
	@FindBy(xpath ="(//ul)[3]//li[2]" )
	private WebElement job;
	
	@FindBy(xpath ="(//ul)[3]//li[3]" )
	private WebElement organizations;
	
	@FindBy(xpath ="(//ul)[3]//li[4]" )
	private WebElement qualifications;
	
	@FindBy(xpath ="(//ul)[3]//li[5]" )
	private WebElement notifications;
	
	@FindBy(xpath ="(//ul)[3]//li[6]" )
	private WebElement corporateBrandings;
	
	@FindBy(xpath ="(//ul)[3]//li[7]" )
	private WebElement more;
	
	@FindBy(xpath = "(//input[contains(@class,'oxd-input')])[2]")
	private WebElement username;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
	private WebElement userrole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeeName;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
	private WebElement status;
	
	


	public WebElement getUserManagement() {
		return userManagement;
	}

	public WebElement getJob() {
		return job;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getQualifications() {
		return qualifications;
	}

	public WebElement getNotifications() {
		return notifications;
	}

	public WebElement getCorporateBrandings() {
		return corporateBrandings;
	}

	public WebElement getMore() {
		return more;
	}
	
}
