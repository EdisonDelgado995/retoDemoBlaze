package co.com.DemoBlaze.tasks;

import co.com.DemoBlaze.Interactions.InteraccionVentanaEmergente;
import net.serenitybdd.screenplay.Task;
import co.com.DemoBlaze.Interactions.InteraccionesCompra;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.DemoBlaze.maps.ElementosCatalogo.BOTON_HOME;
import static co.com.DemoBlaze.maps.ElementosCatalogo.ELEMENTO_GENERICO_CATALOGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class AnadirCarrito {
    public static Task anadirProducto(String tipoProducto, String referencia) throws InterruptedException {
        return  Task.where(
                WaitUntil.the(ELEMENTO_GENERICO_CATALOGO.of(tipoProducto),isPresent()),
                InteraccionesCompra.clicarElementoPagina(ELEMENTO_GENERICO_CATALOGO.of(tipoProducto)),
                WaitUntil.the(ELEMENTO_GENERICO_CATALOGO.of(referencia),isPresent()),
                InteraccionesCompra.clicarElementoPagina(ELEMENTO_GENERICO_CATALOGO.of(referencia)),
                WaitUntil.the(ELEMENTO_GENERICO_CATALOGO.of("Add to cart"),isPresent()),
                InteraccionesCompra.clicarElementoPagina(ELEMENTO_GENERICO_CATALOGO.of("Add to cart")),
                InteraccionVentanaEmergente.aceptar(),
                InteraccionesCompra.clicarElementoPagina(BOTON_HOME));

    }
}
