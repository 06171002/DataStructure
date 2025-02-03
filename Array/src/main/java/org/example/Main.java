package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println("== index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("== index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("== index 변경: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("== 배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (value == arr[i]) {
                System.out.println(value + "찾음");
                break;
            }
        }

        /**
         * arr[2]에 위치한 자료를 찾는다고 가정해보자.
         * 배열은 메모리상에 순서대로 붙어서 존재한다.
         * int는 4byte를 차지한다.
         * 따라서 배열의 시작 위치인 x100(예시)부터 시작해서 자료의 크기(4byte)와 인덱스 번호를 곱하면 원하는 메모리 위치를 찾을 수 있다.
         * 배열의 시작 참조(x100) + (자료의 크기(4byte) * 인덱스 위치(2)) = x108이 나온다. 여기에는 숫자 10이 들어있다.
         */

        /**
         * 배열에 들어있는 데이터를 검색할 때는 배열에 들어있는 데이터를 하나하나 비교해야 한다. 이때는 이전과 같이 인덱스를 사용해서 한 번에 찾을 수 없다.
         * 따라서 평균적으로 볼 때 배열의 크기가 클수록 오랜 시간이 걸린다.
         */
    }
}