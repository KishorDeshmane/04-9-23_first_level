package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_attributes_management_change_status_pop_up_objects {
	public WebDriver driver;

	@FindBy(xpath="//div[text()='Change Status of ']")
	private WebElement change_status_of_text;
	
	@FindBy(xpath="//*[@class='modal-header']/div[@class='modal-title h4']")
	private WebElement name_of_the_attribute_in_pop_up;
	
	@FindBy(xpath="//*[@aria-label='Close']")
	private WebElement x_button_in_pop_up;
	
	@FindBy(xpath="//*[@id='active']")
	private WebElement switch_button_in_pop_up;
	
	@FindBy(xpath="//*[@class='modal-body']/div/div/div/span")
	private WebElement active_inactive_text;
	
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
	
	public Lookups_attributes_management_change_status_pop_up_objects(WebDriver driver) {
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
