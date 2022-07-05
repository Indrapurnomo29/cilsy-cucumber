package Login.LoginFailed;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepLoginFailed {
    WebDriver driver;

    @Given("^System redirect to open chrome an application$")
    public void System_redirect_to_open_chrome_an_application() throws Throwable {
//        System.out.println("This step open the chrome browser and launch the application");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^Enter the email and password with invalid data$")
    public void Enter_the_email_and_password_with_invalid_data() throws Throwable {
//        System.out.println("This step enter the email and password with invalid data");
        driver.findElement(By.id("email")).sendKeys("abct329@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Manisbanget");
    }

    @Then("^User click login button$")
    public void User_click_login_button() throws Throwable {
//        System.out.println("This step click on the login button");
        driver.findElement(By.id("SubmitLogin")).click();
    }
}
