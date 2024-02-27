package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    public static WebDriver driver;

    public DropDownPage(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        driver = rdriver;
    }
 @FindBy(xpath = "//*[@id=\"content\"]/ul/li[11]/a")
         WebElement SelectDrop;

    @FindBy(xpath = "//select[@id='dropdown']")
            WebElement selectElement;

    /*@FindBy(xpath = "//*[@id=\"dropdown\"]/option[2]")
            WebElement dropdown;*/

    private By dropdown = By.id("dropdown");


    public void SetDrop() {
        SelectDrop.click();
    }
    public void SelectDropDown(String option){

        Select DropDownElement=new Select(driver.findElement(dropdown));
        DropDownElement.selectByVisibleText(option);
    }
        public List<String> getSelectedOptions(){
            Select dropdownElement = new Select(driver.findElement(dropdown));
            List<WebElement> selectedElements = dropdownElement.getAllSelectedOptions();
            return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }



}
