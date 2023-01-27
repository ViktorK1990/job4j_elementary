package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Error";
        };

        return name;

    }

        public static void main (String[]args){
            System.out.println(nameOfDay(1));
            System.out.println(nameOfDay(2));
            System.out.println(nameOfDay(3));
            System.out.println(nameOfDay(4));
            System.out.println(nameOfDay(5));
            System.out.println(nameOfDay(6));
            System.out.println(nameOfDay(7));

        }
    }
