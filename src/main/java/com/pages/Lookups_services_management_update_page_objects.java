package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_services_management_update_page_objects {
	public WebDriver driver;

	@FindBy(xpath="//*[@class='page-header']/div/h2")
	private WebElement update_service_page_header_text;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li[1]")
	private WebElement services_breadcrumb_button;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li[2]")
	private WebElement update_services_active_page_in_breadcrumb;
	
	@FindBy(xpath="//*[@for='name']/span")
	private WebElement service_name_above_user_field;
	
	@FindBy(xpath="//*[@for='name']/span[2]")
	private WebElement service_name_asterisk_sign;
	
	@FindBy(xpath="//*[@name='name']")
	private WebElement service_name_user_field;
	
	@FindBy(xpath="//*[@for='service_category']/span")
	private WebElement service_categroy_title_above_user_field;
	
	@FindBy(xpath="//*[@for='service_category']/span[2]")
	private WebElement service_categroy_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='service_category']")
	private WebElement service_categroy_dropdown;
	
	@FindBy(xpath="//*[@name='service_category']/option")
	private List<WebElement> service_categroy_dropdown_list;
	
	@FindBy(xpath="//*[@for='short_desc']/span[1]")
	private WebElement short_description_title_text;
	
	@FindBy(xpath="//*[@for='short_desc']/span[2]")
	private WebElement short_description_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='short_desc']")
	private WebElement short_description_user_field;

	@FindBy(xpath="//*[@for='long_desc']/span[1]")
	private WebElement long_description_title_text;
	
	@FindBy(xpath="//*[@for='long_desc']/span[2]")
	private WebElement long_description_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='long_desc']")
	private WebElement long_description_user_field;

	@FindBy(xpath="//span[text()='Inclusions']")
	private WebElement inclusion_title_text_above_user_field;

	@FindBy(xpath="//span[text()='Inclusions']/span[1]")
	private WebElement inclusion_asterisk_sign;

	@FindBy(xpath="//span[text()='Inclusions']/span[2]")
	private WebElement inclusion_note_of_the_title_text;

	@FindBy(xpath="//*[@name='inclusions']")
	private WebElement inclusion_user_field;

	@FindBy(xpath="//*[text()='Exclusions']")
	private WebElement exclusion_title_text_above_user_field;

	@FindBy(xpath="//*[text()='Exclusions']/span")
	private WebElement exclusion_asterisk_sign;

	@FindBy(xpath="//*[text()='Exclusions']/span[2]")
	private WebElement exclusion_note_of_the_title_text;

	@FindBy(xpath="//*[@name='exclusions']")
	private WebElement exclusion_user_field;
	
	@FindBy(xpath="//*[text()='Upload Image']")
	private WebElement upload_image_title_text;
	
	@FindBy(xpath="//*[text()='Upload Image']/span")
	private WebElement upload_image_note_title_text;
	
	@FindBy(xpath="//*[@name='profile_pic']")
	private WebElement upload_image_user_field;
	
	@FindBy(xpath="//*[@alt='img']")
	private WebElement uploaded_image;
	
	@FindBy(xpath="//*[text()='Is a PPM?']")
	private WebElement is_a_ppm_text;
	
	@FindBy(xpath="(//*[@id='toggleBtn'])[1]")
	private WebElement is_a_ppm_switch_button;
	
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement is_a_ppm_switch_yes_text;
	
	@FindBy(xpath="//*[text()='No']")
	private WebElement is_a_ppm_switch_no_text;

	@FindBy(xpath="//*[text()='Status']")
	private WebElement status_text;
	
	@FindBy(xpath="(//*[@id='toggleBtn'])[2]")
	private WebElement status_switch_button;
	
	@FindBy(xpath="//*[text()='Active']")
	private WebElement status_switch_active_text;
	
	@FindBy(xpath="//*[text()='Inactive']")
	private WebElement status_switch_inactive_text;

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
	
	public Lookups_services_management_update_page_objects(WebDriver driver) {
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
