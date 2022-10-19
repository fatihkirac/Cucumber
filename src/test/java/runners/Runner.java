package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    //    plugin={"html:target\\cucumber-reports.html"},//target klasoru altinda cucumber-reports sayfasi ile
                                                       //    raporlama alabilmek icin kullaniliyor
        plugin={"html:target\\cucumber-reports.html", //Target altinda json ve xml klasorleri altinda rapor almayi saglar
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/feauters", //features klasörü yolunu aldik
        glue = "stepDefinitions", //path from sourceroots ile yolu kopya yapistirda olabilir.
        tags = "@US017",// araya or yazinca feature klasöründeki 1. ve 2. grup çalışır."@gp1" sadece 1.grup, "@gp2" sadece 2. grup calistirir
                            // buraya @All yazinca da tum gruplar calisir.
        dryRun = false //burası true olursa sayfaları acmadan kodları calistirip kontrol eder
)

public class Runner {
   /*
     Runner Class TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senaryolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde
    features : Runeer dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder

    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.
     */
}
