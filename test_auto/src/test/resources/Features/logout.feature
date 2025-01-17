@Logout
Feature: Logout from TalentXpo
  As a user, I want to be able to log out from TalentXpo.
  @LogoutMainButton
  Scenario: Test Case for Logout using Main Logout Button
    Given I open the TalentXpo sign-in page
    When I enter the login "compte1@digitalcook.com" and password "psw"
    And I click connect
    And I logout using the main logout button
    Then I should see the connect button

  @LogoutMenuButton
  Scenario: Test Case for Logout using Menu Logout Button
    Given I open the TalentXpo sign-in page
    When I enter the login "compte1@digitalcook.com" and password "psw"
    And I click connect
    And I logout using the menu logout button
    Then I should see the connect button