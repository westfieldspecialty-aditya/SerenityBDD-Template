package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;

public class GooglePage extends BasePage{

    @FindBy(name = "q")
    private WebElementFacade searchBox;

    public void openGoogle(){
        openUrl("https://www.google.com/");
    }

    public void searchFor(String value){
        try {
            Thread.sleep(10000);
            searchBox.waitUntilVisible().typeAndEnter(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}