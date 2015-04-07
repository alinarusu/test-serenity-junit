package testserenityjunit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


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

    public void enter_operands(String firstOp, String secondOp) {
        firstOperand.type(firstOp);
        secondOperand.type(secondOp);
    }

    public void selectOperatorAdd() {
        select.findElement(By.xpath("//option[@value='ADDITION']")).click();
    }

    public void selectOperatorDiv() {
        select.findElement(By.xpath("//option[@value='DIVISION']")).click();
    }

    public void selectOperatorMod() {
        select.findElement(By.xpath("//option[@value='MODULO']")).click();
    }

    public void selectOperatorMul() {
        select.findElement(By.xpath("//option[@value='MULTIPLICATION']")).click();
    }

    public void selectOperatorSub() {
        select.findElement(By.xpath("//option[@value='SUBTRACTION']")).click();
    }

    public void calculate() {
        goButton.click();
    }

    public String getResult() {
        return result.getText();
    }

}