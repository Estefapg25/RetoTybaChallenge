Feature: Post user

  Background:
    * url "https://restful-booker.herokuapp.com/auth"

  Scenario: Post a create token
    * def jsonResponse = read('../json/create_token.json')
    Given request { "username": "admin", "password": "password123"}
    When method post
    Then status 200
    And match $ == jsonResponse
