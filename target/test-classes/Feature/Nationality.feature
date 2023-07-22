Feature: I am doing automation functionality of Add Nationality in Orange HRM application
	
Background: Common steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Create Nationality Record
    And Log into Application with below credentials
           |Username|Password|
    			|Admin|admin123|
    Then Created Nationality Records 
         |Nationality|
         |Sales24|
         |Sales25|
         |Sales26|
    When Click on logout button
    Then Close Browser
