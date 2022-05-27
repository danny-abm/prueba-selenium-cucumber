package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("^Como usuario navego el sitio del login$")
    public void navegarAloguin(){
        loginPage.navegarLogin();
    }
    @When("^Como usuario ingreso un (.+)$")
    public void escribirUsuario(String usuario){
        loginPage.escribirUser(usuario);
    }

    @And("^Como usuario ingreso una (.+)$")
    public void escribirContra(String password){
        loginPage.escribirPass(password);
    }

    @And("^Como usuario doy click en el boton de loguin$")
    public void clickBotonBusqueda(){
        loginPage.botonBusqueda();
    }

    @Then("^Como usuario valido que el login sea exitoso$")
    public void obtenerTextoDeBusqueda(){
         boolean respuesta = loginPage.succes();
         assertTrue(respuesta);
    }

    @When("^Como usuario ingreso nuevamente un (.+)$")
    public void escribirUsuarioN(String usuariof){
        loginPage.escribirUser(usuariof);
    }

    @And("^Como usuario ingreso nuevamente una (.+)$")
    public void escribirContraN(String passwordf){
        loginPage.escribirPass(passwordf);
    }

    @And("^Como usuario doy click nuevamente en el boton de loguin$")
    public void clickBotonBusquedaN(){
        loginPage.botonBusqueda();
    }

    @Then("^Como usuario valido el login$")
    public void obtenerTextoDeBusquedaN(){
         boolean respuesta = loginPage.fail();
         assertTrue(respuesta);
    }


    
}
