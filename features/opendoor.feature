Feature: Open door

Scenario: door is locked
    Given the door is locked
    When I try to go out the house
    Then I stay at home