@BPM
Feature: To Test BPM Portal

  @BPMAddHaluer
  Scenario: To Add one Haluer and accept the haluer to complete the task
    Given I Navigate to BPM Portal
    When I Login to BPM
    Given I Click on All Task Tab
    And I Search CaseId "004009-118226-2662529"
    Then I Click on Add3 Contact Button
    And I Click on Claim
    Given I Select LOA Details "Yes, LOA looks OK"
    Then I Click on Add Haluer Button
    When I Add Hauler Name Details "TestAutomation"
    And I Add Hauler Details "Lock Fee"
    And I Add Hauler Details "Caster Fee"
    And I Add Hauler Details Add Button
    Then I Select Haulers Agree To The Terms
    Given I Add Contracted Haluer Details
    Then I Click on Complete Task
    Given I Click on the Task Tab
    And I Search CaseId "004009-118226-2662529"
    And I Click on the Case Link "004009-118226-2662529"
    Then I Click on Claim
    When I Select Cancellation Details "No, the cancellation letter was not sent because there is no incumbent"
    Then I Click on Complete Task
    And I Click on Logout

  @BPMAddHaluer1
  Scenario: To upload customer document and add Haluer and complete the task
    Given I Make a New Purchase in Sales Portal
    And I Navigate to BPM Portal
    When I Login to BPM
    Given I Click on All Task Tab
    And I Search CaseId ""
    And I Click on the Case Link ""
    And I Click on Claim
    Given I Upload Customer Document
    Then I Click on Complete Task
    Given I Click on the Cases Tab
    Given I Search CaseId ""
    And I Click on the Case Link ""
    Then I Click on Add3 Contact Button
    And I Click on Claim
    Given I Select LOA Details "Yes, LOA looks OK"
    Then I Click on Add Haluer Button
    When I Add Hauler Name Details "TestAutomation"
    And I Add Hauler Details "Lock Fee"
    And I Add Hauler Details "Caster Fee"
    And I Add Hauler Details Add Button
    Then I Select Haulers Agree To The Terms
    Given I Add Contracted Haluer Details
    Then I Click on Complete Task
    Given I Click on the Task Tab
    And I Search CaseId ""
    And I Click on the Case Link ""
    Then I Click on Claim
    When I Select Cancellation Details "No, the cancellation letter was not sent because there is no incumbent"
    Then I Click on Complete Task
    And I Click on Logout
    And I Click on Logout
