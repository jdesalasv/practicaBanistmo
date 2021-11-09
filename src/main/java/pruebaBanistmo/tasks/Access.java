package pruebaBanistmo.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

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
                Click.on(CAPITAL_INTELIGENTE_BUTTON)
        );
    }
}
