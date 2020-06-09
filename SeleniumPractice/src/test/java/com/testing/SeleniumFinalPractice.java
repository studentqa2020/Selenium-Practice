package com.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page.object.modal.LoginPage;

public class SeleniumFinalPractice {

	public static void main(String[] args) throws  Throwable  {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);// upcasting
		driver.manage().window().maximize();//all the time
		driver.get("https://www.facebook.com/");
		System.out.println("Title of my current page :: "+driver.getTitle());
		System.out.println("URL of my Current Page :: "+driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		System.out.println("Title of my current page :: "+driver.getTitle());
		System.out.println("URL of my Current Page :: "+driver.getCurrentUrl());
		
		driver.manage().deleteAllCookies();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;//type casting
//		js.executeScript("script", "object or element");
//		
//		TakesScreenshot ts = (TakesScreenshot)driver ;//type casting
//		ts.getScreenshotAs(OutputType.FILE);
		
		
		
		
		
//		String filepath="./Config.propeties";
//		FileInputStream fis = new FileInputStream(filepath);//bytecode 
//		Properties pro = new Properties();
//		pro.load(fis);
//		
//		//System.out.println(pro.getProperty("URL"));
//		driver.navigate().to(pro.getProperty("URL"));// 1 URL
//		driver.manage().window().maximize();
//		LoginPage pf = new LoginPage(driver);
//		JavascriptExecutor obj = (JavascriptExecutor) driver;
//		obj.executeScript("arguments[0].style.border='3px solid red'", pf.getSignINBtn());
//		
//		//Selenium
//		pf.getSignINBtn().click();//
//		pf.getSignINBtn().submit();
//		//Actions class
//		Actions ac= new Actions(driver);
//		ac.click().perform();
//		ac.clickAndHold().perform();
//		ac.contextClick().perform();
//		ac.doubleClick().perform();
//		//JE ....click
//		JavascriptExecutor js = (JavascriptExecutor)driver ;
//		js.executeScript("java script", pf.getSignINBtn());
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver, 5);//best wait
//		wait.until(ExpectedConditions.elementToBeClickable(pf.getemailInputBox()));
//		obj.executeScript("arguments[0].style.border='3px solid red'", pf.getemailInputBox());
//		pf.getemailInputBox().sendKeys(pro.getProperty("email"));// 2 email
	}

}
