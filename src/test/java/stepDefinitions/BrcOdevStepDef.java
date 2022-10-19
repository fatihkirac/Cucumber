package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcOdevStepDef {
    BrcPage brcPage=new BrcPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("{string} username girer")
    public void usernameGirer(String gecersizEmail) {
        brcPage.email.sendKeys(gecersizEmail);
    }

    @And("{string} password girer")
    public void passwordGirer(String gecersizPassword) {
        brcPage.password.sendKeys(gecersizPassword);
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        brcPage.login2.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.login2.isDisplayed());
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) throws InterruptedException {
        Thread.sleep(3*1000);
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }
}
