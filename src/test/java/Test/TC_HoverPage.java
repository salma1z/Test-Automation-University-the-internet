package Test;

import Pages.BasePage;
import Pages.HoverPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class TC_HoverPage extends BasePage {
    @Test
    public void TC_Hover(){
        HoverPage hoverObj=new HoverPage(driver);
        hoverObj.setHoverLink();
       var caption= hoverObj.hoverOverFigure(1);
       assertTrue(caption.IsCaptionDisplayed(),"caption not displayed");
       assertEquals(caption.getTitle(),"name:user 1","caption title incorrect");
       assertEquals(caption.getLinkText(),"View profile","caption link is incorrect");
       assertTrue(caption.getLink().endsWith("/users/1"),"link incorrect");
    }
}
