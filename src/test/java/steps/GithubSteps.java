package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GithubPage;

public class GithubSteps {

    GithubPage githubPage = new GithubPage();

    @Given("^Como usuario navego el sitio web de github$")
    public void navegarAGithub(){
        githubPage.navegarGithub(); 
    }
    @When("^como usuario busco la palabra danny-abm")
    public void escribirCriterioBusqueda(){
        githubPage.escribirUser("danny-abm");
    }

    @And("^Como usuario doy enter Git$")
    public void pressEnterG(){
        githubPage.darEnterG();
    }

    @Then("^Espero que se visualize el elemento con el texto danny-abm$")
    public void obtenerTextoDeBusqueda(){
        String textoEsperado = "danny-abm";
        String texto = githubPage.obtenerTextoG();
        boolean estado = texto.contains(textoEsperado);
        assertTrue("No se encuentra el resultado esperado", estado);
    }

    @And("^Como usuario doy click en el users$")
    public void clickBotonUsers(){
        githubPage.botonUser();
    }

    @Then("^Espero que se visualize el elemento con el texto Danny Barton$")
    public void obtenerTextoUser(){
        String textoEsperado = "Danny Barton";
        String texto = githubPage.obtenerTexto2();
        boolean estado = texto.contains(textoEsperado);
        assertTrue("No se encuentra el resultado esperado", estado);
    }
    
}
