Feature: Probar la búsqueda de Google

Scenario: As a user I enter a search criteria in Google
Given I am on the Google search page
When I enter a search criteria 
And Click on the search button
Then the results match the criteria


    Feature Description