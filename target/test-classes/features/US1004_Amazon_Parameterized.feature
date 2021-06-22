@wip
Feature: US1004 Amazon Parameterized

  Background: Amazon sayfasina git
    Given kullanici amazon sayfasina gider

    Scenario: TC07_Amazon iPhone arama parametreli
      When "iPhone" icin arama yapar
      Then sonuclarin "iPhone" icerdigini test eder