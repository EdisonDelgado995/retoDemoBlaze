package co.com.DemoBlaze.maps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.SearchContext;

import java.util.List;
import java.util.function.Function;

import static org.openqa.selenium.By.xpath;

public class ElementosCatalogo {

    public static final Target ELEMENTO_GENERICO_CATALOGO = Target.the("Elemento {0}")
            .locatedBy("//a[contains(text(), '{0}')]");

    public static final Target VENTANA_EMERGENTE= Target.the("VENTANA EMERGENTE")
            .located(By.xpath("//div[@class='sweet-alert']"));

    public static final Target BOTON_HOME= Target.the("Boton inicio")
            .located(By.xpath("//a[@class='nav-link'][contains(.,'Home (current)')]"));

    public static final Target BOTON_CARRITO= Target.the("Boton carrito")
            .located(By.xpath("//a[@class='nav-link'][contains(.,'Cart')]"));

    public static final Target BOTON_COMPRAR= Target.the("Boton comprar")
            .located(By.xpath("//button[@type='button'][contains(.,'Place Order')]"));

    public static final Target CAMPO_NOMBRE= Target.the("Cuadro de texto nombre")
            .located(By.id("name"));

    public static final Target CAMPO_PAIS= Target.the("Cuadro de texto país")
            .located(By.id("country"));

    public static final Target CAMPO_CIUDAD= Target.the("Cuadro de texto ciudad")
            .located(By.id("city"));

    public static final Target CAMPO_TARJETA= Target.the("Cuadro de texto tarjeta de crédito")
            .located(By.id("card"));

    public static final Target CAMPO_MES= Target.the("Cuadro de texto mes")
            .located(By.id("month"));

    public static final Target CAMPO_ANIO= Target.the("Cuadro de texto año")
            .located(By.id("year"));

    public static final Target BOTON_CONFIRMAR_COMPRA= Target.the("Boton confirmar compra")
            .located(By.xpath("//button[contains(@onclick,'purchaseOrder()')]"));

    public static final Target MENSAJE_CONFIRMACION= Target.the("Mensaje de confirmación de compra")
            .located(By.xpath("//h2[contains(.,'Thank you for your purchase!')]"));
}

