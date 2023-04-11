package co.com.fortesza.task;

import co.com.fortesza.models.TablaUsuarios;
import co.com.fortesza.userInterfaces.LoginUI;
import co.com.fortesza.userInterfaces.PlanUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {

    private TablaUsuarios tablaUsuarios;

    public Ingresar(TablaUsuarios tablaUsuarios){
        this.tablaUsuarios = tablaUsuarios;
    }

    public static Ingresar credenciales(TablaUsuarios tablaUsuarios){
        return Tasks.instrumented(Ingresar.class, tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(tablaUsuarios.getUsuario()).into(LoginUI.USER),
        Enter.theValue(tablaUsuarios.getContrasena()).into(LoginUI.PASSWORD),
        Click.on(LoginUI.BTNLOGIN),
        Click.on(PlanUI.BTNPAGO)
        );





    }
}
