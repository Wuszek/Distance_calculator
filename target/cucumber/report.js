$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "name": "Sample new feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Calculator check - addition of two numbers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Calculator is up and running",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.calculatorIsUpAndRunning()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add number 2",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.addNumber(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add number 3",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.addNumber(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Score is 5",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.scoreIs(int)"
});
formatter.result({
  "status": "passed"
});
});