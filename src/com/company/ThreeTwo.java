package com.company;

public class ThreeTwo {
    public static <string> void main (String[] args) {
        String a = "FSRHgjhgfhg";
         if (a.length() >= 2 ) {
             String b = a.substring(0, 2);
             System.out.println("If string length >= 2, then print = " + b);
         } else {
                 System.out.println("String length < 2, then print = " + a);
             }
         }
    }
