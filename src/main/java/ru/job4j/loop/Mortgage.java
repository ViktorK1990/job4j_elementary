package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent){
        int rsl = 0;
        while (amount > 0){
            amount = (amount + (amount * ((percent)/100)) - salary);
            rsl ++;
        }
        return rsl;
    }
}
