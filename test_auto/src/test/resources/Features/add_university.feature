@AddUniversity
Feature: Add a University
  As an admin user, I want to add a university to TalentXpo so that it can be available in the system.

  Background:
    Given I open the TalentXpo sign-in page
    And I enter the login "apporteur11@digitalcook.com" and password "12345678"
    And I click connect

  @AddUniversitySuccess
  Scenario: Successfully add a university with valid details
    Given I am on the Add University page
    When enter all required details
      | field               | value                 |
      | name                | University of Bordeaux|
      | website             | https://ubordeaux.fr  |
      | country             | France                |
      | city                | Bordeaux              |
      | address             | 351 Cours de la Libération |
      | postal code         | 33405                 |
      | language            | French                |
      | description         | Prestigious research university |
      | partnership status  | Partner               |
      | contacts            | contact@ubordeaux.fr  |
      | programs            | Science, Arts         |
    And They click on Save
    Then The university is added and appears in the university table under the University section with the status "Not Verified"

  @AddUniversityMissingName
  Scenario: Attempt to add a university without a name
    Given I am on the Add University page
    When I leave the university name field empty
    And I enter a valid location "Lyon, France"
    And I select the accreditation level "B"
    And I click the "Save" button
    Then I should see an error message "University name is required"

  @AddUniversityInvalidLocation
  Scenario: Attempt to add a university with an invalid location
    Given I am on the Add University page
    When I enter a valid university name "Université de Toulouse"
    And I enter an invalid location "12345"
    And I select the accreditation level "A"
    And I click the "Save" button
    Then I should see an error message "Invalid location format"

  @DuplicateUniversity
  Scenario: Attempt to add a university that already exists
    Given I am on the Add University page
    When I enter a university name that already exists "Université de Bordeaux"
    And I enter the location "Bordeaux, France"
    And I select the accreditation level "A+"
    And I click the "Save" button
    Then I should see an error message "University already exists"