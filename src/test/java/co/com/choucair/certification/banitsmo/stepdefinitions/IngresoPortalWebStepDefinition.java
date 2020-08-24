package co.com.choucair.certification.banitsmo.stepdefinitions;

import co.com.choucair.certification.banitsmo.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class IngresoPortalWebStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que el (.*) ingreso al portal web$")
    public void queElUsuarioIngresoAlPortalWeb(String strUsuario) {
        OnStage.theActorCalled(strUsuario).wasAbleTo(Abrir.portalweb());
    }
}
