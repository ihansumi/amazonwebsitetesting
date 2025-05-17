package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCartPage {

WebDriver driver;
	
	public AddCartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Add to cart
		public void addtocart() {
			WebElement itemlocate=driver.findElement(By.xpath("//span[@id='productTitle' and contains(@class, 'a-size-large')]"));
			WebElement listadd=driver.findElement(By.xpath("//a[@title='See All Buying Options']"));
			listadd.click();
			WebElement addcart=driver.findElement(By.xpath("//input[@name='submit.addToCart']"));
			addcart.click();
		}
		//Navigate to cart page
		public void navigatecart() {
			
			WebElement addcart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			addcart.click();
		}
		public String verifyprodprice() {
			WebElement verprice=driver.findElement(By.xpath("//body[@class='a-m-us a-aui_72554-c a-aui_a11y_6_837773-c a-aui_killswitch_csa_logger_372963-t1 a-aui_template_weblab_cache_333406-c a-bw_aui_cxc_alert_measurement_1074111-c a-meter-animate']"));
			String actual_product=verprice.getText();
			return actual_product;
		}
		public void VerifyQuantity() {
			WebElement quant=driver.findElement(By.xpath("//span[@class='a-dropdown-prompt' and normalize-space(text())='1']"));
			quant.click();
			
		}
}
