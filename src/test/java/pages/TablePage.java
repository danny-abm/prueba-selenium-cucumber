package pages;


public class TablePage extends BasesPage {

    private String locatorTable= "//*[@id='root']/div";
    private String locatorTableTable= "//*[@id='root']/div/table";

    public TablePage() {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    

    public void navegarTabla(){
        navigationTo("https://1v2njkypo4.csb.app/");
    }

    public String obtnenerValorCelda(int row, int column){
        column++;
        row ++;
        return getValueFromTable(locatorTable,row,column);
    }

    

    public boolean visualizarTabla(){
        return validateExistElement(locatorTableTable);
    }

    public void modificar(int row, int column, String value) throws InterruptedException{
        Thread.sleep(3000);
        column++;
        row ++;
        setValueFromTable(locatorTable, row, column, value);
        Thread.sleep(3000);
    }

}
