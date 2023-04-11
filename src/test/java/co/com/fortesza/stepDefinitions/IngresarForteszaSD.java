package co.com.fortesza.stepDefinitions;

import co.com.fortesza.models.TablaUsuarios;
import co.com.fortesza.pages.AbrirNavegadorPage;
import co.com.fortesza.questions.VerificarMensaje;
import co.com.fortesza.task.Ingresar;
import co.com.fortesza.task.Validar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class IngresarForteszaSD {
    AbrirNavegadorPage abrirNavegadorPage;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^el usuario ingresa al ambiente de staging$")
    public void elUsuarioIngresaAlAmbienteDeStaging()  {
        OnStage.theActorCalled("").
                wasAbleTo(Open.browserOn(abrirNavegadorPage));

    }

    @When("^digita usuario y contrasena$")
    public void digitaUsuarioYContrasena(List<TablaUsuarios> tablaUsuarios)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(tablaUsuarios.get(0)));


    }

    @Then("^verifica que ingrese correctamente$")
    public void verificaQueIngreseCorrectamente() {

    }

    @When("^digita usuario y contrasena erradas$")
    public void digitaUsuarioYContrasenaErradas(List<TablaUsuarios> tablaUsuarios)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Validar.credenciales(tablaUsuarios.get(0)));


    }

    @Then("^verifica que no permita el ingreso a la pagina de fortesza$")
    public void verificaQueNoPermitaElIngresoALaPaginaDeFortesza()  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (VerificarMensaje.mensajeError(), Matchers.equalTo("Contraseña o correo son incorrectos")));
    }





}
