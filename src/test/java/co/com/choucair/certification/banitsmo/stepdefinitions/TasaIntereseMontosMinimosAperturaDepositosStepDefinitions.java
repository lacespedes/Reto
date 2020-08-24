package co.com.choucair.certification.banitsmo.stepdefinitions;

import co.com.choucair.certification.banitsmo.tasks.Tarifario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TasaIntereseMontosMinimosAperturaDepositosStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Cuando("^busca el tarifario$")
    public void buscaTarifario() {
        OnStage.theActorInTheSpotlight().attemptsTo(Tarifario.busca());
    }

    @Entonces("^Descarga el documento Tasas de interés y montos mínimos de apertura de Depósitos$")
    public void descargaDocumen() {
    }
}
