Feature: Navigation
  Background:
    Given a user is logged in

#  Scenario Outline: Navigate to Adstream
#    When the user clicks on '<Menuoption>' on the navigation menu
#    Then the user is redirected to '<Landing page title>'
#
#    Examples:
#    |Menuoption| Landing page title|
#    |Adstreamers| Home |
#    |My Teams| Teams Directory     |
#    |News & Events| News & Events    |
#    |Resource Centre| Resource Centre|
#    |AdChat         | AdChat          |
#    |Help Me!        | Help Me!|
#
#
#Scenario: Navigate to My teams to QA Team Test Group
#  When the user clicks on 'My Teams' on the navigation menu
#  And selects team 'QA Team Test Group' from the list
#  Then the user is redirected to 'QA Team Test Group'

#  Scenario: Navigate to Book a room or resource
#    When the user clicks on 'I Want To...' on the navigation menu
#    And selects 'Book'
#    And selects 'A Room or Resource' on the menu
#    Then the user is redirected to 'A Room or Resource'


#    Scenario: View Calendar Event
#      When the user clicks on 'My Teams' on the navigation menu
#      And selects team 'QA Team Test Group' from the list
#      And opens calendar event
#      Then the right calendar event must be opened

      Scenario: Add a comment to a Calendar Event
        When the user clicks on 'My Teams' on the navigation menu
        And selects team 'QA Team Test Group' from the list
        And opens calendar event
#        And add a comment to the event as 'Comment 1'
        Then the comment must be successfully added







