package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

 // 1st make private default constructor
private Driver(){


}
// apply encapsulation and hide data
private static WebDriver driver;


    public static WebDriver getDriver(){
        if (driver ==null) {
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            return driver;
        } else

            return driver;
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
