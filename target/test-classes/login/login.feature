Feature: Test the Guru99 Login
1) Valid Case
2) Invalid Case
Scenario Outline: Test guru99 with valid and invalid data
Background:
Given i should open the browser and naviagte to the login page of guru99
@PositiveTesting
Scenario: To test login with valid Credentials
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the login button
Then i should see the title as "Login: Mercury Tours"
Examples:
|user |pass |
|user |user |
|admin|admin|
@NegativeTesting
Scenario: To Test the Login with invalid Credentials
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the login button
Then i should see the title as "Welcome: Mercury Tours"
Examples:
|user  |pass  |
|mxk   |dsdf  |
