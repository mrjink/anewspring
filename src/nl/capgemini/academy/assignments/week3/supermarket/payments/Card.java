package nl.capgemini.academy.assignments.week3.supermarket.payments;

import nl.capgemini.academy.assignments.week3.supermarket.ShoppingCart;

public class Card implements PaymentMethod {
    @Override
    public boolean pay(ShoppingCart shoppingCart) {
        int total = shoppingCart.discountTotal();
        System.out.format("Pinbetaling: %-36s € %6.2f%n", "", total / 100.0d);
        return true;
    }
}
