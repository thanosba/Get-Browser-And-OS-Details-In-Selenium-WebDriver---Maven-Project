/**
 * Created by thanos-imac on 8/7/18.
 */

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
public class preparation {

    WebDriver driver;

    @BeforeTest
    public void preparation(){

        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/IdeaProjects/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        //Check and print Chrome browser and OS detail.
        CheckBrowserOS();
        driver.close();
    }

    public void CheckBrowserOS() {
        //Get Browser name and version.
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getVersion();

        //Get OS name.
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println("OS = " + os + ", Browser = " + browserName + " "+ browserVersion);
    }
}

