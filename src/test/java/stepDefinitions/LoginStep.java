package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

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
        Assert.assertTrue(" Logout button not displayed",actual);
        //Driver.getDriver().quit();
    }
    @When("User enters invalid username")
    public void user_enters_invalid_username() {
        loginPage.usernameTextBox.sendKeys("InvalidUser");
    }

    @When("User enters invalid pwd")
    public void user_enters_invalid_pwd() {
        loginPage.usernameTextBox.sendKeys("InvalidPassword");
    }

    @Then("User should not be able to land on home page")
    public void user_should_not_be_able_to_land_on_home_page() throws InterruptedException {
       String actualMessage=loginPage.errorMessage.getText();
       String expectedMessage="Your username is invalid!";
       Thread.sleep(5000);
       Assert.assertEquals("The error message verification failed", expectedMessage, actualMessage);


    }

    @When("User enters empty username")
    public void user_enters_empty_username() {
    loginPage.usernameTextBox.sendKeys("");
    }
    @When("User enters empty pwd")
    public void user_enters_iempty_pwd() {
        loginPage.pwdTextBox.sendKeys("");
    }


}
