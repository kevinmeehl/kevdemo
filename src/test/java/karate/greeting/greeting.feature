Feature: Greeting API Test

  Background:
    * url baseUrl

  Scenario: Verify API is Up

    Given path 'greeting'
    When method GET
    Then status 200

  Scenario: Verify Content and Timestamp

    Given path 'greeting'
    When method GET
    Then status 200
    And match $.content == 'Welcome to the machine!'
    And match $.timestamp == '#present'
