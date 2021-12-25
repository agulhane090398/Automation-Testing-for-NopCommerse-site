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
Feature: Login

  @tag1
  Scenario: Successful Login with Valid Credentials
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
		When Click on Logout link
    Then Page title should be "Your store. Login"
    And close browser
    
  Scenario Outline: Login with DDT
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "<email>" and Password as "<pwd>"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
		When Click on Logout link
    Then Page title should be "Your store. Login"
    And close browser
    
    Examples:
    	| email | pwd |
    	| admin@yourstore.com | admin |
    	| admin1@yourstore.com | admin123 |
		

    
  