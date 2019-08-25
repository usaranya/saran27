Feature: Launches Janie and Jack url

@smokeTest
Scenario:
Given user launches Janie and Jack url 
When user clicks signin link in first page
Then user click on create an account link in first page
Then user create new account with below data and clicks on create account button
|firstName|lastName|emailAddress|createPassword|confirmPassword|
|saranya|sara|usaranya230@gmail.com|pandis3333|pandis3333|

