package nl.capgemini.academy.assignments.week3.supermarket.discounts.products;

import nl.capgemini.academy.assignments.week3.supermarket.Product;

public class QuantityProductDiscount implements ProductDiscount {
    private final int halen;
    private final int betalen;

    public QuantityProductDiscount(int halen, int betalen) {
        this.halen = halen;
        this.betalen = betalen;
    }

    @Override
    public int getPrice(Product product, int num) {
        int div = num / halen;
        int rem = num % halen;

        return (div * betalen + rem) * product.getPrice();
    }

    @Override
    public String getText() {
        return String.format("%d halen, %d betalen", halen, betalen);
    }
}
