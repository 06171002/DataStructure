package org.example.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            } else {
                list.add(n);
            }
        }
        System.out.println(list);
    }
}
