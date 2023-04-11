package co.com.fortesza.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target USER = Target.the("user").
            locatedBy("//input[@id='txt-email-or-user']");

    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id='txt-password']");

    public static final Target BTNLOGIN = Target.the("boton login").
            locatedBy("//button[@id='btn-sign-in-page']");



}
