import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1Stepdefs {
    private WebDriver driver;

    public void getDriverManager() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi Jayabalan\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();

    @Given("^Go to the landing page$")
    public void goToTheLandingPage() {

        driver.get("http://ergast.com/api/f1/2017/circuits.json");
    }

    @And("^I enter the circuit id$")
    public void iEnterTheCircutiId() {
    }

    @And("^I enter the circuit name$")
    public void iEnterTheCircuitName() {

    }

    @And("^I enter the country name$")
    public void iEnterTheCountryName() {
    }
}
