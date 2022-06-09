Feature: Application Login

Scenario: Home page default login
Given user is on Netbanking landing page
When user login into application with username and password  
Then home page is populated 
And Cards are disoplayed

