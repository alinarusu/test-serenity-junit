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
        endUser.is_the_home_page();
		endUser.enters("1", "2");
        endUser.starts_calculate();
        endUser.should_see_the_result("3");
    }

    @Issue("#CALC-DIV")
    @Test
    public void calculate_div() {
        endUser.is_the_home_page();
        endUser.enters("10", "2");
        endUser.enter_div_operation();
        endUser.starts_calculate();
        endUser.should_see_the_result("5");
    }

    @Issue("#CALC-MOD")
    @Test
    public void calculate_mod() {
        endUser.is_the_home_page();
        endUser.enters("2", "2");
        endUser.enter_mod_operation();
        endUser.starts_calculate();
        endUser.should_see_the_result("0");
    }

    @Issue("#CALC-MUL")
    @Test
    public void calculate_mul() {
        endUser.is_the_home_page();
        endUser.enters("2", "2");
        endUser.starts_calculate();
        endUser.enter_mul_operation();
        endUser.should_see_the_result("4");
    }

    @Issue("#CALC-SUB")
    @Test
    public void calculate_sub() {
        endUser.is_the_home_page();
        endUser.enters("8", "2");
        endUser.enter_sub_operation();
        endUser.starts_calculate();
        endUser.should_see_the_result("6");
    }

    @Pending @Test
    public void searching_by_wrong_result() {
    }
} 