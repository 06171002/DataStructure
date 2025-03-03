package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] list = new LinkedList[CAPACITY];
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < CAPACITY; i++) {
            list[i] = new LinkedList<>();
        }

        System.out.println(Arrays.toString(list));

        add(list, 1);
        add(list, 2);
        add(list, 5);
        add(list, 8);
        add(list, 14);
        add(list, 99);
        add(list, 9);
        System.out.println(Arrays.toString(list));

        int searchValue = 9;
        boolean contains = contains(list, searchValue);
        System.out.println(contains);

    }

    private static void add(LinkedList<Integer>[] list, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> linkedList = list[hashIndex];
        if (!linkedList.contains(value)) {
            linkedList.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] list, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> linkedList = list[hashIndex];

        return linkedList.contains(searchValue);
    }
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
