@NEXTBASE-798
Feature: Default

	#*User story:* As a user I should be able to find people, documents and more by using top-page search bar; so that I can access the searched data
	#
	#*Acceptance Criteria:* 
	#
	#{color:#ff0000}1. User can see the conversations{color}
	#2. User can find related items to written keyword
	#3. User can find group
  @NEXTBASE-795
  Scenario Outline: Verify that as a HR user, should be able to find people, documents and more by using top-page search bar.
    Given the user is on the login page
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

	#*User story:* As a user I should be able to find people, documents and more by using top-page search bar; so that I can access the searched data
	#
	#*Acceptance Criteria:* 
	#
	#1. User can see the conversations
	#{color:#ff0000}2. User can find related items to written keyword{color}
	#3. User can find group
  @NEXTBASE-796
  Scenario Outline: Verify that as a HR user, should be able to find people, documents and more by using top-page search bar.
    Given the user is on the login page
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

	#*User story:* As a user I should be able to find people, documents and more by using top-page search bar; so that I can access the searched data
	#
	#*Acceptance Criteria:* 
	#
	#1. User can see the conversations
	#2. User can find related items to written keyword
	#{color:#ff0000}3. User can find group{color}
  @NEXTBASE-797
  Scenario Outline: Verify that as a HR user, should be able to find people, documents and more by using top-page search bar.
    Given the user is on the login page
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