package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FactorialTest {
    private final int num;
    private final int expected;


    public FactorialTest(int num, int expected) {
        this.num = num;
        this.expected = expected;
    }


    @Parameterized.Parameters(name = "Факториал {0} равен {1}")
    public static Object[] getData() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
    }

    @Test
    public void factorialTestCorrectResult() {
        Factorial fact = new Factorial();
        assertEquals(expected, fact.factorial(num));
    }


}