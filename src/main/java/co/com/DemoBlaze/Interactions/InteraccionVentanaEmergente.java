package co.com.DemoBlaze.Interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InteraccionVentanaEmergente implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static InteraccionVentanaEmergente aceptar() throws InterruptedException {
        Thread.sleep(1000);
        return instrumented(InteraccionVentanaEmergente.class);
    }
}
