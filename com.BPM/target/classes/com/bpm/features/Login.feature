@BPM
Feature: To Test BPM Portal

@BPMLogin
Scenario: To Login to BPM Portal

Given I Navigate to BPM Portal
When I Login to BPM
Given I Search CaseId "003995-118120-2662489"
Then I Click on Add3 Contact Button
And I Click on Claim
Given I Select LOA Details "Yes, LOA looks OK"
Then I Click on Add Haluer Button