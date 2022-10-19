@hepsiBuradaHata
Feature: US004 Parametre Kullanimi
  Scenario: Parametre Kullanimi
    Given Kullanici "https://hepsiburada.com" sayfasinda
    Then  Kullanici 3 saniye bekler
    When  Url'in "amazon" icerdigini test edelim
    And   Sayfayi kapatir