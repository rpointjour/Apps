package com.example.helloworld;

import java.util.regex.Pattern;
import java.lang.Math;

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

   public static float geoDistance(float lat1, float lon1, float lat2, float lon2)
   {
       float distance = (float) (Math.sin(Math.toRadians(lat1)) *
                      Math.sin(Math.toRadians(lat2)) +
                      Math.cos(Math.toRadians(lat1)) *
                              Math.cos(Math.toRadians(lat2)) *
                              Math.cos(Math.toRadians(lon2) -
                                      Math.toRadians(lon1)));

       distance = distance > 0 ? Math.min(1, distance) : Math.max(-1, distance);
       return (float) (3959 * 1.609 * 1000 * Math.acos(distance));
   }
}