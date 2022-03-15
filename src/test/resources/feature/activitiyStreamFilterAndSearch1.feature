Feature: User should be able to filter and search on Activity Stream.

	#US : As a user, I should be able to filter and search on Activity Stream; so that I can find what I want.
	#1. User can search by Author
	#*2. User can search by "To"*
	@NEXTBASE-818
	Scenario Outline: Verify that , user can search by "To" on  Activity Stream
		User can search by "TO" <users>
		    Given the user is on the login page
		    And the user enters the "<userType>" information
		    When the user search "<Names>" by "To"
		    Then user should see "<Result>" activities on Activity Stream
		    Examples:
		      | users     |  | userType  |  | Names         |  | Result        |
		      | HR        |  | HR        |  | James         |  | James         |
		      | Helpdesk  |  | Helpdesk  |  | James         |  | James         |
		      | Marketing |  | Marketing |  | James         |  | James         |
		      | HR        |  | HR        |  | All employees |  | All employees |
		      | Helpdesk  |  | Helpdesk  |  | All employees |  | All employees |
		      | Marketing |  | Marketing |  | All employees |  | All employees |
		      | HR        |  | HR        |  | Depart3       |  | Depart3       |
		      | Helpdesk  |  | Helpdesk  |  | Depart3       |  | Depart3       |
		      | Marketing |  | Marketing |  | Depart3       |  | Depart3       |
