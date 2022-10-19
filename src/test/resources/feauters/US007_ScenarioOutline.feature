Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given Kullanici "<arananurl>" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "<arananKelime>" icerdigini test edelim
    And   Sayfayi kapatir
    Examples:
      | arananurl | arananKelime |
      | amazonUrl | amazon       |
      | faceUrl   | face         |
      | brcUrl    | blue         |
      | google    | google       |
