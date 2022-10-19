package pages;

import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditorPage {
    public EditorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[text()='New']")
    public WebElement newButton;

    @FindBy (xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//*[text()='Create']")
    public WebElement createButton;

    @FindBy (xpath = "//*[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//*[text()='Fatih Kirac']")
    public WebElement nameText;
}
