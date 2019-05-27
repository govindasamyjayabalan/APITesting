package co.uk.test.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//C:\Workspace\TestAutomation\src\test\resources\features\bank\BankLogin.feature
@CucumberOptions(
        features = "C:\\Workspace\\APITesting\\src\\test\\resources\\features\\",
        glue = {"co.uk.test.steps"},
        tags = {"@F1race"}
)
class F1TestRunner {
}