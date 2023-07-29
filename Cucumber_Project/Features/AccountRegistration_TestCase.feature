Feature:Account_Registration_page

Background:Open account registration page
Given Url:"https://tutorialsninja.com/demo/index.php?route=account/register"
Then QAFOX Account registration page should be displayed

Scenario:Validate Account Registration with valid Credentials
Given firstname "Duher"
Then Firstname entered successfully
Given lastname "Quazi"
Then Lastname entered successfully
Given Email "duher@gmail.com"
Then Email entered successfully
Given Telephon number "9999999999"
Then Telephon number entered successfully
Given Password "Duher123"
Then Password entered successfully
Given Confirm password "Duher123"
Then Confirm Password entered successfully
And Click subscribe radio button no option 
Then Expected radio button should be checked
And Click privacy policy checkbox
Then Privacy policy checkbox should be displayed Checked

Scenario:Validate Register Account with blank one mandatory field
Given firstname "Duher"
Then Firstname entered successfully
And check lastname inputbox
Then Lastname inputbox should be displayed blank(empty)
Given Email "duher@gmail.com"
Then Email entered successfully
Given Telephon number "9999999999"
Then Telephon number entered successfully
Given Password "Duher123"
Then Password entered successfully
Given Confirm password "Duher123"
Then Confirm Password entered successfully
And Click subscribe radio button no option 
Then Expected radio button should be checked
And Click privacy policy checkbox
Then Privacy policy checkbox should be displayed Checked
And Click Continue button
Then Expected Error message should be displayed 