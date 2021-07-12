Feature: Going on the women category page through automationpractice app
  Scenario: Validate user is able to navigate to women page without having to sign in
    Given chrome bowser is open by the user
    Given user is on automationpractice app
    When user clicks on the women link on top
    Then user should be navigated to women category page

Feature: Sign in on automationpratice app
  Scenario: Validate user is able to log in using right credentials
    Given chrome browser is open by the user
    Given user has got an account already on automationpractice app
    Given user is on automationpractice app
    Given user is on the homepage
    When user clicks on sign in
    Then user should be on authentication page
    When user enters valid username "<string>" and password "<string>" and click on log in
    Then user should be on his account page
    And user should see his name he used to create an account on the top right hand side of the screen


