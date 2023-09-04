package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_services_management_change_status_pop_up_objects {
	public WebDriver driver;

	@FindBy(xpath="//*[text()='Change Status of ']")
	private WebElement change_status_of;
	
	@FindBy(xpath="//*[@aria-label='Close']")
	private WebElement x_button;
	
	@FindBy(xpath="//*[@id='active']")
	private WebElement switch_button;
	
	@FindBy(xpath="//*[@class='modal-body']/div/div/div/span")
	private WebElement active_inactive_text_in_switch_button;
	
	@FindBy(xpath="//*[text()='Close']")
	private WebElement close_button;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submit_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_services_management_change_status_pop_up_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
}
