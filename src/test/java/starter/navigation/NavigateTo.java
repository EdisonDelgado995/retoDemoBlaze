package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo  {

    public static Performable DemoBlazePage() {
        return Task.where("{0} Ingresa a Demoblaze",
                Open.browserOn().the(DemoBlazePage.class)
        );
    }

}