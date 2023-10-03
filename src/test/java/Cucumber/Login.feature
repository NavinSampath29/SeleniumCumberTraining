@LoginSuccess
Feature: Login Validation

  Scenario: Successfull Validation
    Given User tries to launch the browser with the url 
    When USer tries to login
    Then Loin should be successfull
    And Browser needst to closed 
    