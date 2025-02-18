package starter.stepdefinitions;

import co.com.DemoBlaze.Interactions.InteraccionverificacionElemento;
import co.com.DemoBlaze.questions.VisualizacionCompra;
import co.com.DemoBlaze.tasks.AnadirCarrito;
import co.com.DemoBlaze.tasks.ConfirmacionCompra;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.Test;

import static co.com.DemoBlaze.maps.ElementosCatalogo.MENSAJE_CONFIRMACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.MatcherAssert.assertThat;

public class BusquedaDemoBlazeDefiniton {

    String nombreActor;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Test
    @Dado("que el {string} visualiza el catálogo de Demoblaze")
    public void accederCatalogoBlazeDemo(String actor) {
        this.nombreActor = actor;
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.demoblaze.com/"));
    }

    @Cuando("se añade el producto de tipo {string} de referencia {string}")
    public void seleccionarProducto(String tipoProducto, String referencia) throws InterruptedException {
       theActorCalled(nombreActor).attemptsTo(
               AnadirCarrito.anadirProducto(tipoProducto, referencia)
       );
    }

    @Cuando("se confirma la compra de los productos")
    public void realizarCompra() throws InterruptedException {
        theActorCalled(nombreActor).attemptsTo(
                ConfirmacionCompra.confirmarCompra()
        );
    }

    @Entonces("se recibe confirmación de la compra con valor {string}")
    public void validarCompra(String valor) throws InterruptedException {
        InteraccionverificacionElemento interaccionverificacionElemento = null;
        interaccionverificacionElemento.verificarValorElemento();
    }
}
