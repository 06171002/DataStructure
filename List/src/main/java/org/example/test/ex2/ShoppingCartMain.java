package org.example.test.ex2;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.displayItem();

        System.out.println("장바구니 상품 출력");
        System.out.println(shoppingCart);


    }
}
