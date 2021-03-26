package co.com.choucair.certification.banitsmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConversorTasasPageObject extends PageObject {
    public static final Target MENU_NEGOCIOS = Target.the("Negocios").located(By.xpath("//*[@id='header-pymes' and .='NEGOCIOS']"));
    public static final Target MENU_HERRAMIENTAS = Target.the("Herramientas").located(By.xpath("//*[@id='menu-top']//descendant::li[.='Herramientas']"));
    public static final Target CONVERSOR_TASAS = Target.the("Conversor de tasas").located(By.xpath("//*[@id='simuladores']//h3[.='Conversor de tasas de interés']"));
    public static final Target BUTOON_CALCULAR = Target.the("calcular").located(By.xpath("//*[@id='btntoolUno']"));
    public static final Target INPUT_INTERES = Target.the("Interes").located(By.xpath("//*[@id='interes']"));
    public static final Target SELECT_PERIODICIDAD = Target.the("Periodicidad").located(By.xpath("//*[@id='periodicidad-deseada']"));
    public static final Target SELECT_CAPITALIZACION = Target.the("Capitalizacion").located(By.xpath("//*[@id='capitalizacion']"));

}
