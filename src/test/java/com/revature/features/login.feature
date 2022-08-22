Feature: login
  Scenario: Successful Login
    Given I am at the page "https://rev2.force.com/revature/s/login/"
    When I click Log in
    Then I should be redirected to the home page