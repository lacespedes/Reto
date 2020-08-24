package co.com.choucair.certification.banitsmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PortalPersonas extends PageObject {
    public static final Target TARIFARIO = Target.the("Tarifario").located(By.xpath("//a[text()='Tarifario']"));
}
