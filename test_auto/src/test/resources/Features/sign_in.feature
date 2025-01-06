
Feature: Sign in to TalentXpo
  As a user, I want to test the sign-in functionality on TalentXpo.
  Scenario Outline: <title>
    Given I open the TalentXpo sign-in page
    When I enter the login "<log_in>" and password "<password>"
    And I click connect
    Then I should see a message indicating whether the login was successful or not

    Examples:
      | title                                        | log_in                  | password |
      | Test Case for Login with Valid Credentials   | agence3@digitalcook.com | 12345678 |
      | Test Case for Login with Invalid Credentials | agen@digitalcook.com    | 87654321 |
      | Test Case for Login with Empty Fields        |                         |          |







