package nl.capgemini.academy.assignments.week3.supermarket.discounts.products;

import nl.capgemini.academy.assignments.week3.supermarket.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuantityProductDiscountTest {

    private Product product;

    @BeforeEach
    void setup() {
        product = new Product("Test", 1000);
    }

    @Test
    void getPrice_4_3_a() {
        ProductDiscount discount = new QuantityProductDiscount(4, 3);
        int price = discount.getPrice(product, 4);
        assertEquals(3000, price);
    }

    @Test
    void getPrice_4_3_b() {
        ProductDiscount discount = new QuantityProductDiscount(4, 3);
        int price = discount.getPrice(product, 3);
        assertEquals(3000, price);
    }

    @Test
    void getPrice_4_3_c() {
        ProductDiscount discount = new QuantityProductDiscount(4, 3);
        int price = discount.getPrice(product, 8);
        assertEquals(6000, price);
    }

    @Test
    void getPrice_4_3_d() {
        ProductDiscount discount = new QuantityProductDiscount(4, 3);
        int price = discount.getPrice(product, 9);
        assertEquals(7000, price);
    }

}