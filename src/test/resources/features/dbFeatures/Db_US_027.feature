
Feature: Mesajlar kullanici  tarafından DB ile dogrulanir
  @DB_US027
  Scenario: Kullanıcı mesajları DB ile dogrulamalidir

    Given Kullanici database ile baglanti kurar
    When  Kullanici kayitli mesajlari gorebilmek icin query olusturur
    Then  Kullanici olusturulan mesaj tablosunu sutun isimlerine gore getirir
    And   Kullanıcı kayitli mesajları dogrulama yapabilmek icin mesaj sutununa gore kaydeder
    And   Kullanici kayitli mesajları dogrular