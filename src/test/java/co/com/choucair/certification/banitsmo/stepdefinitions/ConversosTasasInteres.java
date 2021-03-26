package co.com.choucair.certification.banitsmo.stepdefinitions;

import co.com.choucair.certification.banitsmo.exceptions.NombrePorDefectoNoEncontradoAssertionError;
import co.com.choucair.certification.banitsmo.questions.ConversorTasaInteres;
import co.com.choucair.certification.banitsmo.tasks.Conversor;
import co.com.choucair.certification.banitsmo.tasks.TasaNominalTasaEfectiva;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ConversosTasasInteres {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^busca el conversor de tasas de interes para negocios$")
    public void buscaElConversorDeTasasDeInteresParaNegocios() {
        OnStage.theActorInTheSpotlight().attemptsTo(Conversor.buscar());
    }

    @Cuando("^selecciona tasa nominal a tasa efectiva con tasa de interes (\\d+) (.*) y (.*)$")
    public void seleccionaTasaNominalATasaEfectivaConTasaDeInteresPeriodicidadSemestralYCapitalizacionAnual(int interes, String Periodicidad, String capitalizacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(TasaNominalTasaEfectiva.calcular(interes, Periodicidad, capitalizacion));
    }

    @Entonces("^revisa que el valor esperado es (.*)$")
    public void revisaQueElValorEsperadoEs(String resultado) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConversorTasaInteres.resultado())
                .orComplainWith(NombrePorDefectoNoEncontradoAssertionError.class, NombrePorDefectoNoEncontradoAssertionError.INVALID_NAME));
    }

}
