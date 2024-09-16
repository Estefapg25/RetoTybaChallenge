package co.com.certification.saucedemo.questions;

import co.com.certification.saucedemo.userinterfaces.ProductsSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateLogin implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return ProductsSwagLabs.LBL_PRODUCTS.resolveFor(actor).isVisible();
    }

    public static ValidateLogin inSwagLabs() {

        return new ValidateLogin();
    }
}
