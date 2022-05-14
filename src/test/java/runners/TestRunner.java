package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\Features",
        glue = "stepDefinitions",
        plugin = { "pretty", "html:target/test report/cucumber-reports",
        "json:target/cucumber.json" },
        tags = "@smoke"
)

public class TestRunner {
}
