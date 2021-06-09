package nl.capgemini.academy.assignments.week3.supermarket.payments;

import nl.capgemini.academy.assignments.week3.supermarket.ShoppingCart;

public class Cash implements PaymentMethod {
    @Override
    public boolean pay(ShoppingCart shoppingCart) {
        int roundedTotal = round(shoppingCart.discountTotal());
        System.out.format("Contant: %-40s € %6.2f%n", "", roundedTotal / 100.0d);
        return true;
    }

    private static int round(int discountTotal) {
        // rounds to the nearest 5 cents
        return ((discountTotal + 2) / 5) * 5;
    }
}
