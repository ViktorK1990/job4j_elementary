package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n>0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
                }
        return result;
    }
    public static void main(String[] args) {
        int rsl = calc(0);
        System.out.println(rsl);


    }
}
