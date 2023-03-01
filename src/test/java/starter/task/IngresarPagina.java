package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


import net.serenitybdd.screenplay.actions.Open;


import static starter.page.busquedaPricipalPage.*;

public class IngresarPagina {

    public static Performable simple(String destino, String clave) {
        return Task.where("{0} selecciona un hopedaje 'simple' para '" + destino + "'",
                Open.url("https://sg.asicamericas.com/smartit/app/#/ticket-console"),
                Click.on(CLAVE_USUARIO),
                Enter.theValue(destino).into(LLENA_CLAVE_USUARIO),
                Click.on(UBICA_PASS_USUARIO),
                Enter.theValue(clave).into(LLENA_PASS_USUARIO).thenHit(Keys.ENTER),
                Click.on(UBICA_ASIGNADOS_PROPIOS),
                Click.on(ASIGNADOS_AL_GRUPO),
              //  Click.on(ASIGNADO_A_QUIEN)//,

                Click.on(SELECCIONAR_CHECK)


        );
    }


}
