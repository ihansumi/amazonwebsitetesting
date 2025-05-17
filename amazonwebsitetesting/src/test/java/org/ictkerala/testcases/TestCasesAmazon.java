package org.ictkerala.testcases;

import org.ictkerala.base.InitialSettingsAmazon;
import org.ictkerala.pages.AddCartPage;
import org.ictkerala.pages.HomePageAmazon;
import org.ictkerala.pages.ProductDetailsPage;
import org.ictkerala.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesAmazon extends InitialSettingsAmazon {
	
	HomePageAmazon lobj;
    SearchPage sobj;
    ProductDetailsPage pobj;
    AddCartPage aobj;

    @BeforeClass
    public void initPageObjects() {
        lobj = new HomePageAmazon(driver);
        sobj = new SearchPage(driver);
        pobj = new ProductDetailsPage(driver);
        aobj = new AddCartPage(driver);
    }

	@Test(priority=1)
	public void TC_001() {
	//Navigate to Amazon home page	
	String Actual_url=lobj.verifyLogin();
	Assert.assertEquals(Actual_url, Constants.Expected_url);		
	}
	//verify the Homepage Title
	@Test(priority=2)
	public void TC_002() {
		String org_text=lobj.amazonverify();
		Assert.assertEquals(org_text, Constants.Expected_text);
	}
	
	//Verify the Signin button visibility
	@Test(priority=3)
	public void TC_003() {
		String Actual_signtext=lobj.signinVisibility();
		Assert.assertEquals(Actual_signtext, Constants.Expected_signmsg);
	}
	
	//Verify the Cart Visibility
	@Test(priority=4)
	public void TC_004() {
		lobj.cartVisibile();
	}
	//Search for Bluetooth headphone
	@Test(priority=5)	
	public void TC_005() {
		sobj.searchbar("Bluetooth headphones");
	}
	
	//Verify bluetooth search results
	@Test(priority=6)
	public void TC_006() {
	String searchres=sobj.verifyresults();
	Assert.assertEquals(searchres, Constants.Expect_result_text);
		
	}
	//Verifying and selecting filter dropdown option
	@Test(priority=7)
	public void TC_007() {
		sobj.filter();
	}
	@Test(priority=8)
	//Clicking on one product
	public void TC_008() {
		pobj.clickobject();
	}
	//Verifying the product title
	@Test(priority=9)
	public void TC_009() {
		String Actual_title=pobj.verifyprodtitle();
		Assert.assertEquals(Actual_title, Constants.Exp_prod_title);
	}
	@Test(priority=10)
	//locate cart,price and availability
	public void TC_010() {
		pobj.pricecart();
	}
	@Test(priority=11)
		public void TC_011() {
			aobj.addtocart();
			aobj.navigatecart();		
	}
	@Test(priority=12)
	public void TC_012() {
		aobj.verifyprodprice();
		String Actaul=aobj.verifyprodprice();
		Assert.assertEquals(Actaul, Constants.Exp_price);
		
	}
	@Test(priority=13)
	public void TC_013() {
		aobj.VerifyQuantity();
	}
}

