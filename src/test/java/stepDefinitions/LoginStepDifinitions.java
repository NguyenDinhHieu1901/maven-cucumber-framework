package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginStepDifinitions {
    WebDriver driver;

    @Before("@all_param")
    public void openApplication() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login");
    }

    @When("Input to username text box with data {string}")
    public void inputToUsernameTextBoxWithData(String username) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(username);
    }

    @And("Input to password text box with data {string}")
    public void inputToPasswordTextBoxWithData(String password) {
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("Click to submit button")
    public void clickToSubmitButton() {
        driver.findElement(By.cssSelector("button.login-button")).click();
    }

    @Then("Verify Home Page is displayed")
    public void verifyHomePageIsDisplayed() {
        System.out.println("Verifying.........");
    }

    @After("@all_param")
    public void closeToApplication() {
        driver.quit();
    }

    @When("Input to username text box")
    public void inputToUsernameTextBox() {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("automationtesting@gmail.com");
    }

    @And("Input to password text box")
    public void inputToPasswordTextBox() {
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("123456");
    }

    @When("^Input to username text box with data ([^\"]*)$")
    public void inputToUsernameTextBoxWith(String username) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(username);
    }

    @And("^Input to password text box with data ([^\"]*)$")
    public void inputToPasswordTextBoxWith(String password) {
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @When("Input to username text box with {string} and Input to password text box with {string}")
    public void inputToUsernameTextBoxWithAndInputToPasswordTextBoxWith(String username, String password) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(username);

        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);
    }
}
