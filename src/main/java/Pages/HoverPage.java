package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class HoverPage {
    public WebDriver driver;
    public By figureBox=By.className("figure");
    public By FigureCaption=By.className("figcaption");


    public HoverPage(WebDriver rdriver){
        WebDriver ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[25]/a")
    WebElement HoverLink;

    public void setHoverLink(){
        HoverLink.click();
    }

    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions=new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(FigureCaption));
    }
     public class FigureCaption{
        private WebElement caption;
        private  By header= By.tagName("h5");
        private  By link=By.tagName("a");

        public FigureCaption(WebElement caption){
           this.caption=caption;
        }
        public boolean IsCaptionDisplayed(){
            return caption.isDisplayed();
    }
    public String getTitle(){
            return caption.findElement(header).getText();
    }
    public String getLink(){
            return caption.findElement(link).getAttribute("href");
    }
    public String getLinkText(){
            return caption.findElement(link).getText();
    }
  }
}
