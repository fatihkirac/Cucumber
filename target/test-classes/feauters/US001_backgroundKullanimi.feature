
@Background #Runner class'taki tags bolumune tags="@background", yazıp run dedigimizde bu class'ı calistirir
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici amazonda nutella aratir


    Then  Kullanici nutella icin arama yapar
    And   Sonuclarin nutella icerdigini test eder

  Scenario: TC02 kullanici amazonda Selenium aratir


    Then  Kullanici Selenium icin arama yapar
    And   Sonuclarin Selenium icerdigini test eder

  Scenario: TC03 Kullanici amazonda iphone aratir


    Then  Kullanici iphone icin arama yapar
    And   Sonuclarin iphone icerdigini test eder
    And   Sayfayi kapatir