Feature: Login to site by adding username and password






  Scenario: Login to site for the reservation application
    Given Lunch site
    When Enter username
    And Enter password
    And Click on Sign In button 
    Then Site should be launched successfully
   
