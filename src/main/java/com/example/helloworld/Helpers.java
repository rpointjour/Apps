package com.example.helloworld;

import java.util.regex.Pattern;

public class Helpers {
    // Does 'email' have valid characters allowed for email?
    public static boolean isValidEmailId(String str) {
        return Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(str).matches();
//        return Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9-]+\\\\.[A-Za-z]{2,64}").matcher(str).matches();
//        return true;
    }

    // Convert Celsius to Kelvin
    public static float c2k(float c) {
        return c + 273;
    }

    // Adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}