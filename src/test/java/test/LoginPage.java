package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;
 

public class LoginPage extends TestBase {
	 
	@FindBy(xpath="//input[@Id='username']")
	WebElement user;
	@FindBy(xpath="//input[@Id='password']")
	WebElement pass;
	@FindBy(xpath="//input[@Id='login']")
	WebElement login;
	
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
		
	}

	public void setUserAndPassword(String UserName ,String Password) {
		user.sendKeys(UserName);
		pass.sendKeys(Password);
	}
	
	public void setloginButton() {
		login.click();
	}
	public void getTitle() {
		String title= driver.getTitle();
		System.out.println(title);
		 
	}
	public void setInvalidLogin(String User ,String Passwords) {
		user.sendKeys(User);
		pass.sendKeys(Passwords);
		
	}

	 
		
	}
