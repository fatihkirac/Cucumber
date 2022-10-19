package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login1;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy (xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement login2;

    @FindBy (xpath = "//*[text()='invalid credentials']")
    public WebElement invalidButton;
}
