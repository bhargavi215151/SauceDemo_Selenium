package com.saucedemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SaucedemoBase {

	public static WebDriver driver;
    public static Properties prop;
   
 
    public void initialization() {
    	configProp();
    	String projectPath = System.getProperty("user.dir");
		System.out.println("project path is:" +projectPath);
	System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
   	driver =  new ChromeDriver();
   	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
   	driver.manage().window().maximize();
   	driver.get("https://www.saucedemo.com/");
    }
    
   
    public void configProp()   {
		 prop = new Properties();
		 String propPath = "./src/main/java/com/properties/config.properties";
		 FileInputStream fp;
		 try {
		 fp = new FileInputStream(propPath);
		    prop.load(fp);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("unable to read property file");
		}
  	   
			  
	  }
    public void tearDown() {
    	driver.quit();
    }


}
