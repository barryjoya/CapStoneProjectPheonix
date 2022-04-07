@AllTest @UnitIntegration
Feature: for this feature you have to have an existing account

Background:
Given User is on Retail website 
And User click  on MyAccount
When  User click on Login 
And User enter username <'armanasman1@tekshool.com'> and password <'123456789'> 
And User click on Login button


@UserLogin
Scenario: User loggin in to my Account

Given User is on Retail website 

Then User should be logged in to MyAccount dashboard




@TestAccount  @UnitIntegration
Scenario: Register as an Affiliate user with Cheque Payment Method

When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|payPalEmailAccount|
|StarLLC|www.star123.com|2345|PayPal|dave@tekschool.us|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 











@SmokeTestEdit
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer


When User click on ‘Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|BankOfAmerica|123456789|98765|222333444555|222333444555|
And User click on Continue button  




@TestEditInfo
Scenario: Edit your account Information 

When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
|James|Hendrik|armanasman1@tekshool.com|202-202-2222|
And User click on continue button 
Then User should see a message ‘Success: Your account has been successfully updated.’









