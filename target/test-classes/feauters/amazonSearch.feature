
@All #buraya @All yazıp runner classtaki tag'ada @all deyince butun gruplari calistirir.
Feature: Amazon Search
  @gp1 #buraya @gp1 yazinca Runner classta tags = bolumune @gp 1 uazınca b@gp1 olanlar calisir
  Scenario: TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon sayfasina gider
    Then  Kullanici nutella icin arama yapar
    And   Sonuclarin nutella icerdigini test eder
    And   Sayfayi kapatir

  @gp2
    Scenario: TC02 kullanici amazonda Selenium aratir

      Given Kullanici amazon sayfasina gider
      Then  Kullanici Selenium icin arama yapar
      And   Sonuclarin Selenium icerdigini test eder
      And   Sayfayi kapatir

  @gp3
      Scenario: TC03 Kullanici amazonda iphone aratir
        Given Kullanici amazon sayfasina gider
        Then  Kullanici iphone icin arama yapar
        And   Sonuclarin iphone icerdigini test eder
        And   Sayfayi kapatir