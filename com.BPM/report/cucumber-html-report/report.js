$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 2,
  "name": "To Test Cucumber",
  "description": "",
  "id": "to-test-cucumber",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Cucu"
    }
  ]
});
formatter.before({
  "duration": 4705357936,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To Start Cucumber",
  "description": "",
  "id": "to-test-cucumber;to-start-cucumber",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@OpenCu"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I Open URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I Navigate To Downloads",
  "keyword": "And "
});
formatter.match({
  "location": "Example.i_Open_URL()"
});
formatter.result({
  "duration": 11954384738,
  "status": "passed"
});
formatter.match({
  "location": "Example.i_Navigate_To_Download()"
});
formatter.result({
  "duration": 3090511367,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2672807554,
  "status": "passed"
});
});