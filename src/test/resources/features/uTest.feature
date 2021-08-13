@stories
Feature: Utest
  As a user, I performed the automation technical tests with the screamplay model for Choucair on the Utest page.

  @scenario1
  Scenario: Enter the uTest page
    Given than Jennifer wants to enter uTest as a new user
      | strUser   | strPassword   |
      | TuUsuario | TuClave       |
    When she looking for the log option (JOIN TODAY)
      | strRegistro               |
      | pagina uTest.com          |
    Then she registers on the page to have an account on uTest
      | strRegistro               |
      | pagina uTest.com          |