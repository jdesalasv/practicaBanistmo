package pruebaBanistmo.stepdefinitions;

import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import pruebaBanistmo.model.BancolombiaData;
import pruebaBanistmo.questions.Respuesta;
import pruebaBanistmo.tasks.Access;
import pruebaBanistmo.tasks.OpenUp;
import java.util.List;

public class PruebaBanistmostepdefinitions {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^than Jahaziel needs to enter Bancolombia para descargar el informe$")
    public void thanJahazielNeedsToEnterBancolombiaParaDescargarElInforme() {
        OnStage.theActorCalled("Jahaziel").wasAbleTo(OpenUp.thePage());
    }

    @When("^ingregar a la seccion donde esta el informe$")
    public void ingregarALaSeccionDondeEstaElInforme() {
        OnStage.theActorCalled("Jahaziel").wasAbleTo(
                Access.paginaCapitalInteligente()
        );

    }

    @Then("^validar que la informacion es correcta$")
    public void validarQueLaInformacionEsCorrecta(List<BancolombiaData> bancolombiaData) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.deLa(bancolombiaData.get(0).getStrNombrePdf())));

    }



}
