package pruebaBanistmo.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pruebaBanistmo.interactions.cambiarPestana;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static pruebaBanistmo.usersinterface.BancolombiaMainPage.*;

public class Access implements Task {

    public static Access paginaCapitalInteligente(){

        return Tasks.instrumented(Access.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(

                Click.on(PAGINA_PRINCIPAL),
                Click.on(EMPRESAS_BUTTON),
                Click.on(CAPITAL_INTELIGENTE_BUTTON),

                cambiarPestana.cambio(),

                Click.on(ACTUALIDAD_ECONOMICA),
                Click.on(VER_MAS_PUBLICACIONES),
                Click.on(VER_MAS_PUBLICACIONES),
                Click.on(VER_MAS_PUBLICACIONES),
                Click.on(VER_MAS_PUBLICACIONES),
                Click.on(PAGINA_PDF),
                Click.on(IMAGEN_PDF),

                cambiarPestana.cambio()


        );
    }
}
