Feature: User login with invalid data

  Scenario: Verification user login with invalid data
    Given System redirect to open chrome an application
    When Enter the email and password with invalid data
    Then User click login button