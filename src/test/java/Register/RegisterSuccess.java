package Register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSuccess {
    WebDriver driver;

    @Given("^User Open the chrome$")
    public void User_Open_the_chrome() throws Throwable {
//        System.out.println("This step user open the chrome");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^User input email address with valid data$")
    public void User_input_email_address_with_valid_data() throws Throwable {
        System.out.println("This step user input email address with valid data");
        driver.findElement(By.id("email_create")).sendKeys("abct329@gmail.com");
    }

    @Then("^User click create an account button$")
    public void User_click_create_an_account_button() throws Throwable {
        System.out.println("This step user click create an account and success");
        driver.findElement(By.id("SubmitCreate")).click();
    }
}
