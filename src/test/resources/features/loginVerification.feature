Feature: Login and Logout verification


  Scenario: Positive Login scenario execution
    Given User lands on HRM application
    When User enters username
    And User enters pwd
    And user click login button
    Then User should be able to land on home page


   Scenario: Negative Login Scenario Execution With Invalid Credentials
    Given User lands on HRM application
     When User enters invalid username
     And User enters invalid pwd
     And user click login button
     Then User should not be able to land on home page

  @run
  Scenario: Negative Login Scenario Execution With empty UserName
    Given User lands on HRM application
    When User enters empty username
    And User enters empty pwd
    And user click login button
    Then User should not be able to land on home page