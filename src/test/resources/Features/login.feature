#comments
#Author
@smoketest
Feature: To test login functionality

  

  Scenario: Check login is successfull with valid credentials
    Given User is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  #@smoke1
  #Scenario Outline: Check login is successfull with valid credentials
    #Given User is on login page
    #When user enters "<username>" and "<password>"
    #And clicks on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
