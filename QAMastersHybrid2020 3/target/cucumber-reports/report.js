$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/AuthenticationPage.feature");
formatter.feature({
  "name": "User login for Automation Practise",
  "description": "  As a user\n  I want to Login successfully\n  So that I can access my account",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify user can go to Create an Account page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke1"
    }
  ]
});
