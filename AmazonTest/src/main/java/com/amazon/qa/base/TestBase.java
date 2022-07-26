package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.amazon.qa.util.TestUtil;

public class TestBase {
	//global variables
	public static WebDriver driver;
	public static Properties prop;
	
	
	//constructor class to initialize obj/prop variable initialized
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/ponkarthika/git/Automation-POM_July21/AmazonTest/"
					+ "src/main/java/com/amazon/qa/config");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
//global variable driver also initialized
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome") ) {
			System.setProperty("webdriver.chrome.driver", "//Users//ponkarthika//Downloads//chromedriver");
			ChromeOptions options= new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			
			driver = new ChromeDriver(options);
		}
		/*else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "//Users//ponkarthika//Downloads//geckodriver");
			driver = new FirefoxDriver();
			*/
			
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}

