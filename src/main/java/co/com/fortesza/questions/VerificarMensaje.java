package co.com.fortesza.questions;

import co.com.fortesza.userInterfaces.ContenedorElementos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarMensaje implements Question<String> {

    public static VerificarMensaje mensajeError(){
        return new VerificarMensaje();
    }


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContenedorElementos.LBLMENSAJE).viewedBy(actor).asString();
    }
}
