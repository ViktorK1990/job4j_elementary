package ru.job4j.condition;
public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
    public static int max(int a, int b, int c){
        return max(a, max(b,c));
    }
    public static int max(int a, int b, int c, int d){
        return max(a,max(b,c,d));
    }

    public static void main(String[] args) {
        int rsl = max(10, 12);
        System.out.println(rsl);
        System.out.println(max(1,40,15));
        System.out.println(max(5,35,20,1));
    }

}