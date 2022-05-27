package pages;

import org.openqa.selenium.WebDriver;

public class GooglePage extends BasesPage{

    private String locatorInputBusqueda="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    private String locatorButtonSearch="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]";
    private String locatorTexto="/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div/div[1]/a/h3";


    public GooglePage() {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void navegarGoogle(){
        navigationTo("https://www.google.com/");
    }

    public void escribirBusqueda(String criterio){
        write(locatorInputBusqueda, criterio);

    }
    public void botonBusqueda(){
        click(locatorButtonSearch);

    }

    public String obtenerTexto(){
        return getTextElement(locatorTexto);
    } 
    public void darEnter(){
        keyEnter(locatorInputBusqueda);
    }
    
}
