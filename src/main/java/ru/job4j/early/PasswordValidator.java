package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        if (!validateNull(password)) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (!validateLength(password)) {
    throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!validateLowercase(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!validateUppercase(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!validateNumber(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!validateSpecial(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (validateQwerty(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    public static boolean validateNull (String password) {
        boolean result = true;
        if (password == null) {
            result = false;
        }
        return result;
    }
    public static boolean validateUppercase(String password) {
        boolean result = false;
        for (char index : password.toCharArray()) {
            if (index > 65 && index < 90) {
                result = true;
            }
        }
        return result;
    }

    public static boolean validateLowercase(String password) {
        boolean result = false;
        for (char index : password.toCharArray()) {
            if (index > 97 && index < 122) {
                result = true;
            }
        }
        return result;
    }

    public static  boolean validateLength(String password) {
        boolean result = false;
        if (password.length() > 8 && password.length() < 32) {
            result = true;
        }
        return result;
    }

    public static boolean validateNumber (String password) {
        boolean result = false;
        for (char index : password.toCharArray()) {
            if(index > 48 && index <57) {
                result = true;
            }
        }
        return result;
    }

    public static boolean validateSpecial (String password) {
        boolean result = false;
        for (char index : password.toCharArray()) {
            if (index > 32 && index < 42) {
                result = true;
            }
        }
        return result;
    }

    public static boolean validateQwerty (String password) {
        String passwordLower = password.toLowerCase();
        boolean result = false;
        if(passwordLower.contains("qwerty") || passwordLower.contains("12345") ||
                passwordLower.contains("password") || passwordLower.contains("user") ||
                passwordLower.contains("admin")) {
            result = true;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}