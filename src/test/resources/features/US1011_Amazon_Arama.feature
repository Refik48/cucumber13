@wip
Feature: US1011 Amazon Arama

  Scenario: TC15_Kullanici Amazonda Mehmet Aratir
    Given kullanici "amazon_url" sayfasina gider
    Then Today's deal sekmesine tiklar
    And Today's deal sayfasinda "Mehmet" icin arama yapar
    Then ilk ilan isminde "Mustafa" gectigini test eder


