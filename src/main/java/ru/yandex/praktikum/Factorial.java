package ru.yandex.praktikum;

public class Factorial {

    public int factorial (int n) {
        int result = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }


}
