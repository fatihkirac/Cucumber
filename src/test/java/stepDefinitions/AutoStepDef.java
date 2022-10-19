package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutoPage;
import utilities.Driver;

public class AutoStepDef {
    AutoPage autoPage=new AutoPage();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());

    @And("kullanici sign in linkine tiklar")
    public void kullaniciSignInLinkineTiklar() {
    autoPage.login.click();
    }

    @And("kullanici Create and account bolumune email adresi girer")
    public void kullaniciCreateAndAccountBolumuneEmailAdresiGirer() {
        autoPage.email.sendKeys(faker.internet().emailAddress());
    }

    @And("kullanici Create an Account butonuna basar")
    public void kullaniciCreateAnAccountButonunaBasar() {
        autoPage.creatAccaunt.click();
    }

    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
       actions.click(autoPage.gender).sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
               sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.internet().password()).
               sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("July").sendKeys(Keys.TAB).sendKeys("1980").
               sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
               sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Akgrup Sigorta").sendKeys(Keys.TAB).sendKeys(faker.address().country()).
               sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB).sendKeys("maras").sendKeys(Keys.TAB).
               sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("57587").sendKeys(Keys.TAB).sendKeys("United States").
               sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).
               perform();
    }

    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
        autoPage.register.click();
    }

    @Then("kullanici hesap olustugunu dogrulayin")
    public void kullaniciHesapOlustugunuDogrulayin() {

    }
}
