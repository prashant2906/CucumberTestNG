Feature: Gillette Registration 
  User want to register new user to Gillette website
@Registration
 Scenario Outline: Registration for Gillette
    Given user is on Gillette homepage
    And Gillette title is displayed on the screen
    When user clicked on Register link
    Then user fill "<FIRSTNAME>" and "<LASTNAME>" and "<EMAIL>" and "<PASSWORD>" and "<CONFIRMPASSWORD>" details
    And user select the "<MONTH>" and "<YEAR>" DOB and "<ZIPCODE>"
    Then user clicked on create your profile button


Examples:

  |FIRSTNAME|LASTNAME|EMAIL|PASSWORD|CONFIRMPASSWORD|ZIPCODE|MONTH|YEAR|
  |Prashant|Goel|automationtest2906@gmail.com|lkjhgfdsa@2|lkjhgfdsa@2|122001|06|1990|
  
#@FranceLogin
#Scenario: Register to Gillette France Website 
#	Given user is on Gillette France homepage Login
#	When user clicked on Signin link
#	Then user enters username and password
#	|Automationtest2906@gmail.com|lkjhgfdsa@2|
  #And user clicked on Signin button