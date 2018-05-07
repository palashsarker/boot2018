@login
Feature: Admin Login to HRM home page
In Order to Login to Orange HRM
As a Admin with valid UserName and Password
I want to Enter UserName, Password, click on Login Button to Access

Scenario: Positive- Admin Login Successfully
Given Admin Navigate to HRM Login page
When Admin enter valid UserName and Password
And click on Login button
Then Admin will land in Admin home page