package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_attributes_management_update_page_objects {
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='page-header']/div/h2")
	private WebElement update_attribute_page_header_text;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumber_list;
	
	@FindBy(xpath="")
	private WebElement breadcrumb_attributes_button;
	
	@FindBy(xpath="//*[@class='breadcrumb-item active']")
	private WebElement breadcrumb_update_attribute_active_page;
	
	@FindBy(xpath="//*[text()='Attribute Name']")
	private WebElement attribute_name_above_title_user_field;
	
	@FindBy(xpath="//*[@for='name']/span[2]")
	private WebElement attribute_name_asterisk_sign;
	
	@FindBy(xpath="//*[@name='name']")
	private WebElement attribute_name_user_field;
	
	@FindBy(xpath="//*[text()='Attribute Type']")
	private WebElement attribute_type_title_above_dropdown;
	
	@FindBy(xpath="//*[@for='type']/span[2]")
	private WebElement attribute_type_astersisk_sign;
	
	@FindBy(xpath="//*[@placeholder='Enter attribute type']")
	private WebElement attribute_type_dropdown;
	
	@FindBy(xpath="//*[@placeholder='Enter attribute type']/option")
	private List<WebElement> attribute_type_dropdown_options;
	
	@FindBy(xpath="//*[text()='Attribute Value']")
	private WebElement attribute_value_title_above_user_field;
	
	@FindBy(xpath="//*[text()='Attribute Value']/span[1]")
	private WebElement attribute_value_astersisk_sign;
	
	@FindBy(xpath="//*[text()='Attribute Value']/span[2]")
	private WebElement attribute_value_note_above_user_field;
	
	@FindBy(xpath="//*[@name='value']")
	private WebElement attribute_value_user_field;
	
	@FindBy(xpath="//*[text()='Status']")
	private WebElement status_text;
	
	@FindBy(xpath="//*[@id='toggleBtn']")
	private WebElement status_on_off_button;
	
	@FindBy(xpath="//*[text()='Active']")
	private WebElement staus_button_active_button;
	
	@FindBy(xpath="//*[text()='Inactive']")
	private WebElement staus_button_inactive_button;
	
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
	
	public Lookups_attributes_management_update_page_objects(WebDriver driver) {
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