package com.pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_attributes_management_page_objects {
	public WebDriver driver;
	
	@FindBy(xpath="//h2[text()='Attribute Management']")
	private WebElement attribute_management_header_text;
	
	@FindBy(xpath="//ol[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//ol[@class='breadcrumb']/li[1]")
	private WebElement breadcrumb_dashboard_buttton;
	
	@FindBy(xpath="//ol[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_attribute_management_active_page;
	
	@FindBy(xpath="//*[text()='Records per page']")
	private WebElement record_per_page_text;
	
	@FindBy(xpath="//*[@type='select']")
	private WebElement record_per_page_dropdown_button;
	
	@FindBy(xpath="//*[@type='select']/option")
	private List<WebElement> record_per_page_dropdown_options;
	
	@FindBy(xpath="//*[text()='Create Attribute']")
	private WebElement create_attribute_button;
	
	@FindBy(xpath="//*[@class='input-group']/input")
	private WebElement search_placeholder_value;
	
	@FindBy(xpath="//*[@class='input-group']/button")
	private WebElement search_icon_button;
	
	@FindBy(xpath="//*[text()='Name']")
	private WebElement thread_name_text;
	
	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th/i")
	private WebElement thread_name_asc_desc_button;
	
	@FindBy(xpath="//*[text()='Type']")
	private WebElement thread_type_text;
	
	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[2]/i")
	private WebElement thread_type_asc_desc_button;
	
	@FindBy(xpath="//*[text()='Status']")
	private WebElement thread_status_text;
	
	@FindBy(xpath="//*[text()='Actions']")
	private WebElement thread_action_text;
	
	@FindBy(xpath="//*[@class='dropdown']/button/i")
	private WebElement kebab_menu_3_dot;
	
	@FindBy(xpath="//*[@class='dropdown-item'][1]/a")
	private WebElement kebab_menu_edit_or_update_button;
	
	@FindBy(xpath="//*[@class='dropdown-item'][2]/a")
	private WebElement kebab_menu_change_Status_button;
	
	@FindBy(xpath="//*[@class='dropdown-item'][3]/a")
	private WebElement kebab_menu_delete_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_attributes_management_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void create_attribute_button_is_clicked() {
		create_attribute_button.click();
	}
	
	public void kebab_menu_3_dot_is_clicked(){
		kebab_menu_3_dot.click();
	}
	
	public void kebab_menu_edit_or_update_button_is_clicked(){
		kebab_menu_edit_or_update_button.click();
	}
	
	public void kebab_menu_change_Status_button_is_clicked(){
		kebab_menu_change_Status_button.click();
	}
	
	public void kebab_menu_delete_button_is_clicked(){
		kebab_menu_delete_button.click();
	}
	
	
}