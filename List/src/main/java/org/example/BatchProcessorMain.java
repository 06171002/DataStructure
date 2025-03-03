package org.example;

public class BatchProcessorMain {

    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        BatchProcessor batchProcessor = new BatchProcessor(linkedList);

        batchProcessor.logic(100000);
    }
}
