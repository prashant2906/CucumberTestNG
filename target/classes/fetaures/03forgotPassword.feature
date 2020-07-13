Feature: Gillette ForgotPassword 
  User wants to check forgot password flow want to Signin to Gillette website with Username and Password

 Scenario Outline: Forgot password for Gillette Website
    Given user is on Gillette homepage Login
    And Gillette title is displayed on the screen Login
    When user clicked on Signin link
    And user clicks on forgot password link
    Then user enters "<emailid>"
    And user clicked on create new password button

  Examples:
	|emailid |				
  |automationtest2906@gmail.com |					
  
