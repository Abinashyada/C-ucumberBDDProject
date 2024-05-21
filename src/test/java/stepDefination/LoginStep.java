package stepDefination;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.LoginPage;
import testbase.TestBase;

public class LoginStep extends TestBase{
	 
	LoginPage page= new LoginPage();
@Given("User lunch the Adactin url")
public void user_lunch_the_adactin_url() {
	System.out.println("lunchin browser");
	TestBase.initialize();
    
}
@When("User Enter the {string} and {string}")
public void user_enter_the_and(String string, String string2) {
	System.out.println("UserName And Password");
	LoginPage page= new LoginPage();
	page.setUserAndPassword(prop.getProperty("username"), prop.getProperty("userpassword"));
	System.out.println("UserNamesss And Passworddss");
}
	 
@Then("User click on login button")
public void user_click_on_login_button() {
	LoginPage page= new LoginPage();
	System.out.println("login button");
    page.setloginButton();
}
@Then("User validate the home page title")
public void user_validate_the_home_page_title() {
	LoginPage page= new LoginPage();
	System.out.println("title");
	page.getTitle();
    
}
@When("User Enter the invalid {string} and {string}")
public void user_enter_the_invalid_and(String string, String string2) {
	LoginPage page= new LoginPage();
	page.setInvalidLogin(prop.getProperty("User"), prop.getProperty("Passwords"));
}
}