package Login.LoginSuccess;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepLoginSuccess {
    WebDriver driver;

    @Given("^Open the chrome and launch the application$")
    public void Open_the_chrome_and_launch_the_application() throws Throwable {
//        System.out.println("This step open the chrome browser and launch the application");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^Enter the email and password$")
    public void Enter_the_email_and_password() throws Throwable {
//        System.out.println("This step enter the email and password");
        driver.findElement(By.id("email")).sendKeys("abct329@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Manisbanget1");
    }

    @Then("^Click login button$")
    public void Click_login_button() throws Throwable {
//        System.out.println("This step click on the login button");
        driver.findElement(By.id("SubmitLogin")).click();
    }
}
