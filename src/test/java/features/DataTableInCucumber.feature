@data_table
Feature: Data Table in Cucumber

  @global_data_table
  Scenario Outline: Scenario with global data table
    When User input to First Name textbox with "<firstName>"
    And User input to Last Name textbox with "<lastName>"
    And User input to Email textbox with "<email>"
    And User input to Password textbox with "<password>"
    And User input to Confirm password textbox with "<password>"
    And User click to Register button
    Then Verify message "<messageSuccess>" is displayed

    Examples:
      | firstName | lastName | email                 | password | messageSuccess              |
      | nguyen    | asas     | nguyenasas1@gmail.com | 123456   | Your registration completed |
      | nguyen    | asas     | nguyenasas2@gmail.com | 123456   | Your registration completed |
      | nguyen    | asas     | nguyenasas3@gmail.com | 123456   | Your registration completed |
      | nguyen    | asas     | nguyenasas4@gmail.com | 123456   | Your registration completed |
      | nguyen    | asas     | nguyenasas5@gmail.com | 123456   | Your registration completed |

  @local_data_table
  Scenario Outline: Scenario with local data table
    When User input to Register form with data
      | firstName   | lastName   | email   | password   |
      | <firstName> | <lastName> | <email> | <password> |
    And User click to Register button
    Then Verify message "<messageSuccess>" is displayed
    Examples:
      | firstName | lastName | email                 | password | messageSuccess              |
      | nguyen    | asas     | nguyenasas6@gmail.com | 123456   | Your registration completed |
