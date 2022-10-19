@PracticeAmazon
Feature: Amazon Practice
  Scenario: Amazon Sign in Test

 Given kullanici Amazon web sitesine gider
 When  sign in butonuna tiklar
 And   faker kullanarak e-posta gonderir
 And   gonderdigi e-postanin ekran goruntusunu alir
 And   continiue'a tiklar
 Then  There was a problem mesajini dogrular
 And   Need help e tiklar
 And   forgot your password e tiklar
 Then  Password assistance metnini dogrular
 And   Geri gider
 And   Create your account butonuna tiklar
 And   Create account metnini dogrular
 And   Sayfayi kapatir