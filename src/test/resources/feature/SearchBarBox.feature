

    Feature: the user should be able to find contacts, documents and more using the top page search bar

      Background:
        Given the user is on the login page

        Scenario Outline: : user should be able to see the conversations
          When the user enters the "<user>" information
          Then the user should be able to login
          When click the search bar
          And typed "Conversations" in the search bar
          And click the Conversations button
          Then the	Conversations page	should	be	displayed

          Examples:
            | user      |
            | HR        |
            | Helpdesk  |
            | Marketing |


      Scenario Outline: the user should be able to search for the word typed in the search bar
        
        When the user enters the "<user>" information
        When click the search bar
        And typed "<keyword>" in the search bar
        And click the search bar button
        Then typed keyword should be displayed

        Examples:
          | user      | keyword   |
          | HR        | phone     |
          | HR        | Birthdays |
          | HR        | a         |
          | Helpdesk  | phone     |
          | Helpdesk  | Birthdays |
          | Helpdesk  | a         |
          | Marketing | phone     |
          | Marketing | Birthdays |
          | Marketing | a         |


        Scenario Outline: user should be able to find groups
          When the user enters the "<user>" information
          When click the search bar
          And typed "<keyword2>" in the search bar
          And click the search bar button
          Then typed keyword should be displayed

          Examples:
            | user      | keyword2   |
            | HR        | group      |
            | Helpdesk  | group      |
            | Marketing | group      |

