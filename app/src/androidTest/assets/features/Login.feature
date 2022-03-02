Feature: User is able to login

  @smoke
  Scenario: User opens app first time
    Given app is launched
    Then login screen with user name and password entries and login button is displayed

