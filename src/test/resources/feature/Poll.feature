
@NEXTBASE-934
  Feature: Create a poll by clicking on Poll tab under Activity Stream
    @NEXTBASE-927
    Scenario Outline: User should be able to add users from selecting multiple contacts
      Given User is logged in as "<userType>"
      When User navigates to Poll page
      And click Add more link
      Then click Employees and departments button
      Then user should be able to select multiple contacts
      Examples:
        | userType  |
        | HR        |
        | Helpdesk  |
        | Marketing |
    @NEXTBASE-928
    Scenario Outline: User should be able to attach link by clicking on the add link icon
      Given User is logged in as "<userType>"
      When User navigates to Poll page
      And click link icon
      When enter link info
      Then User should verify the attaching from link
      Examples:
        | userType  |
        | HR        |
        | Helpdesk  |
        | Marketing |
    @NEXTBASE-933
    Scenario Outline: User should be able to send a poll
      Given User is logged in as "<userType>"
      When User navigates to Poll page
      And click question box and write question
      And click answer boxes and write answers
      And click message box and write a poll message
      Then click send button
      Then user should see the poll on the page
      Examples:
        | userType  |
        | HR        |
        | Helpdesk  |
        | Marketing |

    @NEXTBASE-929
    Scenario Outline: User should be able to add mention by clicking on the add mention icon
      Given User is logged in as "<userType>"
      When User navigates to Poll page
      And click Add mention icon
      Then click Employees and departments button
      And select contact from list
      Then click send button
      Then user should see the message on the page
      Examples:
        | userType  |
        | HR        |
        | Helpdesk  |
        | Marketing |
    @NEXTBASE-930
    Scenario Outline: User should be able to add questions and multiple answers
      Given User is logged in as "<userType>"
      When User navigates to Poll page
      And click question box and write question
      And click answer boxes and write answers
      Then click Add question link
      And click second question box and write question
      And click second answer boxes and write answers
      Examples:
        | userType  |
        | HR        |
        | Helpdesk  |
        | Marketing |
    @NEXTBASE-931
    Scenario Outline: User should be able to delete questions and multiple answers
      Given User is logged in as "<userType>"
      When User navigates to Poll page
      And click question box and write question
      And click answer boxes and write answers
      Then User should be able to click delete answer icon and delete question icon
      Examples:
        | userType  |
        | HR        |
        | Helpdesk  |
        | Marketing |
    @NEXTBASE-932
    Scenario Outline: User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox
      Given User is logged in as "<userType>"
      When User navigates to Poll page
      And click question box and write question
      And click answer boxes and write answers
      And click Allow multiple choice checkbox
      And click message box and write a message
      Then click send button
      Then User should be able to provide multiple choice to attendees
      Examples:
        | userType  |
        | HR        |
        | Helpdesk  |
        | Marketing |



