@demo
Feature: Test login functionality


  @login
  Scenario: Check login is successful with valid credentials
    Given Browser is open
    And User is on Login Page
    When user enters username and password
    And User clicks on login
    Then user is navigated to the homepage
    And User close browser

  @parameterization @dataDrivenTesting
  Scenario Outline: Check login is successfull with valid credentials
    Given Browser is open
    And User is on Login Page
    When user enters "<username>" and "<password>"
    And User clicks on login
    Then user is navigated to the homepage
    And User close browser

    Examples: 
      | username | password |
      | Eileen   |    12345 |
      | Bekem    |    12345 |

  @webtable
  Scenario: Check login is successful with valid credentials
    Given Browser is open
    And User is on Login Page "http://practice.cybertekschool.com/tables"
    When user prints table
    Then user gets backround color
    And User close browser




