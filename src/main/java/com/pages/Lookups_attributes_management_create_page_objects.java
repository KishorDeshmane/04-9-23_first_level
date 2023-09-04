package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_attributes_management_create_page_objects {
	public WebDriver driver;

	@FindBy(xpath="//*[@class='page-header']/div/h2")
	private WebElement page_header_text;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li[1]")
	private WebElement attribute_breadcrumb_button;
	
	@FindBy(xpath="//*[@class='breadcrumb-item active']")
	private WebElement create_attribute_breadcrumb;
	
	@FindBy(xpath="//*[text()='Attribute Name']")
	private WebElement attribute_name_above_user_field_text;
	
	@FindBy(xpath="//*[@for='name']/span[2]")
	private WebElement attribute_name_asterisk_sign;
	
	@FindBy(xpath="//*[@id='name']")
	private WebElement attribute_name_user_field;
	
	@FindBy(xpath="//*[text()='Attribute Type']")
	private WebElement attribute_type_above_userfield_text;
	
	@FindBy(xpath="//*[@for='type']/span[2]")
	private WebElement attribute_type_asterisk_sign;
	
	@FindBy(xpath="//*[@id='type']")
	private WebElement attribute_type_dropdown;
	
	@FindBy(xpath="//*[@id='type']/option")
	private List<WebElement> attribute_type_dropdown_list;
	
	@FindBy(xpath="//*[text()='Attribute Value']")
	private WebElement attribute_value_above_user_field_text;
	
	@FindBy(xpath="//span[@class='Services_redAsterisk__aEEYB']")
	private WebElement attribute_value_asterisk_sign;
	
	@FindBy(xpath="//*[text()='(Please provide comma seperated values.)']")
	private WebElement attribute_value_small_text_please_provide;
	
	@FindBy(xpath="//*[@name='value']")
	private WebElement attribute_value_user_field;
	
	@FindBy(xpath="//*[text()='Status']")
	private WebElement status_text_above_toggle_button;
	
	@FindBy(xpath="//*[@id='toggleBtn']")
	private WebElement status_button_toggle_button;
	
	@FindBy(xpath="//*[text()='Active']")
	private WebElement status_button_active_state_text;
	
	@FindBy(xpath="//*[text()='Inactive']")
	private WebElement status_button_inactive_state_text;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submit_button;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancel_button;
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_attributes_management_create_page_objects(WebDriver driver) {
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
