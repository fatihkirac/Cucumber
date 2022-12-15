package stepDefinitions.dbStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;
import static utilities.DatabaseUtility.getColumnNames;

public class US_027_DB_StepDefinition {
   // String query;
   // String fileName;
    @Given("Kullanici database ile baglanti kurar")
    public void kullaniciDatabaseIleBaglantiKurar() {
        DatabaseUtility.createConnection();
    }
    @When("Kullanici kayitli mesajlari gorebilmek icin query olusturur")
    public void kullaniciKayitliMesajlariGorebilmekIcinQueryOlusturur() {
        String query="select * from cmessage";
    }
    @Then("Kullanici olusturulan mesaj tablosunu sutun isimlerine gore getirir")
    public void kullaniciOlusturulanMesajlarıMesajSutununaGoreListeler() {
        String query="select * from cmessage";
        System.out.println("Mesaj sutun isimleri = " + getColumnNames(query));
    }
    @And("Kullanıcı kayitli mesajları dogrulama yapabilmek icin mesaj sutununa gore kaydeder")
    public void kullanıcıKayitliMesajlariDogrulamaYapabilmekIcinKaydeder() {
        String query="select * from cmessage";
        System.out.println("---------------------------");
        List<Object> messageIdsList=getColumnData(query,"id");

        String fileName="src/test/resources/testdata/messages_Ids.txt";
        WriteToTxt.saveMessages(fileName,messageIdsList);
    }

    @And("Kullanici kayitli mesajları dogrular")
    public void kullaniciKayitliMesajlarıDogrular() {
        String fileName="src/test/resources/testdata/messages_Ids.txt";
        List<Object> actualMessageIdsList= ReadTxt.returnMessagesList(fileName);
        System.out.println("actualMessageIdsList = " + actualMessageIdsList);
        List<Object> expectedMessageIdsList=new ArrayList<>();
       expectedMessageIdsList.add("388043");
       expectedMessageIdsList.add("392054");

       Assert.assertTrue("Mesaj idleri uyusmuyor", actualMessageIdsList.containsAll(expectedMessageIdsList));


    }
}
