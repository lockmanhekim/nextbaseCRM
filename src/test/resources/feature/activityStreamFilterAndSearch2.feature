Feature: User should be able to filter and search on Activity Stream.

	#US : As a user, I should be able to filter and search on Activity Stream; so that I can find what I want.
	#*1. User can search by Author*
	#  2. User can search by "To"
	@NEXTBASE-840
	Scenario Outline: Verify that , user can search by "Author" on Activity Stream
		User can search by "Author" <users>
		    Given the user is on the login page
		    And the user enters the "<userType>" information
		    When the user searches "<Names>" by Author
		    Then user should see "<Result>" activities on Activity Stream "Author"
		    Examples:
		      | users     |  | userType  |  | Names                        |  | Result                       |
		      | HR        |  | HR        |  | James                        |  | James                        |
		      | Helpdesk  |  | Helpdesk  |  | James                        |  | James                        |
		      | Marketing |  | Marketing |  | James                        |  | James                        |
		      | HR        |  | HR        |  | helpdesk9@cybertekschool.com |  | helpdesk9@cybertekschool.com |
		      | Helpdesk  |  | Helpdesk  |  | helpdesk9@cybertekschool.com |  | helpdesk9@cybertekschool.com |
		      | Marketing |  | Marketing |  | helpdesk9@cybertekschool.com |  | helpdesk9@cybertekschool.com |