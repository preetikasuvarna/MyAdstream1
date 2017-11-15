Feature:

  Scenario: Add a blog in the user group
    Given a user is logged in
    When the user clicks on 'My Teams' on the navigation menu
    And selects team 'QA Team Test Group' from the list
    And opens Blog
    And Adds a new blog post as 'Test blog'
    Then the blog must be added successfully


