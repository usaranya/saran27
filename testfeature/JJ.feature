Feature: Launches Janie and Jack url

Background:

Given user launches Janie and Jack url
When user click on signin link in first page
Then user enters "usaranya230@gmail.com" in email field
Then user enters "udhayak7777" in password field
Then user clicks signin button in signin page

Scenario Outline: 

When user click on start shopping button in signin page
Then user enters product name on search field
And user can click a "<product>" from the list of products in next page


Examples:
|product|
|sunglasses|




