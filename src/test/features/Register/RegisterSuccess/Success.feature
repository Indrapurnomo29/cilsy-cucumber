Feature: Register with valid data

  Scenario: Email and password match
    Given User Open the chrome
    When User input email address with valid data
    Then User click create an account button