package co.com.DemoBlaze.tasks;

import co.com.DemoBlaze.Interactions.InteraccionVentanaEmergente;
import co.com.DemoBlaze.Interactions.InteraccionesCompra;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.DemoBlaze.maps.ElementosCatalogo.BOTON_CARRITO;
import static co.com.DemoBlaze.maps.ElementosCatalogo.BOTON_COMPRAR;
import static co.com.DemoBlaze.maps.ElementosCatalogo.BOTON_CONFIRMAR_COMPRA;
import static co.com.DemoBlaze.maps.ElementosCatalogo.BOTON_HOME;
import static co.com.DemoBlaze.maps.ElementosCatalogo.CAMPO_ANIO;
import static co.com.DemoBlaze.maps.ElementosCatalogo.CAMPO_CIUDAD;
import static co.com.DemoBlaze.maps.ElementosCatalogo.CAMPO_MES;
import static co.com.DemoBlaze.maps.ElementosCatalogo.CAMPO_NOMBRE;
import static co.com.DemoBlaze.maps.ElementosCatalogo.CAMPO_PAIS;
import static co.com.DemoBlaze.maps.ElementosCatalogo.CAMPO_TARJETA;
import static co.com.DemoBlaze.maps.ElementosCatalogo.ELEMENTO_GENERICO_CATALOGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ConfirmacionCompra {
    public static Task confirmarCompra() throws InterruptedException {
        return  Task.where(
                WaitUntil.the(BOTON_CARRITO,isPresent()),
                InteraccionesCompra.clicarElementoPagina(BOTON_CARRITO),
                WaitUntil.the(BOTON_COMPRAR,isPresent()),
                InteraccionesCompra.clicarElementoPagina(BOTON_COMPRAR),
                WaitUntil.the(CAMPO_NOMBRE, isPresent()),
                Enter.theValue("Edison Delgado").into(CAMPO_NOMBRE),
                Enter.theValue("Colombia").into(CAMPO_PAIS),
                Enter.theValue("Bogotá").into(CAMPO_CIUDAD),
                Enter.theValue("5306589458").into(CAMPO_TARJETA),
                Enter.theValue("02").into(CAMPO_MES),
                Enter.theValue("2025").into(CAMPO_ANIO),
                WaitUntil.the(BOTON_CONFIRMAR_COMPRA, isPresent()),
                InteraccionesCompra.clicarElementoPagina(BOTON_CONFIRMAR_COMPRA)
        )  ;

    }
}