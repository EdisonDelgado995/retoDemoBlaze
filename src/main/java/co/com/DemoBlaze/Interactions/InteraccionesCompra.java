package co.com.DemoBlaze.Interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InteraccionesCompra implements Interaction{

    private final Target elementoPagina;

    public InteraccionesCompra(Target elementoPagina) {
        this.elementoPagina = elementoPagina;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(elementoPagina));
    }

    public static InteraccionesCompra clicarElementoPagina (Target elementoPagina){

        return instrumented(InteraccionesCompra.class, elementoPagina);
    }
}
