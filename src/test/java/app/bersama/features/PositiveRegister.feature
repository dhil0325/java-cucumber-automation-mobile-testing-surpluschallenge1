@register
Feature: Positive Register

  @register @positive
  Scenario: As a user i should be able to register
    Given user navigate to register page
    When user fill out register form and tap register "register1"
    Then user should be navigate to profile page

#  @login @positive
#  Scenario: As a user i should be able to login
#    Given user navigate to login page
#    When user login with "valid_credential1"
#    Then user should be directed to profilepage