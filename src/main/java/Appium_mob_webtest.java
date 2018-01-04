import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class Appium_mob_webtest {
    @Test
    public void FirstTest() throws Exception{
        URL serverUrl = new URL ("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("clearSystemFiles", "true");
        capabilities.setCapability("newCommandTimeout", "10000");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("deviceReadyTimeout", "50");
        capabilities.setCapability("fullReset", "true");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("deviceName", "NEXUS5");
        capabilities.setCapability("browserName", "Chrome");

AppiumDriver driver = new AndroidDriver(serverUrl,capabilities);
WebDriverWait wait = new WebDriverWait(driver, 30);



        }
    }

