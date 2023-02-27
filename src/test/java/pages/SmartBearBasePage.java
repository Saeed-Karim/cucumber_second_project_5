package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SmartBearBasePage {

    public SmartBearBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "#ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;
}
