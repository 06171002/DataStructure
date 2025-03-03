package org.example;

public class MyHashSetV0Main {

    public static void main(String[] args) {

        MyHashSetV0 myHashSetV0 = new MyHashSetV0();
        myHashSetV0.add(1);
        myHashSetV0.add(2);
        myHashSetV0.add(3);

        boolean result = myHashSetV0.add(3);

        System.out.println(result);
        System.out.println(myHashSetV0);
        System.out.println(myHashSetV0.contains(3));
    }
}
