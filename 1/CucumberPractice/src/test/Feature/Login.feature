@smoke
Feature: login on automationpractice system

  Background:
    Given user is on automationpractice site
    When  user clicks on sign in
    Then  user should navigate to authentication page

  @smoke1
  Scenario: verify user is able to login using valid credentials
    When user enters valid username "vicky_sturd@hotmail.com" and password "Vivek123"
    And  click on log in
    Then he should be log in successfully & navigate to my account page
    And  he should see his name on the page

  @smoke2
  Scenario Outline: verify user is not able to log in using invalid credentials
    When user enters valid "<username>" and invalid "<password>"
    And  click on log in
    Then user should get a validation message "<validation_message>"

    Examples:
      | username                | password | validation_message         |
      | vicky_sturd@hotmail.com | vivek123 | Authentication failed.     |
      |                         | Vivek123 | An email address required. |
      | vicky_sturd@hotmail.com |          | Password is required.      |

