@Login2
Feature: AdminLogin to HRM home page
In Order to Loginto Orange HRM
As a Admin with validUserName and Password
I want to EnterUserName, Password, click on Login Button to Access

Scenario: Positive- AdminLogin Successfully
Given Admin Navigateto HRM Login page
When Admin enter validUserName and Password
And click on Loginbutton
Then Admin will land in Adminhome page