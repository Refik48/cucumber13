Feature: US1005_Amazon Scenario Outline
  Scenario Outline: TC10_Amazon Coklu Arama
    
    Given kullanici amazon sayfasina gider
    Then "<Meyve>" icin arama yapar
    And sonuclarin "<Meyve>" icerdigini test eder

    Examples:
    |Meyve|
    |ananas|
    |kavun|
    |armut|
    |portakal|
    |muz|
    |erik|

    # Bir liste icerisine koyduk ve bu listenin icinde yazilanlari tek tek arar.
    # Onemli Noktalar :
    # 1) Examples icerisine aranacak kelimeler yazilir.
    # 2) Yazilan elemanlar duz cizgi (| |) icerisinde yazilmak zorundadir.
    # 3) Scenario'da kullanilan String kelimeiz Listenin ilk elemani olmak zorundadir.