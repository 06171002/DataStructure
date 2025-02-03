package org.example;

public class MyArrayListV1Main {

    public static void main(String[] args) {

        MyArrayListV1 myArrayListV1 = new MyArrayListV1();
        System.out.println("데이터 추가");
        System.out.println(myArrayListV1);
        myArrayListV1.add("a");
        System.out.println(myArrayListV1);
        myArrayListV1.add("b");
        System.out.println(myArrayListV1);
        myArrayListV1.add("c");
        System.out.println(myArrayListV1);

        System.out.println("기능 사용");
        System.out.println("list.size() = " + myArrayListV1.size());
        System.out.println("list.get(1) = " + myArrayListV1.get(1));
        System.out.println("list.indexOf('c') = " + myArrayListV1.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + myArrayListV1.set(2, 'z'));
        System.out.println(myArrayListV1);

        System.out.println("범위 초과");
        myArrayListV1.add("d");
        System.out.println(myArrayListV1);
        myArrayListV1.add("e");
        System.out.println(myArrayListV1);

        //범위 초과, capacity가 늘어나지 않으면 예외 발생
        myArrayListV1.add("f");
        System.out.println(myArrayListV1);
    }
}
