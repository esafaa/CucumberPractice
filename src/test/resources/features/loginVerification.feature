Feature: Login and Logout verification

  @run
  Scenario: Positive Login scenario execution
    Given User lands on HRM application
    When User enters username
    And User enters pwd
    And user click login button
    Then User should be able to land on home page


   Scenario: Negative Login Scenario Execution
    Given User lands on HRM application
     When User enters invalid username
     And User enters invalid pwd
     And user click login button
     Then User should not be able to land on home page