package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageAmazon {
	
	WebDriver driver;
	
	public HomePageAmazon(WebDriver driver)
	{		
		this.driver=driver;
	}
	
	//Veryfying the home page url
	
	public String verifyLogin() {
		String Act_url=driver.getCurrentUrl();
		return Act_url;		
	}
	//Verify "amazon" text in Amazon home page
	public String amazonverify() {
	    WebElement htitle = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	    String logo=htitle.getText();
	    return logo;	    
	}

	public void elementVisibility() {
		//locating search bar
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
	}
	public String signinVisibility() {
		//verifying Sign-in text
		WebElement signin=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		String act_signin_text=signin.getText();
		return act_signin_text;		
	}
	//Verify the visibiliTY OF Cart
	public void cartVisibile() {
		WebElement cart=driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		cart.click();
	}
}
