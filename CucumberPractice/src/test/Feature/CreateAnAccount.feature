Feature: Create an Account
@Regression
Scenario Outline: Verify user is not able to create an account without providing mandatory information.
  When  user clicks on sign in
  When user enters valid detail "<detail>" under create an account heading
  And clicks on create an account button
  Then user should navigate to create an account page
  And selects title "<title>", first name "<first name>", last name "<last name>" and password "<password>"
  And chooses date of birth "<date of birth>", month "<month>" and year "<year>"
  And types in address "<address>", city "<city>" and post code "<post code>"
  And selects state "<state>" and country "<country>"
  And enters a mobile number "<mobile number>"
  And clicks on register
  Then user should see an error "<error>"
  Examples:
    | detail         | title | first name | last name | password | date of birth | month | year | address            | city     | post code | state  | country       | mobile number | error                                        |
    | hfhf@gmail.com |Mr| Vicky      | Talvar    | ehey8990 |6  |7 |1979| 2816  Seneca Drive | Portland | 97205     | Oregon | United States |               | You must register at least one phone number.                         |
