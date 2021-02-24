package com.capgemini.Assementone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	/*
	 * Signin x-path
	 */
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement Signin;
	
	/*
	 * Email address type x-path
	 */
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement text;
	
	/*
	 * create button x-path
	 */
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement button;
	
	
	
	/*
	 * constructor
	 */

	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * By the help of this method we can click on signin button
	 */
	public void signinButton() {
		Signin.click();
	}
	
	/* 
	 * by the help of this method we can enter the email id
	 */
	 public void emailId(String un) {
		 text.sendKeys(un);
	 }
	 
	 /*
	  * by the help of this method we can click on create account button
	  */
	 public void CreateButton() {
	    	 button.click();
	 }
}
