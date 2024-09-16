package co.com.certification.saucedemo.stepdefinitions;


import co.com.certification.saucedemo.questions.ValidateError;
import co.com.certification.saucedemo.tasks.Login;
import co.com.certification.saucedemo.questions.ValidateLogin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class SwagLabsStepDefinitions {

    @When("^the user enters the required information$")
    public void heEntersTheRequiredInformation(DataTable dataTable) {
        List<String> data =dataTable.values();
        theActorInTheSpotlight().attemptsTo(Login.inSwagLabs(data));
    }

    @Then("^user can then view the product module$")
    public void userCanThenViewTheProductModule() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogin.inSwagLabs()));
    }

    @Then("^the user is presented with an error message (.+)$")
    public void theUserIsPresentedWithAnErrorMessage(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateError.onScreen(), containsString(message)));
    }
}
