package co.com.fortesza.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)   //Es  el runner de cucumber con serenity

@CucumberOptions(
        features = "src/test/resources/co.com.fortesza.features/fortesza.feature",
        tags= "@Hu02",
        glue= "co.com.fortesza.stepDefinitions",
        snippets= SnippetType.CAMELCASE)


public class IngresarRunner {

}
