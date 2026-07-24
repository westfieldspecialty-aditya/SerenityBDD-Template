package tests;

import steps.GoogleSteps;
import org.openqa.selenium.*;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings = {
        "Selenium",
        "Serenity BDD",
        "Playwright",
        "JUnit 5"
    })
    public void searchGoogleWithValueSource(String searchText){
        googleSteps.searchFor(searchText);
    }

    @ParameterizedTest
    @MethodSource("searchData")
    void searchGoogleWithMethodSource(String searchText) {
        googleSteps.searchFor(searchText);
    }

    static Stream<String> searchData() {
        return Stream.of(
        "Selenium",
        "Serenity BDD",
        "Playwright",
        "Java"
        );
    }
}