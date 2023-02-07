package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = true;
        char[] array = name.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (isSpecialSymbol(array[i]) || isUpperLatinLetter(array[i]) || isLowerLatinLetter(array[i])
                || isFirstNotUpper(array[0])) {
                    rsl = false;
                    break;
                }

        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 65 && code < 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >97 && code < 122;
    }

    public static boolean isFirstNotUpper(int code){
        return code > 65 && code < 90;
    }

    public static void main(String[] args) {
        System.out.println(isNameValid("$_$"));
    }
}


