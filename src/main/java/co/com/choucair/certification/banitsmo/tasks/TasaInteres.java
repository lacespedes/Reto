package co.com.choucair.certification.banitsmo.tasks;

import co.com.choucair.certification.banitsmo.userinterface.TarifarioPageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class TasaInteres implements Task {
    public static TasaInteres descargar() {
        return Tasks.instrumented(TasaInteres.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TarifarioPageObject.TASAINTERES)
        );
    }
}
