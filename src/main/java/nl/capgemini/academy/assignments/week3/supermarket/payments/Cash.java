package nl.capgemini.academy.assignments.week3.supermarket.payments;

import nl.capgemini.academy.assignments.week3.supermarket.ShoppingCart;
import nl.capgemini.academy.assignments.week3.supermarket.util.Util;

public class Cash implements PaymentMethod {
    @Override
    public boolean pay(ShoppingCart shoppingCart) {
        int roundedTotal = Util.round(shoppingCart.discountTotal());
        System.out.format("Contant: %-40s € %6.2f%n", "", roundedTotal / 100.0d);
        return true;
    }

}
