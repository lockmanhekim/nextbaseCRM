@NEXTBASE-975
Feature: Default

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  @NEXTBASE-886
  Scenario: Verify that HR User should be able to click on upload files icon to upload files and pictures from local disks.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And the user clicks on upload files and clicks on "upload files and images"
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  @NEXTBASE-890
  Scenario: Verify that Marketing User should be able to click on upload files icon to upload files and pictures from local disks.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And the user clicks on upload files and clicks on "upload files and images"
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  @NEXTBASE-891
  Scenario: Verify that Helpdesk User should be able to click on upload files icon to upload files and pictures from local disks.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And the user clicks on upload files and clicks on "upload files and images"
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  @NEXTBASE-895 #passed
  Scenario: Verify that HR User should be able to click on upload files icon to upload files and documents from bixtrix24
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And the user clicks on upload files and clicks on Select document from Bitrix24
    And clicks on send announcenment
    Then user should be send announcement by Uploading Bitrix24

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  @NEXTBASE-896 #passed
  Scenario: Verify that Marketing User should be able to click on upload files icon to upload files and documents from bixtrix24
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And the user clicks on upload files and clicks on Select document from Bitrix24
    And clicks on send announcenment
    Then user should be send announcement by Uploading Bitrix24

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  @NEXTBASE-897 #passed
  Scenario: Verify that Helpdesk User should be able to click on upload files icon to upload files and documents from bixtrix24
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And the user clicks on upload files and clicks on Select document from Bitrix24
    And clicks on send announcenment
    Then user should be send announcement by Uploading Bitrix24

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
  @NEXTBASE-898 #passed
  Scenario: Verify that HR user should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User adds other users and recipients from selecting contact from "E-mail user", "Employees and Departments" and "Recent contact lists"
    And clicks on send announcenment
    Then user should send announcement to users

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
  @NEXTBASE-899 #passed
  Scenario: Verify that Helpdesk user should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User adds other users and recipients from selecting contact from "E-mail user", "Employees and Departments" and "Recent contact lists"
    And clicks on send announcenment
    Then user should send announcement to users

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
  @NEXTBASE-900 #passed
  Scenario: Verify that Marketing user should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User adds other users and recipients from selecting contact from "E-mail user", "Employees and Departments" and "Recent contact lists"
    And clicks on send announcenment
    Then user should send announcement to users

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 3. User should be able to attach link by clicking on the link icon.
  @NEXTBASE-901
  Scenario: Verify that HR User should be able to attach link by clicking on the link icon
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User attaches link by clicking on the link icon
    And clicks on send announcenment
    Then user should be send announcement
    And the link should be clickable

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 3. User should be able to attach link by clicking on the link icon.
  @NEXTBASE-902
  Scenario: Verify that Helpdesk User should be able to attach link by clicking on the link icon
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User attaches link by clicking on the link icon
    And clicks on send announcenment
    Then user should be send announcement
    And the link should be clickable

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC : 3. User should be able to attach link by clicking on the link icon.
  @NEXTBASE-903
  Scenario: Verify that Marketing User should be able to attach link by clicking on the link icon
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User attaches link by clicking on the link icon
    And clicks on send announcenment
    Then user should be send announcement
    And the link should be clickable

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
  @NEXTBASE-904
  Scenario: Verify that HR User should be able to insert videos by clicking on the video icon and entering the video URL.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User inserts videos by clicking on the video icon and entering the video URL.
    And clicks on send announcenment
    Then user should be send announcement
    And the link should be clickable

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
  @NEXTBASE-905
  Scenario: Verify that Helpdesk User should be able to insert videos by clicking on the video icon and entering the video URL.
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User inserts videos by clicking on the video icon and entering the video URL.
    And clicks on send announcenment
    Then user should be send announcement
    And the link should be clickable

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
  @NEXTBASE-906
  Scenario: Verify that Marketing User should be able to insert videos by clicking on the video icon and entering the video URL.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User inserts videos by clicking on the video icon and entering the video URL.
    And clicks on send announcenment
    Then user should be send announcement
    And the link should be clickable

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#5. User should be able to create a quote by clicking on the Comma icon.
  @NEXTBASE-907
  Scenario: Verify that HR user should be able to create a quote by clicking on the Comma icon.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User creates a quote by clicking on the Comma icon.
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#5. User should be able to create a quote by clicking on the Comma icon.
  @NEXTBASE-908
  Scenario: Verify that Helpdesk user should be able to create a quote by clicking on the Comma icon.
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User creates a quote by clicking on the Comma icon.
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#5. User should be able to create a quote by clicking on the Comma icon.
  @NEXTBASE-909
  Scenario: Verify that Marketing user should be able to create a quote by clicking on the Comma icon.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User creates a quote by clicking on the Comma icon.
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  @NEXTBASE-912
  Scenario: Verify that HR user should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User adds mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  @NEXTBASE-913
  Scenario: Verify that Helpdesk user should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User adds mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  @NEXTBASE-914
  Scenario: Verify that Marketing user should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User adds mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  @NEXTBASE-915
  Scenario: Verify that HR user should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User click on Visual Editor and see the editor text-bar displays on top of the message box
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  @NEXTBASE-916
  Scenario: Verify that Helpdesk user should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User click on Visual Editor and see the editor text-bar displays on top of the message box
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  @NEXTBASE-917
  Scenario: Verify that Marketing user should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User click on Visual Editor and see the editor text-bar displays on top of the message box
    And clicks on send announcenment
    Then user should be send announcement

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 8. User should be able to click on the Topic icon to see the announcement Topic text box displays on top of the message box.
  @NEXTBASE-918
  Scenario: Verify that HR User should be able to click on the Topic icon to see the announcement Topic text box displays on top of the message box.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User clicks on the Topic icon to see the announcement Topic text box displays on top of the message box
    And clicks on send announcenment
    Then user should be send announcement
    And Verify that topic is seen

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 8. User should be able to click on the Topic icon to see the announcement Topic text box displays on top of the message box.
  @NEXTBASE-919
  Scenario: Verify that Helpdesk User should be able to click on the Topic icon to see the announcement Topic text box displays on top of the message box.
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User clicks on the Topic icon to see the announcement Topic text box displays on top of the message box
    And clicks on send announcenment
    Then user should be send announcement
    And Verify that topic is seen

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#AC: 8. User should be able to click on the Topic icon to see the announcement Topic text box displays on top of the message box.
  @NEXTBASE-921
  Scenario: Verify that Marketing User should be able to click on the Topic icon to see the announcement Topic text box displays on top of the message box.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User clicks on the Topic icon to see the announcement Topic text box displays on top of the message box
    And clicks on send announcenment
    Then user should be send announcement
    And Verify that topic is seen

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
  @NEXTBASE-970
  Scenario: Verify that HR user should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
    Given the user is on the login page
    Given the user enters the "HR" information
    When the user clicks on more and announcement
    And User creates new tag
    And clicks on send announcenment
    Then user should be send announcement
    And Verify that tag is created

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
  @NEXTBASE-971
  Scenario: Verify that Helpdesk user should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
    Given the user is on the login page
    Given the user enters the "Helpdesk" information
    When the user clicks on more and announcement
    And User creates new tag
    And clicks on send announcenment
    Then user should be send announcement
    And Verify that tag is created

	#US : As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
  @NEXTBASE-973
  Scenario: Verify that Marketing user should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
    Given the user is on the login page
    Given the user enters the "Marketing" information
    When the user clicks on more and announcement
    And User creates new tag
    And clicks on send announcenment
    Then user should be send announcement
    And Verify that tag is created