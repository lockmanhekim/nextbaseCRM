@NEXTBASE-937
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
	Scenario Outline: Verify that HR user can create a high priority task in duration of the certain deadline with time boundries, by mentioning about a user.
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
		   |task1   |marketing3     |

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
	Scenario Outline: Verify that HR user can edit tasks with deadline for adding reminder to e-mail.
		Given the user is on the login page
		Given the user enters the HR information
		When  user navigates to Tasks page
		Then  clicks to "<taskName>"
		And   clicks to Edit button
		When  clicks More to display more settings
		Then  clicks to Add reminder 
		Then  selects "<remindUsing>"
		And   selects email option 
		And   selects a "<timeBoundry>" 
		And   selects "<sendingPerson>" 
		Then  clicks select
		Then  clicks add
		And   clicks to save changes
		
		    Examples: 
		    |taskName|remindUsing |timeBoundry|sendingPerson|
		    |task861 |date        |during task|responsible  |
		    |task861 |date        |during task|creator      |
		    |task861 |date        |during task|self         |
		    |task861 |deadline    |during task|responsible  |
		    |task861 |deadline    |during task|creator      |
		    |task861 |deadline    |during task|self         |	

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
		When the user search "<Names>" by "To"
		Then user should see "<Result>" activities on Activity Stream
		When clicks to "<Result>"
		Then user navigates to "<Result>" employee page
		And  clicks Tasks on the tab
		Then clicks to plus sign button of the "<taskName>" task
		
		        Examples:
		        |taskName|Names|Result|
		        |task858 |hr3  | hr3    |	

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
		Then clicks to a "<taskName>"task
		And  clicks to Edit Button 
		Then clicks to add more button in Responsible person box
		Then clicks Employees and departments in Responsible person
		Then user selects a "<user>"
		And  clicks to save changes
		    Examples: 
		   |taskName |user                         |
		   |task1    |marketing1@cybertekschool.com|	

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
		Then  clicks to a task
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
		
		    Examples:
		    |participantUser               |ObserverUser          |
		    |marketing1@cybertekschool.com |hr2@cybertekschool.com|	

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
		Then  clicks to a task
		And   clicks to Edit button
		Then  clicks to Checklist 
		And   add "<checkedListAmount>" checklistItem - "<checklistData>" using separator
		And  clicks to save changes
		
		    Examples: 
		    |checkedListAmount|checklistData        |
		    |3                |Test1 - Test2 - Test3|	

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
		Then  clicks to a task
		And  clicks to Edit button
		When clicks More to display more settings
		Then clicks to Add sign in Dependent task
		And  selects a "<task>" and clicks select
		And  clicks to save changes
		
		
		    Examples: 
		    |task|
		    |task23  |	

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
	Scenario Outline: Verify that HR user can not add as dependent tasks by editing the already created same task.
		Given the user is on the login page
		Given the user enters the HR information
		When  user navigates to Tasks page
		Then  clicks to a task
		And  clicks to Edit Button 
		When clicks More to display more seetings
		Then clicks to Add sign in Dependent task
		And  selects a "<task>" and clicks select
		And  clicks to save changes
		
		    Examples: 
		    |task|
		    |sameTask  |	

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
		And clicks All templates
		Then clicks Add
		Then user able display New task template	

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
		And   fills "<taskName>" in Things to do box
		And   checks high priority 
		Then  clicks person icon to mention "<mentionUser>" to mention
		Then  assign responsible person as themselves
		When  user clicks to Deadline box
		Then  selects "<day>" day,"<hour>"hour,"<minute>" minutes
		And   selects <"amOrPm>"
		And   clicks select to set deadline
		And   clicks options and selects "<options>"
		Then  clicks Create Task Template
		
		    
		    Examples: 
		    |day|hour|minute  |mentionUser |taskName |options|amOrPm|
		    |5  | 2  | 15     | Marketing  |template1| 1 - 3 | pm   |

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
	Scenario: Verify that HR user can delete task by using "SELECT ACTION" dropdown menu after checking the task.
		Given the user is on the login page
		Given the user enters the HR information
		When  user navigates to Tasks page
		Then user checks the task 
		Then clicks select action dropdown
		And clicks delete	

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
	Scenario Outline: Verify that HR user can not edit tasks with deadline out of time boundaries for adding reminder to e-mail.
		Given the user is on the login page
		Given the user enters the HR information
		When  user navigates to Tasks page
		Then  clicks to "<taskName>"
		And   clicks to Edit Button
		When  clicks More to display more seetings
		Then  clicks to Add reminder 
		Then  selects "<remindUsing>"
		And   selects email option 
		And   selects a "<timeBoundry>" 
		And   selects "<sendingPerson>" 
		Then  clicks select
		Then  clicks add
		And   clicks to save changes
		
		    Examples: 
		    |taskName|remindUsing |timeBoundry            |sendingPerson|
		    |task861 |date        |past                   |responsible  |
		    |task861 |date        |past                   |creator      |
		    |task861 |date        |past                   |self         |
		    |task861 |deadline    |exceeds one year limit |responsible  |
		    |task861 |deadline    |exceeds one year limit |creator      |
		    |task861 |deadline    |exceeds one year limit |self         |	

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
	@NEXTBASE-935
	Scenario Outline: Verify that HR user can not edit tasks with no deadline out of time boundaries for adding reminder to e-mail.
		Given the user is on the login page
		Given the user enters the HR information
		When  user navigates to Tasks page
		Then  clicks to "<taskName>"
		And   clicks to Edit Button
		When  clicks More to display more seetings
		Then  clicks to Add reminder 
		Then  selects "<remindUsing>"
		And   selects email option 
		And   selects a "<timeBoundry>" 
		And   selects "<sendingPerson>" 
		Then  clicks select
		Then  clicks add
		And   clicks to save changes
		
		    Examples: 
		    |taskName|remindUsing |timeBoundry            |sendingPerson|
		    |task861 |date        |past                   |responsible  |
		    |task861 |date        |past                   |creator      |
		    |task861 |date        |past                   |self         |
		    |task861 |date        |exceeds one year limit |responsible  |
		    |task861 |date        |exceeds one year limit |creator      |
		    |task861 |date        |exceeds one year limit |self         |	

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
	@NEXTBASE-936
	Scenario Outline: Verify that HR user can  edit tasks with no deadline for adding reminder to e-mail.
		Given the user is on the login page
		Given the user enters the HR information
		When  user navigates to Tasks page
		Then  clicks to "<taskName>"
		And   clicks to Edit Button
		When  clicks More to display more seetings
		Then  clicks to Add reminder 
		Then  selects "<remindUsing>"
		And   selects email option 
		And   selects a "<timeBoundry>" 
		And   selects "<sendingPerson>" 
		Then  clicks select
		Then  clicks add to add reminder
		And   clicks to save changes
		
		    Examples: 
		    |taskName|remindUsing |timeBoundry      |sendingPerson|
		    |task861 |date        |inOneYearLimit   |responsible  |
		    |task861 |date        |inOneYearLimit   |creator      |
		    |task861 |date        |inOneYearLimit   |self         |