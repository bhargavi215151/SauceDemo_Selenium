package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LogOut;
import com.saucedemo.base.SaucedemoBase;

public class LogOutTest extends SaucedemoBase{
	LogOut log;
	
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		log = new LogOut();
	}
	
	@Test
	public void logoutClickTest() throws InterruptedException {
		log.logoutClick();
	}
	
	
	@Test
	public void loginTextTest() throws InterruptedException {
		log.loginText();
	}
	
	 
	 @AfterMethod
	public void closeSetup() {
		tearDown();
		
	}
	
}
