@login
Feature: Positive Login

  @login @positive
  Scenario: As a user i should be able to login
    Given user navigate to login page
    When user login with "valid_credential1"
    Then user should be directed to profilepage

#  @login @negative
#  Scenario: As a user i should not be able to login with unregistered credential
#    Given user navigate to login page
#    When user login with "invalid_credential1"
#    Then user should see error message "Wrong email or password"
#
#  @login @negative
#  Scenario: As a user i should not be able to login with unregistered credential
#    Given user navigate to login page
#    When user login with "invalid_credential2"
#    Then user should see error message "please input email"
#
#  @login @negative
#  Scenario: As a user i should not be able to login with unregistered credential
#    Given user navigate to login page
#    When user login with "invalid_credential2"
#    Then user should see error message "please input email"
#
#  @login @negative
#  Scenario: As a user i should not be able to login with unregistered credential
#    Given user navigate to login page
#    When user login with "invalid_credential2"
#    Then user should see error message "please input email"