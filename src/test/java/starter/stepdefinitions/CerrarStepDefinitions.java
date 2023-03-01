package starter.stepdefinitions;


import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import starter.page.ResultadosBusquedaPage;
import starter.task.IngresarPagina;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import java.time.Duration;
import java.util.List;

import static starter.page.busquedaPricipalPage.SELECCIONAR_CHECK;

public class CerrarStepDefinitions {

    ResultadosBusquedaPage ResultadosBusquedaPage;

    @Cuando("{actor} tiene tickets para {string} con {string}")
    public void tiene_tickets_para(Actor actor, String destino, String clave) {

        actor.attemptsTo(IngresarPagina.simple(destino, clave));
        actor.attemptsTo(
                WaitUntil.the(SELECCIONAR_CHECK, isVisible()).forNoMoreThan(Duration.ofSeconds(5)));

    }

    @Entonces("debe cerrar los creados en la noche {string}")
    public void debe_cerrar_los_creados_en_la_noche(String palabraEsperada) {


        List<String> resultados = ResultadosBusquedaPage.obtenerResultados();
        for (int i=0; i<17; i++){

        System.out.println(resultados.get(i));
        }

    }

}
