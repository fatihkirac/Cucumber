package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuPage {
    public HerokuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@onclick='addElement()']")
    public WebElement addElement;

    @FindBy (xpath = "//*[@onclick='deleteElement()']")
    public WebElement deleteButon;

    @FindBy (xpath = "//*[@onclick='deleteElement()']")
    public List<WebElement> deleteButonList;
}
