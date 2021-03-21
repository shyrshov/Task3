package com.company;

public class ThreeEight {
    public static void main (String[] args) {
        String a = "Den, John, Will, Kate, Adam, Robin";
        for (String name : a.split(", ")) {
            System.out.println(name);
        }
    }
}
