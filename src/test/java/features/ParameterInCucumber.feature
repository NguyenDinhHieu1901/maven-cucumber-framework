@all_param
  Feature: Parameter in Cucumber

    @no_param
    Scenario: Scenario have no parameter
      When Input to username text box
      And Input to password text box
      And Click to submit button
      Then Verify Home Page is displayed

     @param_with_quotes_mark
     Scenario: Scenario have parameter with quotes mark
       When Input to username text box with data "automationtesting@gmail.com"
       And Input to password text box with data "123456"
       And Click to submit button
       Then Verify Home Page is displayed

     @param_with_no_quotes_mark
     Scenario: Scenario have parameter with no quotes mark
       When Input to username text box with data automationtesting@gmail.com
       And Input to password text box with data 123456
       And Click to submit button
       Then Verify Home Page is displayed

     @multiple_params
     Scenario: Scenario have multiple parameters
       When Input to username text box with "automationtesting@gmail.com" and Input to password text box with "123456"
       And Click to submit button
       Then Verify Home Page is displayed
