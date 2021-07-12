Feature: Create an Account

  @regression
  Scenario Outline: Verify user is not able to create an account without providing mandatory information.
    Given user is on automationpractice site
    When  user clicks on sign in
    And user enters email as "<email>" under create an account heading
    And user selects create an account
    Then user should navigate to create an account page
    And user provide title "<title>", first name "<first name>", last name "<last name>" and password "<password>"
    And user selects DOB "<DOB>", month "<month>" and year "<year>"
    And user provide address "<address>", city "<city>" and post code "<post code>"
    And selects state "<state>" and country "<country>"
    And enters a mobile number "<mobile number>"
    And clicks on register
    Then user should see an error message as "<error>"
    Examples:
      | email          | title | first name | last name | password | DOB | month | year | address            | city     | post code | state  | country       | mobile number | error                                        |
      | hfhf@gmail.com | Mr    | Vicky      | Talvar    | ehey8990 | 6   | 7     | 1979 | 2816  Seneca Drive | Portland | 97205     | Oregon | United States |               | You must register at least one phone number. |


  @smoke
  Scenario Outline: Verify user is not able to create an account without providing mandatory information.
    Given user is on automationpractice site
    When  user clicks on sign in
    And user enters email as "<email>" under create an account heading
    And user selects create an account
    Then user should navigate to create an account page
    When user provide title "<title>", first name "<first name>", last name "<last name>" and password "<password>"
    And user selects DOB "<DOB>", month "<month>" and year "<year>"
    And user provide address as below:
      | 1 Test Street | Test City | TE5T 1NG |
    And selects state "<state>" and country "<country>"
    And enters a mobile number "<mobile number>"
    And clicks on register
    Then user should see an error message as "<error>"
    Examples:
      | email          | title | first name | last name | password | DOB | month | year | address            | city     | post code | state  | country       | mobile number | error                                        |
      | hfhf@gmail.com | Mr    | Vicky      | Talvar    | ehey8990 | 6   | 7     | 1979 | 2816  Seneca Drive | Portland | 97205     | Oregon | United States |               | You must register at least one phone number. |

