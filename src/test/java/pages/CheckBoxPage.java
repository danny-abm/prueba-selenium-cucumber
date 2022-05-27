package pages;



public class CheckBoxPage extends BasesPage {

    private String locatorTest="/html/body/div[2]/div/ul/li[6]/a";
    private String locatorCheck="/html/body/div[2]/div/div/form/input[1]";
    public CheckBoxPage() {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    public void navegarTest(){
        navigationTo("https://the-internet.herokuapp.com/");
    }

    public void clickTest(){
        click(locatorTest);

    }

    public void clickCheck(){
        click(locatorCheck);

    }

}
