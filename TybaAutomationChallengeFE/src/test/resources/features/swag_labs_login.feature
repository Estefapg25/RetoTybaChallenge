Feature: I as a user want to authenticate myself successfully


  @SuccessfulLogin
  Scenario Outline: Validate that with a valid user name and password the user can log in
    Given that the customer accesses the Swag labs site
    When the user enters the required information
      | <username> | <password> |
    Then user can then view the product module


    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |

  @LockedOutUser
  Scenario Outline: Validate login with blocked user
    Given that the customer accesses the Swag labs site
    When the user enters the required information
      | <username> | <password> |
    Then the user is presented with an error message Sorry, this user has been locked out


    Examples:
      | username        | password     |
      | locked_out_user | secret_sauce |