package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage {
    private static WebDriver driver;
private  By TargetText=By.id("target");
private  By ResultText=By.id("result");


    public  KeyPressesPage(WebDriver rdriver){
        this.driver = rdriver;
        PageFactory.initElements(rdriver,this);

    }
@FindBy(xpath = "//*[@id=\"content\"]/ul/li[31]/a")
    WebElement clickBtn;

    public void PressBtn(){
        clickBtn.click();
    }

    public void EnteredText(String text){

        driver.findElement(TargetText).sendKeys(text);
    }
    public String TextResult(){
        return driver.findElement(ResultText).getText();
    }
    public void enterPi(){
        this.EnteredText(Keys.chord(Keys.ALT,"p") + "= 3.14");
    }
 }

