package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListPage extends BasesPage{

    private String locatorBusquedaEstado="/html/body/form/input";
    private String locatorClassCss="name";

    public ListPage() {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void navegarLista(){
        navigationTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }
    
    public void escribirEstado(String value) throws InterruptedException{
        Thread.sleep(3000);
        write(locatorBusquedaEstado, value);
    }

    public List<String> getResults(){
        List<WebElement> list = allEllements(locatorClassCss);
        List <String> stringFromList = new ArrayList<String>();
        for(WebElement elemento : list){
            stringFromList.add(elemento.getText());
        }
        return stringFromList;
    }

    
}
