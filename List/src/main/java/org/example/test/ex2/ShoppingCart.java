package org.example.test.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItem() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println( "상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int total = 0;
        List<Integer> list = items.stream().map(Item::getTotalPrice).toList();
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        for (int i = 0; i < items.size(); i++) {
            builder.append(items.get(i).toString()).append("\n");
        }

        builder.append("전체 가격 합: ").append(total);

        return builder.toString();
    }
}
