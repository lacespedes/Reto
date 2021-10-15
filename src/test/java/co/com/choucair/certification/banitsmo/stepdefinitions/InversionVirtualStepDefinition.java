package co.com.choucair.certification.banitsmo.stepdefinitions;

import co.com.choucair.certification.banitsmo.exceptions.NombrePorDefectoNoEncontradoAssertionError;
import co.com.choucair.certification.banitsmo.questions.ConversorTasaInteres;
import co.com.choucair.certification.banitsmo.questions.Documento;
import co.com.choucair.certification.banitsmo.tasks.InversionVirtual;
import co.com.choucair.certification.banitsmo.tasks.Tarifario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class InversionVirtualStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^Selecciona la opcion inversiones en solicitud de productos$")
    public void seleccionaLaOpcionInversionesEnSolicitudDeProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(InversionVirtual.conocerMas());
    }

    @Entonces("^Descarga el reglamento inversion virtual Bancolombia y verifica que contenga titulo (.*)$")
    public void descargaElReglamentoInversionVirtualBancolombia(String titulo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Documento.descarga(titulo))
                .orComplainWith(NombrePorDefectoNoEncontradoAssertionError.class, NombrePorDefectoNoEncontradoAssertionError.INVALID_NAME));
    }


}
