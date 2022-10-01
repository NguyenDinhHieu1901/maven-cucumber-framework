package stepDefinitions;

import io.cucumber.datatable.DataTable;
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
import java.util.List;
import java.util.Map;

public  class RegisterStepDefinitions {
    WebDriver driver;

    @Before("@data_table")
    public void preCondition() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
    }

    @When("User input to First Name textbox with {string}")
    public void userInputToFirstNameTextboxWith(String firstName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
    }

    @And("User input to Last Name textbox with {string}")
    public void userInputToLastNameTextboxWith(String lastName) {
        driver.findElement(By.id("LastName")).sendKeys(lastName);
    }

    @And("User input to Email textbox with {string}")
    public void userInputToEmailTextboxWith(String email) {
        driver.findElement(By.id("Email")).sendKeys(email);
    }

    @And("User input to Password textbox with {string}")
    public void userInputToPasswordTextboxWith(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("User input to Confirm password textbox with {string}")
    public void userInputToConfirmPasswordTextboxWith(String password) {
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
    }

    @And("User click to Register button")
    public void userClickToRegisterButton() {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("Verify message {string} is displayed")
    public void verifyMessageIsDisplayed(String messageSuccess) {
        Assert.assertEquals(driver.findElement(By.className("result")).getText(), messageSuccess);
    }

    @After("@data_table")
    public void tearDown() {
        driver.quit();
    }

    @When("User input to Register form with data")
    public void userInputToRegisterFormWithData(DataTable registerTable) {
        List<Map<String, String>> register = registerTable.asMaps(String.class, String.class);
        driver.findElement(By.id("FirstName")).sendKeys(register.get(0).get("firstName"));
        driver.findElement(By.id("LastName")).sendKeys(register.get(0).get("lastName"));
        driver.findElement(By.id("Email")).sendKeys(register.get(0).get("email"));
        driver.findElement(By.id("Password")).sendKeys(register.get(0).get("password"));
        driver.findElement(By.id("ConfirmPassword")).sendKeys(register.get(0).get("password"));
    }
}
