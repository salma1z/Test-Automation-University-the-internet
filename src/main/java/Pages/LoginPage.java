package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public WebDriver driver;

    public LoginPage(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[21]/a")
    WebElement OpenLogin;

    @FindBy(id="username")
    WebElement UserField;

    @FindBy(id = "password")
    WebElement PasswordField;

    @FindBy(xpath = "//*[@id=\"login\"]/button/i")
    WebElement LoginBtn;

    @FindBy(id = "flash")
    WebElement FlashLogin;

    public void LoginForm() {
        OpenLogin.click();
    }
    public void SetName(String text){
        UserField.sendKeys(text);
    }
    public void SetPassword(String text){
        PasswordField.sendKeys(text);
    }

    public void SetLogin(){
         LoginBtn.click();

    }
    public String SetFlashMsg(){
        return FlashLogin.getText();
    }
}
