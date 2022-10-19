@BlueRentaCar
Feature: US1009 Blue RentaCar Login
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici bluerentacar ana sayfasinda
    Then  Login yazisina tiklar
    And   Kullanici 3 saniye bekler
    And   gecersiz username girer
    And   gecersiz password girer
    And   Kullanici 3 saniye bekler
    And   Login butonuna basar
    Then  sayfaya giris yapilamadigini kontrol eder
    And   kulllanici sayfayi kapatir