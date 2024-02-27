package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static KeyPressesPage clickKeyPresses;
    public WebDriver driver;

    public HomePage(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[21]/a")
    WebElement FormLogin;

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[11]/a")
    WebElement DropDown;

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[31]/a")
    WebElement KeyPresses;


    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public HoverPage clickHovers() {
        clickLink("Hovers");
        return new HoverPage(driver);

    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSlider clickHorizontalSliderLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }

    public void LoginBtn(){
        FormLogin.click();
    }
    public void ClickDropDown(){
        DropDown.click();
    }


}

