package testserenityjunit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://juliemr.github.io/")
public class CalculatorPage extends PageObject {

    @FindBy(xpath = "//input[@ng-model='first']")
    WebElementFacade firstOperand;

    @FindBy(xpath = "//input[@ng-model='second']")
    WebElementFacade secondOperand;

    @FindBy(id = "gobutton")
    WebElement goButton;

    @FindBy(tagName = "select")
    WebElement select;

    @FindBy(className = "ng-binding")
    WebElement result;

    //public WebElementFacade goButton() {
    //find(By.id("gobutton"))
    //}

    public void enter_operands(String firstOp, String secondOp) {
        firstOperand.type(firstOp);
        secondOperand.type(secondOp);
    }

    public void select_operator_add() {

        select.findElement(By.xpath("//option[@value='ADDITION']")).click();
    }

    public void select_operator_div() {

        select.findElement(By.xpath("//option[@value='DIVISION']")).click();
    }

    public void select_operator_mod() {

        select.findElement(By.xpath("//option[@value='MODULO']")).click();
    }

    public void select_operator_mul() {

        select.findElement(By.xpath("//option[@value='MULTIPLICATION']")).click();
    }

    public void select_operator_sub() {

        select.findElement(By.xpath("//option[@value='SUBTRACTION']")).click();
    }

    public void calculate() {

        goButton.click();
    }

    public java.lang.String getResult() {

        return result.getText();
    }

}