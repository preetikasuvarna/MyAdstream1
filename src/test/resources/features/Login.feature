Feature: MyAdstream login

  Scenario: Successful login to Myadstream account
#  Given Myadstream is open
  When I enter username as 'Preetika.Suvarna'
  And I enter password as 'TErminal12!'
  And click on login
  Then the user login must be successful

  Scenario: Unsuccessful login to Myadstream account
#    Given Myadstream is open
    When I enter username as 'preetika.suvarna'
    And I enter password as 'terminal12!'
    And click on login
    Then an error message must be displayed as 'The user name or password provided is incorrect.'




