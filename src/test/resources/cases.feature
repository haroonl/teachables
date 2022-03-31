Feature: Write as many test cases as you think are sufficient to cover login and sign-up form functionality.

  Scenario: Log in with valid username and password.
    Given I am on the login webpage "https://sso.zeachable.com/secure/123/identity/login"
    When I enter the username "takehome@test.com"
    And I enter the password "Teachable"
    And I click Login

  Scenario: Login with invalid pass
    Given I am on the login webpage "https://sso.zeachable.com/secure/123/identity/login"
    When I enter the username "takehome@test.com"
    And I enter the password "T"
    And I click Login

  Scenario: Show password feature
    Given I am on the login webpage "https://sso.zeachable.com/secure/123/identity/login"
    When I enter the username "takehome@test.com"
    And I enter the password "Teachable"
    Then I click on show password button

  Scenario: forgot password
    Given I am on the login webpage "https://sso.zeachable.com/secure/123/identity/login"
    When I press the forgot password button

  Scenario: remember me button
    Given I am on the login webpage "https://sso.zeachable.com/secure/123/identity/login"
    When I click remember me checkbox

  Scenario: sign up button
    Given I am on the login webpage "https://sso.zeachable.com/secure/123/identity/login"
    When I click sign up