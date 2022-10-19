package stepDefinitions;

import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class HerokustepDefinitoon {
        HerokuPage herokuPage=new HerokuPage();

    @And("{string} butona basin")
    public void butonaBasin(String addElement) {
        herokuPage.addElement.click();
    }

    @And("{string} butonu gorunur oluncaya kadar bekleyin")
    public void butonuGorunurOluncayaKadarBekleyin(String Delete) {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuPage.addElement));
       // ReusableMethods.waitForVisibility(herokuPage.deleteButon,10);
    }

    @And("{string} butonunun gorunur oldugunu test edin")
    public void butonununGorunurOldugunuTestEdin(String arg0) {
        Assert.assertTrue(herokuPage.deleteButon.isDisplayed());
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herokuPage.deleteButon.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {

        Assert.assertTrue(herokuPage.deleteButonList.isEmpty());
    }

    @And("{string}  adresine gidin")
    public void adresineGidin(String herokuUrl) {
        Driver.getDriver().get(herokuUrl);
    }
}
