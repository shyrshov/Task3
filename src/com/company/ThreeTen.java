package com.company;
import java.util.ArrayList;

public class ThreeTen {
    public static void main(String[] args) {
        int[] array = new int[] {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
        ArrayList<Character> list = transformIntToChar(array);
        printList(list);
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }


    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }
}
