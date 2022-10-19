package stepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
public class Practice_TC_07steps {
    PracticeTC07Page practiceTC07Page = new PracticeTC07Page();
    @Given("Tarayıcıyı başlatarak {string} url'sine gidin")
    public void tarayıcıyı_başlatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
    @Then("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
    public void ana_sayfanın_başarıyla_görünür_olduğunu_doğrulayın() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());
    }
    @Then("Test Case buttonu na tıklayın")
    public void test_case_buttonu_na_tıklayın() {
        practiceTC07Page.testCaseLink.click();
    }
    @Then("Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın")
    public void kullanıcının_test_case_sayfasına_başarıyla_yönlendirildiğini_doğrulayın() {
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());
    }
    @Then("İlgili sayfanın ekran görüntüsünü alın")
    public void ilgili_sayfanın_ekran_görüntüsünü_alın() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}