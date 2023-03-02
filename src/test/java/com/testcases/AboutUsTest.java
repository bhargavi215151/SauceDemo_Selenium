package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.AboutUs;
import com.saucedemo.base.SaucedemoBase;

public class AboutUsTest extends SaucedemoBase {
	AboutUs abt ;
	
	@BeforeMethod
	public void setup() {
		initialization();
		abt = new AboutUs();
	}
	
	@Test
	public void loginTest() {
		abt.login();
	}
	
	@Test
	public void aboutusTest() throws InterruptedException {
		abt.clickAboutus();
	}
	
	@Test
	public void aboutUsImageTest() throws InterruptedException {
		abt.aboutpageImage();
	}
	
	@Test
	public void searchTest() throws InterruptedException {
		abt.search();
			
	}
	
	@Test
	public void productDropDownTest() throws InterruptedException {
		abt.productsDropDown();
	}
	
	@Test
	public void footerTest() throws InterruptedException {
		abt.validateFooterLinks();
	}
	
	@Test
	public void blogTextTest() throws InterruptedException {
		abt.blogText();
		
	}
	
	@Test
	public void blogToBack() throws InterruptedException {
		abt.blogPage();
	}
	
	@Test
	public void latestResourceTest() throws InterruptedException {
		abt.latestResource();
		
	}
	
	@Test
	public void privacyPolicyTest() throws InterruptedException {
		abt.privacyPolicy();
	}
	
	@Test
	 public void saucecrossbrowserImage() throws InterruptedException {
		 abt.saucecrossbrowserImage();
	 }
	
	@Test
	public void sauceMobileClick() throws InterruptedException {
		abt.sauceMobileClick();
	}
	 
	@Test
	 public void scrollToClickTest() throws InterruptedException {
		 abt.scrollToClick();
	 }
	 
	 @AfterMethod
	public void closeSetup() {
		tearDown();
		
	}
}
