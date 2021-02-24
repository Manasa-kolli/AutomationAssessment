package com.capgemini.Assementone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalInformationPage {
	
	/*
	 * Title x-path
	 */
	@FindBy(xpath="(//span//input[@type='radio'])[1]")
	WebElement title;
	
	/*
	 * first name x-path
	 */
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement first;
	
	/*
	 * last name x-path
	 */
      @FindBy(xpath="//input[@id='customer_lastname']")	
	   WebElement last;
      
      /*
       * password x-path
       */
      @FindBy(xpath="//input[@id='passwd']")
      WebElement password;
      
      /*
       * day x-path
       */
      @FindBy(xpath="//select[@id='days']")
      WebElement day;
      
      /*
       * month x-path
       */
      @FindBy(xpath="//select[@id='months']")
      WebElement month;
      
      /*
       * year x-path
       */
      @FindBy(xpath="//select[@id='years']")
      WebElement year;
      
      /*
       * Sign-up check-box x-path
       */
      @FindBy(xpath="//input[@id='newsletter']")
      WebElement newLetter;
    
      /*
       * company text x-path
       */
      @FindBy(xpath="//input[@id='company']")
      WebElement company;
      
      /*
       * address-1 x-path
       */
      @FindBy(xpath="//input[@id='address1']")
      WebElement address;
      
      /*
       * address-2 x-path
       */
      @FindBy(xpath="//input[@id='address2']")
      WebElement addressTwo;
      
      /*
       * city x-path
       */
      @FindBy(xpath="//input[@id='city']")
      WebElement city;
      
      /*
       * state x-path
       */
      @FindBy(xpath="//select[@id='id_state']")
      WebElement state;
      
      /*
       * postal-code x-path
       */
      @FindBy(xpath="//input[@id='postcode']")
      WebElement zip;
      
      /*
       * additional information x-path
       */
      @FindBy(xpath="//textarea[@id='other']")
      WebElement additionalInfo;
      
      /*
       * Home number x-path
       */
      @FindBy(xpath="//input[@id='phone']")
      WebElement homeNum; 
      
      /*
       *phone number x-path 
       */
      @FindBy(xpath="//input[@id='phone_mobile']")
      WebElement phone;
      
      /*
       * further address x-path
       */
      @FindBy(xpath="//input[@id='alias']")
      WebElement further;
      
      /*
       * register button x-path
       */
      @FindBy(xpath="//span[text()='Register']")
      WebElement register;
      
	/*
	 * constructor
	 */
	public PersonalInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	/*
	 * by the of this method we can click on radio button
	 */
	public void title() {
		title.click();
	}
	
	/*
	 * by the help of this method we can enter first name
	 */
	public void firstName(String Fname) {
		first.sendKeys(Fname);
	}
	
	/*
	 * by the help of this method we can enter last name
	 */
	public void lastName(String Lname) {
		last.sendKeys(Lname);
	}
	
	/*
	 * by the help of this method we can click on password
	 */
	public void ePassword(String Enterpassword) {
		password.sendKeys(Enterpassword);
		}
	
	/*
	 * by the help of this method we can click in day drop down 
	 */
	public void days() {
		Select s=new Select(day);
		s.selectByIndex(2);
	}
	
	/*
	 * by the help of this method we can click in month drop down
	 */
	public void months() {
		Select s=new Select(month);
		s.selectByIndex(3);
	}
	
	/*
	 * by the help of this method we can click on year drop down
	 */
	public void years() {
		Select s =new Select(year);
		s.selectByIndex(4);
	}
	
	/*
	 * by the help of this method we can click on check box of sign-up
	 */
	public void newLetters() {
		newLetter.click();
	}
	
	/*
	 * by the help of this method we can enter the company name
	 */
	public void companyName(String comName) {
		company.sendKeys(comName);
	}
	
	/*
	 * by the help of this method we can enter the address
	 */
	public void addressOne(String addOne) {
		address.sendKeys(addOne);
	}
	
	/*
	 * by the help of this method we can enter the address two
	 */
     public void addressTwoo(String addTwo) {
    	 addressTwo.sendKeys(addTwo);
     }
     
     /*
      * by the help of this method we can enter the city name
      */
     public void cityName(String Name) {
    	 city.sendKeys(Name);
     }
     
     /*
      * by the help of this method we can click on  state drop down
      */
     public void states() {
 		Select s =new Select(state);
 		s.selectByIndex(15);
 	}
     
     /*
      * by the help of this method we can enter the postal code
      */
     public void postalCode(String zipCode) {
    	 zip.sendKeys(zipCode);
     }
     
     /*
      * by the help of this method we can enter the additional information
      */
     public void additional(String information) {
    	 additionalInfo.sendKeys(information);
     }
     
     /*
      * by the help of this method we can enter the HomeNumber
      */
     public void homeNumber(String homeNumber) {
    	 homeNum.sendKeys(homeNumber);
     }
     
     /*
      * by the help of this method we can enter the phonenumber
      */
     public void phoneNumber(String phoneNum) {
    	 phone.sendKeys(phoneNum);
     }
     
     /*
      * by the help of this method we can enter further address
      */
     public void furtherAddress(String Addfur) {
    	 further.sendKeys(Addfur);
     }
     
     /*
      * by the help of this method we can click on register button
      */
     public void registerButton() {
    	 register.click();
     }
} 
