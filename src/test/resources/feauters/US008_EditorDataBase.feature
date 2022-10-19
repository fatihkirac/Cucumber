@Editor
Feature: US008 Kullanici Data Ekler
  Scenario Outline: Kullanici Yeni Data Ekler

    When Kullanici editorDatabase sayfasina gider
    Then new butonunabasar
    And  isim bolumune "<First Name>"  girer
    And  soyisim bolumune "<Last Name>"  girer
    And  position bolumune"<position>" girer
    And  ofis bolumune "<ofis bilgisi>" girer
    And  extension bolumune"<extension>" girer
    And  start date bolumune"<start date>" girer
    And  salary bolumune "<salary>" girer
    And  Create tusunabasar
    When kullanici "<First Name>" ile aramayapar
    Then isim bolumunde "<First Name>" oldugunu dogrular
    Examples:
      | First Name | Last Name | position | ofis bilgisi | extension | start date | salary |
      | ALi        | Veli      | Qa       | Google       | Senior    | 2022-10-11 | 15000  |
      | Ahmet      | Mehmet    | Qa       | Google       | Junior    | 2022-10-12 | 10500  |
      | Hasan      | Duman     | Dev      | Amazon       | Junior    | 2022-10-10 | 25000  |
      | Akin       | Alkan     | Dev      | Amazon       | Senior    | 2022-10-09 | 50000  |
      | Orhan      | Duman     | PO       | WallMart     | Senior    | 2022-10-08 | 30000  |