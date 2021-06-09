package nl.capgemini.academy.assignments.week3.supermarket.printers;

import nl.capgemini.academy.assignments.week3.supermarket.Product;
import nl.capgemini.academy.assignments.week3.supermarket.ShoppingCart;
import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.ProductDiscount;

import java.util.Map;
import java.util.function.BiConsumer;

public class ConsolePrinter implements CartPrinter {

    @Override
    public void print(ShoppingCart shoppingCart) {
        System.out.println("Inhoud winkelwagen:");
        shoppingCart.getProducts().forEach(printLine(shoppingCart.getDiscounts()));
        int rawTotal = shoppingCart.rawTotal();
        int discountTotal = shoppingCart.discountTotal();
        if (discountTotal == rawTotal) {
            System.out.format("TOTAAL: %-41s € %6.2f%n", "", discountTotal / 100.0d);
        } else {
            System.out.format("TOTAAL:             € %6.2f - € %6.2f (BONUS) = € %6.2f%n",
                    rawTotal / 100.0d,
                    (rawTotal - discountTotal) / 100.0d,
                    discountTotal / 100.0d);
        }
    }

    private BiConsumer<Product, Integer> printLine(Map<Product, ProductDiscount> discounts) {
        return (prod, num) -> {
            int price = prod.getPrice();
            int total = num * price;
            System.out.format("%3d × %-30s @ € %6.2f = € %6.2f%n",
                    num,
                    prod.getName(),
                    price / 100.0d,
                    total / 100.0d);
            ProductDiscount productDiscount = discounts.get(prod);
            if (productDiscount != null) {
                int discountPrice = productDiscount.getPrice(prod, num);
                if (discountPrice != total) {
                    System.out.format("      BONUS: %-36s € %6.2f%n",
                            productDiscount.getText(),
                            (discountPrice - total) / 100.0d);
                }
            }
        };
    }
}
