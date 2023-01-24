package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndSub(double first, double second) {
        return divide(first, second)
                + sub(first, second);
    }

    public static double sumAllMet(double first, double second) {
        return sub(first, second)
                + multiply(first, second)
                + divide(first, second)
                + sub(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAllMet(100, 20));
    }
}