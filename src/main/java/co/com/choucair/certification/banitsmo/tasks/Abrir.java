package co.com.choucair.certification.banitsmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    public static Abrir portalweb() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*Usar en un archivo de properties, para faciliar el manejo de difentes ambientes*/
        //actor.wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"));
        actor.wasAbleTo(Open.url("https://www.grupobancolombia.com/"));
    }
}
