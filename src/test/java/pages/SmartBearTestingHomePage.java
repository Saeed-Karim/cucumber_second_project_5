package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SmartBearTestingHomePage extends SmartBearBasePage{
    public SmartBearTestingHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
