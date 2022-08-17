Feature: Test Login
Scenario: Check login functionality

Given Open browser and navigate to url
When enter valid username and password
And click on the login button
Then click on the logout button and close the browser 
