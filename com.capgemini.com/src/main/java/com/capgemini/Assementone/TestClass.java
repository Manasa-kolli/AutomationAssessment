package com.capgemini.Assementone;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		//create an object for SigninPage class
		SigninPage page=new SigninPage(driver);
		//called the signinButton()
		page.signinButton();
		//called the emailId()
		page.emailId("happy@gmail.com");
		//called the createButton()
		page.CreateButton();
		
		//create an object for personal information
		PersonalInformationPage informationPage=new PersonalInformationPage(driver);
		//called the title()
		informationPage.title();
		//called the firstName() 
		informationPage.firstName("Manasa");
		//called the lastName()
		informationPage.lastName("Kolli");
		//called the ePassword()
		informationPage.ePassword("MANASA");
		//called the days();
		informationPage.days();
		//called the months()
		informationPage.months();
		//called the  years()
         informationPage.years();		
		//called the newLetters()
         informationPage.newLetters();
         //called the companyName()
         informationPage.companyName("Capgemini");
         //called the addressOne()
         informationPage.addressOne("Railwaystation,kp-street");
         //called the addressTwoo()
         informationPage.addressTwoo("street-No-20/21");
         //called the cityName()
         informationPage.cityName("Akividu");
         //called the states()
         informationPage.states();
         //called the postalCode()
         informationPage.postalCode("53423");
         //called the additional()
         informationPage.additional("None");
         //called the homeNumber()
         informationPage.homeNumber("255235");
         //called the phoneNumber()
         informationPage.phoneNumber("9100547980");
         //called the furtherAddress()
       informationPage.furtherAddress("same-Address");  
       //called the registerButton()
       informationPage.registerButton();
     //after register page validation
       String exceptedTitletwo="My account - My Store";
       //string title
       String actualTitleone=driver.getTitle();
       if(actualTitleone.equalsIgnoreCase(exceptedTitletwo))
       {
       	System.out.println("account-true");
       }
       else
       {
       	System.out.println("false");
       }
       //create an object of AddProductToTheCard
       AddProductToTheCard addProductToTheCard=new AddProductToTheCard(driver);
       //called the searchItem()
       addProductToTheCard.searchItem();
       //called the searchClick()
        addProductToTheCard.searchClick();
        //called the addToCartItem()
        addProductToTheCard.addToCartItem();
        //called the checkOutButton()
        addProductToTheCard.checkOutButton();
        //called the checkIn()
        addProductToTheCard.checkIn();
        //called the addressCont()
        addProductToTheCard.addressCont();
        //called the agreeCheck()
        addProductToTheCard.agreeCheck();
        //called the shippingAdd()
        addProductToTheCard.shippingAdd();
		//payement page validation
        String exceptedTitle="Order - My Store";
        //string title
        String actualTitle=driver.getTitle();
        if(actualTitle.equalsIgnoreCase(exceptedTitle))
        {
        	System.out.println("payment-true");
        }
        else
        {
        	System.out.println("false");
        }
        
	}

}
