package co.com.certification.saucedemo.stepdefinitions.hooks;

import co.com.certification.saucedemo.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SwagLabsHook {
    @Managed(driver = "chrome")
    private WebDriver webdriver;

    @Before
    public void configureBaseUrl() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("actor");

    }

    @Given("^that the customer accesses the Swag labs site$")
    public void thatTheCustomerAccessesTheSwagLabsSite() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url(Constants.URL));
    }
}
