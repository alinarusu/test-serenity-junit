package testserenityjunit;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testserenityjunit.steps.EndUserSteps;

@RunWith(SerenityRunner.class)
@Concurrent(threads = "4x")
public class CalculateStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://juliemr.github.io/protractor-demo/")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;

    @Issue("#CALC-ADD")
    @Test
    public void calculate_add() {
        endUser.isTheHomePage();
		endUser.enters("1", "2");
        endUser.startCalculate();
        endUser.waitABit(1500);
        endUser.shouldSeeTheResult("3");
    }

    @Issue("#CALC-DIV")
    @Test
    public void calculate_div() {
        endUser.enters("10", "2");
        endUser.enterDivOperation();
        endUser.startCalculate();
        endUser.waitABit(1500);
        endUser.shouldSeeTheResult("5");
    }

    @Issue("#CALC-MOD")
    @Test
    public void calculate_mod() {
        endUser.enters("2", "2");
        endUser.enterModOperation();
        endUser.startCalculate();
        endUser.waitABit(1500);
        endUser.shouldSeeTheResult("0");
    }

    @Issue("#CALC-MUL")
    @Test
    public void calculate_mul() {
        endUser.enters("2", "2");
        endUser.enterMulOperation();
        endUser.startCalculate();
        endUser.waitABit(1500);
        endUser.shouldSeeTheResult("4");
    }

    @Issue("#CALC-SUB")
    @Test
    public void calculate_sub() {
        endUser.enters("8", "2");
        endUser.enterSubOperation();
        endUser.startCalculate();
        endUser.waitABit(1500);
        endUser.shouldSeeTheResult("6");
    }

    @Pending @Test
    public void searching_by_wrong_result() {
    }
} 