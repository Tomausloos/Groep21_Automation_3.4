package ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ui.EmptyMenuPage;
import ui.Page;
import ui.MealPage;

import static org.junit.Assert.*;


public class ViewAllMealsSteps {

    private WebDriver driver;
    private String path = "http://localhost:8080/AutomationExample_war_exploded/";

    private Page currentPage;

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "/Users/.../web3pers/chromedriver");
        // windows: gebruik dubbele \\ om pad aan te geven
        // hint: zoek een werkende test op van web 2 ...
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        driver.quit();
    }


    @Given("There are meals on the menu")
    public void thereAreMealsOnTheMenu() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
       assertTrue(mealPage.mealTableContainsMeals());
    }

    @When("“Jan” looks at the menu")
    public void jan_looks_at_the_menu() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        System.out.println("Title: " + this.driver.getTitle());
        System.out.println("MealPageTitle" + mealPage.getTitle());
        assertEquals("Menu", mealPage.getTitle());
    }

    @Then("All meals that are on the menu are shown.")
    public void all_meals_that_are_on_the_menu_are_shown() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.containsAllMeals());

    }

    @Given("There are no meals on the menu")
    public void there_are_no_meals_on_the_menu() {
        EmptyMenuPage emptyMenuPage = PageFactory.initElements(driver, EmptyMenuPage.class);
        assertTrue(emptyMenuPage.containsNoMeals());
    }

    @When("“Jan” looks on the menu")
    public void jan_looks_on_the_menu() {
        EmptyMenuPage emptyMenuPage = PageFactory.initElements(driver, EmptyMenuPage.class);
        assertEquals("EmptyMenu", emptyMenuPage.getTitle());
    }

    @Then("“Jan” will get notified there currently are no meals present on the menu")
    public void jan_will_get_notified_there_currently_are_no_meals_present_on_the_menu() {
        EmptyMenuPage emptyMenuPage = PageFactory.initElements(driver, EmptyMenuPage.class);
        assertEquals("There are currently no meals on the menu", emptyMenuPage.getNotification().getText());
    }

    @Given("a sandwich brie contains nuts")
    public void a_sandwich_brie_contains_nuts() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.sandwichNutsContainsAllergiesInformation());
    }



    @Then("next to the sandwich brie “Jan” will see the meal may contains nuts")
    public void next_to_the_sandwich_brie_jan_will_see_the_meal_may_contains_nuts() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.sandwichNutsContainsAllergiesInformation());
    }

    @Given("a sandwich ‘Veggielicious’ is vegetarian")
    public void a_sandwich_veggielicious_is_vegetarian() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.sandwichVeggieIsveggie());

    }

    @Then("next to the sandwich “Jan” will see this sandwich is vegetarian.")
    public void next_to_the_sandwich_jan_will_see_this_sandwich_is_vegetarian() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.sandwichVeggieHasinformationAboutBeingVeggie());
    }

    @Given("a sandwich Martino costs three fifty and a Lasagna costs five")
    public void a_sandwich_martino_costs_3_50_and_a_lasagna_costs_5() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.lasagneCosts5euro());
        assertTrue(mealPage.sandwichmartinoCosts3euros50());
    }


    @Then("“Jan” will see: Broodje Martino: two euros Lasagna: five euros")
    public void jan_will_see_broodje_martino_3_50_lasagna_5() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.lasagneCosts5euro());
        assertTrue(mealPage.sandwichMartinoDisplays3euros50());
    }

    @Given("de maaltijden zijn gesorteerd per categorie")
    public void de_maaltijden_zijn_gesorteerd_per_categorie() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.mealsAreCategorized());
    }


    @Then("“Jan” heeft een duidelijk overzicht per categorie")
    public void jan_heeft_een_duidelijk_overzicht_per_categorie(){
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        assertTrue(mealPage.mealsAreCategorized());
        }


    @When("“Jan” het menu bekijkt")
    public void janHetMenuBekijkt() {
        MealPage mealPage = PageFactory.initElements(driver, MealPage.class);
        System.out.println("Title: " + this.driver.getTitle());
        System.out.println("MealPageTitle" + mealPage.getTitle());
        assertEquals("Menu", mealPage.getTitle());
    }
}
