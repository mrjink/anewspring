package nl.capgemini.academy.assignments.week3.supermarket;

import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.ProductDiscount;

import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private final Map<Product, ProductDiscount> discounts;
    private final Map<Product, Integer> products;

    public ShoppingCart(Map<Product, ProductDiscount> discounts) {
        this.discounts = discounts;
        products = new TreeMap<>();
    }

    public void empty() {
        products.clear();
    }

    public void add(Product product, int quantity) {
        products.compute(product, (prod, num) -> num == null ? quantity : num + quantity);
    }

    public void remove(Product product) {
        products.compute(product, (prod, num) -> num == null || num == 1 ? null : num - 1);
    }

    public int rawTotal() {
        int sum = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product prod = entry.getKey();
            Integer num = entry.getValue();
            sum += prod.getPrice() * num;
        }
        return sum;
        //        return products.entrySet().stream()
        //       .mapToInt(e -> e.getKey().getPrice() * e.getValue())
        //      .sum();
    }

    public int discountTotal() {
        int sum = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product prod = entry.getKey();
            Integer num = entry.getValue();

            if (discounts.containsKey(prod)) {
                sum += discounts.get(prod).getPrice(prod, num);
            } else {
                sum += prod.getPrice() * num;
            }
        }
        return sum;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Map<Product, ProductDiscount> getDiscounts() {
        return discounts;
    }
}
