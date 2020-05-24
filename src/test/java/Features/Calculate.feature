Feature: Sample new feature

   Scenario: Calculate test - check if calculator is working properly
     Given Calculator module and Point module is OK
     When Create point using "Name" 0.0 0.0
     And Create second point using "Name1" 2.0 0.0
     And Calculate distance "Name" 0.0 0.0 "Name1" 2.0 0.0
     Then Distance equals 2.0


  Scenario: Calculate test - wrong wanted value!
    Given Calculator module and Point module is OK
    When Create point using "Name" 0.0 0.0
    And Create second point using "Name1" 2.0 0.0
    And Calculate distance "Name" 0.0 0.0 "Name1" 2.0 0.0
    Then Distance equals 4.0