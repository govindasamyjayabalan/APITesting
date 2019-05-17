Feature:F1 race

  Scenario: Finding number of F1 circuit
    Given Details of the circuit
    And I go to the home page
    And I enter the circuit id
    And I enter the circuit name
    And I enter the country name

  Scenario: Number of circuits in 2018
    Given circuit service endpoint
    And Get to the home page of 2018 circuit
    And I check the number of circuits is 21




