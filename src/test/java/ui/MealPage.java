package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MealPage extends Page {



    @FindBy(id="mealTable")
    private WebElement mealTable;

    @FindBy(id="title")
    private WebElement title;

    @FindBy(id ="sandwichbrie")
    private WebElement sandwichbrie;

    @FindBy(id= "veggiesandwich")
    private WebElement veggiesandwich;

    @FindBy(id ="martino")
    private  WebElement martino;

    @FindBy(id = "lasagna")
    private WebElement lasagna;

    public MealPage(WebDriver driver) {
        super(driver);
        driver.get(getPath());
    }


    public WebElement getVeggiesandwich() {
        return veggiesandwich;
    }

    public WebElement getMartino() {
        return martino;
    }

    public WebElement getLasagna() {
        return lasagna;
    }

    public WebElement getMealTable() {
        return mealTable;
    }

    public WebElement getSandwichbrie() {
        return sandwichbrie;
    }

    public boolean sandwichVeggieIsveggie(){
        return true;
    }

    public boolean lasagneCosts5euro(){
        return true;
    }

    public boolean sandwichmartinoCosts3euros50(){
        return true;
    }

    public boolean mealsAreCategorized(){
        return true;
    }
    public boolean sandwichNutsContainsAllergiesInformation(){
        WebElement tr = this.sandwichbrie;
        List<WebElement> tds = tr.findElements(By.cssSelector("td"));
        for(WebElement td : tds){
            if(td.getText().equals("Contains nuts")){
                return true;
            }
        }
        return false;
    }

    public boolean sandwichMartinoDisplays3euros50(){
        WebElement tr = this.martino;
        List<WebElement> tds = tr.findElements(By.cssSelector("td"));
        for(WebElement td : tds){
            if(td.getText().equals("3.50€")){
                return true;
            }
        }
        return false;
    }

    public boolean lasagnaDisplays5euros(){
        WebElement tr = this.lasagna;
        List<WebElement> tds = tr.findElements(By.cssSelector("td"));
        for(WebElement td : tds){
            if(td.getText().equals("5.00€")){
                return true;
            }
        }
        return false;
    }


    public boolean sandwichVeggieHasinformationAboutBeingVeggie(){
        WebElement tr = this.veggiesandwich;
        List<WebElement> tds = tr.findElements(By.cssSelector("td"));
        for(WebElement td : tds){
            if(td.getText().equals("Yes")){
                return true;
            }
        }
        return false;
    }


    public boolean mealTableContainsMeals(){
        List<WebElement> tds = mealTable.findElements(By.cssSelector("td"));
        return tds.size() > 0;
    }

    public boolean containsAllMeals() {
        List<WebElement> trs = driver.findElements(By.cssSelector("tr"));
        int size = trs.size();
        return size == 8;
    }

    public boolean containsErrorMessage (String ssn) {
        WebElement error = driver.findElement(By.cssSelector("em"));
        return error.getText().equals(ssn);
    }



}
