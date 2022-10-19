package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //Scenariolarda bir hata alinirsa hata alinan yerin fotografini raporlara resim olarak eklemeye yariyor
    @After
    public void tearDown(Scenario scenario){  final byte[] screenshot=((TakesScreenshot)
            Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
        scenario.attach(screenshot, "image/png","screenshots");
    }
    //   Driver.closeDriver();
    }
}
