package nl.capgemini.academy.assignments.week3.supermarket;

import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.ProductDiscount;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class ShoppingCart {
    private final Map<Product, ProductDiscount> discounts;
    private final Map<Product, Integer> products;

    public ShoppingCart() {
        discounts = new TreeMap<>();
        products = new TreeMap<>();
    }

    public void addDiscount(Product product, ProductDiscount productDiscount) {
        discounts.put(product, productDiscount);
    }

    public void empty() {
        products.clear();
    }

    public void add(Product product) {
        products.compute(product, (prod, num) -> num == null ? 1 : num + 1);
    }

    public void remove(Product product) {
        products.compute(product, (prod, num) -> num == null || num == 1 ? null : num - 1);
    }

    public void print() {
        System.out.println("Inhoud winkelwagen:");
        products.forEach(printLine());
        int rawTotal = rawTotal();
        int discountTotal = discountTotal();
        if (discountTotal == rawTotal) {
            System.out.format("TOTAAL: %-41s € %6.2f%n", "", discountTotal / 100.0d);
        } else {
            System.out.format("TOTAAL:             € %6.2f - € %6.2f (BONUS) = € %6.2f%n", rawTotal / 100.0d, (rawTotal - discountTotal) / 100.0d, discountTotal / 100.0d);
        }
    }

    private BiConsumer<Product, Integer> printLine() {
        return (prod, num) -> {
            int price = prod.getPrice();
            int total = num * prod.getPrice();
            System.out.format("%3d × %-30s @ € %6.2f = € %6.2f%n", num, prod.getName(), price / 100.0d, total / 100.0d);
            ProductDiscount productDiscount = discounts.get(prod);
            if (productDiscount != null) {
                int discountPrice = productDiscount.getPrice(prod, num);
                if (discountPrice != total) {
                    System.out.format("      BONUS: %-36s € %6.2f%n", productDiscount.getText(), (discountPrice - total) / 100.0d);
                }
            }
        };
    }

    public int rawTotal() {
        int sum = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product prod = entry.getKey();
            Integer num = entry.getValue();
            sum += prod.getPrice() * num;
        }
        return sum;
        //        return products.entrySet().stream().mapToInt(e -> e.getKey().getPrice() * e.getValue()).sum();
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
}
