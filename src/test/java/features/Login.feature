@login
Feature: Login to application

  #Background:
    #Given Open application

  @valid_login
  Scenario: Login with valid information
    When Input to username text box with data "admin"
    And Input to password text box with data "admin"
    And Click to submit button
    Then Verify Home Page is displayed

  @invalid_login
  Scenario: Login with valid information
    When Input to username text box with data "username"
    And Input to password text box with data "password"
    And Click to submit button
    Then Verify Home Page is displayed