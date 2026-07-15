package steps;

import pages.GooglePage;
import net.serenitybdd.annotations.Step;

public class GoogleSteps{
    
    GooglePage googlePage;

    @Step("Search on google")
    public void searchFor(String value){
        googlePage.openGoogle();
        googlePage.searchFor(value);
    }
}