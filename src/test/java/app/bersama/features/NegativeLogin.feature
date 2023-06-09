@login
Feature: Negative Login

  @login @negative
  Scenario Outline: As a user i should not be able to login with unregistered credential
    Given user navigate to login page
    When user login with "unregistered_credential1"
    Then user should see error message <snackBarErrorMessage>

    Examples:
      | snackBarErrorMessage    |
      | Wrong Email or Password |