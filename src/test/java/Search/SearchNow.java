package Search;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchNow {
    WebDriver driver;

    @Given("User open the chrome in website")
    public void User_open_the_chrome_in_website() throws Throwable {
//        System.out.println("This step user open the chrome in website");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");

    }

    @When("User input data")
    public void User_input_data() throws Throwable {
//        System.out.println("This step user input data");
        driver.findElement(By.id("hotel_location")).sendKeys("Jakarta");
        driver.findElement(By.id("id_hotel_button")).click();
        driver.findElement(By.className("search_result_li")).click();
        driver.findElement(By.id("check_in_time")).click();
        driver.findElement(By.linkText("4")).click();
        driver.findElement(By.linkText("5")).click();

    }

    @Then("User see hotel available")
    public void User_see_hotel_available() throws Throwable {
//        System.out.println("This step user can saw hotel");
        driver.findElement(By.cssSelector("button[id='search_room_submit'] span")).click();

    }
}
