package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {
    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class=\"text\"][.='Alerts']")
    public WebElement alertButton;

    @FindBy(xpath = "(//*[text()='Click me'])[2]")
    public WebElement clickMe;
}
