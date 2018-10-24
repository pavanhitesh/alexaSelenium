$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 2,
  "name": "Example for Alexa",
  "description": "",
  "id": "example-for-alexa",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@example"
    }
  ]
});
formatter.before({
  "duration": 17359063800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Launch the seleniumhq browser and navigate to download page",
  "description": "",
  "id": "example-for-alexa;launch-the-seleniumhq-browser-and-navigate-to-download-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@example1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigated to seleiumhq org with url \"https://www.seleniumhq.org/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on download tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User navigated to documentation tab",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.seleniumhq.org/",
      "offset": 42
    }
  ],
  "location": "StepDefinitions.user_navigated_to_seleiumhq_org_with_url(String)"
});
formatter.result({
  "duration": 2550961200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_download_tab()"
});
formatter.result({
  "duration": 1972159300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_navigated_to_documentation_tab()"
});
formatter.result({
  "duration": 1826985800,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1648803800,
  "status": "passed"
});
});