Feature: Navigation

  Scenario: Navigate to Adstream
    Given a user is logged in
    When the user clicks on 'Adstreamers' on the navigation menu
    Then the user is redirected to 'People Directory'

