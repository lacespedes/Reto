package co.com.choucair.certification.banitsmo.tasks;

import co.com.choucair.certification.banitsmo.userinterface.InversionVirtualPageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class InversionVirtual implements Task {
    public static Performable conocerMas() {
        return Tasks.instrumented(InversionVirtual.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InversionVirtualPageObject.BOTON_PAGINA_PRINCIPAL),
                Click.on(InversionVirtualPageObject.BOTON_SOLICITAR_PRODUCTO),
                Click.on(InversionVirtualPageObject.LINK_INVERSIONES),
                Click.on(InversionVirtualPageObject.LINK_MOSTRAR_FILTROS),
                Click.on(InversionVirtualPageObject.ICONO_MONTO_MINIMO),
                Click.on(InversionVirtualPageObject.LINK_CONOCE_MAS),
                Click.on(InversionVirtualPageObject.MENU_DOCUMENTOS),
                Click.on(InversionVirtualPageObject.BOTON_REGLAMENTO_INTERNO)
        );
    }
}
