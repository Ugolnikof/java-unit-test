package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorMultTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorMultTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{0} * {1} = {2}")  // передали тестовые данные
    public static Object[] getSumData() {
        return new Object[][] {
                { 2, 3, 6},
                { 1, 3, 3},
                { -2, 3, -6},
                { -2, -3, 6},
                { 1, 0, 0}
        };
    }

    @Test
    public void shouldSumPositive() {
        Calculator calc = new Calculator();
        int actual = calc.mult(firstNumber, secondNumber); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }

}