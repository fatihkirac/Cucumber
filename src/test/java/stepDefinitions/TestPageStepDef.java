package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

public class TestPageStepDef {
    PracticeTestPage practiceTestPage=new PracticeTestPage();
    Actions actions=new Actions(Driver.getDriver());
    int down32Toplam;
    int clickTextToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresine_gidin(String Url) {
        Driver.getDriver().get(Url);
    }
    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer int1) {
        for (int i = 0; i < int1; i++) {
            practiceTestPage.clickButton.click();
        }

    }
    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer int1) {
        for (int i = 0; i < int1; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }
    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
        for (WebElement w: practiceTestPage.down32
             ) {
         down32Toplam+= Integer.valueOf(w.getText().replaceAll("[^0-9]",""));
            //bu sekilde down 32 ifadesinin down kısmı gider 32 kalir.
            // kalan 32 String oldugu icin int'a cevirmemiz gerekiyor. onun icin Integer.valuOf icine aldik

        }
        System.out.println("down32 toplami :" +down32Toplam);
    }
    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {
        for (WebElement w:practiceTestPage.clickText
             ) {
           clickTextToplam+= w.getText().length();
        }
        sonuc=down32Toplam-clickTextToplam;
        System.out.println("sonuc : "+sonuc);
    }

    @Then("Sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int result) {
        Assert.assertEquals("Sonuc esit degil",result,sonuc);
    }
}
