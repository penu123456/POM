Feature: create job records

Background: common steps
      Given user launch chrome browser
      And enter URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
      
Scenario: Enter job records
      Then enter login details
        |Username|Password|
        |Admin|admin123|
      When enter job record details
        |JOBNAME|JOBDESCR|JOBNOTE|
        |abc|abc descr|abc descr|
        |def|def descr|def descr|  
      Then close the browser