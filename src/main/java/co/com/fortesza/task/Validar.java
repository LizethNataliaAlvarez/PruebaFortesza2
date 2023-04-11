package co.com.fortesza.task;

import co.com.fortesza.models.TablaUsuarios;
import co.com.fortesza.userInterfaces.ContenedorElementos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Validar implements Task {

    private TablaUsuarios tablaUsuarios;

    public Validar(TablaUsuarios tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }

    public static Validar credenciales(TablaUsuarios tablaUsuarios){
        return Tasks.instrumented(Validar.class, tablaUsuarios);



    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaUsuarios.getUsuario()).into(ContenedorElementos.USER),
                Enter.theValue(tablaUsuarios.getContrasena()).into(ContenedorElementos.PASSWORD),
                Click.on(ContenedorElementos.BTNLOGIN)


        );
}
}
