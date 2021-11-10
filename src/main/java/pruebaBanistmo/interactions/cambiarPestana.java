package pruebaBanistmo.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;



import java.util.Set;

public class cambiarPestana implements Interaction {

    public static cambiarPestana cambio(){

        return Tasks.instrumented(cambiarPestana.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Set<String> ventanaId = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String id : ventanaId) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(id);
        }


    }

}
