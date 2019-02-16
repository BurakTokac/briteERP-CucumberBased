package pages.configuration_accounting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Journals {
    public Journals(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement pageName;

    @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'Accounting') ]")
    public WebElement accountingLink;

    @FindBy(xpath = "(//span[@class='oe_menu_text'][contains(text(),'Journals')])[2]")
    public WebElement journalsLink;

    @FindBy(xpath = "//li[@class='active'][.='New']")
    public WebElement creationNewPageText;

}
