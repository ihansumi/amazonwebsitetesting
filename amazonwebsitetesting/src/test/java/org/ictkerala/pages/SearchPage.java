package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	//search for Bluetooth headphones
	public void searchbar(String btooth) {
		WebElement Searchbarfind=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Searchbarfind.click();
		Searchbarfind.sendKeys(btooth);
		//search button
		WebElement blutoothsearch=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		blutoothsearch.click();
	}
	//Verify search result is displayed
	public String verifyresults() {
		WebElement results=driver.findElement(By.xpath("//h2[contains(normalize-space(text()), 'Results')]"));
		String result_text=results.getText();
		return result_text;
	}
	//Verify filter options
	public void filter() {
		WebElement fildrop=driver.findElement(By.xpath("//span[@class='a-dropdown-label']"));
		fildrop.click();
		WebElement filteropt=driver.findElement(By.xpath("//select[@id='s-result-sort-select']/option[text()='Price: Low to High']"));
		filteropt.click();
	}

}
