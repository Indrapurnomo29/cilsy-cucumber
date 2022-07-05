package BookingHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepBookingHotel {
    WebDriver driver;

    @Given("^Open the chrome and launch QA site$")
    public void Open_the_chrome_and_launch_QA_site() throws Throwable {
//        System.out.println("This step user open the chrome and launch QA site for booking hotel");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^User input data for booking hotel in QA site$")
    public void User_input_data_for_booking_hotel_in_QA_site() throws Throwable {
//        System.out.println("This step user input valid data for booking hotel");
        driver.findElement(By.id("email")).sendKeys("abct329@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("passwd")).sendKeys("Manisbanget1");
        Thread.sleep(1000);
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='Home']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("hotel_location")).sendKeys("Jakarta");
        Thread.sleep(1000);
        driver.findElement(By.id("id_hotel_button")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("search_result_li")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("check_in_time")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("30")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("31")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[id='search_room_submit'] span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("icon-plus")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[name='Submit'] span")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='Proceed to checkout'] span")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[class='btn btn-default button button-medium pull-right'] span")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='Proceed to Payment'] span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("cgv")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='Pay by bank wire']")).click();
        Thread.sleep(1000);
    }

    @Then("^User successfully booked hotel$")
    public void User_successfully_booked_hotel() throws Throwable {
//        System.out.println("This step user successfully booked hotel");
        driver.findElement(By.cssSelector("p[id='cart_navigation'] span:nth-child(1)")).click();
        Thread.sleep(1000);
    }
}
