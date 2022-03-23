@NEXTBASE-1007
Feature: Default

	#*U.S.:*
	#
	#As a user, I should be able to send files by selecting File subheading from "More" tab under Activity Stream.
	#
	# 
	#
	#*A.C.:*
	#
	#*1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.*
	@NEXTBASE-911
	Scenario Outline: Verify that user should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
		Given the user is on the login page
		When the user enters the "<user>" information
		Then the user should be able to login
		And the user click on More button
		When the user click on File button
		Then the user click on Upload File and Images button
		And the user upload a file
		Then the user should be able to see the uploaded file
		
		    Examples:
		    | user       |
		    | HR         |
		    | Helpdesk   |
		    | Marketing  |	

	#*U.S.:*
	#
	#As a user, I should be able to send files by selecting File subheading from "More" tab under Activity Stream.
	#
	# 
	#
	#*A.C.:*
	#
	#*1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.*
	@NEXTBASE-920
	Scenario Outline: Verify that user should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		And the user click on More button
		When the user click on File button
		And click on the download from external drive button
		Then click on the all drive buttons
		            Examples:
		            | user       |
		            | HR         |
		            | Helpdesk   |
		            | Marketing  |	

	#*U.S.:*
	#
	#As a user, I should be able to send files by selecting File subheading from "More" tab under Activity Stream.
	#
	# 
	#
	#*A.C.:*
	#
	#*1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.*
	@NEXTBASE-922
	Scenario Outline: Verify that user should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
		Given the user is on the login page
		When the user enters the "<user>" information
		When the user should be able to login
		And the user click on More button
		When the user click on File button
		And the user click on select document from Bitrix24 button
		Then the user click on files to upload
		Then the user should be able to verify the uploaded file
		            Examples:
		            | user       |
		            | HR         |
		            | Helpdesk   |
		            | Marketing  |