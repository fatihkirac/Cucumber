package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guru = new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index = 0;
        for (int i = 0; i < guru.basliklar.size(); i++) {
           if(guru.basliklar.get(i).getText().equals(baslik)){//feature'dan gelen string degeri i degerine esitledik
               System.out.println(guru.basliklar.get(i).getText());//feature'dan gelen basligi yazdirdik
               index = i+1; //feature'dan gelen ve i degerine esitledigimiz string'i ayni degere sahip sutunlarida
                            //yazdirabilmek icin bos bir konteynar olusturup ona atadik. Liste index 0(sıfır) dan
                            //basladigi icin ve webTable locate'imiz 1 den basladigi icin i degrini 1 artirdik
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                //webTable'daki body'i locate edip esitledigimiz index'i baslik altindaki sutunu getirebilmesi icin
                //bu liste koyduk
                sutunElement.forEach(t-> System.out.println(t.getText()));

                //for (WebElement w:sutunElement) {
                //    System.out.println(w.getText());
                //}



            }

        }
    }
}