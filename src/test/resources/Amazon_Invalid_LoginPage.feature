Feature: Amazon Invalid LoginPage Functionality

@Amazon_InvalidLoginPage
Scenario: Validate Invalid LoginPage
Given Chrome Browser Open
Then Enter the URL
Then Move to Hello Sigin In Element
Then Click on Sigin In Button
Then Enter Mobile Number or Email ID
Then Click on Continue Button
Then Enter Invalid Password
Then Click on Login Button
Then Validate Error Msg