package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmptyMenuPage extends Page {

    public EmptyMenuPage(WebDriver driver) {
        super(driver);
        this.driver.get("http://localhost:8080/AutomationExample_war_exploded/EmptyMenu.jsp");
    }

    @FindBy(id= "notification")
    WebElement notification;

    public boolean containsNoMeals() {
        List<WebElement> trs = driver.findElements(By.cssSelector("tr"));
        int size = trs.size();
        return size == 1;
    }

    public WebElement getNotification() {
        return notification;
    }


}
