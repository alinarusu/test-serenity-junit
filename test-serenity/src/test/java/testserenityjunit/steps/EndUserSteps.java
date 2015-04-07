package testserenityjunit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import testserenityjunit.pages.CalculatorPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EndUserSteps extends ScenarioSteps {

    CalculatorPage calculatorPage;

    @Step
    public void isTheHomePage() {

        calculatorPage.open();
    }

    @Step
    public void enters(String firstOp, String secondOp) {

        calculatorPage.enter_operands(firstOp, secondOp);
    }

    @Step
    public void enterAddOperation() {
        calculatorPage.selectOperatorAdd();
    }

    @Step
    public void enterDivOperation() {
        calculatorPage.selectOperatorDiv();
    }

    @Step
    public void enterModOperation() {
        calculatorPage.selectOperatorMod();
    }

    @Step
    public void enterMulOperation() {
        calculatorPage.selectOperatorMul();
    }

    @Step
    public void enterSubOperation() {
        calculatorPage.selectOperatorSub();
    }

    @Step
    public void startCalculate() {
        calculatorPage.calculate();
    }

    @Step
    public void shouldSeeTheResult(java.lang.String result) {
        assertThat(calculatorPage.getResult(), is(result));
    }

}