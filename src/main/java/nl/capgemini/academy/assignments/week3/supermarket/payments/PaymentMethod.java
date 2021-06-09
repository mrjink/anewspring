package nl.capgemini.academy.assignments.week3.supermarket.payments;

import nl.capgemini.academy.assignments.week3.supermarket.ShoppingCart;

public interface PaymentMethod {
    boolean pay(ShoppingCart shoppingCart);
}
