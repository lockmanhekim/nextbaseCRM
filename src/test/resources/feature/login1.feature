@NEXTBASE-789
Feature: Default

	#*US:* As a user, I should be able to login.
	#
	#*Acceptance Criteria:* 
	#
	#*1)User should be able to login as HR user with Valid Credentials*
	#2)User should be able to login as Helpdesk user with Valid Credentials
	#3)User should be able to login as HR user with Valid Credentials.
	#4)Users should not be able to login with invalid credentials
	#5)Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")
  @NEXTBASE-778
  Scenario: Verify that User should be able to login as HR user with Valid Credentials
  Login as a HR
    Given the user is on the login page
    When the user enters the HR information
    Then the user should be able to login

	#*US:* As a user, I should be able to login.
	#
	#*Acceptance Criteria:* 
	#
	#1)User should be able to login as HR user with Valid Credentials
	#*2)User should be able to login as Helpdesk user with Valid Credentials*
	#3)User should be able to login as HR user with Valid Credentials.
	#4)Users should not be able to login with invalid credentials
	#5)Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")
  @NEXTBASE-779
  Scenario: Verify that User should be able to login as Helpdesk user with Valid Credentials
  Login as a helpdesk
    Given the user is on the login page
    When the user enters the helpdesk information
    Then the user should be able to login

	#*US:* As a user, I should be able to login.
	#
	#*Acceptance Criteria:*
	#
	#1)User should be able to login as HR user with Valid Credentials
	#2)User should be able to login as Helpdesk user with Valid Credentials
	#*3)User should be able to login as Marketing user with Valid Credentials.*
	#4)Users should not be able to login with invalid credentials
	#5)Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")
  @NEXTBASE-780
  Scenario: Verify that User should be able to login as Marketing user with Valid Credentials.
  Login as a marketing
    Given the user is on the login page
    When the user enters the marketing information
    Then the user should be able to login

	#*US:* As a user, I should be able to login.
	#
	#*Acceptance Criteria:*
	#
	#1)User should be able to login as HR user with Valid Credentials
	#2)User should be able to login as Helpdesk user with Valid Credentials
	#3)User should be able to login as Marketing user with Valid Credentials.
	#*4)Users should not be able to login with invalid credentials*
	#5)Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")
  @NEXTBASE-787
  Scenario Outline: Verify that Users should not be able to login with invalid credentials
  Users should not be able to login with invalid credentials
    Given the user is on the login page
    When the user enters the "<userType>" "<invalid>" information
    Then the user should not be able to login
    Examples:
      | userType | invalid |
      |   HR     | username|
      |   HR     | password|
      |   HR     |  empty  |
      | Helpdesk |username |
      | Helpdesk |password |
      | Helpdesk |  empty  |
      | Marketing|username |
      | Marketing|password |
      | Marketing|  empty  |

	#*US:* As a user, I should be able to login.
	#
	#*Acceptance Criteria:*
	#1)User should be able to login as HR user with Valid Credentials
	#2)User should be able to login as Helpdesk user with Valid Credentials
	#3)User should be able to login as Marketing user with Valid Credentials.
	#4)Users should not be able to login with invalid credentials
	#*5)Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")*
	#h4.
  @NEXTBASE-788
  Scenario: Verify that Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")
  Users should not be able to try to login after 5 tries with invalid credentials
    Given the user is on the login page
    When the user enters invalid credentials 5 times
    Then the Error message should be "Please try again after one minute"