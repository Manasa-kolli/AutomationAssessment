package com.capgemini.Assementone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductToTheCard {
	
	/*
	 * search item x-path
	 */
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement searchitem;
	/*
	 * saerch button
	 */
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement search;
	
	/*
	 * add to cart button x-path
	 */
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addToCart;
	
	/*
	 * check-out x-path
	 */
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement checkout;
	
	/*
	 * check button x-path
	 */
     @FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
	WebElement check;
     
     /*
      * address x-path
      */
    @FindBy(xpath="//button[@name='processAddress']")
    WebElement addressC;
    
    /*
     * agree x-path
     */
   @FindBy(xpath="//input[@id='cgv']") 
    WebElement  aggree;
    
    /*
     * shippping x-path
     */
    @FindBy(xpath="//button[@name='processCarrier']")
    WebElement shipping;
	
	/*
	 * constructor
	 */
    public AddProductToTheCard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

    /*
     * by the help of this method we can click on add to cart
     */
    public void searchItem() {
       searchitem.sendKeys("T-shirt");
    }
    
    /*
     * by the help of this method we can click on search item
     */
    public void searchClick() {
    	search.click();
    }
    
    /*
     * by the help of this method we can click on add to card
     */
    public void addToCartItem() {
    	addToCart.click();
    }
    
    /*
     * by the help of this method we can click on check out button
     */
    public void checkOutButton() {
    	checkout.click();
    }
    
    /*
     * by the help of this method we can click on check-in button
     */
  public void checkIn() {
   check.click();
   }
  
  /*
   * by the help of this method we can click on addresscont button
   */
  public void addressCont() {
	 addressC.click();
  }
  
  /*
   * by the help of this method we can click on agreecheck button
   */
  public void agreeCheck() {
	  aggree.click();
  }
  
  /*
   * by the help of this method we can click on shippingAdd button
   */
  public void shippingAdd() {
	 shipping.click(); 
  }
}
