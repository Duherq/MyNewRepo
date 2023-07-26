Feature:Account_Registration_page

Background:Open account registration page
Given Url: "https://tutorialsninja.com/demo/index.php?route=account/register"
Then QAFOX Account registration page should be displayed

Scenario: Validate Account Registration with valid Credentials

Given firstname:"Duher"
Then Firstname entered successfully
Given lastname:"Quazi"
Then Lastname entered successfully
