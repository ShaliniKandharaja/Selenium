#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


@tag
Feature: Login Functionality of Leaftaps Application

# Background keyword is for --> Common pre conditions--> for multiple scenarios --> In a single feature file

#Background: 
    #Given Launch the browser
    #And Load the url
    
  @Smoke  #tag name we can give --Positive Scenario
  Scenario: Login with possitive credentials
    Given Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on Login button
    Then Homepage should be displayed
    
    #Since we are starting from Enter username,we shouldn't start from And,So use Given
    #In single feature file if you have two scenarios & same steps consecutivly, We can use Background keyword
    #Since we are starting from Enter username,we shouldn't start from And,So use Given
    
    
    @Functional  @Regression #Negative Scenario
    Scenario: Login with invalid credentials
    Given Enter the username as 'Demosales' 
    And Enter the password as 'crmsfa'
    When Click on Login button
    But ErrorMessage should be displayed
    
    
    


