package co.com.choucair.certification.banitsmo.tasks;

import co.com.choucair.certification.banitsmo.userinterface.PortalPersonas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Tarifario implements Task {
    public static Performable busca()  {
        return Tasks.instrumented(Tarifario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PortalPersonas.TARIFARIO)
        );
    }
}
