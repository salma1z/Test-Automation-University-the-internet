package Test;

import Pages.BasePage;
import Pages.DropDownPage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TC_Dropdown extends BasePage {

    @Test
    public void TC_ValidSelect() throws InterruptedException {

        DropDownPage DropObj=new DropDownPage(driver);
        DropObj.SetDrop();
        DropObj.SelectDropDown("Option 2");
        Thread.sleep(2000);
        String option="Option 2";
        DropObj.SelectDropDown(option);
        var selectedOptions = DropObj.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number ");
    }
}
