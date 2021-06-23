@wip
Feature: US1006_Dinamik Url Test

  Scenario: TC11_Dinamik Url Test

    Given kullanici "<sayfaUrl>" sayfasina gider
    Then sayfayi kapatir
    Examples:
      |sayfaUrl|
      |amazon_url|
      |yandex_url|
      |facebook_url|