package co.com.DemoBlaze.Interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Collection;
import java.util.Objects;

import static co.com.DemoBlaze.maps.ElementosCatalogo.MENSAJE_CONFIRMACION;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.targets.Target.the;
import static org.hamcrest.MatcherAssert.assertThat;


public class InteraccionverificacionElemento {
    public InteraccionverificacionElemento(Target mensajeConfirmacion) {
    }

    @Step
    public void verificarValorElemento(){
        WebElementFacade elemento = MENSAJE_CONFIRMACION.resolveFor(getDriver());

        // Comprueba si el elemento es visible y está disponible
        if (elemento.isPresent() && elemento.isVisible()) {
            String valorElemento = elemento.getText();
            assertThat(valorElemento).contains("Thank you for your purchase!");
        } else {
            throw new AssertionError("El elemento no está presente o no es visible.");
        }
    }

    private Collection<Object> assertThat(String valorElemento) {
        return null;
    }


}

