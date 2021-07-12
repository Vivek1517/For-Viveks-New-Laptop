$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/LoginTests.feature");
formatter.feature({
  "name": "User login for Automation Practise",
  "description": "  As a user\n  I want to Login successfully\n  So that I can access my account",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.selectSignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the authentication page",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifyAuthenticationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see SignUp panel",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifySingUpPanel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify User can login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke1"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "I enter username as testaccount@mailinator.com, password as Password1",
  "keyword": "When "
});
formatter.match({
  "location": "AuthenticationPageSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click SignIn",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.clickSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Should be loggedIn successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountPageSteps.verifyLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on MyAccount page",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountPageSteps.iShouldBeOnMyAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify User can see vaidation messages for invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke2"
    }
  ]
});
formatter.step({
  "name": "I enter username as \u003cemail\u003e, password as \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click SignIn",
  "keyword": "And "
});
formatter.step({
  "name": "I should not be loggedIn",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see validation message as \u003cmessage\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "",
        "",
        "An email address required."
      ]
    },
    {
      "cells": [
        "sdfdsf",
        "sdfsdf",
        "Invalid email address."
      ]
    },
    {
      "cells": [
        "testaccount@mailinator.com",
        "sdfsdf",
        "Authentication failed."
      ]
    },
    {
      "cells": [
        "testaccount@mailinator",
        "sdfsdf",
        "enter valid email address."
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.selectSignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the authentication page",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifyAuthenticationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see SignUp panel",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifySingUpPanel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify User can see vaidation messages for invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke2"
    }
  ]
});
formatter.step({
  "name": "I enter username as , password as ",
  "keyword": "When "
});
formatter.match({
  "location": "AuthenticationPageSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click SignIn",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.clickSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should not be loggedIn",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldNotBeLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see validation message as An email address required.",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldSeeValidationMessageAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.selectSignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the authentication page",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifyAuthenticationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see SignUp panel",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifySingUpPanel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify User can see vaidation messages for invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke2"
    }
  ]
});
formatter.step({
  "name": "I enter username as sdfdsf, password as sdfsdf",
  "keyword": "When "
});
formatter.match({
  "location": "AuthenticationPageSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click SignIn",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.clickSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should not be loggedIn",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldNotBeLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see validation message as Invalid email address.",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldSeeValidationMessageAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.selectSignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the authentication page",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifyAuthenticationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see SignUp panel",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifySingUpPanel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify User can see vaidation messages for invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke2"
    }
  ]
});
formatter.step({
  "name": "I enter username as testaccount@mailinator.com, password as sdfsdf",
  "keyword": "When "
});
formatter.match({
  "location": "AuthenticationPageSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click SignIn",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.clickSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should not be loggedIn",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldNotBeLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see validation message as Authentication failed.",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldSeeValidationMessageAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.selectSignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the authentication page",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifyAuthenticationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see SignUp panel",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.verifySingUpPanel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify User can see vaidation messages for invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke2"
    }
  ]
});
formatter.step({
  "name": "I enter username as testaccount@mailinator, password as sdfsdf",
  "keyword": "When "
});
formatter.match({
  "location": "AuthenticationPageSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click SignIn",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.clickSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should not be loggedIn",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldNotBeLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see validation message as enter valid email address.",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.iShouldSeeValidationMessageAs(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[enter ]valid email address.\u003e but was:\u003c[In]valid email address.\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat automationPractice.StepDefs.AuthenticationPageSteps.iShouldSeeValidationMessageAs(AuthenticationPageSteps.java:62)\n\tat ✽.I should see validation message as enter valid email address.(file:src/test/features/LoginTests.feature:32)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});