package com.pages;

import org.openqa.selenium.By;

import com.saucedemo.base.SaucedemoBase;

public class LogOut extends SaucedemoBase{
    

	public void login(){
		driver.findElement(By.xpath(prop.getProperty("usernamepath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passxpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginxpath"))).click();
	}
	public void logoutClick() throws InterruptedException {
		login();
		driver.findElement(By.xpath(prop.getProperty("menubar"))).click();
		driver.findElement(By.xpath(prop.getProperty("logout"))).click();
		Thread.sleep(2000);
	}
	
	public void loginText() throws InterruptedException {
		logoutClick();
		 if(driver.getPageSource().contains("Swag Labs")){
			 System.out.println("Text is present:Swag Labs");
			 }else{
			 System.out.println("Text is absent");
			 }	
	}
	
	
	
}
