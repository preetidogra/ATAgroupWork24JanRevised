Feature: Logout feature check

Scenario: To validate logout feature
Given User is logged in
Then User clicks on the menu
Then User click on the dropdown list
When User clicks on Logout link
Then User is logged out

