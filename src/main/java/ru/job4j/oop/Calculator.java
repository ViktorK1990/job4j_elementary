package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }
    public static int minus(int a) {
        return a - x;
    }
    public int multiply(int a) {
        return x * a;
    }
    public int devide(int a) {
        return x / a;
    }
    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + devide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        Calculator calculator = new Calculator();
        System.out.println(result);
        System.out.println(calculator.devide(10));
        System.out.println(calculator.multiply(10));
        System.out.println(sum(10));
        System.out.println(minus(10));
        System.out.println(calculator.sumAllOperation(10));

    }
}
