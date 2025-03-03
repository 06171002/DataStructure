package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class MyArrayListV1Main {

    public static void main(String[] args) throws IOException {

//        MyArrayListV1 myArrayListV1 = new MyArrayListV1();
//        System.out.println("데이터 추가");
//        System.out.println(myArrayListV1);
//        myArrayListV1.add("a");
//        System.out.println(myArrayListV1);
//        myArrayListV1.add("b");
//        System.out.println(myArrayListV1);
//        myArrayListV1.add("c");
//        System.out.println(myArrayListV1);
//
//        System.out.println("기능 사용");
//        System.out.println("list.size() = " + myArrayListV1.size());
//        System.out.println("list.get(1) = " + myArrayListV1.get(1));
//        System.out.println("list.indexOf('c') = " + myArrayListV1.indexOf("c"));
//        System.out.println("list.set(2, 'z') = " + myArrayListV1.set(2, 'z'));
//        System.out.println(myArrayListV1);
//
//        System.out.println("범위 초과");
//        myArrayListV1.add("d");
//        System.out.println(myArrayListV1);
//        myArrayListV1.add("e");
//        System.out.println(myArrayListV1);
//
//        //범위 초과, capacity가 늘어나지 않으면 예외 발생
//        myArrayListV1.add("f");
//        System.out.println(myArrayListV1);
//
//






//        Scanner sc = new Scanner(System.in);

//        System.out.println("스위치 갯수");
//        int switchCount = sc.nextInt();
//
//        System.out.println("스위치 상태");
//        String str = "";
//        for (int i = 0; i < switchCount; i++) {
//            str += sc.next() + " ";
//        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb1 = new StringBuilder();
//
//        int switchCount = Integer.parseInt(br.readLine());
//
//        Map<Integer, Integer> switchMap = new HashMap<>();
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//
//        for (int i = 1; i <= switchCount; i++) {
//            switchMap.put(i, Integer.parseInt(st.nextToken()));
//        }
//
//        System.out.println(switchMap);
//        int[] switchStatus = new int[switchCount];
//        for (int i = 0; i < switchCount; i++) {
//            switchStatus[i] = sc.nextInt();
//        }
//
//        System.out.println("학생 수");
//        int studentCount = sc.nextInt();
//
//        System.out.println("학생 상태");
//        int student1 = 0;
//        int student1Num = 0;
//
//        student1 = sc.nextInt();
//        student1Num = sc.nextInt();
//
//
//
//        int student2 = sc.nextInt();
//        int student2Num = sc.nextInt();
//
//
//        System.out.println(Arrays.toString(switchStatus));
//        int[] switchStatusClone = new int[switchCount + 1];
//        for (int i = 1; i < switchStatusClone.length; i++) {
//            switchStatusClone[i] = switchStatus[i-1];
//        }
//
//        System.out.println(Arrays.toString(switchStatusClone));
//        System.out.println(student1Num);
//        if (student1 == 1) {
//            for (int i = 1; i < switchStatusClone.length; i++) {
//                if (i % student1Num == 0) {
//                    if (switchStatusClone[i] == 0) {
//                        switchStatusClone[i] = 1;
//                    } else if (switchStatusClone[i] == 1) {
//                        switchStatusClone[i] = 0;
//                    }
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(switchStatusClone));
//
//        int nextValue = student2Num + 1;
//        int prevValue = student2Num - 1;
//        if (student2 == 2) {
//            while (prevValue >= 1){
//                if (switchStatusClone[student2Num + 1] != switchStatusClone[student2Num - 1]) {
//                    if (switchStatusClone[student2Num] == 0) {
//                        switchStatusClone[student2Num] = 1;
//                    } else if (switchStatusClone[student2Num] == 1) {
//                        switchStatusClone[student2Num] = 0;
//                    }
//                    break;
//                } else if (switchStatusClone[nextValue] == switchStatusClone[prevValue] ) {
//                    nextValue++;
//                    prevValue--;
//                    if (switchStatusClone[nextValue] != switchStatusClone[prevValue]) {
//
//                        if (prevValue == 0) {
//                            prevValue = prevValue + 1;
//                            nextValue = nextValue - 1;
//
//                            for (int i = prevValue; i <= nextValue; i++) {
//                                if (switchStatusClone[i] == 0) {
//                                    switchStatusClone[i] = 1;
//                                } else if (switchStatusClone[i] == 1) {
//                                    switchStatusClone[i] = 0;
//                                }
//                            }
//                            break;
//                        }
//
//                        for (int i = prevValue; i <= nextValue; i++) {
//                            if (switchStatusClone[i] == 0) {
//                                switchStatusClone[i] = 1;
//                            } else if (switchStatusClone[i] == 1) {
//                                switchStatusClone[i] = 0;
//                            }
//                        }
//                        break;
//                    } else if (switchStatusClone[prevValue] == switchStatusClone[nextValue] && prevValue == 0 ) {
//                        prevValue = prevValue + 1;
//                        nextValue = nextValue - 1;
//
//                        for (int i = prevValue; i <= nextValue; i++) {
//                            if (switchStatusClone[i] == 0) {
//                                switchStatusClone[i] = 1;
//                            } else if (switchStatusClone[i] == 1) {
//                                switchStatusClone[i] = 0;
//                            }
//                        }
//                        break;
//                    }
//                }
//            }
//        }
//
//        for (int i = 1; i < switchStatusClone.length; i++) {
//            switchStatus[i - 1] = switchStatusClone[i];
//        }
//
//        System.out.println(Arrays.toString(switchStatusClone));

//        String str = "One";
//
//        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
//
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(lowerCase.charAt(13%lowerCase.length()));
//        }

        int M = 1;

        System.out.println("어느 한 컴퓨터공학과 학생이 교수를 찾아가 물었다");
        recur(0, "", M);
        System.out.println("라고 답변하였지.");
    }

    private static void recur(int i, String s, int M) {
        System.out.println(s + "재귀함수가 뭔가요?");
        if (i == M) {
            System.out.println(s + "재귀함수는 자기 자신을 호출하는 함수라네");
            return;
        }
        System.out.println(s + "잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(s + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(s + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.");
        s = s + "____";
        recur(i + 1, s, M);
        System.out.println(s + "라고 답변하였지.");
    }
}
