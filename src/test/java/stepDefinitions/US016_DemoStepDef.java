package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class US016_DemoStepDef {
    DemoPage demoPage=new DemoPage();
    Actions actions=new Actions(Driver.getDriver());
    @When("kullanici Alerts’e tiklayin")
    public void kullaniciAlertsETiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoPage.alertButton.click();
    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
    demoPage.clickMe.click();
    }

    @And("kullanici Allert’in gorunur olmasini bekler")
    public void kullaniciAllertInGorunurOlmasiniBekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("kullanici Allert uzerindeki yazinin “This alert appeared after bes seconds oldugunu test  eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
        Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains("This alert appeared after 5 seconds"));
    }

    @And("kullanici Ok diyerek alerti kapatin")
    public void kullaniciOkDiyerekAlertiKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }
}
