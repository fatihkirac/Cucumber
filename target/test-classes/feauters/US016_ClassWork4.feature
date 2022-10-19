@US016
Feature: US016 Class Work4

  Scenario: TC01 alerts and explicitly wait
    Given kullanici "demoUrl" anasayfasinda
    And   kullanici 2 sn bekler
    When  kullanici Alerts’e tiklayin
    And   kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar
    And   kullanici Allert’in gorunur olmasini bekler
    And   kullanici Allert uzerindeki yazinin “This alert appeared after bes seconds oldugunu test  eder
    And   kullanici Ok diyerek alerti kapatin
