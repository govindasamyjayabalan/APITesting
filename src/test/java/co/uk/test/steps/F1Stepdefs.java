package co.uk.test.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class F1Stepdefs {
    private WebDriver driver;
    private Response response;


    @Given("^Details of the circuit$")
    public void goToTheLandingPage() {
        getDriverManager();
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

    public void getDriverManager() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi Jayabalan\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("^I go to the home page$")
    public void iGoToTheHomePage() {

    }


    //------

    @Given("^To find the number of circuits in (\\d+)$")
    public void toFindTheNumberOfCircuitsIn(int arg0) {

    }

    @And("^Get to the home page of (.*) circuit$")
    public void getToTheHomePageOfCircuit(int arg0) throws JAXBException {

        String endpoint = "http://ergast.com/api/f1/"+ arg0 +"/circuits.json";
        response = given().
                when().
                get(endpoint).
                thenReturn();
//                then().
//
//                assertThat().
//                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));

    }

    @And("^I check the number of circuits is (\\d+)$")
    public void iCheckTheNumberOfCircuitsIs(int numberOfCircuits) {
        JSONObject jsonObj = new JSONObject(response.getBody().prettyPrint());
        JSONArray jsonArray = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits");
        assertThat("Checking number of circuits", jsonArray.length(), is(numberOfCircuits));

    }
}
