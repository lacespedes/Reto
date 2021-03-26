package co.com.choucair.certification.banitsmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConversorTasaInteres implements Question<Boolean> {
    public static ConversorTasaInteres resultado() {
        return new ConversorTasaInteres();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
