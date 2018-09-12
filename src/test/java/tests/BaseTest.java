package tests;

import automationpracticeui.objects.MainPage;
import automationpracticeui.steps.MainPageSteps;
import listeners.CustomListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(CustomListener.class)
public class BaseTest {
   public MainPageSteps mainPageSteps;
public WebDriver driver;

    @BeforeMethod
    public void prepareEnv () {
        System.out.println("Preparing environment");

        System.setProperty("webdriver.chrome.driver", "D:\\automation\\artifactid\\artifactid\\src\\main\\resources\\chromedriver.exe");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability("marionette", true);
        WebDriver driver = new ChromeDriver(desiredCapabilities);
        driver.get("http://automationpractice.com/index.php");
        mainPageSteps = new MainPageSteps(driver);
        }

        @AfterMethod

        public void cleanupEnv () {
            System.out.println("Clean environment");
          //  driver.quit();

        }
}
