package com.company;

import java.util.Locale;

public class ThreeFive {
    public static void main (String[] args) {
        String a = "ABCDEFGHIJK";
        a = a.replaceAll("[AEIOUaeiou]","");
        System.out.println(a.toLowerCase());
    }
}
