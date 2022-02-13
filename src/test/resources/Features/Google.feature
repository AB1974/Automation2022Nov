@google
Feature: To test login functionality

  Scenario: User hits Google
    Given User is on Google search page
    When User types Hello World
    Then User is navigated to search results
    And User close browser
    