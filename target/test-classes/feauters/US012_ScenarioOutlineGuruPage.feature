Feature: US012 Class Work

  Scenario Outline: TC01 kullanici sutun basligi ile liste alabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    And   "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      |Basliklar          |
      |Company            |
      |Group              |
      |Prev Close (Rs)	  |
      |Current Price (Rs) |
      |% Change           |

    Scenario: Kullanici sayfayi kapatir
      Given sayfayi kapatir