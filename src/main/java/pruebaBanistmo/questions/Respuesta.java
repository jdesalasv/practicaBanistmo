package pruebaBanistmo.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static pruebaBanistmo.usersinterface.PdfPage.*;

public class Respuesta implements Question<Boolean> {
    private String question;

    public Respuesta(String question){

        this.question = question;

    }

    public static Respuesta deLa(String question){

        return new Respuesta(question);

    }

    @Override
    public Boolean answeredBy(Actor actor){

        return PDF.resolveFor(actor).isPresent();
    }
}
