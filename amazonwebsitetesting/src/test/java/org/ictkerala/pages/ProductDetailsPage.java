package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {
	
	WebDriver driver;
	
	public ProductDetailsPage(WebDriver driver) {
		this.driver=driver;
	}
	//Click on one of the objects
	public void clickobject() {
		WebElement object=driver.findElement(By.xpath("//div[@data-component-type='s-search-result']//h2//span[contains(text(), 'Soundcore Anker Life Q20 Hybrid Active Noise Cancelling')]"));
		object.click();
	}
	
	public String verifyprodtitle() {
		WebElement prodTitle=driver.findElement(By.xpath("//span[@id='productTitle' and normalize-space(text())=\"Soundcore Anker Life Q20 Hybrid Active Noise Cancelling Headphones, Wireless Over Ear Bluetooth Headphones, 60H Playtime, Hi-Res Audio, Deep Bass, Memory Foam Ear Cups, Travel, Office, USB-C Charging\"]"));
		String Act_prod_tit=prodTitle.getText();
		return Act_prod_tit;
	}
	//Locate price add to cart
	public void pricecart() {
		WebElement price=driver.findElement(By.xpath("//span[contains(@id,'priceblock')]"));
		WebElement addcart=driver.findElement(By.xpath("//input[@name='submit.addToCart']"));
		addcart.click();
	}

}
