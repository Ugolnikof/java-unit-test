package ru.yandex.praktikum;

// класс для проверки на совершеннолетие
public class Program {
    public boolean checkIsAdult (int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }

    }
}
