package co.com.certification.saucedemo.tasks;

import co.com.certification.saucedemo.userinterfaces.LoginSwagLabs;
import co.com.certification.saucedemo.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task{
    private final List<String> data;

    public Login(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0)).into(LoginSwagLabs.TXT_USER_NAME),
                Enter.theValue(data.get(1)).into(LoginSwagLabs.TXT_PASSWORD),
                Wait.onMoment(200),
                Click.on(LoginSwagLabs.BTN_LOGIN),
                Wait.onMoment(200));
    }

    public static Login inSwagLabs(List<String> data) {
        return Tasks.instrumented(Login.class, data);
    }
}
