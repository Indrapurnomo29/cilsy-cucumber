Feature: User register with invalid data

  Scenario: Email not match
    Given Open the chrome
    When User input email address with invalid data
    Then User failed to register