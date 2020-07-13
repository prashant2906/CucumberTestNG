Feature: Gillette Signin 
  User want to Signin to Gillette website with Username and Password
@IndiaLogin
 Scenario Outline: Signin to Gillette India Website
    Given user is on Gillette homepage Login
    And Gillette title is displayed on the screen Login
    When user clicked on Signin link
    Then user enters "<username>" and "<password>"
    And user clicked on Signin button

 Examples:
	|username|password|	
  |automationtest2906@gmail.com|lkjhgfdsa@2|	
  
  
#@FranceLogin
#Scenario: Signin to Gillette Austria Website 
#	Given user is on Gillette France homepage Login
#	When user clicked on Signin link
#	Then user enters username and password
#	|Automationtest2906@gmail.com|lkjhgfdsa@2|
  #And user clicked on Signin button
#	
 
  
