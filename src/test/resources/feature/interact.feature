@NEXTBASE-1006
Feature: Default

	#*U.S.:*
	#
	#As a user, I should be able to interact with employees on the posts that I have access to.{*}{{*}}
	#
	#*A.C.:*
	#
	#{color:#172b4d}1. User should be able to make a comment, like, or unfollow on other employees' posts.{color}
	# 2. User should be able to like, or make comments on all other reviewers' comments.
	# *3. User should be able to click on reviewers' name and visit their profiles.*
	# 4. User should be able to add others' posts to favorite by clicking on the Star icon.
	@NEXTBASE-958
	Scenario Outline: Verify that user should be able to click on reviewers' name and visit their profiles.
		Given the user is on the login page
		When the user enters the "<user>" information
		Then the user should be able to login
		And the user click on reviewer's button
		When the user click on mike reviewer 
		And  the user should be able to see mike user's profile
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |	

	#*U.S.:*
	#
	#As a user, I should be able to interact with employees on the posts that I have access to.{*}{{*}}
	#
	#*A.C.:*
	#
	#{color:#172b4d} 1. User should be able to make a comment, like, or unfollow on other employees' posts.{color}
	# 2. User should be able to like, or make comments on all other reviewers' comments.
	# 3. User should be able to click on reviewers' name and visit their profiles.
	# *4. User should be able to add others' posts to favorite by clicking on the Star icon.*
	@NEXTBASE-959
	Scenario Outline: Verify that user should be able to add others' posts to favorite by clicking on the Star icon
		Given the user is on the login page
		When the user enters the "<user>" information
		Then the user should be able to login
		And the user click on the star icon
		When the user click on the search button 
		And  the user click on the favorites button
		Then the user should be able to see the post in the favorites
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |	

	#*U.S.:*
	#
	#As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*A.C.:*
	#
	#{color:#172b4d} 1. User should be able to make a comment, like, or unfollow on other employees' posts.{color}
	# *2. User should be able to like, or make comments on all other reviewers' comments.*
	# 3. User should be able to click on reviewers' name and visit their profiles.
	# 4. User should be able to add others' posts to favorite by clicking on the Star icon.
	@NEXTBASE-894
	Scenario Outline: Verify that users should be able to like, or make comments on all other reviewers' comments.
		Given the user is on the login page
		When the user enters the "<user>" information
		Then the user should be able to login
		And the user can see the all other reviewers' comments on the home page
		And the user click on the like button
		Then the like button should be activated
		When the user click on the comment
		Then the comment should be sended
		
		
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |	

	#*U.S.:*
	#
	#As a user, I should be able to interact with employees on the posts that I have access to.{*}{*}
	#
	#*A.C.:*
	#
	#{color:#172b4d}*1. User should be able to make a comment, like, or unfollow on other employees' posts.*{color}
	# 2. User should be able to like, or make comments on all other reviewers' comments.
	# 3. User should be able to click on reviewers' name and visit their profiles.
	# 4. User should be able to add others' posts to favorite by clicking on the Star icon.
	@NEXTBASE-872
	Scenario Outline: Verify that users should be able to make a comment, like, or unfollow on other employees' posts.
		Given the user is on the login page
		When the user enters the "<user>" information
		Then the user should be able to login
		And the user see employee Mike
		When the user click on the like
		Then like should be activated
		And  the user click on comment and add comment
		And the user send the comment
		Then comment should be sended
		And the user click on the unfollow
		Then follow button should be activated
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |