package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tlh.vaj;
import pages.GooglePage;

public class GoogleSteps {
    GooglePage googlePage = new GooglePage();

    @Given("^Como usuario nabego el sitio web de google$")
    public void navegarAGoogle(){
        googlePage.navegarGoogle();
    }
    @When("^como usuario busco la palabra pinguino$")
    public void escribirCriterioBusqueda(){
        googlePage.escribirBusqueda("pinguino");
    }

    @And("^Como usuario doy click en el boton buscar$")
    public void clickBotonBusqueda(){
        googlePage.botonBusqueda();
    }

    @Then("^Espero que se visualize el elemento con el texto Spheniscidae$")
    public void obtenerTextoDeBusqueda(){
        String textoEsperado = "Spheniscidae";
        String texto = googlePage.obtenerTexto();
        boolean estado = texto.contains(textoEsperado);
        assertTrue("No se encuentra el resultado esperado", estado);
    }

    @When("^como usuario busco la palabra ping pong$")
    public void escribirPingPong(){
        googlePage.escribirBusqueda("ping pong");
    }
    @And("^Como usuario doy enter$")
    public void pressEnter(){
        googlePage.darEnter();;
    }
}
