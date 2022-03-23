Feature: Default

	#US:
	#
	#As a PC user, I should be able to download Desktop version of the application
	#
	#AC:
	#
	#*1.User should be able to click on Mac OS icon under Desktop*
	#*Client to download Mac version of Bitrix.*
	#*2. User should be able to click on Windows icon under Desktop Client to download Windows version of Bitrix.*
	#*3. User should be able to click on Linux icon under Desktop*
	#*Client to download Linux version of Bitrix.*

	@NEXTBASE-986
	Scenario Outline: Verify that all user types can download desktop versions for different OS.
		Given the user is on the login page
		    And the user enters the "<usertype>" information
		    When user clicks "<OS type>" under Desktop Client
		    Then user should be able to see downloaded file with name "<Downloaded file>" in Downloads folder.
		    Examples:
		      | usertype  | OS type | Downloaded file      |
		      | HR        | Windows | bitrix24_desktop.exe |
		      | Marketing | Windows | bitrix24_desktop.exe |
		      | Helpdesk  | Windows | bitrix24_desktop.exe |
		      | HR        | Mac OS  | bitrix24_desktop.dmg |
		      | Marketing | Mac OS  | bitrix24_desktop.dmg |
		      | Helpdesk  | Mac OS  | bitrix24_desktop.dmg |
		      | HR        | Linux   | bitrix24             |
		      | Marketing | Linux   | bitrix24             |
		      | Helpdesk  | Linux   | bitrix24             |