package nl.capgemini.academy.assignments.week3.supermarket.discounts.products;

import nl.capgemini.academy.assignments.week3.supermarket.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PercentageProductDiscountTest {

    private Product product;

    @BeforeEach
    void setup() {
        product = new Product("Test", 1000);
    }

    @Test
    void getPrice_5_20_a() {
        ProductDiscount discount = new PercentageProductDiscount(5, 20);
        int price = discount.getPrice(product, 1);
        assertEquals(1000, price);
    }

    @Test
    void getPrice_5_20_b() {
        ProductDiscount discount = new PercentageProductDiscount(5, 20);
        int price = discount.getPrice(product, 4);
        assertEquals(4000, price);
    }

    @Test
    void getPrice_5_20_c() {
        ProductDiscount discount = new PercentageProductDiscount(5, 20);
        int price = discount.getPrice(product, 5);
        assertEquals(4000, price);
    }

    @Test
    void getPrice_5_20_d() {
        ProductDiscount discount = new PercentageProductDiscount(5, 20);
        int price = discount.getPrice(product, 6);
        assertEquals(4800, price);
    }

}