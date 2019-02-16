# *User should be able to see Journals Configuration page and Journals information

# *User should be able to click and see details

# *User should be Click Create Button able to enter all information

# *User should able to see all information after save

# *User should be able to Delete information and verify it's gone

@Regression @todoo
Feature: As a user or manager should be able to Create and Delete a Journal

  Background:
    Given Manager on Invoicing Page
    And user clicks on Configuration=>Accounting Link from left menu
    Then user clicks on Journals Link from left menu

  @BRIT-4065 @emrah
  Scenario Outline: Create a new Journal
    Then user clicks on Create button
    And user see Journals -"New" creation page
    Then user fills out required information "<JournalName>"
    Then user clicks on save button
    And user should see and verifies details that entered
    Examples:
      | JournalName    |
      | SampleJournal1 |
      | SampleJournal2 |

  @BRIT-4065 @emrah
  Scenario Outline: Delete a Journal
    And user open a tax that has "<JournalName>"
    Then user clicks on Action button
    And user clicks Delete option
    And user should see "Are you sure you want to delete this record ?" message
    Then user clicks to Ok button
    And user doesn't see deleted Journal on main page
    Examples:
      | JournalName    |
      | SampleJournal1 |
      | SampleJournal2 |