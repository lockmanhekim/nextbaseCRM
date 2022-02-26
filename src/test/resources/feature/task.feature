Feature: User should be able to use Tasks function on Tasks Page
  @task
    Scenario Outline:<userType> user should be able to display tasks
      Given the user is on the login page
      Given the user enters the "<userType>" information
      When  user navigates to Tasks page
      Then "<userType>" user should be able to display tasks "<taskStatus>" by clicking "<taskTab>" tab.

      Examples:
      |userType | taskStatus                 |taskTab                     |
      |HR       |In Progress - Ongoing Tasks |All Tasks  - Ongoing Tasks  |
      |Helpdesk |In Progress - Ongoing Tasks |All Tasks   - Ongoing Tasks |
      |Marketing|In Progress - Ongoing Tasks |All Tasks  - Ongoing Tasks  |


