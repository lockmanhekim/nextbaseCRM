Feature:

  Scenario Outline:
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When the user clicks on "Search and Filter" on Activity Stream
    Then the user should be able to see default filters as "my activity, work, favourite, announcements, workflows"
    Examples:
      | usertype  |
      | Marketing |
      | Helpdesk  |
      | HR        |

  @2
  Scenario Outline:
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When the user clicks on "Search and Filter" on Activity Stream
    And the user clicks "add field" on filter pop-up
    When the user selects all option
    Then the user should see options in search fields
    And the user unselects all option
    Then the selected options should be deleted
    Examples:
      | usertype  |
      | Marketing |
      | Helpdesk  |
      | HR        |

  @3
  Scenario Outline:
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When the user clicks on "Search and Filter" on Activity Stream
    And the user selects "<dates>" from "date" field
    And the user clicks "search" on filter pop-up
    Then the user should be able to display "<dates>" based results on Activity Stream page


    Examples:
      | usertype  | dates        |
      | Marketing | Yesterday    |
      | Helpdesk  | Last N days  |
      | HR        | Custom range |
      | Marketing | Last N days  |
      | HR        | Yesterday    |
      | Helpdesk  | Custom range |
      | Helpdesk  | Yesterday    |
      | HR        | Last N days  |
      | Marketing | Custom range |

  @4
  Scenario Outline:
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When the user clicks on "Search and Filter" on Activity Stream
    And the user selects the types from "<type>" field
    And the user clicks "search" on filter pop-up
    Then the user should be able to display "<type>" based results on Activity Stream page


    Examples:
      | usertype  | type  |
      | Marketing | Posts |
      | Helpdesk  | Posts |
      | HR        | Posts |

  @5

  Scenario Outline:
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When the user clicks on "Search and Filter" on Activity Stream
    And the user clicks "Save Filter" on filter pop-up
    When the user enters "<filtername>" as filter name
    And the user clicks "Save" on filter pop-up
    Then the user should be able to see  "<filtername>" in filter names



    Examples:
      | usertype  | filtername |
      | Marketing | POSTS      |
      | Helpdesk  | POSTS      |
      | HR        | POSTS      |

  @6
  Scenario Outline:
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When the user clicks on "Search and Filter" on Activity Stream
    And the user clicks "add field" on filter pop-up
    When the user selects all option
    And the user clicks "Restore to default" on filter pop-up
    Then the selected options should be deleted

    Examples:
      | usertype  |
      | Marketing |
      | Helpdesk  |
      | HR        |

  @7

  Scenario Outline:
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When the user clicks on "Search and Filter" on Activity Stream
    And the user searches all types from "type" field
    When the user clicks "Configure filter" on filter pop-up
    And the user clicks "Reset to default" on filter pop-up
    When the user accepts pop-up on the page
    Then there should be no text on filter and search field

    Examples:
      | usertype  |
      | Marketing |
      | Helpdesk  |
      | HR        |