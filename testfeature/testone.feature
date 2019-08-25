Feature:  demo Automation registration

Scenario: 
Given demo automationtesting url

Scenario Outline:

Given entering demo automationtesting url
When user entering "<first name>", "<last name>","<Address>","<Email address>" And "<phone number>"
Then user click on "<gender>"
Then user click on "<hobbies>"
When user entering "<languages>"
Then user selecting "<skills>" in dropdown
Then user selecting "<country>"



Examples:
|firstname|lastname|Address|Email address|phone number|gender|hobbies|languages|skills|country|
|saranya|sara|kelambakam|sara@gmail.com|9875631354|female|cricket|english|Java|India|
