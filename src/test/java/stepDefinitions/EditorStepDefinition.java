package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditorStepDefinition {
    EditorPage editorPage=new EditorPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    @Then("new butonunabasar")
    public void newButonunabasar() {
    editorPage.newButton.click();
    }

  // @And("tum bilgileri girer")
  // public void tumBilgileriGirer() {

  // actions.click(editorPage.firstName).sendKeys("Fatih").sendKeys(Keys.TAB).
  //         sendKeys("Kirac").sendKeys(Keys.TAB).sendKeys("QA").sendKeys(Keys.TAB).
  //         sendKeys("Istanbul").sendKeys(Keys.TAB).sendKeys("Ext").sendKeys(Keys.TAB).
  //         sendKeys("2022-10-12").sendKeys(Keys.TAB).sendKeys("80000").sendKeys(Keys.TAB).perform();
  // }

    @And("Create tusunabasar")
    public void createTusunabasar() {
        actions.sendKeys(Keys.TAB,Keys.ENTER).perform();

    }

    @When("kullanici ilk isim ile aramayapar")
    public void kullaniciIlkIsimIleAramayapar() {
    editorPage.searchBox.sendKeys("Fatih");
    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular() {
        String expectedName="Fatih Kirac";
        Assert.assertEquals(expectedName,editorPage.nameText.getText());
    }

    @When("Kullanici editorDatabase sayfasina gider")
    public void kullaniciEditorDatabaseSayfasinaGider() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @And("isim bolumune {string}  girer")
    public void isimBolumuneGirer(String firstName) {
        editorPage.firstName.sendKeys(firstName);
    }

    @And("soyisim bolumune {string}  girer")
    public void soyisimBolumuneGirer(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();
    }

    @And("position bolumune{string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();

    }

    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String ofis) {
        actions.sendKeys(Keys.TAB).sendKeys(ofis).perform();

    }

    @And("extension bolumune{string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();

    }

    @And("start date bolumune{string} girer")
    public void startDateBolumuneGirer(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();

    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();

    }

    @When("kullanici {string} ile aramayapar")
    public void kullaniciIleAramayapar(String firstName) {
        editorPage.searchBox.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(editorPage.nameText.getText().contains(isim));
    }
}
