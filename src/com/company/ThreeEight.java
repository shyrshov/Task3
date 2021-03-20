package com.company;

public class ThreeEight {
    public static void main (String[] args) {
        String a = "Den, John, Will, Kate, Adam, Robin";
        char[] names = a.toCharArray();
        for (int i = 0; i < names.length; i++) {
            if (names[i] != ' ' && names[i]!= ',') {
                System.out.print(names[i]);
            } else {
                if (names[i] == ',') {
                    System.out.print("\n");
                }
            }
        }

    }
}
