package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {
    public WebDriver driver;

    public ForgetPasswordPage(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[20]/a")
    WebElement ForgetPassBtn;

    @FindBy(id = "email")
    WebElement Email;

    @FindBy(id="form_submit")
    WebElement Submit;



    public void SetForgetBtn(){
        ForgetPassBtn.click();
    }
     public void SetEmail(String text){
        Email.sendKeys(text);
 }
    public void SubmitBtn(){
        Submit.click();
    }
}
