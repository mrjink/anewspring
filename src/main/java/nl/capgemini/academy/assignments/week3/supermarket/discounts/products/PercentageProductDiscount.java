package nl.capgemini.academy.assignments.week3.supermarket.discounts.products;

import nl.capgemini.academy.assignments.week3.supermarket.Product;

public class PercentageProductDiscount implements ProductDiscount {
    private final int num;
    private final int percentage;

    public PercentageProductDiscount(int num, int percentage) {
        this.num = num;
        this.percentage = percentage;
    }

    @Override
    public int getPrice(Product product, int num) {
        int price = product.getPrice() * num;
        if (num >= this.num) {
            return (price * (100 - percentage)) / 100;
        }
        return price;
    }

    @Override
    public String getText() {
        return String.format("%d%% korting, bij minimaal %d stuks", percentage, num);
    }
}
