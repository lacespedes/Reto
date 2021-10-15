package co.com.choucair.certification.banitsmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InversionVirtualPageObject extends PageObject {
    public static final Target BOTON_PAGINA_PRINCIPAL = Target.the("Ir a la pagina principal").located(By.xpath("//*[@id='modal-prehome-fenix']/div/div/div[2]/button"));
    public static final Target MENU_PERSONAS = Target.the("Personas").located(By.id("header-personas"));
    public static final Target BOTON_SOLICITAR_PRODUCTO = Target.the("Solicitar Producto").located(By.id("header-solicitud-productos"));
    public static final Target LINK_INVERSIONES = Target.the("Inversiones").located(By.id("filtro-inversiones"));
    public static final Target LINK_MOSTRAR_FILTROS = Target.the("Mostrar filtros inversion").located(By.id("mostrar-filtros"));
    public static final Target ICONO_MONTO_MINIMO = Target.the("Seleccionar Monto minimo").located(By.id("tag-catMontoMinimo500000 icon-cash"));
    public static final Target LINK_CONOCE_MAS = Target.the("Conoce Mas").located(By.id("filtrado-conoce-inversion-0"));
    public static final Target MENU_DOCUMENTOS = Target.the("Menu Documentos").located(By.xpath("//*[@id='tabs']/div/ul/li[4]/a"));
    public static final Target BOTON_REGLAMENTO_INTERNO = Target.the("Descargar Reglamento Interno").located(By.xpath("//*[@id='tab4']/button/a"));


}
