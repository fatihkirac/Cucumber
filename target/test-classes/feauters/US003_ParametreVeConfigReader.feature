@US003
Feature: Parametre Kullanimi
  Scenario: TC01 Parametre Kullaniminda ConfigReader Kullanimi
    Given Kullanici "faceUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "facebook" icerdigini test edelim
    And   Sayfayi kapatir

  Scenario: TC02 Parametre Kullaniminda ConfigReader Kullanimi
    Given Kullanici "googleUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "google" icerdigini test edelim
    And   Sayfayi kapatir
  @gp2
  Scenario: TC02 Parametre Kullaniminda ConfigReader Kullanimi
    Given Kullanici "brcUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "blue" icerdigini test edelim
    And   Sayfayi kapatir