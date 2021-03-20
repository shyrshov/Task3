package com.company;

import java.util.Locale;

public class ThreeSeven {
    public static void main (String[] args) {
        String a = "john_smith@example.com";
        int i = a.indexOf('@');
        int j = a.indexOf('_');
        String b = a.substring(0, i);
        StringBuilder login = new StringBuilder();
        login.append(b.substring(0, 1).toUpperCase());
        login.append(b.substring(1, j));
        login.append(" ");
        login.append(b.substring(j+1, j+2).toUpperCase());
        login.append(b.substring(j+2, i));
        String domain = a.substring(i+1, a.length());
        System.out.println(login);
        System.out.println(domain);

    }
}
