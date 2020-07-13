 Feature: Gillette Registration 
  User want to register new user to Gillette website

 Scenario Outline: Registration for Gillette
    Given user should redirect to "<gmail>"
    And enter the credentials "<username>" and "<password>"
    When user click reset password button in email 
    Then user fill "<newpass>" and "<connewpass>"
    And try to login again using "<username>" and "<newpass>"
   

Examples:
  |gmail|username|password|newpass|connewpass|
  |https://mail.google.com|Automationtest2906@gmail.com|lkjhgfdsa@2|lkjhgfdsa@2|lkjhgfdsa@2|

