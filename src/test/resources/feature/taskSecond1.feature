@NEXTBASE-1005
Feature: Default

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#*1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.*
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-858
	Scenario Outline: Verify that HR user can create a high priority task in duration of the certain deadline by mentioning about a user.
		Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  clicks New Task button 
				And   fills "<taskName>" in Things to do box
				And   checks High Priority check box
				And   clicks person icon and selects "<userMention>" to mention
				Then  clicks to add more button in Responsible person box
				Then  user selects a "<responsibleUser>" user
				When  user clicks to Deadline box
				Then  selects "<month>", "<year>", "<day>", "<hour>","<minute>" and "<amOrPm>"
				And   clicks select to set deadline
				And   clicks to  Add Task to create the task
				
				    Examples:
						| userMention  |taskName   |responsibleUser        |month    |year  | day |hour |minute| amOrPm|
						|marketing1    |TestTask2  | marketing3            |September|2022  |   9 |   02|12    |pm    |	

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#*2. Marketing User can edit the task by declaring himself/herself as responsible person.*
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-859
	Scenario Outline: Verify that Marketing user can edit the task by declaring himself/herself as responsible person.
				Given the user is on the login page
				Given the user enters the marketing information
				When  user navigates to Tasks page
				Then clicks to "<taskName>"
				And  clicks to Edit button 
				Then clicks to change in Responsible person box
				Then  user selects a "<responsibleUser>" user
				And  clicks to save changes 
				
				    Examples: 
				   |taskName|responsibleUser|
				   |TestTask3   |marketing3     |

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#*3. HR User can edit the task for adding time tracking.*
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-860
	Scenario Outline: Verify that HR user can edit the task for adding time tracking.
				Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then clicks to "<taskName>"
				And  clicks to Edit button
				When clicks More to display more settings
				Then clicks Task Planned Time check box
				And  enters "<hours>" hours,"<minutes>" minutes to time tracking 
				And  clicks to save changes
		
				
				Examples:
				   |taskName    |hours|minutes|
				   |TestTask1   |2    |30     |	

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#*4. HR User can edit the task for adding reminder to e-mail.*
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-861
	Scenario Outline: Verify that HR user can edit tasks for adding reminder to e-mail by using date option.
		Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  clicks to "<taskName>"
				And   clicks to Edit button
				When  clicks More to display more settings
				Then  clicks to Add reminder 
				Then  selects "<remindUsing>" to remind
				And   selects email option
				And   selects a "<date>" from calendar
				And   selects "<sendingPerson>" the recipient
				Then  clicks add
				And   clicks to save changes
		
				    Examples:
				    |taskName    |remindUsing |date             |sendingPerson			 |
				    |TestTask2  |date        |before deadline  |to creator  			 |
					|TestTask2  |date        |before deadline  |to responsible person   |
					|TestTask2  |date        |before deadline  |to self      			 |
					|TestTask2  |date        |after deadline   |to creator      		 |
					|TestTask2  |date        |after deadline   |to responsible person	 |
					|TestTask2  |date        |after deadline   |to self      			 |
					|TestTask2  |date        |past date        |to creator  			 |
					|TestTask2  |date        |past date		|to responsible person   |
					|TestTask2  |date        |past date		|to self      			 |
					|testdeneme2 |date        |in one year limit|to creator  			 |
					|testdeneme2 |date        |in one year limit|to responsible person   |
					|testdeneme2 |date        |in one year limit|to self      			 |
					|testdeneme2 |date        |exceeds one year |to creator  			 |
					|testdeneme2 |date        |exceeds one year |to responsible person   |
					|testdeneme2 |date        |exceeds one year |to self      			 |
					|testdeneme2 |date        |past date        |to creator  			 |
					|testdeneme2 |date        |past date		|to responsible person   |
					|testdeneme2 |date        |past date	    |to self      			 |




	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#*5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.*
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-862
	Scenario Outline: Verify that Marketing user can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
		        Given the user is on the login page
				Given the user enters the marketing information
				When  user navigates to Tasks page
				Then  clicks to plus sign button of the "<taskName>" task
				
				        Examples:
				        |taskName|
				        |TestTask2  |	

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#*6. HR User can add one more responsible person by editing created task.*
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-863
	Scenario Outline: Verify that HR user can add one more responsible person by editing created task.
				Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  clicks to "<taskName>"
				And  clicks to Edit button
				Then clicks to add more button in Responsible person box
				Then  user selects a "<responsibleUser>" user
				And  clicks to save changes
				    Examples: 
				   |taskName  |responsibleUser              |
				   |TestTask1 |marketing1@cybertekschool.com|	

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#*7. Marketing User can add participants and observers to already created task by editing.*
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-864
	Scenario Outline: Verify that marketing user can add participants and observers to already created task by editing.
		Given the user is on the login page
				Given the user enters the marketing information
				When  user navigates to Tasks page
				Then  clicks to "<taskName>"
				And   clicks to Edit button
				Then  clicks Participants
				And   clicks add in Participants
				Then  clicks Employees and departments in Participants
				Then  selects "<participantUser>"
				When  user clicks to Observers 
				And   clicks add in Observers
				Then  clicks Employees and departments in Observers
				Then  user selects "<ObserverUser>"
				And   clicks to save changes
				Then  Asserts "<participantUser>" and "<ObserverUser>" added
				
				    Examples:
				   |taskName |participantUser               |ObserverUser          |
				   |TestTask3 |marketing1@cybertekschool.com |hr2@cybertekschool.com|	

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#*8. Marketing User can add checklist to an already created task by editing.*
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-865
	Scenario Outline: Verify that Marketing user can add checklist to an already created task by editing.
		Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  clicks to "<taskName>"
				Then  clicks to add for adding checklist
				And   fills input box with checklist data using separator

				    Examples: 
				   |taskName|
				   |TestTask6|

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#*9. HR User can add dependent tasks by editing the already created task.*
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-866
	Scenario Outline: Verify that HR user can add dependent tasks by editing the already created task.
		Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  clicks to "<taskName>"
				And  clicks to Edit button
				When clicks More to display more settings
				Then clicks to Add sign in Dependent task
				And  selects a "<task>" and clicks select
				And  clicks to save changes
				
				
				    Examples: 
				    |task    		 | taskName|
				    |TestTask866.1  |	TestTask866.2 |

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#*9. HR User can add dependent tasks by editing the already created task.*
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-867
	Scenario Outline: Verify that HR user can not add same task as dependent tasks by editing the already created task.
		Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  clicks to "<taskName>"
				And  clicks to Edit button
				When clicks More to display more settings
				Then clicks to Add sign in Dependent task
				And  selects a "<task>" and clicks select
				And  clicks to save changes displays error
				
				    Examples:
						|task    		| taskName|
						|TestTask867.1   |TestTask867.1 |

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#*10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.*
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-868
	Scenario: Verify that HR user can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
		Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  user clicks new task module
				And   clicks All templates
				Then  clicks Add
				Then  user able display New task template page

	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#*11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.*
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-869
		Scenario Outline: Verify that HR user can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
				Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then  user clicks new task module
				And   clicks All templates
				Then  clicks Add
				And   fills "<taskName>" in Things to do box in New task template
				And   checks High Priority check box
				And   clicks person icon and selects "<userMention>" to mention
				Then  user can display themselves as Responsible person
				Then  selects "<deadlineOption>" and enters "<timeValue>"
				And   clicks options
				And   selects "<options>" for deadline options
				Then  clicks Create Task Template "<taskName>"
		
		
				
				    
				    Examples: 
				    |userMention |taskName      |options|deadlineOption |timeValue  |responsibleUser |
					| Marketing3  |template869.1| 1 - 3 |Day             |5          | hr3           |
					| Marketing3  |template869.2| 1 - 3 |Hour            |2          | hr3           |
					| Marketing3  |template869.3| 1 - 3 |Minute          |15         | hr3           |


	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#*12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.*
	@NEXTBASE-871
	Scenario Outline: Verify that HR user can delete task by using "SELECT ACTION" dropdown menu after checking the task.
		Given the user is on the login page
				Given the user enters the HR information
				When  user navigates to Tasks page
				Then user checks the "<taskName>"
				Then clicks select action dropdown
				And  clicks delete
				Then clicks Apply
				Then clicks to continue in the pop up

		Examples:

			| taskName     |
			|TestTask871   |


	#User Story:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#Acceptance Criteria:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#*4. HR User can edit the task for adding reminder to e-mail.*
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-887
	Scenario Outline:Verify that HR user can edit tasks for adding reminder to e-mail using deadline option.
		Given the user is on the login page
		Given the user enters the HR information
		When  user navigates to Tasks page
		Then  clicks to "<taskName>"
		And   clicks to Edit button
		When  clicks More to display more settings
		Then  clicks to Add reminder
		Then  selects deadline to remind
		And   selects email option
		Then  selects "<dayOrHour>"
		Then enters "<time>" to time input box
		And   selects "<sendingPerson>" the recipient
		Then  clicks add
		And   clicks to save changes
				
				    Examples: 
				    |taskName  |sendingPerson       | dayOrHour | time|
					|TestTask6 |to self             |day        |5    |
					|TestTask6 |to creator          |day        |5    |
					|TestTask6 |to resposible person|day        |5    |
					|TestTask6 |to self             |hour       |5    |
					|TestTask6 |to creator          |hour       |5    |
					|TestTask6 |to resposible person|hour       |5    |



