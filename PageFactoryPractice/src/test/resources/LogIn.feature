Feature: Sign in on automationpratice app
  Scenario: Validate user is able to log in using valid credentials
    Given chrome browser is open by the user
    Given user has got an account already on automationpractice app
    Given user is on automationpractice app
    Given user is on the homepage
    When  user clicks on sign in
    Then user should be on authentication page
    When user enters valid username "<string>" and password "<string>"
    And  user clicks on log in
    Then user should be on his account page
    And  user should see username on the page