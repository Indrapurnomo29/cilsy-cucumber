package Register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterFailed {
    WebDriver driver;

    @Given("Open the chrome")
    public void Open_the_chrome() throws Throwable {
        System.out.println("This step user open the chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("User input email address with invalid data")
    public void User_input_email_address_with_invalid_data() throws Throwable {
        System.out.println("This step user input email address with invalid data");
        driver.findElement(By.id("email_create")).sendKeys("abct329@com");
    }

    @Then("User failed to register")
    public void User_failed_to_register() throws Throwable {
        System.out.println("This step user can't register because data invalid");
        driver.findElement(By.id("SubmitCreate")).click();
    }
}
