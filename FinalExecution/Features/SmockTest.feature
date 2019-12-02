Feature: Login functionality for WildFire chicago website
  The user should be able to login into the WildFire chicago site if the username and the password are correct.

  @TestLogin
  Scenario: Login with valid credintials
    Given I am on WildFire Home page
    When I complete login with valid credentials
    Then I see profile name as KHOSRUZ ZAMAN
    And I successfully loged out.
    And I closed browser
   
