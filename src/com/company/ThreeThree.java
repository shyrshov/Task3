package com.company;

public class ThreeThree {
    public static void main (String[] args) {
        String a = "Welcome to Java World";
        char b = 'p';
        StringBuilder c = new StringBuilder();
        c.append("<");
        c.append(b);
        c.append(">");
        c.append(a);
        c.append("</");
        c.append(b);
        c.append(">");
        System.out.println(c);

    }
}
