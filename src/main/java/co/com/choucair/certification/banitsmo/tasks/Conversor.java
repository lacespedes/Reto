package co.com.choucair.certification.banitsmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Conversor  implements Task {
    public static Conversor buscar() {
        return Tasks.instrumented(Conversor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
