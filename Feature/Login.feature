Feature: Title of your feature
 
 Background:
 Given user launches browser in "chrome"
 And user launches application using url "http://www.google.com"
 And user wait for page laod123

   @123
  Scenario: Reading test data 
    Given I want to write test data for id "123"
     Then The database table tenant_master will contain record with tenant_Id = 'Surya' and status 'Ready'
  
  
