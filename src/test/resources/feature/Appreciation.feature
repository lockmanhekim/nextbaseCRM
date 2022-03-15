@NEXTBASE-991
Feature: Default

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#{color:#FF0000}1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.{color}
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-870
	Scenario Outline: Verify that you can upload files and images using the "More-Appreciation" tab.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click the Upload File button
		And upload a file
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#{color:#ff0000}1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.{color}
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-892
	Scenario Outline: Verify that you can download from external drive using the "More-Appreciation" tab.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click the upload files button
		And click the download from external drive button
		Then click the all drive buttons
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#{color:#ff0000}1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.{color}
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-893
	Scenario Outline: Verify that you can select documents from bixtrix24 using the "More-Appreciation" tab.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click the upload files button
		And click the select document from Btrix24 button
		And click the sales and marketing button
		And click the Quotes button
		Then click the docx file 
		And click the select document button
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#{color:#FF0000}2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.{color}
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-910
	Scenario Outline: Verify that As a user I should be able to add users and recipients from selecting contact from Employees contact lists.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to choose button
		And typed "All employees" in the choose button1
		And click the employees button
		And click the send button
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#{color:#ff0000}2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.{color}
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-923
	Scenario Outline: Verify that As a user I should be able to add users and recipients from selecting contact from , Departments contact lists.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to choose button
		And typed "Depart3" in the choose button2
		And click the department button
		And click the send button2
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#{color:#ff0000}2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.{color}
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-924
	Scenario Outline: Verify that As a user I should be able to add users and recipients from selecting contact from E-mail user, contact lists.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to choose button
		Then typed "hr77@cybertekschool.com" in the choose button3
		And click the email button
		And click the send button 
		
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#{color:#FF0000}3. User should be able to attach link by clicking on the link icon.{color}
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-925
	Scenario Outline: Verify that as a user should be able to attach link by clicking on the link icon.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to link button
		Then typed "https://www.carolinasoftech.com/course-details/qa-automation" in the link bar
		And click the save button
		
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#{color:#FF0000}4. User should be able to insert videos by clicking on the video icon and entering the video URL.{color}
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-926
	Scenario Outline: Verify that as a user should be able to insert videos by clicking on the video icon and entering the video URL.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to insert video button
		Then typed "https://www.youtube.com/watch?v=iMu47raqbcc" in the video source bar
		And click the save button2
		
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#{color:#FF0000}5. User should be able to create a quote by clicking on the Comma icon.{color}
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-938
	Scenario Outline: Verify that as a user should be able to create a quote by clicking on the Comma icon.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to comma button
		And typed "I Will Try Something" in the comma button2
		And click the send button2
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#{color:#FF0000}6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.{color}
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-939
	Scenario Outline: Verify that as a user should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to add mention button
		And typed "I Will Try Something" in the add mention button
		And select contacts from the lists provided in dropdown
		And click the send button2
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#{color:#FF0000}7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.{color}
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-940
	Scenario Outline: Verify that as a user should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to visual editor button
		And see the editor text-bar displays on top of the message box
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#{color:#FF0000}8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.{color}
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-941
	Scenario Outline:  Verify that as a user should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to topic button
		And the topic section can be seen above the message box.
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#{color:#FF0000}9. User should be able to click on "Record Video" tab to record a video and attach it with the message.{color}
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-960
	Scenario Outline: Verify that as a user should be able to click on "Record Video" tab to record a video and attach it with the message.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to record video button
		And click to allow button
		And video recording should be possible
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#{color:#FF0000}10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.{color}
	#11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
	@NEXTBASE-980
	Scenario Outline: Verify that as a user should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to add tag button
		And typed "Tester" in the add tag button
		And click to add button
		And click the send button2
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |	

	#*User story:* I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream.
	#
	#*A.C.:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
	#2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
	#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
	#8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
	#9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
	#10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
	#{color:#FF0000}11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.{color}
	@NEXTBASE-990
	Scenario Outline: Verify that as a user should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		When click the More button
		And click the Appreciation
		And click to thumbs up button and see the whole illustration
		    Examples:
		    | user       | 
		    | HR         | 
		    | Helpdesk   |
		    | Marketing  |