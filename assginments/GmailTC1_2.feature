Feature: Login Functionality Feature

In order to ensure Login Functionality works,
I want to run the cucumber test to verify it is working

Scenario: Login Functionality

Given user navigates to www.gmail.com
When user logs in using Username as sureshreddy.sys and Password PASSWORD
Then login should be successful

Scenario: Login Functionality

Given user navigates to www.gmail.com
When user logs in using Username as sureshreddy.sys and Password PASSWORD1
Then login should be unsuccessful

