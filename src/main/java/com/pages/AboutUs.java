package com.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.saucedemo.base.SaucedemoBase;

public class AboutUs extends SaucedemoBase {

	
	public void login(){
		driver.findElement(By.xpath(prop.getProperty("usernamepath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passxpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginxpath"))).click();
	}
	
	public void clickAboutus() throws InterruptedException {
		 login();
		driver.findElement(By.xpath(prop.getProperty("menubar"))).click();
	    driver.findElement(By.xpath(prop.getProperty("aboutus"))).click();
	}
	
	 public void aboutpageImage() throws InterruptedException {
			clickAboutus();
			  boolean isElementVisible = driver.findElement(By.xpath(prop.getProperty("aboutusImage"))).isDisplayed();
	          System.out.println("we found the element -"+ isElementVisible);
	 }
	 
	public void search() throws InterruptedException {
		clickAboutus();
		driver.findElement(By.xpath(prop.getProperty("search"))).click();
		 WebElement key = driver.findElement(By.xpath(prop.getProperty("searchText")));
		 key.sendKeys("Developers");
		 key.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath(prop.getProperty("searchone"))).click();
		 Thread.sleep(2000);
			
	}
	
	
	public void productsDropDown() throws InterruptedException {
		clickAboutus();
		driver.findElement(By.xpath(prop.getProperty("products"))).click();
		 driver.findElement(By.xpath(prop.getProperty("productdropdown"))).click();
		 Thread.sleep(2000);
	}
	
	public void validateFooterLinks() throws InterruptedException {
		clickAboutus();
		WebElement element = driver.findElement(By.xpath(prop.getProperty("footers")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); element.click();
		
	}
	
	public void blogText() throws InterruptedException {
		 clickAboutus();
		 driver.findElement(By.xpath(prop.getProperty("resources"))).click();
		 driver.findElement(By.xpath(prop.getProperty("blogs"))).click();
			 if(driver.getPageSource().contains("Sauce Labs Blog")){
				 System.out.println("Text is present");
				 }else{
				 System.out.println("Text is absent");
		          }
	}
	public void blogPage() throws InterruptedException {
		 clickAboutus();
		 driver.findElement(By.xpath(prop.getProperty("resources"))).click();
		 driver.findElement(By.xpath(prop.getProperty("blogs"))).click();
		 driver.findElement(By.xpath(prop.getProperty("blogtoback"))).click();
		 Thread.sleep(2000);
	}
	
	public void latestResource() throws InterruptedException {
		 clickAboutus();
		 if(driver.getPageSource().contains("Latest resources")){
			 System.out.println("Text is present:Latest resources");
			 }else{
			 System.out.println("Text is absent");
	          }
    }

   public void privacyPolicy() throws InterruptedException {
	   clickAboutus();
	   driver.findElement(By.xpath(prop.getProperty("privacypolicy"))).click(); 
	   if(driver.getPageSource().contains("Privacy Policy")){
			 System.out.println("Text is present:Privacy Policy");
			 }else{
			 System.out.println("Text is absent");
	          }   
   }

  public void saucecrossbrowserImage() throws InterruptedException {
	  clickAboutus();
	  driver.findElement(By.xpath(prop.getProperty("saucecrossbrowser"))).click();
          boolean isElementVisible = driver.findElement(By.xpath(prop.getProperty("saucecrossImage"))).isDisplayed();
          System.out.println("we found the element -"+ isElementVisible);
  }


  public void sauceMobileClick() throws InterruptedException {
	  clickAboutus();
	  driver.findElement(By.xpath(prop.getProperty("saucemobile"))).click(); 
  }
  
  public void scrollToClick() throws InterruptedException {
	  clickAboutus();
	  driver.findElement(By.xpath(prop.getProperty("scrollto"))).click(); 
  }


}





