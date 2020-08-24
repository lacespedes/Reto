package co.com.choucair.certification.banitsmo.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@Regresion"},
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        glue = "co.com.choucair.certification.banitsmo.stepdefinitions",
        snippets = CAMELCASE )

public class RunnerTags {
}
