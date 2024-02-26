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
Feature: CreateLead functionality of Leaftaps Application

#Background: 
    #Given Launch the browser
    #And Load the url

#Scenario Outline is to pass multiple data to a single scenario, followed by Examples keyword
  @Smoke
  Scenario Outline: Create Lead with with multiple data
    Given Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on Login button
    Then Homepage should be displayed
    When Click on crmsfa Link
    And Click on Leads link
    And Click on Create Lead Link
    Given Enter the company name as <companyname>
    And Enter the first name as <firstname>
    And Enter the last name as <lastname>
    When Click on CreateLead button
    Then ViewLeadPage should be displayed
    
    Examples:
    |companyname|firstname|lastname|
    |TestLeaf|Raghu|R|
    |Qeagle|Vineeth|V|
    
    
    
    
    
    
    
    
    
    


