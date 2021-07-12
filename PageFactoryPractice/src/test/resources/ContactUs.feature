Feature: contact us
  Scenario: user should be able to navigate to contact us page
    Given chrome broswer is open
    Given user is on automationpractice app
    Given user clicks on contact us link
    Then user should be on contact us page & should see the contact us form