package HW01.sample;

import HW01.regular.Calculator;
import HW01.regular.Decorator;

import static HW01.regular.Decorator.decorate;

/**
 * Основной класс приложения.
 */
public class Main {
    /**
     * Вход в программу
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int result = Calculator.sumOfNumbers(2, 2);
        System.out.println(decorate(result));
        result = Calculator.subtractionOfNumbers(6, 3);
        System.out.println(decorate(result));
        result = Calculator.multiplicationOfNumbers(3, 2);
        System.out.println(decorate(result));
        result = Calculator.divisionOfNumbers(4, 2);
        System.out.println(decorate(result));
    }
}
