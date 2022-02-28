package katas.katas.CalculatorKata;

import static  org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.equalToObject;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void CalculatorStartsWithTotalEqualZero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal(), equalTo(0.0));
    }

    @Test
    void CalculatorCanSumAValueToTheTotal() {
        Calculator calculator = new Calculator();
        double num = 4.0;
        calculator.getSuma(num);
        assertThat(calculator.getTotal(), equalTo(num));

        calculator.getSuma(1.5);
        assertThat(calculator.getTotal(), equalTo(5.5));
    }

    @Test
    void CalculatorCanSubtractAValueToTheTotal() {
        Calculator calculator = new Calculator();
        double num = 4.0;
        calculator.getSubtract(num);
        assertThat(calculator.getTotal(), equalTo(-4.0));
    }

    @Test
    void CalculatorCanMultiplyAValueToTheTotal() {
        Calculator calculator = new Calculator();
        double num = 4.0;
        calculator.setTotal(4.0);
        calculator.multiply(num);
        assertThat(calculator.getTotal(), equalTo(16.0));
    }

    @Test
    void CalculatorCanDivideAValueToTheTotal() {
        Calculator calculator = new Calculator();
        double num = 2.0;
        calculator.setTotal(4.0);
        calculator.divide(num);
        assertThat(calculator.getTotal(), equalTo(2.0));
    }

    @Test
    void CalculatorCanMakeAPercentageOfTheTotal() {
        Calculator calculator = new Calculator();
        double num = 2;
        calculator.setTotal(100);
        calculator.percentage(num);
        assertThat(calculator.getTotal(), equalTo(2.0));
    }

    @Test
    void CalculatorCanKnowIfAValueIfIsEven() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEven(2));
        assertFalse(calculator.isEven(3));
    }

    @Test
    void CalculatorCanReturnTheGreaterValue() {
        Calculator calculator = new Calculator();
        double num1 = 8;
        double num2 = 4;
        assertThat(calculator.getGreater(num1, num2), equalTo(num1));
    }

   @Test
    void CalculatorCanSumAArray() {
        Calculator calculator = new Calculator();

        int[] arrayList = { 10, 20, 30, 15};
        calculator.sumArray(arrayList);
        assertThat(calculator.getTotal(), equalTo((double)75));
   }

    @Test
    void CalculatorCanReturnAListOfNumbersGreaterThanOrEqualTo5() {
        Calculator calculator = new Calculator();

        int[] numList = { 2, 4, 5, 7, 9 };

        ArrayList<Integer> newList = calculator.greaterOrEqualTo5(numList);

        assertThat(newList.size(), equalTo(3));
    }

}