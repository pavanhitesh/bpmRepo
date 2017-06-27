@API
Feature: Test ActivitiCase generation
  Background:
    Given I Make a New Purchase in Sales Portal

  @SalesPurchase
  Scenario: Create a new purchase and generate an ActivitiCaseId
    And I print the New Activiti Case Id

  