package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginStep {
 //WebDriver driver;

 LoginPage loginPage ;

    @Given("User lands on HRM application")
    public void user_lands_on_hrm_application() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
      //  driver = new ChromeDriver();
        Driver.getDriver().get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(5000);
        loginPage = new LoginPage();

        // This is 2 nd way of pageFactory use
        //PageFactory.initElements(driver, loginPage);

    }


    @When("User enters username")
    public void user_enters_username() {
        //driver.findElement(By.id("username")).sendKeys("student");
        loginPage.usernameTextBox.sendKeys("student");

    }
    @When("User enters pwd")
    public void user_enters_pwd() {
        //driver.findElement(By.id("password")).sendKeys("Password123");
        loginPage.pwdTextBox.sendKeys("Password123");
    }
    @When("user click login button")
    public void user_click_login_button() throws InterruptedException {
       // driver.findElement(By.id("submit")).click();
        loginPage.submitButton.click();
        Thread.sleep(5000);

    }

    @Then("User should be able to land on home page")
    public void user_should_be_able_to_land_on_home_page() {
        boolean actual=  Driver.getDriver().findElement(By.cssSelector("a.wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color")).isDisplayed();
        Assert.assertTrue(" The username element not displayed",actual);
        Driver.getDriver().quit();
    }

}
