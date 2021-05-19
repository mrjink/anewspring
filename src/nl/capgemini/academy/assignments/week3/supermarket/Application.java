package nl.capgemini.academy.assignments.week3.supermarket;

import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.DayOfWeekProductDiscount;
import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.ProductDiscount;
import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.QuantityProductDiscount;
import nl.capgemini.academy.assignments.week3.supermarket.discounts.products.PercentageProductDiscount;

import java.time.DayOfWeek;

public class Application {
    public static void main(String[] args) {
        ProductDiscount numberProductDiscount = new QuantityProductDiscount(4, 3);
        ProductDiscount percentageProductDiscount = new PercentageProductDiscount(2, 31);
        ProductDiscount dayOfWeekProductDiscount = new DayOfWeekProductDiscount(DayOfWeek.WEDNESDAY, 100);

        Product robijn = new Product("Robijn", 300);
        Product brinta = new Product("Brinta", 250);
        Product chinGroen = new Product("Chinese Groenten", 500);
        Product kwark = new Product("Kwark", 200);
        Product luiers = new Product("Luiers", 1000);

        ShoppingCart cart = new ShoppingCart();
        cart.addDiscount(luiers, numberProductDiscount);
        cart.addDiscount(robijn, percentageProductDiscount);
        cart.addDiscount(kwark, dayOfWeekProductDiscount);

        cart.add(robijn);
        cart.add(robijn);
        cart.add(robijn);
        cart.add(brinta);
        cart.add(chinGroen);
        cart.add(chinGroen);
        cart.add(kwark);
        cart.add(luiers);
        cart.print();
    }
}
