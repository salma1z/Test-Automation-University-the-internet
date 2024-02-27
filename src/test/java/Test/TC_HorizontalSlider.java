package horizontalslider;

import Pages.BasePage;
import Pages.HomePage;
import Pages.HoverPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TC_HorizontalSlider extends BasePage {

    @Test
    public void SetHorizontalSlider(){
        var horizontalSlider = HomePage.clickHorizontalSliderLink();
        double sliderRange = 3;
        horizontalSlider.setSliderRange(sliderRange);
        assertEquals(horizontalSlider, String.valueOf(sliderRange), "Result and adjusted range do not match.");
    }
}