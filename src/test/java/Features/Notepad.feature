Feature: Notepad Application Management
 
  Background:
    Given Launched the Notepad application
  @TC
  Scenario: Wait for 5 seconds and close Notepad
    When I wait for 5 seconds
    Then I close the Notepad application

