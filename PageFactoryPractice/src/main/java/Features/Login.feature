Feature: Login on autmationpractice application

Scenario: user should be able to login using valid credentials
Given browser is open
And click on signin link on home page
And this will take the user to login page
When user enters valid "username" and "password" and click on log in
Then verify user is sucessfully loged in

