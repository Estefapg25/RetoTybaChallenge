package co.com.certification.saucedemo.questions;

import co.com.certification.saucedemo.userinterfaces.LoginSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateError implements Question<String> {


    private String errorMessage;

    @Override
    public String answeredBy(Actor actor) {
        errorMessage= Text.of(LoginSwagLabs.LBL_LOCKED_OUT_USER).asString().answeredBy(actor);

        return errorMessage;
    }

    public static ValidateError onScreen(){
        return new ValidateError();
    }
}
