package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

public class BasePage {
    public String baseurl = "https://the-internet.herokuapp.com/";
    public String userName = "";
    public String Password = "";
    public static WebDriver driver;
    JavascriptExecutor js;

    public static Logger logger;

    @BeforeClass
    public static void SetUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");

    }

    @AfterClass
    public static void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();driver.quit();
    }
    public void ScrollDown()
    {
        new WebDriverWait(driver, Duration.ofSeconds(50));

        JavascriptExecutor js = (JavascriptExecutor) driver;
    }
    public void captureScreen (WebDriver driver, String tname) throws IOException {

        //Code for capturing screenshots
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(src, new File("./image2.png"));
        System.out.println("Screenshot taken");

    }

}



