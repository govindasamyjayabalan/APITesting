Feature:F1 race

@F1race
  Scenario: Number of circuits in 2018
    Given Get to the home page of 2018 circuit
    And I check the number of circuits is 21
    And I enter the circuit id  albert_park
    And I enter the circuit name
    And I check the the location is valid






