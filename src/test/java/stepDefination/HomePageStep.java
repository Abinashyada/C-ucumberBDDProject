package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.HomePage;
import testbase.TestBase;

public class HomePageStep extends TestBase {
	
	HomePage home= new HomePage();
	
@When("User select the location")
public void user_select_the_location() {
	HomePage home= new HomePage();
	home.setLocation();
    
}

@Then("User select the hotel")
public void user_select_the_hotel() {
	home.setHotel();
     
}

@Then("User select the room type and room number")
public void user_select_the_room_type_and_room_number() {
    home.setRoom();
}
 



}
