@Facebook
Feature: To validate the login functionality of the given application

  
	@Smoke
  Scenario: To verify the login functionality with invalid username and valid password for facebook
    And User will hit the URl
    When User will enter the username and password
      | Username     | Password   |
      | Selenium     | Java       |
      | SQL          | SQL @123   |
      | Python       | Python@123 |
      | SeleniumAuto | JavaPython |
    And User will click the login button
    Then User should be displayed with error MSG
    And User should be displayed the different URL
    But User should be displayed with Home Page

	@Sanity
  Scenario: To verify the login functionality with valid username and valid password for Instagram
    And User will hit the url of app
    When User will enter the Username and Password
    And User will click the LogIn button
    Then User should be displayed with Error MSG
