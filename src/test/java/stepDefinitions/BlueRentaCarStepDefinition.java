package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class BlueRentaCarStepDefinition {
    BrcPage brcPage=new BrcPage();
    Faker faker=new Faker();
    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.login1.click();

    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {

        brcPage.email.sendKeys(faker.internet().emailAddress());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.password.sendKeys(faker.internet().password());
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.login2.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() throws IOException, InterruptedException {
        Thread.sleep(2000);
        WebElement invalidEntry=brcPage.invalidButton;
        File invalidWe=invalidEntry.getScreenshotAs(OutputType.FILE);
       // TakesScreenshot ts= (TakesScreenshot) Driver.getDriver(); //==> tum sayfa resmi icin
       // File tumSayfaResmi=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(invalidWe,new File("target/ekranGoruntusu/brcUnvalidLogin.jpeg"));
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
