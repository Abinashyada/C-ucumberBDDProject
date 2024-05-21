Feature: Adactin home page valication

Background: 
Given User lunch the Adactin url
When User Enter the "<UserName>" and "<Password>"
Then User click on login button
@Test
Scenario: validate the search hotel
When User select the location
Then User select the hotel
And User select the room type and room number
 