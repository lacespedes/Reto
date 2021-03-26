package co.com.choucair.certification.banitsmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TasaNominalTasaEfectiva  implements Task {
    int interes; String periodicidad; String capitalizacion;
    TasaNominalTasaEfectiva(int interes, String periodicidaderiodicida, String capitalizacion){
        this.interes = interes;
        this.periodicidad = periodicidad;
    }

    public static TasaNominalTasaEfectiva calcular(int interes, String periodicidad, String capitalizacion) {
        return Tasks.instrumented(TasaNominalTasaEfectiva.class, interes, periodicidad, capitalizacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
