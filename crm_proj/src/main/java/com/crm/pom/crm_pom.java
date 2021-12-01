package com.crm.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm_proj_webDriverUtilities.WebDriverUtility;

public class crm_pom extends WebDriverUtility {
	
	WebDriverUtility wb=new WebDriverUtility();
	
	 WebDriver driver=null;
	
	
	public  crm_pom(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),\" Administrator\")]//following::img[1]")
	private WebElement signoutIMG;
	
	@FindBy(xpath="//a[contains(text(),\"Sign Out\")]")
	private WebElement signout;
	
	public void signOut()
	{
		 wb.mouseOver(driver, signoutIMG, signout);
		
		
	}
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	
	public void org()
	{
	org.click();
	}
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement plus;
	
	public void plus()
	{
		plus.click();
	}
	
	
}

