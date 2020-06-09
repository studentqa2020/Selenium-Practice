package com.page.object.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public  LoginPage(WebDriver driver){
		
			PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class ='login']")
	private WebElement signINBtn;

	public WebElement getSignINBtn() {
		return signINBtn;
	}

	
	@FindBy(xpath="//*[@id='email']")
	private WebElement emailInputBox;
	
	public WebElement getemailInputBox(){	
	return emailInputBox;
	}
	
}
