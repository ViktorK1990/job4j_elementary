package ru.job4j.condition;
public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
    public static void main(){
        int rsl = max(10,12);
        System.out.println(rsl);
    }
}