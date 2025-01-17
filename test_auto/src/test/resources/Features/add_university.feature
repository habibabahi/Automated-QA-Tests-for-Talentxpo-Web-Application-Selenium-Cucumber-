@AddUniversity
Feature: Add a University
  As an admin user, I want to add a university to TalentXpo so that it can be available in the system.

  Background:
    Given I open the TalentXpo sign-in page
    And I enter the login "compte1@digitalcook.com" and password "psw"
    And I click connect

  @AddUniversitySuccess
  Scenario: Successfully add a university with valid details
    Given I am on the Add University page
    When enter all required details
      |fieldName                |fieldValue                                |
      | UniversityName          | Université de Bordeaux 1                     |
      | UniversityWebsite       | https://ubordeaux.fr                       |
      | UniversityCountry       | France                                    |
      | UniversityCity          | Bordeaux                                  |
      | UniversityAddress       | 351 Cours de la Libération                |
      | UniversityPostalCode    | 33405                                     |
      | UniversityLanguage      | Français (B1) : intermédiaire             |
      | UniversityDescription   | Université de recherche prestigieuse      |
      | ProfessionalPartnership | Partenaire                                 |
      | AcademicPartnership     | Partenaire                                 |
      | UniversityLogo          | C:\Users\HACHANA\Desktop\e4NqO3Li_400x400.jpg|
      | BrochuresPosters        | C:\Users\HACHANA\Desktop\Guide-Etudiant_2024_FR_w.pdf |
      | ContactName             | Dr. Marie Dupont                          |
      | ContactPosition         | Directrice des admissions                 |
      | ContactEmail            | contact@ubordeaux.fr                      |
      | ContactPostalAddress    | 351 Cours de la Libération, Bordeaux      |
      | ContactPhoneCode        | france                                    |
      | ContactPhone            | 0555123456                                |
      | ProgramName             | Master en Informatique                    |
      | ProgramField            | Informatique                              |
      | ProgramDegree           | Mastere                                    |
      | ProgramAddress          | 351 Cours de la Libération, Bordeaux      |
      | ProgramPostalCode       | 33405                                     |
      | ProgramWebsite          | https://ubordeaux.fr/informatique         |
      | ProgramCampus           | Campus principal                          |
      | ProgramFee              | 10 000 € par an                           |
      | ProgramPrerequisites    | Diplôme de Bachelor dans un domaine lié   |

    And They click on Save
    Then The university is added and appears in the university table under the University section with the status "Not Verified"

