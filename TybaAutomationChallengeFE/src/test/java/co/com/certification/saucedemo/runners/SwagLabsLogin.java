package co.com.certification.saucedemo.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/swag_labs_login.feature",
        glue = "co.com.certification.saucedemo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class SwagLabsLogin {

}
