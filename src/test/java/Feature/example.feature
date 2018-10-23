@example
Feature: Example for Alexa

  @example1
  Scenario: Launch the seleniumhq browser and navigate to download page
    Given User navigated to seleiumhq org with url "https://www.seleniumhq.org/"
    When User click on download tab
    Then User navigated to documentation tab
