Feature: Going on the women category page through automationpractice app
  Scenario: Validate user is able to navigate to women page without having to sign in
    Given chrome bowser is open by the user
    Given user is on automationpractice app
    When user clicks on the women link on top
    Then user should be navigated to women category page




