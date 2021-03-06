package co.com.choucair.certification.automatizaciondemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/pageDemo.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.certification.automatizaciondemo.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
