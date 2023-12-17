package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

     //one way of implementing PageFactory
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id="username")
    public WebElement usernameTextBox;

    @FindBy(id="password")
    public WebElement pwdTextBox;

    @FindBy(id="submit")
    public WebElement submitButton;


}
