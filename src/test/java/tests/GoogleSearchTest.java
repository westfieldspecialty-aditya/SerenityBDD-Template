package tests;

import steps.GoogleSteps;
import org.openqa.selenium.*;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleSearchTest{

    @Managed
    WebDriver driver;

    @Steps
    GoogleSteps googleSteps;

    @Test
    public void searchGoogle(){
        googleSteps.searchFor("Selenium with Serenity");
    }
}