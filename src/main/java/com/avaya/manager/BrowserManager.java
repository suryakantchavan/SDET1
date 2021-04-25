package com.avaya.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {

	static WebDriver driver;

	private static BrowserManager instance = null;

	private BrowserManager() {

	}

	public static BrowserManager getInstance() {
		if (instance == null) {

			instance = new BrowserManager();
		}

		return instance;

	}

	public synchronized void intialsWebDriver(String borwserType) {
		if (borwserType.equals("chrome")) {

			String chromeDriverName = "chromedriver.exe";
			String driverPath = "./Driver/";
			System.setProperty("webdriver.chrome.driver", driverPath + chromeDriverName);
			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		
		
	}
	
	
	public static WebDriver  getDriver()
	{
		return driver;
		
	}
}
