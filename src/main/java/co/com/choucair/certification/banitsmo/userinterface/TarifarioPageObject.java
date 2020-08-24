package co.com.choucair.certification.banitsmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TarifarioPageObject extends PageObject {
    public static final Target TASAINTERES = Target.the("Tasas Interes").located(By.xpath("//table[@class='table-responsive']//descendant::td//descendant::span[text()=¡Tasas de interés y montos mínimos de apertura de Depósitos']//ancestor::tr//descendant::a"));
}
