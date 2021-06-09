package nl.capgemini.academy.assignments.week3.supermarket;

import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.DayOfWeekProductDiscount;
import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.PercentageProductDiscount;
import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.ProductDiscount;
import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.QuantityProductDiscount;
import nl.capgemini.academy.assignments.week3.supermarket.payments.Card;
import nl.capgemini.academy.assignments.week3.supermarket.payments.Cash;
import nl.capgemini.academy.assignments.week3.supermarket.payments.PaymentMethod;
import nl.capgemini.academy.assignments.week3.supermarket.printers.CartPrinter;
import nl.capgemini.academy.assignments.week3.supermarket.printers.ConsolePrinter;

import java.security.SecureRandom;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Application {
    private static final Random RANDOM = new SecureRandom();

    public static void main(String[] args) {
        ProductDiscount quantityProductDiscount = new QuantityProductDiscount(4, 3);
        ProductDiscount percentageProductDiscount = new PercentageProductDiscount(2, 31);
        ProductDiscount dayOfWeekProductDiscount = new DayOfWeekProductDiscount(DayOfWeek.WEDNESDAY, 99);

        Product robijn = new Product("Robijn", 299);
        Product brinta = new Product("Brinta", 249);
        Product chinGroen = new Product("Chinese Groenten", 499);
        Product kwark = new Product("Kwark", 199);
        Product luiers = new Product("Luiers", 999);

        Map<Product, ProductDiscount> discounts = new TreeMap<>();
        discounts.put(luiers, quantityProductDiscount);
        discounts.put(robijn, percentageProductDiscount);
        discounts.put(kwark, dayOfWeekProductDiscount);

        ShoppingCart cart = new ShoppingCart(discounts);

        List<Product> products = new ArrayList<>();
        products.add(robijn);
        products.add(brinta);
        products.add(chinGroen);
        products.add(kwark);
        products.add(luiers);

        for (int i = 0; i < RANDOM.nextInt(12) + 7; i++) {
            cart.add(getRandomProduct(products), 1);
        }

        PaymentMethod paymentMethod = getRandomPaymentMethod();
        CartPrinter printer = new ConsolePrinter();
        printer.print(cart);
        paymentMethod.pay(cart);
        System.out.println();
    }

    private static Product getRandomProduct(List<Product> products) {
        return products.get(RANDOM.nextInt(products.size()));
    }

    private static PaymentMethod getRandomPaymentMethod() {
        if (Math.random() < 0.5d) {
            return new Card();
        }
        return new Cash();
    }
}
