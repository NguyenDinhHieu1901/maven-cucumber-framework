package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "html:target/reports"},
        monochrome = true,
        snippets = CAMELCASE,
        tags = "@param_with_quotes_mark")
public class TestRunner {
}
