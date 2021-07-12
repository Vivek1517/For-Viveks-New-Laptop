Feature: User login for Automation Practise
  As a user
  I want to Login successfully
  So that I can access my account

  @regression  @smoke1
  Scenario: verify user can go to Create an Account page
    Given I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignUp panel
    When I Enter EmailId as "Sonalirshah@hotmail.com"
    And I click Create An Account Button
    Then I Should be on the Registration page

  Scenario: verify user can not register without providing mandatory fields
    Given I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignUp panel
    When I Enter EmailId as "Sonalirshah@hotmail.com"
    And I click Create An Account Button
    Then I Should be on the Registration page
    When I select register
    Then I should see error message as "please provide data to mandatory fields"


  Scenario: verify user can not register with invalid data
    Given I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignUp panel
    When I Enter EmailId as "Sonalirshah@hotmail.com"
    And I click Create An Account Button
    Then I Should be on the Registration page
    When  I provide firsntame as "!@£$%^&*"
    When  I provide lastname as "£$%^&"
    When  I provide password as "Password1"
    When  I provide confirm password as "Password1"
    When I select register
    Then I should see error message as "please provide valida firstname"

  Scenario: verify user can not register when password doesnt match with confirm password
    Given I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignUp panel
    When I Enter EmailId as "Sonalirshah@hotmail.com"
    And I click Create An Account Button
    Then I Should be on the Registration page
    When  I provide firsntame as "sri"
    When  I provide lastname as "test"
    When  I provide password as "Password1"
    When  I provide confirm password as "Password12"
    When I select register
    Then I should see error message as "password does not match with confrim password"


  # Happy Path scenarios:
  @regression @smoke1
  Scenario: Verify User can login with valid credentials
    Given I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignIn panel
    When I enter username as "testaccount@mailiantor.com", password as "Password1"
    And I click SignIn
    Then I Should be loggedIn successfully
    And I should be on MyAccount page

 # UnHappy Path scenarios:
#  @regression
#  Scenario: Verify User can not login with invalid credentials
#    Given  I am on the homepage
#    When I select SignIn link
#    Then I should be on the authentication page
#    And I should see SignIn panel
#    When I enter username as "srikanth", password as "sdfsdfdsf"
#    And I click SignIn
#    Then I should not be loggedIn
#    And I should see validation message as "Invalid email address."
#
#  @regression
#  Scenario: Verify User can see validation message when fields left blank
#    Given I am on the homepage
#    When I select SignIn link
#    Then I should be on the authentication page
#    And I should see SignIn panel
#    When I enter username as "", password as ""
#    And I click SignIn
#    Then I should not be loggedIn
#    And I should see validation message as "An email address required"
#
#  @regression
#  Scenario: Verify User can dee validation message for invalid credentials
#    Given  I am on the homepage
#    When I select SignIn link
#    Then I should be on the authentication page
#    And I should see SignIn panel
#    When I enter username as "testaccount@mailinator.com", password as "sdfsdfdsf"
#    And I click SignIn
#    Then I should not be loggedIn
#    And I should see validation message as "Authentication failed."


  @regression @smoke
  Scenario Outline: Verify User can see vaidation messages for invalid credentials
    Given  I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignIn panel
    When I enter username as <email>, password as <password>
    And I click SignIn
    Then I should not be loggedIn
    And I should see validation message as <message>
    Examples:
      | email                      | password | message                    |
      |                            |          | An email address required. |
      | sdfdsf                     | sdfsdf   | Invalid email address.     |
      | testaccount@mailinator.com | sdfsdf   | Authentication failed.     |
      | testaccount@mailinator     | sdfsdf   | enter valid email address. |










