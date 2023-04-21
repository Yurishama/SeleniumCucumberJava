Feature: Probar la busqueda de Google

Scenario:Google search
    Given I am on the Google search page
    When I enter a search criteria
    And click on the search button
    Then the results match the criteria