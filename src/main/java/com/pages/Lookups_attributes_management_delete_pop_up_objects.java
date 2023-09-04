package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_attributes_management_delete_pop_up_objects {
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()='!']")
	private WebElement big_i_text;
	
	@FindBy(xpath="//*[text()='Are you sure?']")
	private WebElement are_you_sure_question_mark;
	
	@FindBy(xpath="//*[@id='swal2-html-container']")
	private WebElement you_want_to_delete_this_text;
	
	@FindBy(xpath="//*[text()='Yes, delete it!']")
	private WebElement yes_delete_it_button;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancel_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_attributes_management_delete_pop_up_objects(WebDriver driver) {
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
