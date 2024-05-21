package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//select[@id='location']")
	WebElement location;
  @FindBy(xpath="//select[@id='hotels']")
  WebElement hotel;
  @FindBy(xpath="//select[@id='room_type']")
  WebElement room;
	
	
	 public HomePage(){
		PageFactory.initElements(driver, this);
		
	}
	public void setLocation() {
	Select s= new Select(location);
//	location.click();
	s.selectByIndex(2);
	
	}
	public void setHotel() {
	Select s1= new Select(hotel);
	s1.selectByIndex(2);

	
	}	
	public void setRoom() {
		Select s3= new Select(room);
		s3.selectByIndex(2);

		
		}	
}
