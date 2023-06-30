Feature: OrangeHRM Application Functionalities Testing

Background:
Given User should Launch Edge Browser

@Smoke
Scenario: Validating OrangeHRM Application LogIn Page
Given User should Launch Edge Browser
When User Enters OrangeHRM Applicatioin Url Address
Then User should be able to Navigate to OrangeHRM Application LogIn Page
Then User should Close the OrangeHRM Application 

@Smoke @Sanity
Scenario: Validating OrangeHRM Application LogIn Functionality
Given User should Launch Edge Browser
When User Enters OrangeHRM Applicatioin Url Address
Then User should be able to Navigate to OrangeHRM Application LogIn Page
Then User should enter UserName and Password and click on logIn button
Then User should be navigated to OrangeHRM Application Home Page
Then User should logOut from the OrangeHRM Application
Then User should Close the OrangeHRM Application

@LogInTestWithTestData
Scenario Outline: Validating OrangeHRM Application LogIn Functionality with Multiple TestData
Given User should Launch Edge Browser
When User Enters OrangeHRM Applicatioin Url Address
Then User should be able to Navigate to OrangeHRM Application LogIn Page
Then User should enter "<UserName>" and "<Password>" and click on logIn button
Then User should be navigated to OrangeHRM Application Home Page
Then User should logOut from the OrangeHRM Application
Then User should Close the OrangeHRM Application

Examples:
|  UserName   |  Password  	  |
|  Eashwar    |  Ea$hwar@9    |
|  Eashwar    |  Q@Trainer	  |
|  laddu      |  Ea$hwar@9    |
|  Eashwar    |  GulabJamun   |
