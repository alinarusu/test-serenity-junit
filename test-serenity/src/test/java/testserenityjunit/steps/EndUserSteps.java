package testserenityjunit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import testserenityjunit.pages.CalculatorPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EndUserSteps extends ScenarioSteps {

    CalculatorPage calculatorPage;

    @Step
    public void is_the_home_page() {

        calculatorPage.open();
    }

    @Step
    public void enters(String firstOp, String secondOp) {

        calculatorPage.enter_operands(firstOp, secondOp);
    }

    @Step
    public void enter_add_operation() {
        calculatorPage.select_operator_add();
    }

    @Step
    public void enter_div_operation() {
        calculatorPage.select_operator_div();
    }

    @Step
    public void enter_mod_operation() {
        calculatorPage.select_operator_mod();
    }

    @Step
    public void enter_mul_operation() {
        calculatorPage.select_operator_mul();
    }

    @Step
    public void enter_sub_operation() {
        calculatorPage.select_operator_sub();
    }

    @Step
    public void starts_calculate() {

        calculatorPage.calculate();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void should_see_the_result(java.lang.String result) {
        assertThat(calculatorPage.getResult(), is(result));
    }

}