package co.com.certification.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSwagLabs {

    public static final Target TXT_USER_NAME = Target.the("field to enter user name").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("field to enter password").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Icon to go to login").located(By.id("login-button"));
    public static final Target LBL_LOCKED_OUT_USER =  Target.the("error message user blocked").locatedBy("//h3");
}
