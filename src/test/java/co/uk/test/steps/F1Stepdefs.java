package co.uk.test.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.JAXBException;
import javax.xml.stream.Location;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class F1Stepdefs {
    private WebDriver driver;
    private Response response;



    @Given("^Details of the circuit$")
    public void goToTheLandingPage() {
        getDriverManager();
        driver.get("http://ergast.com/api/f1/2018/circuits.json");

    }

    public void getDriverManager() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi Jayabalan\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
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

    }

    @And("^I check the number of circuits is (\\d+)$")
    public void iCheckTheNumberOfCircuitsIs(int numberOfCircuits) {
        JSONObject jsonObj = new JSONObject(response.getBody().prettyPrint());
        JSONArray jsonArray = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits");
        assertThat("Checking number of circuits", jsonArray.length(), is(numberOfCircuits));

    }

    @And("^I enter the circuit id (.*)$")
    public void iEnterTheCircuitId(String  arg0) {

    }
   @And("^I enter the circuit name(.*)$")
    public void iPassTheCircuitIdToFindLocation(String circuitId) {

       given().
               pathParam("circuitId",circuitId).
               when().
               get("http://ergast.com/api/f1/circuits/{circuitId}.json").
               then().
               assertThat().
               body("MRData.CircuitTable.Circuits.Location[0].country",equalTo("Australia" ));
    }

    @And("^I check the the location is valid$")
    public void iCheckTheTheLocationIsValid() {
        String season = "2017";
        response=given().
                pathParam("raceSeason",season).
         when().
        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").thenReturn();
        JSONObject jsonObj = new JSONObject(response.getBody().prettyPrint());
        String  jasonObj = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getString("season");
        assertThat(jasonObj, is("2017"));

       // JSONArray jsonArray = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray(season);
           //


    }




}
