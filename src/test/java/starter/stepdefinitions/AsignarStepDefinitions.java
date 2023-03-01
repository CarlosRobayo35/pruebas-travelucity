package starter.stepdefinitions;

import io.cucumber.java.ast.Cuando;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static starter.page.busquedaPricipalPage.ASIGNADOS_AL_GRUPO;

public class AsignarStepDefinitions {


    @Cuando("{actor} tiene tickets sin asignar {string}")
    public void hay_tickets_sin_asignar(Actor actor, String vacio) {

     //   actor.attemptsTo(buscarVacio);
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ASIGNADOS_AL_GRUPO, isVisible()).forNoMoreThan(Duration.ofSeconds(60)));

    }
}
