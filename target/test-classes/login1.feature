@Instagram
Feature: To validate the login functionality of the given applicatioN

@Regression
Scenario: To verify the login functionality with invalid username and valid password for INStagram
    And User will hit the Url of app
    When User will enter the Username anD Password
    And User will click the LogIn buttoN
    Then User should be displayed with Error MsG