@Regression
Feature: As a user or manager should be able to Create and Delete a Bank Account

  Background:
    Given Manager on Invoicing Page
    And user clicks on Configuration=>Accounting Link from left menu
    Then user clicks on Bank Account Link from left menu

  @BRIT-4064 @emrah
  Scenario Outline: Create a new Bank Account
    Then user clicks on Create button
    And user see 'Bank Account -"New"' creation page
    Then user fills out required information "<BankName>"
    Then user clicks on save button
    And user should see and verifies details that entered
    Examples:
      | BankName    |
      | SampleBank1 |
      | SampleBank2 |

  @emrah
  Scenario Outline: Delete a Bank Account
    And user open a tax that has "<BankName>"
    Then user clicks on Action button
    And user clicks Delete option
    And user should see "Are you sure you want to delete this record ?" message
    Then user clicks to Ok button
    And user doesn't see deleted Bank Account on main page
    Examples:
      | BankName    |
      | SampleBank1 |
      | SampleBank2 |